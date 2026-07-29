# Vehicle OOP Android Assignment

This project is a simple Android application that demonstrates the main Object-Oriented Programming concepts using Java.

The app lets a user type a vehicle brand, choose either **Car** or **Motorcycle**, and then displays information about the selected vehicle.

## OOP Concepts Shown

- **Class:** `Vehicle`, `Car`, `Motorcycle`, and `MainActivity`
- **Object:** The app creates objects such as `new Car("Toyota")`
- **Encapsulation:** The `brand` field is private and accessed using getter and setter methods
- **Abstraction:** `Vehicle` is an abstract class with an abstract `move()` method
- **Inheritance:** `Car` and `Motorcycle` extend `Vehicle`
- **Polymorphism:** `showVehicle(Vehicle vehicle)` accepts different child objects and calls the correct `move()` method

## Project Structure

```text
app/src/main/java/com/example/vehicle/
  Vehicle.java
  Car.java
  Motorcycle.java
  MainActivity.java

app/src/main/res/layout/
  activity_main.xml
```

## How To Run

1. Open the folder in Android Studio.
2. Let Gradle sync the project.
3. Run the app on an Android emulator or a physical Android device.
4. Enter a brand such as `Toyota`, `BMW`, `Honda`, or `Yamaha`.
5. Tap **Show Car** or **Show Motorcycle**.

## Example Output

```text
Vehicle Brand: Toyota
Toyota car is driving on the road.
```
