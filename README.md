# CrackMe02
## Partagez vos préférences  
English version below

### Objectif :  
Accéder à la page "Gain d'argent" accessible uniquement aux membres Premiums  

### Prérequis :   
- Les Android Platform Tools ou ADB sur votre ordinateur  
https://developer.android.com/studio/command-line/adb  
- Un téléphone physique **ROOT** ou un émulateur **ROOT** comme celui de Genymotion 
https://www.genymotion.com/download/

### Déroulement :  
Téléchargez et installez la release stockée sur ce repo   
OU  
Récupérez le code source (sans le lire) et compilez l'application  

### Règles :  
Interdit de décompiler/recompiler l'application  


### Infos :  
Si vous êtes bloqué, cliquez longtemps sur le bouton en bas à droite de l'écran principal

### Indices menant à la solution :  

<details>
  <summary>1er indice</summary>
  
  Les SharedPreferences sont situées dans le dossier /data/data/APP_PACKAGE_NAME du téléphone
  
</details>

<details>
  <summary>2eme indice</summary>
  
  Le nom du package de l'application est com.fduhen.crackme02
  
</details>

<details>
  <summary>3eme indice</summary>
  
  Les données sauvegardées dans le fichier XML ne sont pas lisibles ? Allez faire un tour sur https://www.base64decode.org/
  
</details>

<details>
  <summary>4eme indice</summary>
  
  Pour éditer un fichier stocké sur le téléphone, il faut le récupérer sur votre poste.  
  ```
  adb pull /chemin/vers/le/dossier/du/telephone ~/chemin/sur/votre/poste
  ```
  Puis le pousser à nouveau sur le téléphone
  
  ```
  adb push ~/chemin/sur/votre/poste/lefichier.extension /chemin/vers/le/dossier/du/telephone 
  ```
  
</details>

-----------

### Objectives :
Access to the "Earn money" pages restricted to Premium members.    

### Prerequisites :  
- Android Platform Tools or ADB on your computer  
https://developer.android.com/studio/command-line/adb  
- A device or emulator with a SD card.  
https://www.genymotion.com/download/

### Steps :
Download the APK stored in the release page of this repo and install it  
OR  
Retrieve the source code (without reading it) and compile it  

### Rules :
You cannot decompile/compile the app

### Infos : 
If you're stuck, long press on the icon in the bottom-right of the app's screen  

### Step by step Tips to help you :  

<details>
  <summary>1st Tip</summary>
  
  The SharedPreferences are located in the folder /data/data/APP_PACKAGE_NAME of your device
  
</details>

<details>
  <summary>2nd Tip</summary>
  
  The app's package name is com.fduhen.crackme02
  
</details>

<details>
  <summary>3rd Tip</summary>
  
  The datas you found in the XML file aren't readable ? Check out this website : https://www.base64decode.org/
  
</details>

<details>
  <summary>4th Tip</summary>
  
  In order to edit a file stored on your phone, you have to retrieve it on your computer first.  
  ```
  adb pull /path/toward/phone/folder ~/path/to/your/computer
  ```
  Then you can edit the file and push it back to the phone's memory.  
  
  ```
  adb push ~/path/to/your/computer/thefile.extension /path/toward/phone/folder 
  ```
  
</details>
