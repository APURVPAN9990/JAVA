import java.util.Scanner;
class Quad2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a: ");
        double a= sc.nextDouble();
        System.out.print("Input b: ");
        double b= sc.nextDouble();
        System.out.print("Input c: ");
        double c= sc.nextDouble();

        double dis = b * b - 4.0 * a * c;

        if ( dis >0)
        {
            double r1 = (-b + Math.sqrt(dis)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(dis)) / (2.0 * a);
            System.out.println("The roots are " + r1 + "and" + r2);
        } 
        else if ( dis < 0)
        {
            System.out.println("The roots are Imaginary & different.");
        }
        else
        {
            System.out.println("The roots are identical.");
            double r1= (-b + Math.sqrt(dis)) / (2.0 * a);
        }
    }
}