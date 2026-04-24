public class switchc {
    public static void main(String[] args) {
        System.out.println("1.addition");
        System.out.println("2.substration");
        System.out.println("3.division");
        System.out.println("4.multiplcation");
        int a=1020, b=20;
        switch (2) {
            case 1:int c=a+b;
                System.out.println(c);
                break;
            case 2:int d=a-b;
            System.out.println(d);
            default:
                System.out.println("invalid operator");
                break;
        }
    }
 }
