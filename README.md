# 📚 Reading Routine Backend

독서 습관 형성을 돕는 서비스 **Reading Routine**의 백엔드 서버입니다.
사용자의 독서 기록을 관리하고, 통계를 제공하며, 외부 API를 활용한 도서 검색 기능을 제공합니다.

---

## 🚀 Tech Stack

* **Language**: Java 21
* **Framework**: Spring Boot
* **Build Tool**: Gradle
* **Database**: (추후 추가 예정)
* **API**: Aladin Open API

---

## 📦 Project Structure

```plaintext
com.readingroutine
 ├── controller     # API 요청 처리
 ├── service        # 비즈니스 로직
 ├── repository     # DB 접근
 ├── domain         # 엔티티 (데이터 모델)
 └── config         # 설정 (보안, DB 등)
```

---

## ✨ Features

* 📖 도서 검색 API (Aladin API 연동 예정)
* 📝 독서 기록 관리
* 📊 독서 통계 제공
* 🔐 사용자 인증 (추후 구현 예정)

---


## 🔥 Goal

* 기존 Django REST Framework 기반 백엔드 서버를 Spring Boot로 마이그레이션

* 요청 → 처리 → 데이터 반영까지의 흐름을 명확히 분리하고  
  계층형 아키텍처(Controller-Service-Repository)를 기반으로 구조 개선

* 트랜잭션 처리 및 데이터 정합성을 고려한 설계로  
  실제 서비스 수준의 안정적인 백엔드 구현

* 향후 트래픽 증가를 고려한 확장 가능한 구조 설계 및 성능 개선 기반 마련
