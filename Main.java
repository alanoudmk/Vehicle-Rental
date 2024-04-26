package final_project;
import java.io.*;           //to use File classes
import java.util.Scanner;  //to use scanner 
import java.util.ArrayList;  //to use ArrayList
import java.util.*; 




public class Main {

    
    
    public static void main(String[] args) throws IOException  {
        int choice;
        boolean flag=true;
        Scanner scan = new Scanner(System.in);                              // Scanner to read input from user
        
        
        ArrayList<Customer> customers = new ArrayList<Customer>();          //ArrayList contains object of Customer type
        ArrayList<Bus> buses = new ArrayList<Bus>();                        //ArrayList contains object of Bustype
        
        
        Customer c = new Customer();                                        //object of each class we have
        Bus b = new Bus();
        Rent r = new Rent();
        
        
        
        
        
        System.out.println("**** Welcome to our Bus Rental Application ****\n");
        
        
        
        
        
        
        while(flag){
            menu();
            choice=scan.nextInt();
            scan.nextLine();
            
            
            
            switch(choice){
                case 1:
                    String cust_name ;
                    int cust_id;
                    int cust_age;
                    int cust_phone;
                    
                    System.out.println("Enter Customer Name : ");
                    cust_name=scan.nextLine();
                    System.out.println("Enter Customer Phone Number : ");
                    cust_phone= scan.nextInt();
                    System.out.println("Enter Customer Id : ");
                    cust_id= scan.nextInt();
                    // validation
                    cust_age=valid_age();                                                 
                    
                    
                    Customer cus = new Customer(cust_name,cust_phone,cust_id,cust_age );  // object
                    customers.add(cus);                                                   // add the cust in the ArrayList customer
                    cus.store_cutsomer_info_file();
                    break;
                    
                    
                case 2 :
                    String bus_color;
                    String bus_type;
                    String bus_num;
                    double bus_price;
                    
                    scan.nextLine();
                    System.out.println("Enter Bus color : ");
                    bus_color=scan.nextLine();
                    System.out.println("Enter Bus type : ");
                    bus_type=scan.nextLine();
                    System.out.println("Enter Bus number : ");
                    bus_num=scan.nextLine();
                    System.out.println("Enter Bus price per day : ");
                    bus_price=scan.nextDouble();
                    
                    
                    Bus bus = new Bus(bus_color , bus_type , bus_price,bus_num);      //object 
                    buses.add(bus);                                                   // add the bus in the ArrayList buses
                    bus.set_price(bus_price);
                    bus.store_bus_info_file();
                    break;
                 
                    
                case 3:
                    int num_bus;
                    int num_customer;
                    int num_day ;
                    
                    c.display_customer_info_file();
                    System.out.println("---------------------------");
                    b.display_bus_info_file();
                    System.out.println("---------------------------");
                    
                    System.out.println("Enter bus number : ");
                    num_bus=scan.nextInt();
                    System.out.println("Enter customer number : ");
                    num_customer=scan.nextInt();
                    System.out.println("Enter number of days : ");
                    num_day =scan.nextInt();
                    System.out.println("---------------------------\n\n");
                    
                    
                    Rent rent = new Rent(num_day , customers.get(num_customer-1) , buses.get(num_bus-1));
                    
                    System.out.println("**** New Rent For: ****");
                    System.out.println(customers.get(num_customer-1));
                    System.out.println("**** For The Bus:  ****");
                    System.out.println(buses.get(num_bus-1));
                    rent.store_rent_info_file();
                    System.out.println("---------------------------\n\n");
                    break;
                    
                    
                case 4:
                    c.display_customer_info_file();
                    break;
                    
                    
                case 5:
                    b.display_bus_info_file();
                    break;
                    
                    
                    
                case 6:
                    r.display_rent_info_file();
                    break;
                   
                    
                case 7:
                    System.out.println(" GOOD BYE ");
                    flag=false;
                    break;
                    
                    
                default:
                    System.out.println("wrong choice/n/n");
                    break;
            }
                    
    } 
    
        
        
        
        
        
        
    }
        
        
        
    
    
    
    
    
    
    public static void menu(){
        
        System.out.println("1. Add Customer : ");
        System.out.println("2. Add Bus : ");
        System.out.println("3. New Rent : ");
        System.out.println("4. Display all Customers information : ");
        System.out.println("5. Display all Bus information : ");
        System.out.println("6. Display all Rent information : ");
        System.out.println("7. exit  \n");
        System.out.println("Enter your choice : ");
    }
        
        
    public static int valid_age(){
          Scanner scan = new Scanner(System.in);    
          int age;
          do{
          System.out.println("Enter Customer Age : ");// validation
          System.out.println("*NOTE: age must be not less than 25");
          age= scan.nextInt();
          }while(age<=25);
          return age;          
    }
}






