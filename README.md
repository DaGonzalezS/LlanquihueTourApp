# LlanquihueTour

## Descripción

Proyecto desarrollado para la asignatura Desarrollo Orientado a Objetos I.

El sistema modela una agencia de turismo que gestiona distintos tipos de servicios turísticos en la región de Llanquihue. Se implementa una jerarquía de clases utilizando herencia simple, aplicando conceptos de Programación Orientada a Objetos como encapsulación, herencia y polimorfismo.

En esta séptima semana el proyecto implementa polimorfismo a través de la sobrescritura del método mostrarInformacion() en las clases hijas, lo que permite tratar distintos tipos de servicios turísticos de manera uniforme.

Asimismo, se utiliza una colección List<ServicioTuristico> para almacenar objetos de diferentes subclases, aprovechando el polimorfismo en tiempo de ejecución.

## Clases creadas

- ServicioTuristico
- RutaGastronomica
- PaseoLacustre
- ExcursionCultural
- GestorServicios
- Main

## Estructura del proyecto

```
src
├── data
│   └── GestorServicios.java
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
└── ui
    └── Main.java
```

## Funcionamiento

- Se crea un gestor de servicios (GestorServicios)
- Se instancian distintos tipos de servicios turísticos
- Se almacenan en una lista de tipo ServicioTuristico
- Se recorren utilizando polimorfismo
- Se muestra la información de cada servicio en consola

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main` ubicada en el paquete `ui`.
3. El programa mostrará por consola dos instancias de cada tipo de servicio turístico.

## Autor

Daniel González
