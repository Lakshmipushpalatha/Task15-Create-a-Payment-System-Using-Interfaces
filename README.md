# Task15-Create-a-Payment-System-Using-Interfaces
java calculation

## 1. Introduction
The Payment System Using Interfaces is a simple Java application that demonstrates how interfaces can be used to implement multiple payment methods.

This application supports three types of payments:
1. Card Payment
2. UPI Payment
3. Wallet Payment

The program allows users to enter a payment amount and select their preferred payment method. It validates the amount and processes the payment based on the user's choice.

## 2. Objective
The main objectives of this project are:

- To understand Java interfaces.
- To implement an interface in multiple classes.
- To understand loose coupling.
- To perform payment amount validation.
- To implement different payment methods using a common interface.

## 3. Technologies Used
- Java
- Scanner Class
- Switch Statement
- If-Else Statement
- Interface
- Classes and Methods

## 4. Project Structure

The project contains the following interface and classes:

- **Payment:** An interface that declares the common `processPayment()` method.
- **CardPayment:** Implements the Payment interface to process card payments.
- **UPIPayment:** Implements the Payment interface to process UPI payments.
- **WalletPayment:** Implements the Payment interface to process wallet payments.
- **Main:** Takes user input, validates the amount, selects the payment method, and processes the payment.

## 5. Working of the Program

### Step 1: Create Payment Interface
A Payment interface is created with a method named `processPayment(double amount)`.

This method defines common payment behavior for all payment methods.

### Step 2: Implement Card Payment
The CardPayment class implements the Payment interface and provides its own implementation of the `processPayment()` method.

It displays a message indicating that the payment was processed using a card.

### Step 3: Implement UPI Payment
The UPIPayment class implements the Payment interface.

It processes the payment using the UPI payment method and displays the payment amount.

### Step 4: Implement Wallet Payment
The WalletPayment class implements the Payment interface.

It processes the payment using the wallet payment method and displays the payment amount.

### Step 5: Take User Input
The Scanner class is used to accept the payment amount and payment method choice from the user.

### Step 6: Validate Payment Amount
The program checks whether the entered amount is greater than zero.

- If the amount is greater than zero, the program continues.
- If the amount is zero or negative, an invalid amount message is displayed.

### Step 7: Select Payment Method
A switch statement is used to select the payment method.

- Choice 1: Card Payment
- Choice 2: UPI Payment
- Choice 3: Wallet Payment

### Step 8: Process Payment
The selected payment object calls the `processPayment()` method.

The program displays the selected payment method, amount paid, and payment successful message.

## 6. Sample Output

### Card Payment
```text
===== PAYMENT SYSTEM =====
Enter payment amount: Rs. 1000

Select Payment Method:
1. Card Payment
2. UPI Payment
3. Wallet Payment

Enter your choice: 1

Payment processed using Card.
Amount Paid: Rs. 1000.0
Payment Successful!
```

### UPI Payment
```text
Enter payment amount: Rs. 500
Enter your choice: 2

Payment processed using UPI.
Amount Paid: Rs. 500.0
Payment Successful!
```

### Wallet Payment
```text
Enter payment amount: Rs. 250
Enter your choice: 3

Payment processed using Wallet.
Amount Paid: Rs. 250.0
Payment Successful!
```

### Invalid Amount
```text
Enter payment amount: Rs. -100

Invalid amount! Please enter an amount greater than zero.
```

### Invalid Payment Choice
```text
Enter payment amount: Rs. 500
Enter your choice: 5

Invalid payment choice!
```

## 7. Concepts Learned

Through this project, I learned:

- How to create and use interfaces in Java.
- How to implement one interface in multiple classes.
- How to achieve loose coupling.
- How to use method implementation in different classes.
- How to use switch statements for menu selection.
- How to validate user input.
- How to achieve runtime polymorphism using interface references.

## 8. Advantages of Using Interfaces

- Provides abstraction.
- Supports loose coupling.
- Allows multiple classes to follow a common structure.
- Makes programs easier to maintain and extend.
- Helps add new payment methods without changing existing implementations.

## 9. Conclusion

This project helped me understand the concept of interfaces in Java and how they can be implemented by multiple classes.

I also learned how to use interface references, runtime polymorphism, user input, and validation to develop a simple payment application.

**Note:** This is an educational payment simulation. It does not perform actual financial transactions or connect to banking services.
