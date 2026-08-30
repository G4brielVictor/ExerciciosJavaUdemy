package src.secao13_Heranca.Ex3.Entities;

public class Enterprise extends TaxPayer{

    private Integer numberOfEmployees;

    public Enterprise(){

    }

    public Enterprise(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double liquidAnnual = 0;
        if(numberOfEmployees <= 10){
            liquidAnnual = getAnnualIncome() * 0.16;
        }
        else {
            liquidAnnual = getAnnualIncome() * 0.14;
        }

        return liquidAnnual;
    }
}
