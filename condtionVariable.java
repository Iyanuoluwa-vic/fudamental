import java.util.Scanner;

public class condtionVariable {
    public static void main(String[] args) {
        System.out.println("Enter your grade");

        Scanner keyboard = new Scanner(System.in);
       



        // this is used to caculate Grade of student  base on their score
         int grade =keyboard.nextInt();
         keyboard.nextLine();
        if(grade >= 90){
            System.out.println("You hade a grade of A" );
        }
        else if(grade >=80){
              System.out.println("You hade a grade of B" );
        }

        else if(grade >=70){
              System.out.println("You hade a grade of C" );
        }

         else if(grade >=60){
              System.out.println("You hade a grade of D" );
        }

         else {
              System.out.println("You hade a grade of F" );
        }



        // To check if you meet getting a student loan

        String Citizen;
        int CreditScore;
        int age;

        System.out.println("Where you born in the United State: Enter yes or no");
        Citizen =keyboard.nextLine();

        while((Citizen.compareTo("yes")!= 0) && (Citizen.compareTo("Yes")!= 0) && (Citizen.compareTo("No")!= 0) && (Citizen.compareTo("no")!= 0) ){

            System.out.println("Incorrect value entered");
            System.out.println("Where you born in the United State: Enter yes or no");
            Citizen =keyboard.nextLine();
        }

        System.out.println("Enter your credit score");
        CreditScore =keyboard.nextInt();

        System.out.println("Enter your age");
        age =keyboard.nextInt();



        if(Citizen.equals( "yes")){
            if(CreditScore >700){
                if(age >=18){
                  System.out.println("You can get a fincial aid");

                }
            }  
        
            else{
                 System.out.println("You can not get a fincial aid");
            }
        }
        else{
            System.out.println("You can not get a fincial aid");
        }




        keyboard.close();
        
    }
}