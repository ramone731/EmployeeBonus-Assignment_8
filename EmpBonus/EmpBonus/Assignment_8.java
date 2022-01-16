package EmpBonus;
/*===========================================================================
Java Assignment - 8

Using the try catch block in the Java assignment in order to  degerming the 
accurate Bonus for each categories' Employees ranging from, A - C
===========================================================================
*/

public class Assignment_8 {
    public static void main(String[] args) {
        
        Employee employeeA = new Employee("A");
        Employee employeeB = new Employee("B");
        Employee employeeC = new Employee("C");    
        
        //Employee Set bonus A
        try{
            employeeA.setBonus(4000);
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            employeeA.setBonus(5000);
        }catch(Exception e){
                System.out.println(e);
            }

            //Employee Set bonus B
            try{
                employeeB.setBonus(4000);
            }catch(Exception e){
                System.out.println(e);
            }
            try{
                employeeB.setBonus(5000);
            }catch(Exception e){
                    System.out.println(e);
                }
    
            //Employee Set bonus C
            try{
                employeeC.setBonus(4000);
            }catch(Exception e){
                System.out.println(e);
            }
            try{
                employeeC.setBonus(5000);
            }catch(Exception e){
                    System.out.println(e);
                }   
            }
        }     

    

