package final_project;
import java.io.*;           //to use File classes
import java.util.Scanner;  //to use scanner 



public class Rent {
    // fields
    private int days;
    private Customer customer;
    private Bus bus;
    private double TotalPrice;
    
    
    
    
    
    
    
    
    
    
    
    
    // no arg constructor preforms initial values
    public Rent(){
        days=0;
        customer=null;
        bus=null;
        this.TotalPrice=0;
    }
    
    // constructor
    public Rent( int days ,Customer cust , Bus bus ){
        this.days=days;
        this.customer=cust;
        this.bus=bus;
    }

    
    
    
    
    
    
    
    
    //METHOD set_days  assighn valus 
    public void set_days( int days ) {
        this.days=days;
    }
    //METHOD set_customer  assighn valus 
    public void set_customer( Customer cust ) {
        this.customer=cust;
    }
    //METHOD set_bus  assighn valus 
    public void set_bus( Bus bus ) {
        this.bus=bus;
    }
    
    
    
    
    //METHOD get_days return days
    public int get_days(){
        return days;
    }
    //METHOD get_customer return days
    public Customer get_customer(){
        return customer;
    }
    //METHOD get_bus return bus
    public Bus get_bus(){
        return bus;
    }

    
    
    
    
    
    //METHOD to calculate the price
    public void calc_price(){
        TotalPrice= (this.days)*(this.bus.get_price());
        
    }
    
    
    
    
    //toString method
    public String toString(){
        String str="Rent Info:\n "+this.customer
                +"\n"+this.bus+
                "\nNum days:"+this.days
                +"\nTotal Price:"+this.TotalPrice;
        return str;
        
    }
    
    
    
    
    
    
       
  
  
    
    //METHOD to store Rental information into a file
    public void store_rent_info_file() throws IOException{
        FileWriter fwrite = new FileWriter("Rent.txt",true);
        PrintWriter write = new PrintWriter(fwrite);
        
        write.print(this.customer.get_customer_name()+"\t\t");
        write.print(this.bus.get_BusNumber()+"\t\t");
        write.print(this.days+"\t\t");
        write.print(this.TotalPrice);
        write.close(); 
        
    }
    
    
    
       
    
        
    //METHOD to display customer information from a file
    public void display_rent_info_file()throws IOException{
        int count=1;
        
        System.out.println("\tCustomer Name\tBus plate number\t Total Price");
        
        File file = new File("Rent.txt");                               // to open file
        Scanner scan = new Scanner(file);                              // Scanner to read input from file
        
            while(scan.hasNext()){
                String line=scan.nextLine();;
                System.out.println(count+"\t"+line);
                count++;
            }
        scan.close();                                                  // Scanner.close();
    }

}
