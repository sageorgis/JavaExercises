/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicdevice;

/**
 *
 * @author Nikos
 */
public class Laptop extends Computer{
    private boolean hasWifi;
    
    public Laptop(int price){
        super(price, "unknown");
    }
    
    public Laptop(int price, String brand, boolean hasWifi){
        super(price,brand);
        this.hasWifi=hasWifi;
        setPrice(price);
    }
    

   
    
    @Override
    public void setPrice(int price) {
       if(hasWifi == true){
            this.price = price + 20;
        }
    }
    
}
