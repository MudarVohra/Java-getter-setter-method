/*A87_Mudar Vohra
Q24.Create a class Car containing features about a car like-color,model,name,company.
Create its gettter and setter methods to take values and display them.
*/
import java.util.*;

class Q24_Car{

    static String color, model, name, company;

    String getcolor(){
        System.out.println("Enter the color of car : ");
        Scanner sc  = new Scanner(System.in);
        color = sc.nextLine();

        return color;
    }

    String getmodel(){
        System.out.println("Enter the model of car : ");
        Scanner sc  = new Scanner(System.in);
        model = sc.nextLine();

        return model;
    }

    String getname(){
        System.out.println("Enter the name of car : ");
        Scanner sc  = new Scanner(System.in);
        name = sc.nextLine();

        return name;
    }

    String getcompany(){
        System.out.println("Enter the company of car : ");
        Scanner sc  = new Scanner(System.in);
        company = sc.nextLine();

        return company;
    }

    void setcolor(String color) { 
        this.color = color; 
    } 

    void setmodel(String model ) { 
        this.model = model; 
    } 

    void setname(String name) { 
        this.name = name; 
    } 

    void setcompany(String company) { 
        this.company = company; 
    } 

    void display(){
        System.out.println("Color of car is : " + color);
        System.out.println("Model of car is : " + model);
        System.out.println("Name of car is : " + name);
        System.out.println("Company of car is : " + company);
    }
    public static void main(String[] args) {
        Q24_Car obj;
        obj= new Q24_Car();

        obj.getcolor();
        obj.getmodel();
        obj.getname();
        obj.getcompany();
    
        obj.setcolor(color);
        obj.setmodel(model);
        obj.setname(name);
        obj.setcompany(company);

        obj.display();
    }
}