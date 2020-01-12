# StarWars_listing_app

 This is a mobile android app that lists star wars characters using a REST API provided by the Awesomity Lab
 and provides additional information as one clicks on a certain character.



## Table of Contents
- [Requirements to Run my App](#requirements-to-run-my-app)
  - [Common](#common)
    - [For Android](#for-android)
    - [For iOS](#for-ios)
- [Steps to Run](#steps-to-run)
  - [Windows](#windows)
  - [macOS](#macos)
- [Known bugs](#debugging)
  - [Common](#common-1)
  - [VSCode](#vscode)
    - [Common](#common-2)
    - [iOS](#ios)
    - [Android](#android)
- [Technologies used](#additional-requirements-to-run-e2e-tests)
  - [E2E on Android](#e2e-on-android)
  - [E2E on iOS](#e2e-on-ios)
- [Some screenshots of my App](#tools)
  - [Scripts](#scripts)
  - [Reactotron](#reactotron)
  - [Staging and Continuous Integration](#staging-and-continuous-integration)
- [# Personal Information](#default-information)
- [License](#available-scripts)
  - [`npm start`](#npm-start)
    - [`npm test`](#npm-test)
    - [`npm run ios`](#npm-run-ios)
    - [`npm run android`](#npm-run-android)
      - [Using Android Studio's `adb`](#using-android-studios-adb)
      - [Using Genymotion's `adb`](#using-genymotions-adb)
- [Other](#other)
  - [Writing and Running Tests](#writing-and-running-tests)
  - [Adding Flow](#adding-flow)

___
### Default information in README.md
- [Default Information](#default-information)
  - [Available Scripts](#available-scripts)
    - [`npm start`](#npm-start)
      - [`npm test`](#npm-test)
      - [`npm run ios`](#npm-run-ios)
      - [`npm run android`](#npm-run-android)
        - [Using Android Studio's `adb`](#using-android-studios-adb)
        - [Using Genymotion's `adb`](#using-genymotions-adb)
  - [Other](#other)
    - [Writing and Running Tests](#writing-and-running-tests)
    - [Adding Flow](#adding-flow)

## Requirements to Run my-App
### Common 
  * `node 10+` (with `npm 6.4.1`)  
  <small>Last known-to-work NodeJS versions - 10.14.2, 11.5.0, 12.0.7. (`npm rebuild` or `npm install` would be needed because of `react-native-make` if changing node version after initially installing dependencies with `npm install`)</small>
  * ninja (for Android)  
  <small>macOS - `brew install ninja`, Windows - instructions [here](https://github.com/rwols/CMakeBuilder/wiki/Ninja-for-Windows-Installation-Instructions)</small>
  * react-native-cli `npm install -g react-native-cli`
#### For Android
<small>(macOS and Windows)</small>  
    * `Java 1.8` (jdk 8)  
    * `Android Studio` or manual installation if SDK and platform tools (look at how to setup an Android project with gradle)
#### For iOS
<small>(macOS only)</small>  
    * `macOS 10.13 High Sierra` or higher <small>(not tested on El Capitan and before)</small>  
    * `Homebrew` - http://brew.sh  
    * `CocoaPods` (`brew install pods`)  
    * `Xcode 9.4.1`

## Steps to Run
### Windows
  (1) `git clone https://github.com/Omoyi/StarWars_listing_app.git`  
  (2) `cd <project-folder>` for example `cd C:\projects\Mobile-App`  
  (3) `npm install`  
  (4) `react-native run-android` 
### macOS
(1) `git clone git://github.com/LockTrip/Mobile-app.git`  
(2) `cd <project-folder>` for example `cd $HOME$/projects/Mobile-App`  
(3) `npm install`  
(4) `react-native run-ios` or `react-native run-android`

## Known bugs

### Common
(1) put ``debugger`` statement in code  
(2) debug with "Debug JS Remotely" and a browser  
  
*_Note:_* To debug **WebView** or **mobile browser** - use:  
- for iOS: *Safari/Develop/Simulator...* 
- for Android: *Chrome/Remote device* and choose emulator/device


## Technologies used
E2E tests (aka integration tests) are using `detox` (with Grey Box vs the common Black Box approach) with `mocha`.
### E2E on Android
 * ???
### E2E on iOS
<small>(macOS only)</small>
  * `brew tap wix/brew`
  * `brew install applesimutils`
 
## Some screenshots of my App


# Personal Information

## License



Now you can run `npm run flow` (or `yarn flow`) to check the files for type errors.
You can optionally use a [plugin for your IDE or editor](https://flow.org/en/docs/editors/) for a better integrated experience.

To learn more about Flow, check out [its documentation](https://flow.org/).
