![CI (Build and Test)](https://github.com/flamestro/AgileIsTheNewOrange/workflows/CI%20(Build%20and%20Test)/badge.svg)

# Introduction
This application is an API that can be used for a KanBan/Scrum board UI like [this](https://github.com/flamestro/agile-is-the-new-orange-ui) one.

Start application using:

`docker-compose -f docker-compose.yml up --build`

# Relevant Dev-Endpoints

Application: `http://localhost:8080`

Metrics: `http://localhost:8081/actuator/prometheus`

Swagger: `http://localhost:8080/swagger-ui.html`

Mongo: `mongodb://localhost:27017`
