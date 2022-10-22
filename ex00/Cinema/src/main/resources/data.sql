INSERT INTO user_account (first_name, last_name, phone_number, password)
VALUES ('Ivan', 'Ivanov', '+79631419043', 't!%J73973X#G'),
       ('Petr', 'Petrov', '+79541217233', 'l!gVxFX%6#75'),
       ('Oksana', 'Samoilova', '+71244121212', '#4W88GP^Ut&z'),
       ('Olga', 'Vedenina', '89292943144', 'nJ1kT47g40^3'),
       ('Airat', 'Tukhvatullin', '83516324652', '^4g*3Rr&9x%S')
    ON CONFLICT DO NOTHING;