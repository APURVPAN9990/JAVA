import java.util.Scanner;
class Calarea
{
    public static void main(String args[])
    {
        double pi=3.14;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the option to calculate the: ");
        System.out.println("1. Area of a Triangle");
        System.out.println("2. Area of a Rectangle");
        System.out.println("3. Area of a Square");
        System.out.println("4. Area of a Circle");
        System.out.println("5. Volume of a Cuboid");
        System.out.println("6. Volume of a Cube");
        System.out.println("7. Volume of a Cone");
        System.out.println("8. Volume of a Cylinder");

        int num=sc.nextInt();
        switch (num)
        {
            case 1:
                System.out.println("Area of a Triangle: ");
                double b,h, area=0;
                System.out.print("Enter the base: ");
                b = sc.nextDouble();
                System.out.print("Enter the height: ");
                h = sc.nextDouble();
                area = 0.5 * b * h ;
                System.out.println("The area of Triangle is : " +area);
                break;
            
            case 2:
                System.out.println("Area of a Rectangle: ");
                double l;// area=0;
                System.out.print("Enter the Length: ");
                l = sc.nextDouble();
                System.out.print("Enter the Breadth: ");
                b = sc.nextDouble();
                area = l * b ;
                System.out.println("The area of Rectangle is : " +area);
                break;

            case 3:
                System.out.println("Area of a Square: ");
                double s;
                System.out.print("Enter the Side length: ");
                s = sc.nextDouble();
                area = s * s;
                System.out.println("The area of Square is : " +area);
                break;

            case 4:
                System.out.println("Area of a Circle: ");
                double r;
                System.out.print("Enter the Radius: ");
                r = sc.nextDouble();
                area = pi * ( r * r) ;
                System.out.println("The area of Circle is : " +area);
                break;

            case 5:
                System.out.println("Volume of Cuboid: ");
                double w, vol=0;
                System.out.print("Enter the lenght ");
                l = sc.nextDouble();
                System.out.print("Enter the width: ");
                w = sc.nextDouble();
                System.out.print("Enter the height: ");
                h = sc.nextDouble();
                vol = l * w * h ;
                System.out.println("The Volume of Cubiod is : " +vol);
                break;

            case 6:
                System.out.println("Volume of Cuboid: ");
                double a;
                System.out.print("Enter the lenght ");
                a = sc.nextDouble();
                vol = a * a * a ;
                System.out.println("The Volume of Cuboid is : " +vol);
                break;

            case 7:
                System.out.println("Volume of Cone: ");
                System.out.print("Enter the radius ");
                r = sc.nextDouble();
                System.out.print("Enter the height: ");
                h = sc.nextDouble();
                vol = (1/3) * pi * (r * r) * h ;
                System.out.println("The Volume of Cone is : " +vol);
                break;

            case 8:
                System.out.println("Volume of Cylinder: ");
                System.out.print("Enter the radius ");
                r = sc.nextDouble();
                System.out.print("Enter the height: ");
                h = sc.nextDouble();
                vol = pi * (r * r) * h ;
                System.out.println("The Volume of Cylinder is : " +vol);
                break;

            default:
            System.out.println("Wrong Input");
        }
    }
}