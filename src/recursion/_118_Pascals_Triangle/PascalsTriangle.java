package recursion._118_Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        if (numRows == 0) {
            return output;
        }

        output.add(new ArrayList<>());
        output.get(0).add(1);
        List<Integer> singleRow;
        List<Integer> previousRow;

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            singleRow = new ArrayList<>();
            previousRow = output.get(rowNum - 1);

            singleRow.add(1);

            for (int j = 1; j < rowNum; j++) {
                singleRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            singleRow.add(1);

            output.add(singleRow);
        }
        return output;
    }
}