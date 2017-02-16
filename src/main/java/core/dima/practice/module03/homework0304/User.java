package core.dima.practice.module03.homework0304;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    private double commission5 = 0.95;
    private double comission10 = 0.90;


    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary() {
        this.balance += this.salary;
        System.out.println("The balance after receipt of salary: " + balance);
    }

    void withdraw(int summ) {
        if (summ < 1000) {
            this.balance -= ((int) (summ * commission5));
        } else {
            this.balance -= ((int) (summ * comission10));
        }
        System.out.println("The balance after withdraw: " + balance);
    }

    void companyNameLenght() {
        System.out.println(this.companyName.length());
    }

    void monthIncreaser(int addMonth) {
        System.out.println(this.monthsOfEmployment += addMonth);
    }


    //  мутаторы и аксессоры))
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


}
