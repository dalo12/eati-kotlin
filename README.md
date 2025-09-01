# EATI 2025: Kotlin Multiplatform

This project is a result of the course _Kotlin Multiplatform_ offered by the _Escuela de Actualización en Tecnologías Informáticas_ (School of Information Technology) conducted by _Departamento de Ciencias e Ingeniería de la Computación_ (Computer Science Departament) at _Universidad Nacional del Sur_  🇦🇷

The project itself is a movie catalog with a filtering. It runs in desktop and Android devices.

## Screenshots
### Desktop
![desktop screenshot](/screenshots/desktop.png)

### Adroid
![android screenshot](/screenshots/android.png)

# Documentation
This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…