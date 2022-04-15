class BankAccount{

//double checkingBalance and savingBalance (belonging to bank account)
    private double checkingBalance;
    private double savingsBalance;

//Static number of accounts created so far (belonging to bank account)
    public static int numberOfAccounts = 0;
    public static double totalHoldings = 0;

//Create a class member (static) that tracks the total amount of money stored in every account created.
//In the constructor, be sure to increment the account count.
    public BankAccount(){
        BankAccount.numberOfAccounts += 1;
        this.checkingBalance= 0;
        this.savingsBalance = 0;
    }

//Create a getter method for both checkings and savings account
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingBalance(){
        return this.savingsBalance;
    }

//Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public void depositMoney( double amount, String account){
        if (account == "checking"){
            this.checkingBalance += amount;
        }else{
            this.savingsBalance += amount;
        }
        this.totalHoldings += amount;
    }
//Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdrawMoney( double amount, String account){
        if (account == "checking"){
            if (amount > this.checkingBalance){
                System.out.println("Insufficient Funds");
                return;
            }
            this.checkingBalance -= amount;
        }else{
            if (amount > this.savingsBalance){
                System.out.println("Insufficient Funds");
                return;
            }
            this.savingsBalance -= amount;
        }
        this.totalHoldings += amount;
    }

//Create a method to see the total money from the checking and saving, (%.2f formats decimal to the 10s place (used for money))
    public void displayAccountBalance() {
        System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.checkingBalance, this.savingsBalance));
    }

}