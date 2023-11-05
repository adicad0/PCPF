import java.util.Scanner;
class SAcubeCO{
    private int a, b;
    SAcubeCO(int a){
        System.out.println(4*a*a);
    }
    SAcubeCO(int a, int b){
        System.out.println((4*a*a)+(4*b*b));
    }


    public static void main(String[] args) {
        int n1, side1, side2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of cube: ");
        n1= sc.nextInt();
        switch (n1) {
            case 1:
                System.out.println("Enter side: ");
                side1 = sc.nextInt();
                SAcubeCO obj= new SAcubeCO(side1);
                break;
            case 2:
                System.out.println("Enter side of cube 1: ");
                side1 = sc.nextInt();
                System.out.println("Enter side of cube 2: ");
                side2 = sc.nextInt();
                SAcubeCO obbj1= new SAcubeCO(side1,side2);
                break;

            default:
                break;
        }
        sc.close();
    }
}