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
public class Desktop extends Computer{
    private boolean hasExtraLight;
 
   
    
    public Desktop(int price){
        super(price,"unknown");
    }
    
    public Desktop(int price, String brand, boolean hasExtraLight){
        super(price,brand);
        this.hasExtraLight=hasExtraLight;
        setPrice(price);
    }
    public void hasExtraLight(boolean hasExtraLight){
        if(hasExtraLight == true){
            this.hasExtraLight=true;
        }else{
            this.hasExtraLight=false;
        }
    }
    @Override
    public void setPrice(int price) {
        if(hasExtraLight == true){
            this.price=price +10;
        }
    }
    
}
