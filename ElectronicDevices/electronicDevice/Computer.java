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
public abstract class Computer {
    private String brand;
    protected int price;
    private static int computersCreated;
    public Computer(int price){
        this.price=price;
        computersCreated++;
    }
    
    public Computer(int price, String brand){
        this(price);
        this.brand=brand;
    }

    public static int getComputersCreated() {
        return computersCreated;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public String getBrand(){
        return this.brand;
    }

    private void setBrand(String brand){
        this.brand=brand;
    }
    
    public abstract void setPrice(int price);
}
