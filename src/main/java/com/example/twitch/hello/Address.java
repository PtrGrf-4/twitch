package com.example.twitch.hello; // 注意：去掉了空格，并用项目统一包名

public record Address(
        String street,
        String city,
        String state,
        String country
) {

}