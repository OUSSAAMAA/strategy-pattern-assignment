# Strategy Pattern – Java Example

This project demonstrates the **Strategy Design Pattern** in Java.  
It shows how you can **dynamically change algorithms (strategies) at runtime** without modifying the context code.  

---

## 📌 What is the Strategy Pattern?

The **Strategy Pattern** allows selecting an algorithm’s behavior at runtime.  
Instead of hardcoding logic, you inject the behavior as an object, which improves:

- Flexibility  
- Extensibility  
- Separation of concerns  

In this example, the `Context` class can execute different strategies depending on user input.

---

## 🧩 How It Works

1. The `Strategy` interface defines a common method: `operationStrategy()`.  
2. Concrete strategies implement `Strategy`:

   - `StrategyImpl1`  
   - `StrategyImpl2`  
   - `StrategyImplDefault`  

3. `Context` holds a reference to a `Strategy` object and executes it via `makeOperation()`.  
4. `Main` allows the user to select which strategy to run using **dynamic class loading (reflection)**.


