package src.secao14_Exceptions.Ex1.Model.Exceptions;

public class BusinessException extends RuntimeException{
    public BusinessException(String msg){
        super(msg);
    }
}
