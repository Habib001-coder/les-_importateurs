package models;

public class GoodsDetails {
    private  String name;
    private  String serial;
    private  String quantity;
    private  String origin;

    public  GoodsDetails(String name, String serial, String quantity, String origin){
        this.name= name;
        this.serial= serial;
        this.quantity=quantity;
        this.origin=origin;



    }


    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial( String serial ) {
        this.serial = serial;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity( String quantity ) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin( String origin ) {
        this.origin = origin;
    }
}
