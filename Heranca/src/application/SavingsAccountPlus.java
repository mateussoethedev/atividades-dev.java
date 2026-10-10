package application;

public class SavingsAccountPlus extends SavingsAccount{
    private double bonus;

    @Override
    public void withDraw ( double amount ){
        balance -= amount -2;
    }

    public SavingsAccountPlus(double bonus) {
        this.bonus = bonus;
    }

}
