# 5PruebaDeEvaluacion

Este repositorio contiene una aplicación de gestión para una cadena de restaurantes. La aplicación está diseñada para proporcionar funcionalidades como la preparación de mesas y el servicio de comida. El código fuente está estructurado utilizando varios patrones de diseño para mejorar la modularidad y la flexibilidad del sistema.

## Clases Principales

### `BookingSystemAdapter`

Esta clase es un adaptador que permite integrar un sistema de reservas externo en la aplicación. Implementa la interfaz `Restaurant`, lo que le permite ser utilizado como un restaurante en el sistema.

### `ExternalBookingSystem`

Esta interfaz define las operaciones que debe proporcionar un sistema de reservas externo. En este caso, solo incluye el método `bookTable()` para reservar mesas.

### `Restaurant`

Esta interfaz define las operaciones que debe proporcionar un restaurante en la aplicación. Incluye los métodos `prepareTables()` para preparar mesas y `serveFood()` para servir comida.

## Patrones Utilizados
### Patrón de Construccion (Factory Method y Singleton)
### Patrón de Estructuracion (Composite, Adapter y Observer)


El patrón adaptador se utiliza para integrar el sistema de reservas externo (`ExternalBookingSystem`) en la aplicación como un restaurante (`Restaurant`). La clase `BookingSystemAdapter` actúa como un adaptador entre las interfaces incompatibles, permitiendo que el sistema de reservas externo sea utilizado como un restaurante en la aplicación.


