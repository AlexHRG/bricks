import java.util.HashMap;
import java.util.Map;

public class Brick {

    static Map<Integer, double[]> map = new HashMap();

    static double W(int row, int pos) {
        if (row == 0) return 0.0;

        double result;
        double[] array = map.get(row);

        if (array == null) {
            array = new double[row+1];
        }

        if (array[pos] != 0.0) {
            return array[pos];
        }

        if (pos == 0) result = (W(row - 1, pos) + 1) / 2;//first brick in line
        else if (pos == row) result = (W(row - 1, pos - 1) + 1) / 2;//last brick in line
        else result =  (W(row - 1, pos - 1) + 1) / 2 + (W(row - 1, pos) + 1) / 2;

        array[pos] = result;
        map.put(row, array);

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Pressure = " + Brick.W(322, 156));
    }
}

