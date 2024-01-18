# ANDROID
# Tarea 3
- **Autor**: *José Antonio Pérez de Prada*
- **Asignatura**: Multimedia

## Enunciado
Cambia el proyecto para que el segundo activity en vez de ser el contador sea un activity con un FrameLayout en el que se verán los diferentes fragments (mínimo home, contador, salir) y por otra parte una barra de navegación con la que podamos viajar entre los diferentes fragments.

## Resultado
### Ventanas
Este ejercicio cuenta con dos ventanas:

#### Ventana de Login
![ventana de login](resourcesReadme/ventanaLogin.png)

Es la vetana principal del proyecto, es decir, es con la que se iniciará la aplicación. Para acceder a la segunda ventana de la aplicación, el usuario deberá introducir un nombre y una contraseña concretos, los cuales como se pide en el enunciado son en ambos casos *admin*. Esta ventana no ha sido modificada desde el ejercicio 2.

Como se vio en el ejercicio 2, la ventana de login es la que nos permitirá o no acceder al resto del contenido de la aplicación. Si se introduce de forma incorrecta el usuario, la contraseña o ambas a la vez, aparecerá un texto en la parte inferior de la ventana en el que indicará que nos hemos equivocado y tendremos que intentarlo de nuevo.

![](resourcesReadme/loginIncorrecto.png)

Si la contraseña y el usuario son correctos, nos dejará acceder a la segunda ventana de la aplicación.

#### Ventana principal donde se muestran los fragments
![](resourcesReadme/homeFragment.png)

Esta es la ventana que se mostrará tras introducir correctamente el nombre y la contraseña. A diferencia del ejercicio anterior, en esta ventana se muestran el **fragmentContainerView** y el **bottomNavigationView**.

- El **fragmentNavigationView** es donde se mostrarán los fragments de la aplicación. En este caso tenemos 2 fragments más a parte del que se ve en la captura que se mostrarán más adelante.

- El **bottomNavigationView** es el encargado de que podamos visualizar los fragments. Dicho de otra forma, es el encargado de que podamos cambiar de un fragment a otro.

Cuando pulsamos alguna de las dos otras opciones del **bottomNavigationView** podemos a ir a laguna de estos fragments:

### Con el votón de Counter:
![](resourcesReadme/toCounter.png)

![](resourcesReadme/counterFragment.png)

El contador sigue sin hacer nada, pero en este caso lo que hemos hecho es cambiarlo de una actividad a un fragment.

### Con el votón de Logout:
![](resourcesReadme/toLogout.png)

![](resourcesReadme/logoutFragment.png)

Este fragment es como el fragment de Home, pero en el caso de que fuera una aplicación realista, este fragment mostraría la opción de poder salir de la aplicación pulsando un botón.