Sprint02-End
===================


- Heroku: Por medio de Parse se podrían hacer los deploys. Otra opcion seria con appEngine


- [Android] unitTest Modelo 
- [Android] Home UI reorganized  

- [Android] Persistencia local (data offline), se decidió guardar el json directamente por medio de SharedPreferences, y no usar sqlite-

- [Windows Phone 10]Manipulación del json con c# y https://github.com/JamesNK/Newtonsoft.Json/releases Desarrollo de pequeños scripts para obtener información de los mismos generando nuevos  archivos.
- [Windows Phone 10] Prototipo de buscador de cartas para 
>  Se puede ver la imagen con la consiguiente información contenida en la misma de cualquier carta existente (30000+). Localmente solo contiene un archivo de texto con los nombres de las cartas y su correspondiente identificador que permita acceder a la imagen a través de una consulta http:
En el repo se encuentra un video del mismo en funcionamiento a través del emulador:
- https://github.com/MTG-Helper/android/blob/master/doc/WPCardFinderDemoLocalNamesRemoteImages20160613.flv

- [Youtube](https://youtu.be/S0v4QQTYsTM)

--


    El json más “pequeño” contiene todas las cartas por nombre (+15000), el de los sets pesa 16mb y contiene una gran cantidad de set dentro de las mismas los datos de las cartas correspondientes. Cada objeto “json” contiene dentro infinidad de objetos diferentes Las cartas contienen distinta información según el set al que corresponden (all Sets.json) y también son diferentes entre sí (AllCards.json) este último contiene la información de los sets que la incluyen. 

Se propone desarrollar una estrategia respecto a los datos que se van a manejar de acuerdo a los requerimientos del cliente y las posibilidades de la aplicación.
