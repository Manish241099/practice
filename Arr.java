import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(21);
        list.add(15);
        list.add(70);
        list.add(33);
        list.add(46);
        list.add(20);
        list.add(10);
        for (int r : list) {
            if (r % 5 == 0) {
                System.out.println(r);
            }
        }
        for (int r : list) {
            if (r % 7 == 0) {
                System.out.println("divide by 7: sw7"+r);
            }
        }


    }
}
