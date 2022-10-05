package edu.school21.cinema.repositories;

import edu.school21.cinema.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User findUserByPhoneNumber(String phoneNumber) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM user_account WHERE phone_number = ?", new UserMapper(), phoneNumber);
        } catch (Exception e) {
            return null;
        }
    }

    public void saveUser(User user) {
        jdbcTemplate.update("INSERT INTO user_accaunt (first_name, last_name, phone_number, password) VALUES (?, ?, ?, ?)",
                user.getFirstName(), user.getLastName(), user.getPhoneNumber(), user.getPassword());
    }

    private static class UserMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setFirstName(rs.getString("first_name"));
            user.setLastName(rs.getString("last_name"));
            user.setPhoneNumber(rs.getString("phone_number"));
            user.setPassword(rs.getString("password"));
            return user;
        }
    }
}
