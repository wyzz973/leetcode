import easy.isAcronym;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        isAcronym isAcronym = new isAcronym();
        List<String> words = List.of("alice", "bob", "charlie");
        isAcronym.isAcronym1(words,"abc");
    }
}