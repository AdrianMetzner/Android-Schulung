# Android-Schulung/ Android Training

This repository holds the base project for a base Android development training. By following the steps below, a complete development environment is set up, which will enable you to start developing directly. This training will use Android Studio, as it is the simples way to get started when developing android applications. If you wish to use a different IDE, you will have to set up your development environment yourself. 
For developing Android Applications, you should install:
*  Gradle
*  Android SDK 
*  AVD-Manager (Android virtual device manager)

## Step 1: Obtaining Android Studio

Go to <https://developer.android.com/studio/index.html> and install android studio for your system. To do so follow the instructions on the page.
After installing, start Android Studio, which performs some initialization tasks, among which the android sdk will be downloaded and configured. Note that some downloads might be required to obtain the SDK.

After successfully starting, Android Studio will display a popup menu, which asks you to either create a new project or import an existing one. If you have obtained this project, you can import it by guiding Android Studio to the corresponding folder. Otherwise follow the dialog and create a new "Empty Activity" project.

## Step 2: Setting up a Virtual Device
In the IDE choose go to the AVD Manager, either under "Tools -> Android -> AVD Manager" or in the icon bar. In the popup, that opens, choose the "Create Virtual Device ..." option on the bottom left. Please follow the instructions in this menu and create a new Phone virtual device. In general it is advisable to create at least one device with the current android version.

##Step 3: The first build

Finally you are ready for building the first app. To do this, press play in the icon bar or choose "Run -> Run 'app' ". This will open a new Dialog, in which you can choose the device on which the app will be launched. If you have followed the instructions under Step 2, you can choose the virtual device you have created already. If you have not created a virtual device, you can create a new one from this dialog as well. After choosing the device Android Studio will compile and launch the app. It even launches the virtual device if it has not been running. If you have imported this project and everything went well, an application will start that displays the app name as well as the information of the device it is started on.

