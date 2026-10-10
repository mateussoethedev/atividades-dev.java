package application;

import java.util.function.DoublePredicate;

public
//final ( para nao ser herdado )
class SavingsAccount extends Account{
    private Double interestRate;

    @Override
    public
//final ( para nao ser sobreposto )
    void withDraw(double amount){
        balance -= amount;
    }

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }


}
