package coronado.pkg2b;

public class fits {
    
    String Id;
    String Name;
    int Age;
    double Bmi;
    String Goal;
    
    public void userStorage(String id, String name, int age, double bmi, String goal){
        this.Id =id;
        this.Name = name;
        this.Age = age;
        this.Bmi = bmi;
        this.Goal = goal;
    }
    
    public void viewUser(){
        
        String status = "";
        
        if(this.Age >= 18 && this.Age <= 65){
            status = "Eligibile";
        }
        if(this.Bmi >= 18.5 && this.Bmi >= 30.0){
            status = "Eligibile";
        }
        else{
            status = "Not Eligibile";
        }
        
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-20s\n",
                        "ID", "Name", "AGE", "BMI", "Fitness Goals", "Eligibility Status");
        
        System.out.printf("%-10s %-10s %-10d %-10.2f %-20s %-20s",
                        this.Id, this.Name, this.Age, this.Bmi, this.Goal, status);
    }
    
}
