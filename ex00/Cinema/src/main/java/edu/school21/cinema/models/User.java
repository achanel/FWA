package edu.school21.cinema.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    public static final Integer NAME_LENGTH = 127;
    public static final Integer PHONE_NUMBER_LENGTH = 127;

    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
}
