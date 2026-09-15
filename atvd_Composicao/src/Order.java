import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;

    SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");

    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public void AddItem (OrderItem item){
        items.add(item); ;
    }

    public void removeItem (OrderItem item){
            items.remove(item); ;
        }

    public Double total() {
        Double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: " + moment + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " (" + dt1.format(client.getbirthDate()) + ") - "
                + client.getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : items) {
            sb.append(item.product.getName() +
                    ", $" + item.getPrice() +
                    ", Quantity: " + item.getQuantity()
                    + ", Subtotal: $" + item.subTotal()
                    + "\n");
        }
        sb.append("Total price: $" + total());
        return sb.toString();
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
}
