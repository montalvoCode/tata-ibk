# TATA - PROYECTO BACKEND

### Requisitos

Plugins que deben estar instalados en su IDE:
* [Lombok](http://projectlombok.org/) - *Libreria de Bytecode que genera automaticamente los Getters y Setters*.
* Java 8
---
Ejecutar DockerFile - Ambiente Linux

Creación de imagen docker
* docker build -t ibk:1.0 .

Creación de contenedor con la imagen construida
* docker run -d -p 9090:8080 --name ibk_container ibk:1.0
---
