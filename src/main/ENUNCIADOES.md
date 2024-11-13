# Sistema de Monitoreo de Aeropuertos

Un sistema de monitoreo basado en Java que simula y rastrea el estado de una flota de aeronaves y las operaciones del aeropuerto. El sistema puede manejar el monitoreo de hasta 100 aeronaves simultáneamente.

## Características

- Monitoreo en tiempo real del estado de las aeronaves (disponible, en mantenimiento, en vuelo)
- Seguimiento de la capacidad del aeropuerto y disponibilidad de aeronaves
- Información detallada de las aeronaves (modelo, capacidad, estado)
- Soporte para manejar hasta 100 aeronaves simultáneamente
- Suite de pruebas completa

## Funcionalidades Principales

### Gestión de Aeropuerto
- Obtener el número total de aeronaves en el aeropuerto
- Verificar la capacidad actual del aeropuerto
- Monitorear el estado de todas las puertas de embarque
- Generar un reporte del estado del aeropuerto

### Operaciones de Aeronaves
- Listar todas las aeronaves (hasta 100)
- Filtrar aeronaves por estado
- Verificar asientos disponibles por aeronave
- Rastrear la ubicación de las aeronaves (puerta de embarque, mantenimiento, en vuelo)
- Obtener el total de asientos disponibles en el aeropuerto

## Estructura del Proyecto

```
airport-monitoring/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/airport/
│   │           ├── model/
│   │           │   ├── Aircraft.java
│   │           │   └── Airport.java
│   │           └── service/
│   │               ├── AirportService.java
│   │               └── MonitoringService.java
│   └── test/
│       └── java/
│           └── com/airport/
├── pom.xml
└── README.md
```

## Componentes Clave

### Modelos

#### Aeronave
- Identificador único
- Modelo de la aeronave
- Capacidad total de asientos
- Asientos disponibles
- Estado actual (DISPONIBLE, EN_VUELO, EN_MANTENIMIENTO)
- Ubicación actual (número de puerta o bahía de mantenimiento)

#### Aeropuerto
- Capacidad total
- Lista de aeronaves (máximo - 100)
- Número de puertas
- Estado operativo

### Operaciones Principales

#### Gestión de Aeronaves
- Consultar disponibilidad de aeronaves
- Obtener detalles de la aeronave por ID
- Listar todas las aeronaves con su estado actual

#### Funciones de Monitoreo
- Monitoreo de estado en tiempo real
- Contador de aeronaves disponibles
- Total de asientos disponibles
- Aeronaves en mantenimiento
- Aeronaves en vuelo
- Estado de disponibilidad de puertas

## Pruebas

El sistema incluye pruebas unitarias completas que cubren:
- Gestión de la capacidad del aeropuerto
- Capacidades de monitoreo de la flota
- Casos límite y manejo de errores

## Construcción y Ejecución

### Prerrequisitos
- Java 11 o superior
- Maven 3.6.0 o superior

### Comandos de Construcción
```bash
# Limpiar y construir el proyecto
mvn clean install

# Ejecutar pruebas
mvn test
