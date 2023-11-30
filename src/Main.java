import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> tmp = new ArrayList<>(intList);

        for (int i = 0; i < tmp.size(); i++) {
            if (tmp.get(i) <= 0 || tmp.get(i) % 2 != 0) {
                tmp.remove(i);
                i--;
            }
        }

        Collections.sort(tmp);
        System.out.println(tmp);

    }

}