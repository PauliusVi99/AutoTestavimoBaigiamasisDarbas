# PetCity Automation Test

#### Reference: https://www.petcity.lt

### Test Cases:

1. Test the Search bar with invalid data
   * Go to home page
   * Enter valid product
   * Click search icon
   * Check if error message is shown


2. Test the Search bar with valid data
    * Go to home page
    * Enter invalid product
    * Click search
    * Check if product card is present


3. Test a shop category selecting
    * Go to  home page
    * Click "E-parduotuvė" in navigation bar
    * Click "Katės"
    * Click "Kačių tualetai"
    * Check current URL


4. Test the existing user login
   * Go to login page
   * Enter valid email
   * Enter valid password
   * Click login button
   * Check if user is logged in


5. Test products adding to the cart function
   * Go to E-parduotuve page
   * Add three different types of products with different quantity
   * Check total number of products showed near basket icon 