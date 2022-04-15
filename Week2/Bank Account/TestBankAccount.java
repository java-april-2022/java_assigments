class TestBankAccount {
    public static void main(String[] args ){

        BankAccount dogeBankAccount = new BankAccount();
        dogeBankAccount.depositMoney(800, "checking");
        dogeBankAccount.depositMoney(750, "savings");
        dogeBankAccount.withdrawMoney(100, "checking");
        dogeBankAccount.withdrawMoney(70, "checking");
        dogeBankAccount.withdrawMoney(35, "checking");
        dogeBankAccount.displayAccountBalance();


        BankAccount katBankAccount = new BankAccount();
        katBankAccount.depositMoney(450, "checking");
        katBankAccount.depositMoney(600, "savings");
        katBankAccount.withdrawMoney(10, "checking");
        katBankAccount.withdrawMoney(70, "savings");
        katBankAccount.withdrawMoney(35, "checking");
        katBankAccount.displayAccountBalance();

        System.out.println(dogeBankAccount.getCheckingBalance());
        System.out.println(dogeBankAccount.getSavingBalance());

        System.out.println(katBankAccount.getCheckingBalance());
        System.out.println(katBankAccount.getSavingBalance());

        System.out.println(BankAccount.totalHoldings);
    }   
}
