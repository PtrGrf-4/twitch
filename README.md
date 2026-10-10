# Twitch+ Backend API & Search Platform

A Spring Boot backend for a Twitch content search platform, currently under active development. This service integrates directly with the Twitch API to aggregate live streams, videos, and clips.

## Tech Stack
- **Language:** Java 21
- **Framework:** Spring Boot 4.1
- **API Integration:** OpenFeign, Twitch API
- **Authentication:** OAuth 2.0 (Client Credentials)
- **Database:** MySQL, Spring Data JDBC
- **Tools:** Gradle, Docker

## Features Implemented
- Integrated Twitch API via OpenFeign to fetch live streams, videos, and clips.
- Implemented OAuth 2.0 authentication to securely manage Twitch API tokens.
- Designed MySQL schemas and implemented data access layers for users, items, and favorites.
- Utilized Java Records as immutable DTOs to parse nested JSON responses from Twitch.
- Configured global CORS and Spring Security for frontend integration.

## Project Structure
- `src/main/java/com/example/twitch/external/` - Twitch API integration and external models
- `src/main/java/com/example/twitch/db/` - Database entities and repositories
- `src/main/java/com/example/twitch/favorite/` - Favorite functionality (Controller, Service)
- `src/main/java/com/example/twitch/item/` - Item search and grouping logic
- `src/main/resources/database-init.sql` - SQL script to initialize the MySQL schema

## How to Run
1. Ensure MySQL is running locally (e.g., via Docker).
2. Set environment variables: `TWITCH_CLIENT_ID`, `TWITCH_CLIENT_SECRET`, and `DATABASE_PASSWORD`.
3. Run the application:
```bash
./gradlew bootRun
