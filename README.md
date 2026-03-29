# Easy Base Forge — Demo Projects

Reference implementations showing [Easy Base Forge REST Builder](https://github.com/ak-ragnor/Easy-base-forge) in action across two real Spring Boot projects with different configurations.

---

## Projects

### `petstore-maven` — Maven · FLAT layout

A pet clinic API built with the **EasyBase Maven plugin**, demonstrating every available configuration option.

| Config | Value |
|--------|-------|
| Build tool | Maven |
| Layout | `FLAT` — all resources share packages |
| Response wrapping | `ALWAYS` — every method returns `ResponseEntity<T>` |
| Pagination | `SPRING_DATA` — `Pageable` + `Page<T>` |
| Delegate stubs | `delegateImpl: true` |
| Annotations | `@CrossOrigin("*")`, `@Slf4j` on base controllers |
| Authors | Multiple (`authors` list) |
| Post-generate | `postGenerateCommand` echo |

**API:** Pets + Owners with `oneOf` discriminator (medical history), `anyOf` events, `allOf` patch composition, UUID/Long/LocalDate/OffsetDateTime types, nested `AddressDTO`, full bean validation.

**Run generation:**
```bash
cd petstore-maven
mvn generate-sources
```

---

### `bookstore-gradle` — Gradle · MULTI_MODULE layout

A bookstore API built with the **EasyBase Gradle plugin**, demonstrating the alternative configuration options.

| Config | Value |
|--------|-------|
| Build tool | Gradle |
| Layout | `MULTI_MODULE` — per-resource sub-packages |
| Response wrapping | `VOID_ONLY` — only void methods use `ResponseEntity<Void>` |
| Response wrapper | Custom `ApiResponse<T>` / `ApiPageResponse<T>` classes |
| Pagination | `SPRING_DATA` |
| Delegate stubs | `delegateImpl: true` |
| Generated annotation | `addGeneratedAnnotation: false` |
| Author | Single (`author` field) |
| CORS | `@CrossOrigin("https://app.example.com")` |

**API:** Books + Authors with `oneOf` discriminator (edition types: Physical/Digital/Audio), `allOf` update/patch requests, ISBN-13 `@Pattern` validation, `format: email`, boolean fields.

**Run generation:**
```bash
cd bookstore-gradle
./gradlew easybaseGenerate
```

---

## Prerequisites

Both projects require **Easy Base Forge** built and installed locally:

```bash
# 1. Clone and install the forge
git clone https://github.com/ak-ragnor/Easy-base-forge.git
cd Easy-base-forge
mvn install -DskipTests

# 2. For the Gradle demo — publish the Gradle plugin locally
cd easybase-gradle-plugin
./gradlew publishToMavenLocal
```

---

## Commit History

Each project follows the real developer workflow as individual commits:

```
feat: init spring boot project        ← pom.xml / build.gradle, Application class
feat: add easybase config             ← easybase-config.yaml
feat: add openapi specification       ← src/main/resources/api.yaml
feat: run easybase generation         ← all generated + custom stub files
```

This makes it easy to see exactly what each step produces.

---

## Project Structure After Generation

### petstore-maven (FLAT)

```
src/main/java/com/example/petstore/
├── controller/
│   ├── base/
│   │   ├── PetsControllerBase.java      ← generated (always overwritten)
│   │   └── OwnersControllerBase.java    ← generated
│   ├── PetsController.java              ← yours (never overwritten)
│   └── OwnersController.java            ← yours
├── delegate/
│   ├── impl/
│   │   ├── base/
│   │   │   ├── PetsApiDelegateImplBase.java   ← generated
│   │   │   └── OwnersApiDelegateImplBase.java ← generated
│   │   ├── PetsApiDelegateImpl.java     ← yours
│   │   └── OwnersApiDelegateImpl.java   ← yours
│   ├── PetsApiDelegate.java             ← generated
│   └── OwnersApiDelegate.java           ← generated
└── dto/
    ├── PetDTO.java                      ← generated (shared across resources)
    ├── CreatePetRequest.java            ← generated
    ├── MedicalHistoryEntry.java         ← generated (oneOf base)
    ├── VaccinationRecord.java           ← generated (oneOf variant)
    ├── OwnerDTO.java                    ← generated
    └── AddressDTO.java                  ← generated (nested object)
```

### bookstore-gradle (MULTI_MODULE)

```
src/main/java/com/example/bookstore/
├── common/
│   ├── ApiResponse.java                 ← hand-written wrapper class
│   └── ApiPageResponse.java             ← hand-written wrapper class
├── books/
│   ├── controller/base/BooksControllerBase.java   ← generated
│   ├── controller/BooksController.java            ← yours
│   ├── delegate/BooksApiDelegate.java             ← generated
│   ├── delegate/impl/base/BooksApiDelegateImplBase.java  ← generated
│   ├── delegate/impl/BooksApiDelegateImpl.java    ← yours
│   └── dto/
│       ├── BookDTO.java                 ← generated
│       ├── BookEdition.java             ← generated (oneOf base)
│       ├── PhysicalEdition.java         ← generated (oneOf variant)
│       ├── DigitalEdition.java          ← generated
│       └── AudioEdition.java            ← generated
└── authors/
    ├── controller/ ...
    ├── delegate/ ...
    └── dto/ ...
```

---

## Related

- [Easy Base Forge](https://github.com/ak-ragnor/Easy-base-forge) — the code generator
- [REST Builder documentation](https://github.com/ak-ragnor/Easy-base-forge/blob/main/RESTBUILDER.md) — full configuration reference
