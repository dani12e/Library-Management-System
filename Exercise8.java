public class Exercise8 {
    public static void areaaa(int a, int b){
        int area =  a * b;
        System.out.println("the area of the rectangle is: " + area);
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("enter length: ");
        int a = scanner.nextInt();
        System.out.println(a);
        System.out.println("enter width: ");
        int b = scanner.nextInt();
        System.out.println(b);

        areaaa(a,b);



    }
}
