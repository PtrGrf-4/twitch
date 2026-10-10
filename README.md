# Twitch+ Backend
A Spring Boot backend for searching Twitch streams, videos, and clips.

## Tech Stack
- Java 21, Spring Boot
- MySQL, Spring Data JDBC
- OpenFeign, OAuth 2.0
- Docker, Gradle

## Features
- Integrated Twitch API via OpenFeign.
- Implemented OAuth 2.0 for secure API authentication.
- Designed MySQL schemas and data access layers for users, items, and favorites.
- RESTful controllers for search and favorite endpoints.

## How to Run
1. Start MySQL: `docker-compose up -d`
2. Set env vars: `TWITCH_CLIENT_ID`, `TWITCH_CLIENT_SECRET`, `DATABASE_PASSWORD`
3. Run: `./gradlew bootRun`
