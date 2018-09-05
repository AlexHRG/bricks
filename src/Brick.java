public class Brick {

    static double W(int row, int pos) {

        if (row == 0) return 0.0;

        if (pos == 0) return (W(row - 1, pos) + 1) / 2;//first brick in line
        else if (pos == row) return (W(row - 1, pos - 1) + 1) / 2;//last brick in line

        return  (W(row - 1, pos - 1) + 1) / 2 + (W(row - 1, pos) + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Pressure = " + Brick.W(3, 0));
    }
}

