# Airport Monitoring System

A Java-based monitoring system that simulates and tracks the status of aircraft fleet and airport operations. The system can handle monitoring of up to 100 aircraft simultaneously.

## Features

- Real-time monitoring of aircraft status (available, in maintenance, in flight)
- Airport capacity and aircraft availability tracking
- Detailed aircraft information (model, capacity, status)
- Support for handling up to 100 aircraft simultaneously
- Comprehensive test suite

## Core Functionalities

### Airport Management
- Get total number of aircraft in the airport
- Check airport current capacity
- Monitor all gates status
- Generate airport status report

### Aircraft Operations
- List all aircraft (up to 100)
- Filter aircraft by status
- Check available seats per aircraft
- Track aircraft location (gate, maintenance, airborne)
- Get total seats available in the airport

## Project Structure

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

## Key Components

### Models

#### Aircraft
- Unique identifier
- Aircraft model
- Total seat capacity
- Total seats available
- Current status (AVAILABLE, IN_FLIGHT, IN_MAINTENANCE)
- Current location (gate number or maintenance bay)

#### Airport
- Total capacity
- List of aircraft (max - 100)
- Number of gates
- Operating status

### Main Operations

#### Aircraft Management
- Query aircraft availability
- Get aircraft details by ID
- List all aircraft with their current status

#### Monitoring Features
- Real-time status monitoring
- Available aircraft count
- Total seats available
- Aircraft in maintenance
- Aircraft in flight
- Gate availability status

## Testing

The system includes comprehensive unit tests covering:
- Airport capacity management
- Fleet monitoring capabilities
- Edge cases and error handling

## Build and Run

### Prerequisites
- Java 11 or higher
- Maven 3.6.0 or higher

### Build Commands
```bash
# Clean and build the project
mvn clean install

# Run tests
mvn test
```

## Sample Usage Scenarios

1. **Fleet Status Check**
    - View all 100 aircraft and their current status
    - Filter by available aircraft
    - Filter by aircraft in maintenance

2. **Capacity Monitoring**
    - Check total available seats across all aircraft
    - Monitor gate availability
    - Track aircraft distribution in airport

3. **Status Reports**
    - Generate fleet status summary
    - View maintenance schedule
    - Check airport capacity utilization