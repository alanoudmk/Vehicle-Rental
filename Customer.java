package final_project;
import java.io.*;           //to use File classes
import java.util.Scanner;  //to use scanner 




public class Customer {
    // fields
    private String customer_name ;
    private int customer_phone ;
    private int customer_id ;
    private int customer_age ;
    
    
    
    
    
    
    // no arg constructor preforms initial values
    public Customer(){
        customer_name = "";
        customer_phone= 0;
        customer_id=0;
        customer_age=0;
        
    }
    // constructor 
    public Customer(String customaer_name  , int customer_phone  , int customer_id , int customer_age ){
        this.customer_name = customaer_name;
        this.customer_phone= customer_phone;
        this.customer_id=customer_id;
        this.customer_age=customer_age;
    }
    /*
    ADD
    */
    // costructor accept object as argument
    public Customer(Customer cust){
        this.customer_name = cust.customer_name;
        this.customer_phone= cust.customer_phone;
        this.customer_id= cust.customer_id;
        this.customer_age= cust.customer_age;
    }
    
    
    
    
    
    
    
    
    
    //METHOD set_customer_name   assighn valus 
    public void set_customer_name( String name ) {
        customer_name=name;
    }
    //METHOD set_ customer_phone   assighn valus
    public void set_customer_phone( int phone ){
        customer_phone=phone;
    }
    //METHOD set_ customer_id   assighn valus
    public void set_customer_id( int id ){
        customer_id=id;
    }
    //METHOD set_ customer_age   assighn valus
    public void set_customer_age( int age ){
        customer_age=age;
    }
    
    
    
    
    
    
    
    //METHOD get_customer_name return customer name
    public String get_customer_name(){
        return customer_name;
    }
    //METHOD get_customer_phone return customer phone number
    public int get_customer_phone(){
        return customer_phone;
    }
    //METHOD get_customer_id return customer id
    public int get_customer_id(){
        return customer_id;
    }
    //METHOD get_ customer_age return customer age
    public int get_customer_age(){
        return customer_age;
    }
    
    
    
    
    
    //toString method
    public String toString(){
        return "Customer Info:\nCustomer name: "+this.customer_name
                +"\nCustomer Phone Number: "+this.customer_phone
                +"\nCustomer National Id: "+this.customer_id
                +"\nCustomer Age:"+this.customer_age;
        
    }
    
    
    
   
    
    
    
    
    
    //METHOD to store customer information into a file
    public void store_cutsomer_info_file() throws IOException{
        FileWriter fwrite = new FileWriter("CustomerInfo.txt",true);
        PrintWriter write = new PrintWriter(fwrite);
        
        write.print(this.customer_name+"\t\t");
        write.print(this.customer_phone+"\t\t");
        write.print( this.customer_id+"\t\t");
        write.println(this.customer_age);
        write.close(); 
    }
    
    
    
   
    
    
    
    //METHOD to display customer information from a file
    public void display_customer_info_file() throws IOException{
        int count=1;
        
        System.out.println("No.\tCustomer name\t Phone\t National ID\t Age");
        
        
        File file = new File("CustomerInfo.txt");                      // to open file
        Scanner scan = new Scanner(file);                              // Scanner to read input from file
        
            while(scan.hasNext()){
                String line=scan.nextLine();
                System.out.println(count+"\t"+line);
                count++;
            }
            
            
        scan.close();                                                  // Scanner.close();
    }


}
