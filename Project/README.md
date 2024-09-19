BASIC GROCERY MANAGEMENT SYSTEM
<br>

This project simulates a simple grocery store where users can purchase various items such as Vegetables, Fruits, and Packed Food. Each item category has its own pricing, and the system calculates the total cost based on the selected item and quantity.

<br>
Project Structure
The project includes the following classes:
 <br>
Household (Interface):
<br>
Provides the base methods for item categories, including:
selling(): Displays the list of items available in the category.
pricing(): Calculates and displays the total price based on the quantity.
measuredValue(): Takes input for the quantity to calculate the total price.
<br>
PackedFood:

Implements the Household interface.
Handles various packed food items (Pasta, Magiee, Lays, Biscuits).
Prices are calculated based on predefined rates for each item.
<br>
Vegetables:

Implements the Household interface.
Handles various vegetable items (Carrot, Beetroot, Tomato, Chilly).
Uses an encapsulated class Encaps to store and retrieve the rate of vegetables.
<br>
Fruits:

Implements the Household interface.
Handles various fruit items (Apple, Banana, Mango, Orange).
Prices are based on a fixed rate.