# StarWars_listing_app

 This is a mobile android app that lists star wars characters using a REST API provided by the Awesomity Lab
 and provides additional information as one clicks on a certain character.



## Table of Contents
- [Requirements to Run my App](#requirements-to-run-my-app)
    - [For Android](#for-android)
    - [For iOS](#for-ios)
- [Steps to Run](#steps-to-run)
  - [Windows](#windows)
  - [macOS](#macos)
- [Known bugs](#debugging)
- [Technologies used](#technologies-used)
- [Screenshots of my App](#some-screenshots-of-my-App)
  - [Scripts](#scripts)
  - [Reactotron](#reactotron)
  - [Staging and Continuous Integration](#staging-and-continuous-integration)
- [# Personal Information](#default-information)
- [License](#license)
- [Other](#other)
___
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
(1) `git clone https://github.com/Omoyi/StarWars_listing_app.git``  
(2) `cd <project-folder>` for example `cd $HOME$/projects/Mobile-App`  
(3) `npm install`  
(4) `react-native run-ios` or `react-native run-android`

## Known bugs

(1) put ``debugger`` statement in code  
(2) debug with "Debug JS Remotely" and a browser  
  
*_Note:_* To debug **WebView** or **mobile browser** - use:  
- for iOS: *Safari/Develop/Simulator...* 
- for Android: *Chrome/Remote device* and choose emulator/device


## Technologies used

  ### API
   * Used a Rest Api to fetch data provided by Awesomity lab, here is the link `https://awesome-star-wars-api.herokuapp.com/`
  ### Java
   <small>(Programming language)</small>
    Designed the app in Java
 ### Android Studio
    This was my Editor, i used to write my codes
## Some screenshots of my App


# Personal Information
  My names: `Uwimana Rachel`
  Email: ****** Urakhel7@gmail.com
## License

## TO YOU

 Thank you for going through my readme if you have any question feel free to contact me through the personal information       provided above 
