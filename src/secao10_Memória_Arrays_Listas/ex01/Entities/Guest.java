package src.secao10_Memória_Arrays_Listas.ex01.Entities;

public class Guest {

    private final String name;
    private final String email;

    public Guest(String name, String email, int room) {
        this.name = name;
        this.email = email;
    }

    public String toString(){
        return name + ", " + email;
    }
}
