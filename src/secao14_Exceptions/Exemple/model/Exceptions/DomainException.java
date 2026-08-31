package src.secao14_Exceptions.Exemple.model.Exceptions;

//RuntimeException: Um tipo de exception que o compilador não te obriga a tratar.
//Exception: O compilador te Obriga a tratar a exception

public class DomainException extends Exception{
    public DomainException(String message){
        super(message);
    }
}
