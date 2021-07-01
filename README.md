# CrackMe02
## Partagez vos préférences  

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
