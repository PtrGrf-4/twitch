# Twitch+ Full-Stack Platform
A full-stack web app to search and favorite Twitch streams, videos, and clips.

## Tech Stack
- Backend: Java 21, Spring Boot, MySQL, OpenFeign, OAuth 2.0
- Frontend: Next.js 16, TypeScript, Tailwind CSS

## Features
- Search Twitch content via Twitch API.
- Secure OAuth 2.0 authentication.
- Favorites collection with MySQL.
- Responsive Next.js UI with dynamic search.

## Run
1. `docker-compose up -d`
2. Set `TWITCH_CLIENT_ID`, `TWITCH_CLIENT_SECRET`, `DATABASE_PASSWORD`
3. Backend: `./gradlew bootRun`
4. Frontend: `cd frontend && npm install && npm run dev`
