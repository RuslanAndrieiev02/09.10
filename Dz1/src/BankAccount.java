public class BankAccount {
    private Person person;
   private String IBAN;
    private double balance;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(Person person, String IBAN, double balance) {
        this.person = person;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "person=" + person +
                ", IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                '}';
    }
}
