import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку: ");
            A.add(scanner.nextLine());
        }

        System.out.println("Список А: " + A);

        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку: ");
            B.add(scanner.nextLine());
        }

        System.out.println("Список Б: " + B);

        ArrayList<String> C = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(4 - i));
        }

        System.out.println("Список С: " + C);

        Collections.sort(C, Comparator.comparingInt(String::length));

        System.out.println("список С: " + C);
    }
}