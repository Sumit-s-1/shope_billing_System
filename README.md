# Shope_billing_System
 A Shop Billing System is a software application or a set of procedures used by shops and retail businesses to manage and automate the process of generating bills for customers. It typically integrates with point-of-sale (POS) systems, inventory management, and financial reporting tools.

•	Product Management: Add multiple products to the bill with their name, price, and quantity.
•	Discounts: Apply discounts in percentage to the total amount.
•	Taxes: Apply taxes in percentage to the total amount.
•	Final Shop: Generate a detailed bill showing product details, discounts, taxes, and the total payable amount.
•	Input Validation: Ensures positive price, quantity, and percentage values for a smooth user experience.
•	Formatted Output: The bill is displayed with proper formatting for better readability.


# How to Use

•	Requirements
                 Java 21 or higher installed on your machine.
                 check your Java version:
bash
java -version
•	Text Editor or IDE for Java (e.g., IntelliJ IDEA, Eclipse, or VS Code).

Running the Program
1.	Clone the repository or download the ShopBillingSystem.java file to your local machine.
                bash
git clone https://github.com/Sumit-s-1/shop-billing-system.git
2.	Compile the Java program using the javac command:
bash
javac ShopBillingSystem.java
3.	Run the compiled Java program:

bash
java ShopBillingSystem

Example Interaction
The program will prompt the user to input the following:

1.	Product Details: For each product, you will enter the name, price, and quantity.
2.	Discount: Apply a discount percentage (optional).
3.	Tax: Apply a tax percentage (optional).
Here’s an example of what the interaction might look like in the terminal:

Enter the number of products:
2
Enter product 1 name:
PC
Enter price for PC:
50000
Enter quantity for PC:
1
Enter product 2 name:
CPU
Enter price for CPU:
500
Enter quantity for CPU:
2
Enter discount percentage (if any, else enter 0):
10
Enter tax percentage (if any, else enter 0):
18

----- over all bill -----
Product               Price      Quantity   Total      
-------------------------------------------------------
PC                50000.00   1          50000.00   
CPU               500.00    2          1000.00    
Total Amount: 51000.00
Discount: 5100.00
Tax: 9180.00
Total Payable Amount: 55080.00
-------------------
Sample Output Format
The generated shop (bill) includes:
•	Product name, price, quantity, and total price per product.
•	Total amount before and after applying discounts and taxes.

Example Code Flow
•	Add products to the bill one by one.
•	Apply discounts (optional).
•	Apply taxes (optional).
•	Generate the final bill (shop).

Classes and Methods
Product Class
•	Attributes: name, price, quantity.
•	Methods:
  o	getTotalPrice(): Calculates the total price for the product (price * quantity).
  o	displayProduct(): Displays product details in a readable format.
Shop Class
•	Attributes:
   o	products[]: Array to store products.
   o	totalAmount: Stores the sum of all products' total prices.
   o	discount: Discount applied to the total amount.
   o	tax: Tax applied to the total amount.
Methods:
   •	addProduct(Product product): Adds a product to the shop.
   •	applyDiscount(double discountPercentage): Applies the discount to the total amount.
   •	applyTax(double taxPercentage): Applies the tax to the total amount.
   •	generateShop(): Generates and displays the final bill with all details.
ShopBillingSystem Class (Main Class)
•	Methods:
  o	Main method to run the system, gather input, and invoke methods from Product and Shop classes to manage products, apply discounts/taxes, and generate the 
  final bill
