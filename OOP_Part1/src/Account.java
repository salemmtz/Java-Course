public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        this("56789", 2.5, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = number;
        this.accountBalance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double fund) {
        this.accountBalance += fund;
        System.out.println("You deposit $" + fund + ". New balance is $" + this.accountBalance);
    }

    public void withdrawFunds(double fund) {
        if (this.accountBalance - fund < 0) {
            System.out.println("You have not enough money in your balance");
        } else {
            this.accountBalance -= fund;
            System.out.println("You withdraw $" + fund + ". New balance is $" + this.accountBalance);
        }
    }
}
