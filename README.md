# agora_rtc_engine

### NOTE: THIS IS A FORKED REPO WITH SCREEN SHARING FUNCTIONALITY ADDED
#### To learn more about implementing screen share and other advanced features, refer [Agora API Examples](https://github.com/AgoraIO/API-Examples).

![pub package](https://img.shields.io/pub/v/agora_rtc_engine.svg?include_prereleases)

[中文](README.zh.md)
[日本語](README.jp.md)

This Flutter plugin is a wrapper for [Agora Video SDK](https://docs.agora.io/en/Interactive%20Broadcast/product_live?platform=All%20Platforms).

Agora.io provides building blocks for you to add real-time voice and video communications through a simple and powerful SDK. You can integrate the Agora SDK to enable real-time communications in your own application quickly.

## Screen Sharing (Android Only)

This repo is an edited version of the existing Agora Flutter SDK, meaning, all Agora features are available with the addition of screen sharing. Currently, Android only.

Changes made:

- Added ss and aidl folders under Android ([Agora-Flutter-SDK/android/src/main/java](https://github.com/Ayush412/Agora-Flutter-SDK/tree/master/android/src/main)). Refer [lib-screensharing](https://github.com/AgoraIO/API-Examples/tree/master/Android/APIExample/lib-screensharing/src/main).
- Added a method channel to enable and disable screen share (Check [RtcEngine.kt](https://github.com/Ayush412/Agora-Flutter-SDK/blob/master/android/src/main/java/io/agora/rtc/base/RtcEngine.kt) and [rtc_engine.dart](https://github.com/Ayush412/Agora-Flutter-SDK/blob/master/lib/src/rtc_engine.dart)).

TODO:
- iOS implementation

## Usage

To use this plugin, add `agora_rtc_engine` as a dependency in your [pubspec.yaml](https://flutter.dev/docs/development/packages-and-plugins/using-packages) file.

## Getting Started

* See the [example](example) directory for a sample about one to one video chat app which using `agora_rtc_engine`.
* Or checkout this [Tutorial](https://github.com/AgoraIO-Community/Agora-Flutter-Quickstart) for a sample about live broadcasting app which using `agora_rtc_engine`.

## Device Permission

Agora Video SDK requires `camera` and `microphone` permission to start video call.

### Android

Open the `AndroidManifest.xml` file and add the required device permissions to the file.

```xml
<manifest>
    ...
    <uses-permission android:name="android.permission.READ_PHONE_STATE"/>
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.MODIFY_AUDIO_SETTINGS" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

    <!-- The Agora SDK requires Bluetooth permissions in case users are using Bluetooth devices.-->
    <uses-permission android:name="android.permission.BLUETOOTH" />
    ...
</manifest>
```

### iOS

Open the `Info.plist` and add:

- `Privacy - Microphone Usage Description`, and add a note in the Value column.
- `Privacy - Camera Usage Description`, and add a note in the Value column.

Your application can still run the voice call when it is switched to the background if the background mode is enabled. Select the app target in Xcode, click the **Capabilities** tab, enable **Background Modes**, and check **Audio, AirPlay, and Picture in Picture**.

## Error handling

### Android build error

The error log like `Could not find com.github.agorabuilder:native-full-sdk:3.4.2.`

pls refer to https://github.com/AgoraIO/Agora-Flutter-SDK/issues/321#issuecomment-843913064

## API

* [Flutter API](https://docs.agora.io/en/All/api-ref?platform=Flutter)
* [Android API](https://docs.agora.io/en/Video/API%20Reference/java/index.html)
* [iOS API](https://docs.agora.io/en/Video/API%20Reference/oc/docs/headers/Agora-Objective-C-API-Overview.html)

## How to contribute

To help work on this sdk, see our [contributor guide](https://github.com/AgoraIO/Flutter-SDK/blob/master/CONTRIBUTING.md).