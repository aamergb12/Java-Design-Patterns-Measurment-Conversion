# Java Design Patterns & Measurement Conversion

A Java project exploring interfaces, abstract classes, and callbacks with real-world applications like shirt measurements and mathematical computation.

## 📦 Modules

### 🔢 Measurement Conversion
- Converts shirt sizes between inches and centimeters
- Utilizes an enum (`Units`) for conversion logic

### ➗ Math with Callbacks
- `AbstractMath` defines a math API
- `ConcreteMath` implements actual operations
- Supports custom callbacks via `Callback` interface

### 🔄 Callback Framework
- `Callbacker` triggers callback methods under set conditions
- Fully testable with JUnit-style test classes

## 📁 Project Structure
- `src/`: Java source files
- `test/`: Unit test classes

## 🧪 How to Run Tests
```bash
javac src/**/*.java test/*.java
java test.TestConcreteMath
java test.TestShirtMeasurements
