## SMU Web Dev Speedrun - CLI Cafe

CLI Cafe is a task to help you practise how to work with JDBC in Java projects.

This project consists an incomplete CLI application that you will need to connect to a MySQL database to allow your users to interact with a cafe in CLI.

## Features to Support

The CLI Cafe must be able to support:

- Viewing of the Food Menu
  - Selecting food menu should first displays a list of categories
  - Selecting a category in the food menu should show all the food in the selected category
  - Selecting a food item should show the user the choice to either add to cart or go back
  - Selecting the choice to add to cart should prompt for the user on the quantity to add
- Viewing of the Cart
  - Selecting the cart menu should display all the items in the cart
  - Selecting the option to checkout the cart should create a receipt in the database and clear the cart
  - Selecting the option to remove an item from the cart should prompt the user the quantity to remove from the cart, checking what's the maximum possible to remove
- Viewing of the Past Receipts
  - Selecting the past receipts menu should display all the past receipts, paginated by up to 5 receipts per page.
  - Selecting the previous or next page should display the previous or next 5 receipts offset by the page number
 
## Setup

1. Create a new directory `lib`.
2. Add the JDBC jar into the `lib` directory.
3. In your local MySQL server add a new schema.
4. Run the `local/table.sql` to seed the databse tables.
5. Run the `local/data.sql` to seed the data for the tables.

## Tasks

Look for all the `// TODO` in code to find all the tasks.

If you are using IntelliJ, you can find all the TODOs using View > Tool Windows > TODO.

## Extra Challenges

If you want to have extra challenges, try implementing some of the following extra features:

- [ ] User login before able to make orders, link receipts to individual users.
- [ ] Inventory count for the food items, doing extra validations before allowing a food item to be placed in order.
- [ ] Admin management of categories and food, allowing the admin to have the ability to **C**reate, **U**pdate, **D**elete categories and food items.
