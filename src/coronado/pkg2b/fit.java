package coronado.pkg2b;

import java.util.Scanner;

public class fit {
    
    public void input(){
        
        Scanner sc = new Scanner(System.in);
        fits[] f = new fits[100];
        
        System.out.print("Enter number of applications: ");
        int appNum = sc.nextInt();
        
        for(int i = 0; i < appNum; i++){
            
            System.out.println("Enter details of application "+(i+1)+":");
            
            System.out.print("ID: ");
            String id = sc.next();
            
            System.out.print("Name: ");
            String name = sc.next();
            
            System.out.print("Age: ");
            int age = sc.nextInt();
            
            System.out.print("BMI: ");
            double bmi = sc.nextInt();
            
            System.out.print("Goal: ");
            String goal = sc.nextLine();
            sc.next();
            
            f[i] = new fits();
            f[i].userStorage(id, name, age, bmi, goal);
            
        }
        
        for(int i = 0; i < appNum; i++){
            f[i].viewUser();
        }
        
    }
    
}
