public class ShopApp {
    public static void main(String[] args) {
        // create a new instance of customer
        Customer c1 = new Customer();

        // set properties of the customer
        c1.setName("Brian");
        c1.setYearOfBirth(1998);
        c1.setBalance(50.80f);
        c1.setIsNew(true);

        // print messages
        System.out.println("Hello, " + c1.getName() + "."); // string interpolation
        System.out.println("Your balance is: " + c1.getBalance() + "."); // show the value of a property
        System.out.println("Your age is: " + (2023 - c1.getYearOfBirth())+ "."); // show the age of the customer
        System.out.println(c1.getIsNew() ? "The customer is new.":"The customer is not new"); // show if the customer is new or not
        System.out.println(c1.getCode()); // show the customer code
//        c1.code = "123"; // try to change a 'final' variable (commented out otherwise program will throw error)

        // casting
        double balanceInDouble = c1.getBalance();
        int balanceInInt = (int) c1.getBalance();
        System.out.println(balanceInDouble);
        System.out.println(balanceInInt);

    }
}
