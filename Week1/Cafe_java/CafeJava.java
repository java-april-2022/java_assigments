public class CafeJava{
    public static void main(String[] args){
        
String generalGreeting = "Welcome to Cafe Java, ";
String pendingMessage = "Your order will ready shortly ";
String readyMessage = "Your order is ready ";
String displayTotalMessage = "Your total is $";

// Menu Variables
double mochaPrice = 3.5;
double lattePrice = 4.5;
double cappucinoPrice = 3.8;
double dripCoffeePrice = 3.0;

// Customer name variables
String customer1 = "Cindihuri";
String customer2 = "Sam";
String customer3 = "Jimmy";
String customer4 = "Noah";

// Order completions
boolean isReadyOrder1 = false;
boolean isReadyOrder2 = false;
boolean isReadyOrder3 = true;
boolean isReadyOrder4 = true;

//Example
System.out.println(generalGreeting + customer1);

//1)Cindi ordered
System.out.println(readyMessage + customer1);

//2) Noah Ordered a cappucino
if (isReadyOrder4){
    System.out.println(readyMessage + customer4);
    System.out.println(displayTotalMessage + cappucinoPrice);
}
else{
    System.out.println(pendingMessage + customer4);
}

//3) Sam Ordered 2 lattes
System.out.println(displayTotalMessage + lattePrice * 2);
if (isReadyOrder2){
    System.out.println(readyMessage + customer2);
}
else {
    System.out.println(pendingMessage + customer2);
}

//4) Jimmy screw up his latte order and wants a refund ...
System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));

    }
}




