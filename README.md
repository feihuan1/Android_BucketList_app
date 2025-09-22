# BucketList (Android)

A simple Android app template for managing a personal bucket list. The current version includes a launcher `MainActivity` and a starter UI showing two card sections: "Things to do" and "Places to go" with image backdrops.

## Features
- **Launcher activity**: `MainActivity` defined in `AndroidManifest.xml`
- **Material-ready stack**: AppCompat, Material Components, ConstraintLayout, CardView, RecyclerView
- **Modern Gradle setup**: Kotlin DSL, namespace `com.example.bucketlist`, SDK 24–36

## App Info
- **Package**: `com.example.bucketlist`
- **App name**: `BucketList`
- **Language**: Java (with Gradle Kotlin DSL build)
- **Min SDK**: 24
- **Target/Compile SDK**: 36

## UI Overview
`res/layout/activity_main.xml` defines a vertical layout with two `CardView`s:
- "Things to do" card with an image and gradient overlay
- "Places to go" card with an image and gradient overlay

## Project Structure
```
BucketList/
├─ app/
│  ├─ src/main/
│  │  ├─ java/com/example/bucketlist/MainActivity.java
│  │  ├─ res/layout/activity_main.xml
│  │  └─ AndroidManifest.xml
│  └─ build.gradle.kts
├─ settings.gradle.kts
├─ build.gradle.kts
└─ README.md
```

## Build & Run
1. Open the project in Android Studio (latest stable recommended).
2. Let Gradle sync complete.
3. Choose a device/emulator with Android 7.0 (API 24) or higher.
4. Run the `app` configuration.

### Command line
From the project root:
```bash
./gradlew :app:assembleDebug
```
APK output: `app/build/outputs/apk/debug/app-debug.apk`.

## License
Open source
