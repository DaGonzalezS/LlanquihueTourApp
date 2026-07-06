# LlanquihueTour

## Descripción

Proyecto desarrollado para la asignatura Desarrollo Orientado a Objetos I.

El sistema modela una agencia de turismo que gestiona distintos tipos de servicios turísticos en la región de Llanquihue. Se implementa una jerarquía de clases utilizando herencia simple, aplicando conceptos de Programación Orientada a Objetos como encapsulación, herencia y polimorfismo.

En esta versión se implementa el polimorfismo mediante la sobrescritura del método mostrarInformacion() en las clases derivadas de ServicioTuristico. Esto permite que distintos tipos de servicios sean tratados de forma uniforme utilizando referencias de la clase base.

Además, se utiliza una colección List<ServicioTuristico> para almacenar objetos pertenecientes a distintas subclases. Gracias al polimorfismo en tiempo de ejecución, cada objeto ejecuta su propia implementación del método mostrarInformacion().

## Organización de clases 

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
