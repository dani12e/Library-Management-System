public class Exercise6 {
    public static void main(String[] args) {
        int[] number = new int[3];
        number[0] =30;
        number[1]= 40;
        number[2] =50;
        

        for (int numbers : number) {
              int a = number[0] + number[1] + number[2] ;
              int b = a / number.length;
            System.out.println(b);
        }
    }
}
