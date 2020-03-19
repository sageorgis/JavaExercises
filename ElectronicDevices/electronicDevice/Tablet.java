
package electronicdevice;

/**
 *
 * @author Nikos
 */
public class Tablet extends Computer{
    private boolean hasBluetooth;
    
    public Tablet(int price){
        super(price,"unknown");
    }
    
    public Tablet(int price, String brand, boolean hasBluetooth){
        super(price,brand);
        this.hasBluetooth=hasBluetooth;
        setPrice(price);
    }
    

    
    @Override
    public void setPrice(int price) {
        if(hasBluetooth == true){
            this.price+=price + 50;
        }
    }
    
}
