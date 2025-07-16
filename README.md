# Kotlin Multiplatform Teaparty Project

This project is a Kotlin Multiplatform build targeting JVM, JS (IR), and WebAssembly WASI. It includes:

- `teaparty-core`: Shared core logic for all platforms.
- `examples/cli`: Example CLI app using [Clikt](https://ajalt.github.io/clikt/) (JVM target).

## Features
- Multiplatform: JVM, JS (browser/node), WASI
- Uses `kotlinx-coroutines` for async
- Tests use `kotlin-test` and JUnit5 for JVM

## Build & Run

### Build all
```sh
./gradlew build
```

### Run CLI example (JVM)
```sh
./gradlew :examples:cli:run
```

### Run tests
```sh
./gradlew test
```

## Adding More Examples
Add new projects under `examples/` and include them in `settings.gradle.kts`.
