package src.secao12_Enumeracao.Ex1.Entities;

import src.secao12_Enumeracao.Ex1.Entities_enum.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    //O atributo moment receberá automaticamente a data e hora atuais no momento em que o objeto for instanciado.
    private Date moment = new Date();
    private OrderStatus status;

    //Declaraçao da referência;
    private Client client;
    //Quando uma variável possui como tipo uma classe, ela normalmente armazena uma referência para um objeto daquela classe.


    private List<OrderItem> items = new ArrayList<>();

    public Order(){
    }

    public Order(OrderStatus status, Client client){
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }



    public double total(){
        double totalPrice = 0.0;
        for(OrderItem item : items){
            totalPrice += item.subTotal();
        }
        return totalPrice;
    }
}
