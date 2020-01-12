# StarWars_listing_app

 This is a mobile android app that lists star wars characters using a REST API provided by the Awesomity Lab
 and provides additional information as one clicks on a certain character.

#### By **Uwimana Rachel**

## Table of Contents

- [Personal Information](#personal-information)
- [Requirements to Run my App](#requirements-to-run-my-app)
- [Steps to Run](#steps-to-run)
- [Known bugs](#known-bugs)
- [Technologies used](#technologies-used)
- [Screenshots of my App](#some-screenshots-of-my-App)
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

(1) I wasn't able to show the list of saved characters due to time.
(2) I can't edit or change a characters name.

## Technologies used

  #### API
   * Used a Rest Api to fetch data provided by Awesomity lab, here is the link `https://awesome-star-wars-api.herokuapp.com/`
  #### Java
   <small>Programming language</small>
    Designed the app in Java
  #### Android Studio
    This was my Editor, I used it to write my codes
## Some screenshots of my App

![](app/src/main/res/drawable/screenhome.png)
![](app/src/main/res/drawable/detail.png)

## Personal Information

  **My names: `Uwimana Rachel`**
  **Email: ***Urakhel7@gmail.com*****

## License
  
  MIT License

Copyright (c) [2019] [Uwimana Rachel]

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
  
## End

 Thank you for going through my readme if you have any question feel free to contact me through the personal information       provided above.
