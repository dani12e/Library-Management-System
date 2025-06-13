import java.util.List;

public class Exercise29 {
    public static void main(String[] args) {
        List<String> names = List.of("Daniel", "Sam", "Alex", "Zoe", "Grace");

        names.stream()
            .filter(name -> name.length() > 4)
            .map(name -> name.toUpperCase())
            .forEach(System.out::println);
                
            }
    }

