package domains;

/**
 * Created by dongchul on 2019-06-04.
 */
public enum Sudoku {
    HEIGHT(9),
    WIDTH(9);

    int size;

    Sudoku(int size) {
        this.size = size;
    }
}
