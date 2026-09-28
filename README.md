# E-Commerce Order Facade

## Overview
This is a lightweight Java backend simulation demonstrating the **Facade Design Pattern**. It orchestrates a complex e-commerce order workflow by providing a simplified, unified interface (`OrderFacade`) that manages various underlying domain subsystems. 

By utilizing the Facade pattern, the client and controller layers are decoupled from the intricate business logic required to process or cancel an order.

## Architecture
*   **OrderController**: Simulates the API layer that receives client requests.
*   **OrderFacade**: The core orchestrator providing a simplified interface for checkout and cancellation.
*   **Subsystems**: Independent services handling Inventory, Payment, Logistics, Notifications, and Analytics.

## Concepts Demonstrated
*   **Facade Pattern**: Encapsulating subsystem complexity.
*   **Data Transfer Objects (DTOs)**: Using an `Order` model to pass data.
*   **Custom Exception Handling**: Managing failure states (e.g., out of stock, payment failed).