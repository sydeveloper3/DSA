import java.util.ArrayList;

public class testpath {
    static ArrayList<String> mazepath(int currentrow, int currentcol, int row, int col) {
        if (currentrow == row && currentcol == col) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if (currentrow > row || currentcol > col) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> horizontal = mazepath(currentrow, currentcol + 1, row, col);
        for (String str : horizontal) {
            result.add(str + "H");
        }
        ArrayList<String> Vertical = mazepath(currentrow + 1, currentcol, row, col);

        for (String str : Vertical) {
            result.add(str + "V");
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<String> res = mazepath(1, 1, 3, 3);
        System.out.println(res);
    }

}
