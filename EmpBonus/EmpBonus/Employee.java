package EmpBonus;

public class Employee {
    
    //Initiialize variable Bonus and Grade
    private int bonus;
    private String grade;

    public Employee(String grade){
        this.grade = grade;
    }
    
    //Throw all ecpetion out of the function of the
    public void setBonus (int bonus) throws AmountMismatchException{

        /*
        -Check the grade of the employee in
        -Check the bonus amount in the
        -If incorrect, throw the exceptino
        */
        
        //Grade A
        if(this.grade == "A"){
            if(bonus == 5000){
                this.bonus = bonus;
                System.out.println("Bonus amount is added Successful");
            }
            else{
                throw new AmountMismatchException("Bonus amount: " + bonus + " is not correct for Grade " + grade);
            }
        }
        
        //Grade B
        else if(this.grade == "B"){
            if(bonus == 4000){
                System.out.println("Bonus amount is added Successful");
            }
            else{
                throw new AmountMismatchException("Bonus Amount: " + bonus + " is not correct for Grade" + grade);
            }

        }
        
        //Grade C
        else if (this.grade == "C"){
            if(bonus == 3000){
                this.bonus = bonus;
                System.out.println("Bonus amount is added Successful");
            }
            else{
                throw new AmountMismatchException("Bonus Amount: " + bonus + " is not a correct for Grade " + grade);  
            }
        }
    }
}
