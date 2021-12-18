import java.util.Scanner;
class Salary
{
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary");
        double salary = sc.nextDouble();
        System.out.println("Year");
        int year = sc.nextInt();

        if(year > 5)
        {
            double bonus = salary * 0.05;
            salary = salary + bonus;
            System.out.println(salary);
        }
    }
}