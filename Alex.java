package alexis;

public class person {

private String name;  
private String city;  
private int age;  
private double height;  
// This MUST be static to keep track of everyone  
private static int totalPeople;   

// Constructor (This matches your image)  
public person(String name, String city, int age, double height) {  
    this.name = name;  
    this.city = city;  
    this.age = age;  
    this.height = height;  
    totalPeople++;  
}  

public void displayinfo() {  
    System.out.println("=== Person Information ===");  
    System.out.println("name : " + this.name);  
    System.out.println("city : " + this.city);  
    System.out.println("age  : " + this.age);  
    System.out.println("height : " + this.height + " m");  
    System.out.println();  
}  

public void heightnew(double h) {  
    double oldheight = this.height;  
    this.height = h;  
    System.out.println("\n[UPDATE] " + this.name +   
        "'s height has changed from " + oldheight + " to " + this.height);  
}  

public void havebirthday() {  
    this.age += 1;  
    System.out.println("happy birth day " + this.name + " you are now " + this.age);  
}  

public static void showtotalpeople() {  
    System.out.println("\ntotal number of people created : " + totalPeople);  
}  

public static void main(String[] args) {  
    // 1. Create the 3 people from the assignment  
    person p1 = new person("Alice", "New York", 25, 1.65);  
    p1.displayinfo();  

    person p2 = new person("Bob", "London", 30, 1.75);  
    p2.displayinfo();  

    person p3 = new person("Charlie", "Paris", 22, 0.0);  
    p3.displayinfo();  

    // 2. Test methods (Matches your image logic)  
    p1.heightnew(1.68);  
    p2.heightnew(1.82);  
    p1.havebirthday();  

    // 3. Loop for 5 more people  
    System.out.println("\n--- Creating 5 more people ---");  
    for (int i = 1; i <= 5; i++) {  
        person temp = new person("Person" + i, "City" + i, 21, 1.70);  
        if (i == 1) {  
            temp.displayinfo();  
            System.out.println("... (4 more people) ...");  
        }  
    }  

    // 4. Show total  
    person.showtotalpeople();  
}

}