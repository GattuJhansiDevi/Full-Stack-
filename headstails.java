import java.util.Random;
import java.util.stream.IntStream;

public class headstails {
    
    public static void main(String[] args) {
        
        int rounds = 10; 
        int[] results1 = new int[rounds];
        int[] results2 = new int[rounds]; 
        
        
        for (int i = 0; i < rounds; i++) {
            
            results1[i] = new Random().nextInt(2); 
            results2[i] = new Random().nextInt(2); 
        }
        
        
        long count1 = IntStream.of(results1).filter(result -> result == 1).count();
        long count2 = IntStream.of(results2).filter(result -> result == 1).count();
        
       
        String winner = "";
        if (count1 > count2) {
            winner = "kareena";
        } else if (count2 > count1) {
            winner = "jhansi";
        } else {
            winner = "Tie";
        }
        
       
        System.out.println("kareena: " + IntStream.of(results1).mapToObj(result -> result == 1 ? "H" : "T").reduce("", String::concat));
        System.out.println("jhansi: " + IntStream.of(results2).mapToObj(result -> result == 1 ? "H" : "T").reduce("", String::concat));
        System.out.println("Winner: " + winner);
    }
}