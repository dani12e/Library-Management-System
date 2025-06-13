import java.util.Optional;

public class Exercise30 {
    public static void main(String[] args) {
        String name = "Daniel";
        Optional<String> optionalName = Optional.ofNullable(name);

        optionalName.ifPresentOrElse(
    System.out::println,
    () -> System.out.println("missing")
);

    }
}
