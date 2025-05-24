import java.util.*;
public class PetArray
{
    public static void main(String[] args)
    {
        int[][] ages; // 2D array where ages will be stored. human age is rows. dog age is columns
        Scanner sc = new Scanner(System.in);
        int i, j, human, dog;
        
        System.out.println("Enter number of humans: ");
        human = sc.nextInt();

        ages = new int[human][]; // instantiated the row with scanned number of humans

        for (i = 0; i < human; i++)
        {
            System.out.println("Enter number of dogs for human " + (i+1) ": ");
            dog = sc.nextInt() + 1; // +1 is added to make up enough space for dog age since human age is in the first column
            ages[i] = new int[dog]; // instantiated the column with scanned number of dogs per human
            
            do{
                System.out.println("Enter age of human " + (i+1) + ": ");
                ages[i][0] = sc.nextInt();

                if (ages[i][0] < 1)
                    System.out.println("Invalid age.");

            }while(ages[i][0] < 1);
            
            for (j = 1; j < dog; j++){
                do{ // do-while loop to scan and check for valid age of human and dogs
                System.out.println("Enter age of dog " + j + " (in human years)" + " for human " + (i+1) + ": ");
                ages[i][j] = sc.nextInt();

                if (ages[i][j] < 1)
                    System.out.println("Invalid age.");

                }while(ages[i][j] < 1);
            }
        }

        // IN PROGRESS: needs to display human age and dog age (dog age is calculated by '16 x log(age of dog in human years) + 31' using the Math class)

        sc.close();
    }
}
