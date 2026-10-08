package com.example.twitch.model;


// imports...


import com.example.twitch.db.entity.ItemEntity;


public record FavoriteRequestBody(
        ItemEntity favorite
) {}
