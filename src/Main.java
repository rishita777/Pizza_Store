import java.util.Scanner;
public class Main
{
    void displayCustomerDetails(String name, String email, String address, long phoneNo)
    {
        System.out.println("----------------------------------------------------");
        System.out.println("                Order Summery                       ");
        System.out.println("----------------------------------------------------");
        System.out.println("Name : " +name);
        System.out.println("Email ID : "+email);
        System.out.println("Contact Number : " +phoneNo);
        System.out.println("Address : "+address);
    }

    void displayMenu()
    {
        float priceOfRegularPizza = 9.99f;
        float priceOfMediumPizza = 11.99f;
        float priceOfLargePizza = 13.99f;
        float priceOfGarlicBread = 5.99f;
        float priceOfBaverages = 1.99f;

        System.out.println("Select The Item Want to Order");
        System.out.println("Sl No         Item Category");
        System.out.println("-----------------------------------");
        System.out.println("1) Pizza ");
        System.out.println("      Price of One Regular Pizza :  "+priceOfRegularPizza);
        System.out.println("      Price of One Medium Pizza :   "+priceOfMediumPizza);
        System.out.println("      Price of One Large Pizza :    "+priceOfLargePizza);
        System.out.println("2) Garlic Bread ");
        System.out.println("       Price of One Garlic Bread :   "+priceOfGarlicBread);
        System.out.println("3) Beverages ");
        System.out.println("       Price of One Baverages :    "+priceOfBaverages);
    }

    float getPriceOfPizzaBasedOnSize(int size)
    {
        float priceOfPizza = 0;
        if(size == 1)
        {
            priceOfPizza = 9.99f;
        }
        else if(size == 2)
        {
            priceOfPizza = 11.99f;
        }
        else if(size == 3)
        {
            priceOfPizza = 13.99f;
        }
        else
        {
            System.out.println("Invalid Size Enter 1, 2 or 3");
            priceOfPizza = 0;
        }
        return priceOfPizza;
    }


    float getPriceOfGarlicBread()
    {
        return 5.99f;
    }
    float getPriceOfBaverage()
    {
        return 1.99f;
    }
    float calculatepriceOfPizza(int noOfPizza, float priceOfPizza)
    {
        float totalPriceOfPizza = priceOfPizza*noOfPizza;
        return totalPriceOfPizza;

    }
    float calcualtePriceOfGarlic(int noOfGarlicBread, float priceOfGarlicBread)
    {
        float totalGarlicPrice = priceOfGarlicBread*noOfGarlicBread;
        return totalGarlicPrice;

    }

    float calculatePriceOfBaverages(int noOfBaverages, float priceOfBaverages)
    {
        float totalBaveragesPrice = noOfBaverages*priceOfBaverages;
        return totalBaveragesPrice;

    }

    float calculateTotalBill(float totalPizzaPrice, float totalGarlicPrice, float totalBaveragesPrice)
    {
        float totalBillAmount = totalPizzaPrice+totalGarlicPrice+totalBaveragesPrice;
        return totalBillAmount;
    }

    float calculateDiscountAndReturnBillAmount(float totalBillAmount)
    {
        float revisedTotalBillAmount = 0.0f, discountApplied;
        discountApplied = totalBillAmount*10/100;
        revisedTotalBillAmount = totalBillAmount-discountApplied;
        return revisedTotalBillAmount;

    }

    void displayOrderDetails(int noOfPizza, int noOfGarlicBread, int noOfBaverages, float totalPrice, float totalPriceAfterDiscount){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Order Details");
        System.out.println("--------------------");
        System.out.println("Total Number of Pizzas you Have ordered         "+noOfPizza);
        System.out.println("Total Number of Garlic Bread you have Ordered   "+noOfBaverages);
        System.out.println("Total Number of Baverages You Have ordered      "+noOfBaverages);
        System.out.println("---------------------------------------------------------------");
        System.out.println("The Total Bill Amount "+totalPrice);
        System.out.println("Your Revised Bill Amount after Adding Discount "+totalPriceAfterDiscount);
    }
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Main pizzaorderwithmethod = new Main();

        float totalPriceForBaverages = 0.0f;
        float totalPriceForGarlic = 0.0f;
        float totalPriceForPizza = 0.0f;
        float totalBillAmount;
        float revisedBillAmount;
        int noOfPizza=0;
        int noOfBaverages=0;
        int noOfGarlic=0;
        float priceOfPizza;
        int totalnoOfPizza = 0;
        int totalnoOfGarlic = 0;
        int totalnoOfBaverages = 0;

        System.out.println("Please Enter Customer Name :");
        String name = scanner.nextLine();
        System.out.println("Please Enter Customer Email Id :");
        String email = scanner.nextLine();
        System.out.println("Enter Customer Address :");
        String address = scanner.nextLine();
        System.out.println("Enter Customer Phone Number :");
        long phoneNo = scanner.nextLong();
        pizzaorderwithmethod.displayMenu();

        int i = 1;

        while(i==1)
        {
            System.out.println("\nEnter 1 for Pizza 2 for Garlic Bread and 3 for Baverages");
            int isChoice = scanner.nextInt();
            switch(isChoice)
            {
                case 1:
                    System.out.println("Enter the Size of Pizza you want to order for Regular 1 for medium 2 and for large 3");
                    int size = scanner.nextInt();
                    priceOfPizza = pizzaorderwithmethod.getPriceOfPizzaBasedOnSize(size);
                    System.out.println("How Many you want to have");
                    noOfPizza = scanner.nextInt();
                    totalnoOfPizza = totalnoOfPizza+noOfPizza;
                    totalPriceForPizza = pizzaorderwithmethod.calculatepriceOfPizza(totalnoOfPizza, priceOfPizza);
                    System.out.println("Total Price Of Pizza "+totalPriceForPizza);
                    break;

                case 2:
                    System.out.println("How Many Garlic Bread you want to have");
                    noOfGarlic = scanner.nextInt();
                    totalnoOfGarlic = totalnoOfGarlic+noOfGarlic;
                    float prizeOfGarlic = pizzaorderwithmethod.getPriceOfGarlicBread();
                    totalPriceForGarlic = pizzaorderwithmethod.calcualtePriceOfGarlic(totalnoOfGarlic, prizeOfGarlic);
                    System.out.println("Total Price For Garlic Bread "+totalPriceForGarlic);
                    break;

                case 3:
                    System.out.println("How Many Baverages You Want to Have");
                    noOfBaverages = scanner.nextInt();
                    totalnoOfBaverages = totalnoOfBaverages+noOfBaverages;
                    float priceOfBaverages = pizzaorderwithmethod.getPriceOfBaverage();
                    totalPriceForBaverages = pizzaorderwithmethod.calculatePriceOfBaverages(totalnoOfBaverages,priceOfBaverages);
                    System.out.println("Total Price for Baverages "+totalPriceForBaverages);
                    break;

                default:
                    System.out.println("You have Selected Wrong Option kindly Enter 1 for Pizza 2 for Garlic Bread and 3 for Baverages");
                    break;
            }

            System.out.println("Enter 1 to Continue and 0 to Exit");
            i = scanner.nextInt();
        }

        totalBillAmount = pizzaorderwithmethod.calculateTotalBill(totalPriceForPizza, totalPriceForGarlic, totalPriceForBaverages);
        System.out.println("Your Total Bill Amount Including all the orders is "+totalBillAmount);
        revisedBillAmount = pizzaorderwithmethod.calculateDiscountAndReturnBillAmount(totalBillAmount);

        if(revisedBillAmount>=50)

        {
            System.out.println("Congratulations you are eligible for Discount your Revised Bill Amount is "+revisedBillAmount);
        }

        else

        {
            System.out.println("Sorry! You're not eligible for any discount since total bill amount is less 50"+revisedBillAmount);
        }

        pizzaorderwithmethod.displayCustomerDetails(name, email, address, phoneNo);
        pizzaorderwithmethod.displayOrderDetails(totalnoOfPizza,totalnoOfGarlic,totalnoOfBaverages, totalBillAmount, revisedBillAmount);
    }
}