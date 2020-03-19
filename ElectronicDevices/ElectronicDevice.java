
import electronicdevice.Computer;
import electronicdevice.Desktop;
import electronicdevice.Laptop;
import electronicdevice.Tablet;
import java.util.ArrayList;
import java.util.List;

/*##Example
1. Create abstract class Computer ("brand", "price", "getPrice()", "getBrand()", "setBrand()").
Only "setPrice()" will be abstract. Subclasses Laptop, Desktop, Tablet.
2. You can only specify "price", "brand" while creating the object(use appropriate Constructors).
No class will have a default constructor.
All classes will have 2 constructors. One with "price" and one with "price-brand".
3. Make 10 objects and store to list.
4. Get the sum of prices according to "brand". Print sum of each brand and print total.
5.Modify the program so that user(main method) cannot change the brand of the computer.
6.Get the sum of prices according to "object type".
package electronicdevice;*/

/**
 *
 * @author Nikos Sageorgis
 */
public class ElectronicDevice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sony = "Sony";
        String acer = "Acer";
        String asus = "Asus";
        String lenovo = "Lenovo";
        Computer desktop1 = new Desktop(900,sony,true);
        Computer laptop1 = new Laptop(700,acer,true);
        Computer tablet1 = new Tablet(50,asus,false);
        Computer desktop2 = new Desktop(800,sony,true);
        Computer laptop2 = new Laptop(1100,acer,true);
        Computer tablet2 = new Tablet(90,asus,false);
        Computer desktop3 = new Desktop(750,sony,true);
        Computer laptop3 = new Laptop(400,lenovo,true);
        Computer tablet3 = new Tablet(120,asus,false);
        Computer laptop4 = new Laptop(500);
        Computer tablet4 = new Tablet(120);
        
        List <Computer> computers = new ArrayList();
        
        computers.add(desktop1);
        computers.add(laptop1);
        computers.add(tablet1);
        computers.add(desktop2);
        computers.add(laptop2);
        computers.add(tablet2);
        computers.add(desktop3);
        computers.add(laptop3);
        computers.add(tablet3);
        computers.add(laptop4);
        computers.add(tablet4);
        
        int sumSony = 0;
        int sumAcer = 0;
        int sumAsus = 0;
        int sumLenovo = 0;
        int sumUnknown = 0;
        int sumTotal = 0;
        
        for (Computer c : computers){
            if(c.getBrand().equals(sony)){
                sumSony+=c.getPrice();
            }else if(c.getBrand().equals(acer)){
                sumAcer +=c.getPrice();
            }else if(c.getBrand().equals(asus)){
                sumAsus +=c.getPrice();
            }else if(c.getBrand().equals(lenovo)){
                sumLenovo +=c.getPrice();
            }else{
                sumUnknown += c.getPrice();
            }
        }
        
        sumTotal = sumAcer + sumAsus + sumSony + sumUnknown + sumLenovo;
        System.out.printf("%s Computers cost %d$\n",sony, sumSony);        
        System.out.printf("%s Computers cost %d$\n",acer, sumAcer);        
        System.out.printf("%s Computers cost %d$\n",lenovo,sumLenovo);        
        System.out.printf("%s Computers cost %d$\n",asus, sumAsus);        
        System.out.printf("%s Computers cost %d$\n","unknown", sumUnknown);        
        System.out.printf("%s Computers cost %d$\n","Total", sumTotal);
        
        int sumLaptop = 0;
        int sumDesktop = 0;
        int sumTablet =0;
        for (Computer c : computers){
            if(c instanceof Desktop){
                sumDesktop+=c.getPrice();
            }else if(c instanceof Laptop){
                sumLaptop +=c.getPrice();
            }else if(c instanceof Tablet){
                sumTablet +=c.getPrice();
            }
        }
        
        System.out.printf("%s Computers cost %d$\n", "Desktop",sumDesktop);
        System.out.printf("%s Computers cost %d$\n", "Laptop",sumLaptop);
        System.out.printf("%s Computers cost %d$\n", "Tablet",sumTablet);

    }
    
}
