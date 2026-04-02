# MechDrive Calculator Backend

Backend da duoc setup lai hoan toan bang Spring Boot + Maven.

## Tech Stack

- Java 17
- Spring Boot 3.3.x
- Maven
- Jakarta Bean Validation

## Cau truc hien tai

```text
src/
  main/
    java/com/mechdrive/calculator/
      MechDriveCalculatorApplication.java
      config/
        HealthController.java
        WebConfig.java
      common/exception/
        ApiErrorResponse.java
        GlobalExceptionHandler.java
      modules/standarddata/
        controller/StandardDataController.java
        service/StandardDataService.java
        dto/
          UpsertStandardDataRequest.java
          StandardDataItemResponse.java
          UpsertStandardDataResponse.java
    resources/
      application.yml
  test/
    java/com/mechdrive/calculator/
      MechDriveCalculatorApplicationTests.java
```

## Yeu cau moi truong

- JDK 17+
- Maven 3.9+

## Cach chay local

1. Chinh sua bien moi truong trong file `.env` neu can.
2. Build:

```bash
mvn clean package
```

3. Run:

```bash
mvn spring-boot:run
```

Ung dung mac dinh chay tai `http://localhost:3000`.

## API co san

- GET `/api/v1/health`
- GET `/api/v1/standard-data`
- POST `/api/v1/standard-data`

Payload mau cho POST `/api/v1/standard-data`:

```json
{
  "code": "MTR-01",
  "name": "Motor 3kW",
  "metadata": {
    "power": 3,
    "unit": "kW"
  }
}
```

## Docker

Build va run voi Docker Compose:

```bash
docker compose up --build
```
