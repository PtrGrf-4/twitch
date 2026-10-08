package com.example.twitch.hello; // 注意：你依然沿用了 laioffer 的包名

import com.example.twitch.hello.Address;
import com.fasterxml.jackson.annotation.JsonProperty;

public record Person(
        String name,
        String company,
        @JsonProperty("home_address") Address homeAddress,
        @JsonProperty("favourite_book") Book favoriteBook
) {}