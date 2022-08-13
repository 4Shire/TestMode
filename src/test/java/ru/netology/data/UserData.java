package ru.netology.data;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserData {
    String login;
    String password;
    String status;
}
