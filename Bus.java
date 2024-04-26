
package final_project;
import java.io.*;            //to use File classes
import java.util.Scanner;    //to use scanner 



public class Bus {
    // fields
    private String color;
    private String type;
    private double price;
    private String BusNumber;


    
    
    
    
    
    // constructor
    public Bus( String color ,String type , double price,String BusNumber ){
        this.color=color;
        this.type=type;
        this.price=price;
        this.BusNumber=BusNumber;
    }
    // no arg constructor preforms initial values
    public Bus(){
        color="";
        type="";
        price=0;
        BusNumber="";
    }
    /*
    ADD
    */
    // costructor accept object as argument
    public Bus(Bus bus){
        this.color=bus.color;
        this.type=bus.type;
        this.price=bus.price;
        this.BusNumber=bus.BusNumber;
    }

    
    
    
    
    
    //METHOD set_color   assighn valus 
    public void set_color( String color ) {
        this.color=color;
    }
    //METHOD set_type  assighn valus 
    public void set_type( String type ) {
        this.type=type;
    }
    //METHOD set_price  assighn valus 
    public void set_price ( double price  ) {
        this.price =price ;
    }
    //METHOD BusNumber  assighn valus 
    public void set_BusNumber ( String num  ) {
        this.BusNumber =num ;
    }
    
    
    
    
    
    
    
    
     //METHOD get_color return bus color
    public String get_color(){
        return color;
    }
    //METHOD get_type return bus type
    public String get_type(){
        return type;
    }
    //METHOD get_price  return bus price 
    public double get_price (){
        return price ;
    }
    //METHOD get_BusNumber return bus plate number
    public String get_BusNumber (){
        return BusNumber ;
    }
    
    
    
    
    
    
    //toString method
    public String toString(){
            return "Bar Info:\nBus Type:: "+this.type
                    +"\nBus Color: "+this.color
                    +"\nBus Plate Number: "+this.BusNumber+
                    "\nPrice Per Day:"+this.price;      
    }
    
    
    
    
    
    
    
    
     //METHOD to store Bus information into a file
    public void store_bus_info_file() throws IOException{
        FileWriter fwrite = new FileWriter("BusInfo.txt",true);
        PrintWriter write = new PrintWriter(fwrite);
        write.print(this.type+"\t\t  ");
        write.print(this.color+"\t\t");
        write.print( this.price+"\t\t");
        write.println(this.BusNumber);
        write.close(); 
    }
    
    
   
    
    
    
    
    //METHOD to display bus information from a file
    public void display_bus_info_file() throws IOException{
        int count=1;
        
        System.out.println("No.\tBus Type\t Bus Color\t Price Per Day \t Plate Number");
        
        
        File file = new File("BusInfo.txt");                           // to open file
        Scanner scan = new Scanner(file);                              // Scanner to read input from file
        
        
            while(scan.hasNext()){
                
                String line=scan.nextLine();
                System.out.println(count+"\t"+line);
                count++;
                
            }
            
           
        scan.close();                                                  // Scanner.close();
    }

}
