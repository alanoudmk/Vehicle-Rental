# Vehicle-Rental
This is a Java program that simulates a bus rental application. It allows users to perform various actions such as adding customers, adding buses, renting buses, and displaying information.
-The project developed for the University of Jeddah OOR (Object-Oriented Programming) course.


#Code Overview
The code consists of a single class, Main, which contains the main method and other supporting methods.



#Usage
The program uses the following classes:
- `Customer`: Represents a customer with attributes such as name, phone number, ID, and age.
- `Bus`: Represents a bus with attributes such as color, type, number, and price per day.
- `Rent`: Represents a rental transaction with attributes such as the number of days, the customer renting the bus, and the rented bus.
  
The program uses `ArrayList` to store objects of `Customer` and `Bus` classes. It provides a menu-driven interface where users can choose different options.
Here's a breakdown of the program:
1. The `main` method initializes necessary variables, creates objects of the required classes, and displays a welcome message.
2. The program enters a while loop that displays a menu and prompts the user for a choice. The user's input is read using a `Scanner`.
3. Based on the user's input, the program performs different operations:
   - Option 1: Adds a new customer by taking input for their name, phone number, ID, and age. The customer object is then added to the `customers` ArrayList.
   - Option 2: Adds a new bus by taking input for its color, type, number, and price per day. The bus object is then added to the `buses` ArrayList.
   - Option 3: Creates a new rental transaction by taking input for the bus number, customer number, and number of days. The rental object is created using the selected bus and customer objects, and then stored.
   - Option 4: Displays information about all customers by reading from a file.
   - Option 5: Displays information about all buses by reading from a file.
   - Option 6: Displays information about all rentals by reading from a file.
   - Option 7: Exits the program.
4. The `menu` method displays the menu options.
5. The `valid_age` method is used for input validation, ensuring that the customer's age is not less than 25.
Note: The program relies on additional methods and classes (`Customer`, `Bus`, `Rent`) that are not shown in the provided code snippet.




#Customer
1. The class has three constructors:
   - The no-argument constructor initializes the instance variables with default values.
   - The parameterized constructor accepts values for customer name, phone number, ID, and age and assigns them to the respective instance variables.
   - The third constructor accepts an object of the `Customer` class as an argument and copies the values of its instance variables to the current object.
2. The class provides setter methods to assign values to the customer's name, phone number, ID, and age.
3. The class provides getter methods to retrieve the values of the customer's name, phone number, ID, and age.
4. The `toString` method returns a formatted string representation of the customer's information.
5. The `store_customer_info_file` method writes the customer's information to a file named "CustomerInfo.txt". It uses a `FileWriter` and a `PrintWriter` to write the information line by line.
6. The `display_customer_info_file` method reads the customer information from the "CustomerInfo.txt" file and displays it in a formatted manner. It uses a `File` object and a `Scanner` to read the file line by line and prints the information using a while loop.
Note: Both the `store_customer_info_file` and `display_customer_info_file` methods throw an `IOException`, so you need to handle it appropriately when calling these methods.



#Rent Class
The Rent class represents a rental transaction. It contains information about the number of days, customer, and bus involved in the rental. It provides methods for setting and getting these values, calculating the rental price, and storing/displaying rental information.
The Rent class has the following components:
  --Fields
days: Represents the number of days for the rental.
customer: Represents the customer associated with the rental.
bus: Represents the bus rented.
TotalPrice: Represents the total price for the rental.
  --Constructors
Rent(): Constructs a default Rent object with initial values for all fields.
Rent(int days, Customer cust, Bus bus): Constructs a Rent object with the provided number of days, customer, and bus.
  --Setter Methods
set_days(int days): Sets the number of days for the rental.
set_customer(Customer cust): Sets the customer associated with the rental.
set_bus(Bus bus): Sets the bus rented for the rental.
  --Getter Methods
get_days(): Returns the number of days for the rental.
get_customer(): Returns the customer associated with the rental.
get_bus(): Returns the bus rented for the rental.
  --Additional Methods
calc_price(): Calculates the total price for the rental based on the number of days and the bus's price per day.
toString(): Returns a string representation of the rental, including customer information, bus information, number of days, and total price.
store_rent_info_file(): Stores the rental information into a file named "Rent.txt".
display_rent_info_file(): Displays the rental information from the "Rent.txt" file.



#Bus Class
Here's a breakdown of the code:
1. The class has two constructors:
   - The constructor with parameters accepts values for bus color, type, price, and plate number and assigns them to the respective instance variables.
   - The no-argument constructor initializes the instance variables with default values.
2 The class provides a constructor that accepts an object of the `Bus` class as an argument and copies the values of its instance variables to the current object.
3. The class provides setter methods to assign values to the bus's color, type, price, and plate number.
4. The class provides getter methods to retrieve the values of the bus's color, type, price, and plate number.
5. The `toString` method returns a formatted string representation of the bus's information.
6. The `store_bus_info_file` method writes the bus's information to a file named "BusInfo.txt". It uses a `FileWriter` and a `PrintWriter` to write the information line by line.
7. The `display_bus_info_file` method reads the bus information from the "BusInfo.txt" file and displays it in a formatted manner. It uses a `File` object and a `Scanner` to read the file line by line and prints the information using a while loop.
Note: Both the `store_bus_info_file` and `display_bus_info_file` methods throw an `IOException`, so you need to handle it appropriately when calling these methods.




#File Handling
The Rent and Customer classes use file handling to store and retrieve information from files named "Rent.txt" and "CustomerInfo.txt", respectively. Ensure that these files exist and are accessible in the program's execution environment.

