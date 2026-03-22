# Ejercicio pasar a mayúsculas

Creación del proyecto usando MVC.

La aplicación le solicita un texto al usuario, y se lo devuelve en mayúsculas.

```plantuml
@startuml
skinparam style strictuml
skinparam Monochrome true
left to right direction

actor "Usuario" as user

rectangle "Aplicación de Texto" {
    usecase "Transformar texto a mayúsculas" as UC1
}

user --> UC1 : Introduce texto y\nrecibe el resultado
@enduml
```

## Consideraciones técnicas

Esta plantilla usa devcontainer, veremos su explicación en clase con detalle, pero a de forma sencilla es indicarte es como si tuvieses arrancada una máquina virtual con todo el software que necesites y solo pesase 250 MB. Para que te funcione necesitas en tu ordenador el siguiente software:

- VSCode
- Docker

>Nota: JDK, git, maven... todo el software está ya instalado en el `devcontainer`.

### Ejecutar el devcontainer

1. Abre el proyecto clonado con VSCode
2. Detectará que tiene un devcontainer:

<img src="img/abrirDevContainer.png">

Verás que te abre una nueva instancia de VSCode con todo el software (herramientas y extensiones de VSCode) instalado.