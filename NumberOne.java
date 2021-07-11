import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result{

    public static ArrayList<String> getPosition(int V, List<Integer> arr) {
        ArrayList<String> rs = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (V == arr.get(i)) {
                rs.add(Integer.toString(i + 1));
            }
        }
        System.out.println(rs);
        return rs;
    }
}

public class NumberOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,8,2,3,5,10,10,8,8,3,5);

        Result.getPosition(2, numbers);
        Result.getPosition(8, numbers);
        Result.getPosition(3, numbers);
        Result.getPosition(5, numbers);
        Result.getPosition(10, numbers);
        Result.getPosition(11, numbers);
    }   
}