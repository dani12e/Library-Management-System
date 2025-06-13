public class Exercise5 {
    public static void main(String[] args) {
        int[] scores = {20,30,40,50};
        
        for (int score : scores) {
            int i = 1;
            do {
                System.out.println("score " + i +":" + score);
                           i++;

            } while (i<5);
             
            
        }
    }
}
