package src.secao13_Heranca.Ex3.Entities;

public class Individual extends TaxPayer{

    private Double healthExpense;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpense) {
        super(name, annualIncome);
        this.healthExpense = healthExpense;
    }

    public Double getHealthExpense() {
        return healthExpense;
    }

    public void setHealthExpense(Double healthExpense) {
        this.healthExpense = healthExpense;
    }

    @Override
    public Double tax() {
        double liquidAnnual = 0;

        if(getAnnualIncome() < 20000){
            liquidAnnual = getAnnualIncome() * 0.15;
        }
        else {
            liquidAnnual = getAnnualIncome() * 0.25;
        }

        if(healthExpense > 0){
            liquidAnnual -= healthExpense * 0.50;
        }

        return liquidAnnual;
    }
}
