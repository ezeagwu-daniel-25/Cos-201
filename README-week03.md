# COS 201 - Week 3 Practical

**Student:** Ezeagwu Ugochukwu Daniel
**Matric Number:** 25/18116
**Programme:** Software Engineering
**Course:** COS 201 - Computer Programming I

## Topic
Variables, Data Types, Expressions and Input/Output.

## Programs

| File | Description |
|------|-------------|
| `SimpleCalculator.java` | Reads two numbers and shows their sum, difference, product, quotient and remainder. |
| `AverageCalculator.java` | Reads three scores and shows the total and average. |
| `ItemCost.java` | Reads an item name, unit price and quantity, then shows the total cost. |

## How to Compile and Run

Make sure the JDK is installed (`javac -version` to check). Open a terminal in the `week03` folder, then:

```
javac SimpleCalculator.java
java SimpleCalculator

javac AverageCalculator.java
java AverageCalculator

javac ItemCost.java
java ItemCost
```

## Sample Output

**SimpleCalculator**
```
Enter the first number: 10
Enter the second number: 4
10.0 + 4.0 = 14.0
10.0 - 4.0 = 6.0
10.0 * 4.0 = 40.0
10.0 / 4.0 = 2.5
10.0 % 4.0 = 2.0
```

**AverageCalculator**
```
Enter the first score: 70
Enter the second score: 80
Enter the third score: 90
Total   = 240.0
Average = 80.00
```

**ItemCost**
```
Enter the item name: Notebook
Enter the unit price: 500
Enter the quantity: 3
Item       : Notebook
Unit price : 500.00
Quantity   : 3
Total cost : 1500.00
```
