package src.secao8_POO.ex03.Entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        return grade1+grade2+grade3;
    }

    public double missingPoints(){
        if(finalGrade()>=60){
            return finalGrade();
        }
        else {
            return 60 - finalGrade() ;
        }
    }
}
