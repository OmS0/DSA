import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("STUDENT GRADE CALCULATOR");

        System.out.print("Enter The Number Of Subjects: ");
        int num = sc.nextInt();
        sc.nextLine();

        if(num <= 0)
        {
            System.out.println("Invalid Number Of Subjects. Please Enter A Positive Integer.");
            return;
        }

        String[] Names = new String[num];
        double[] marks = new double[num];

        for(int i=0; i<num; i++)
        {
            System.out.print("Enter The Name Of Subject " + (i+1) +" : " );
            Names[i] = sc.nextLine();

            System.out.print("Enter Marks For " + Names[i] + " : ");
            marks[i] = sc.nextDouble();

            if(marks[i] < 0 || marks[i] > 100)
            {
                System.out.println("Invalid Marks. Marks Should Be Between 1 & 100");
                return;
            }
            sc.nextLine();
        }

        double TotalMarks = 0;
        for (double mark : marks)
        {
            TotalMarks = TotalMarks + mark;
        }

        double AveragePercentage = TotalMarks / num;

        String Grade;
        if(AveragePercentage >= 90)
        {
            Grade = "A+";
        }
        else if(AveragePercentage >= 80)
        {
            Grade = "A";
        }
        else if(AveragePercentage >= 70)
        {
            Grade = "B+";
        }
        else if(AveragePercentage >= 60)
        {
            Grade = "B";
        }
        else if(AveragePercentage >= 50)
        {
            Grade = "C";
        }
        else
        {
            Grade = "F";
        }

        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Average Percentage: " + AveragePercentage + "%");
        System.out.println("Grade: " + Grade);

    }
}