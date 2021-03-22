public class Calculate {
    public static int[][] findEnteredLineAndColumn(int[][] array, int size, int line, int column) {
        int lineOfNewArray = 0;
        int[][] mas = new int[2][size];
        for (int i = line - 1, j = 0; j < array.length; j++) {
            mas[lineOfNewArray][j] = array[i][j];
        }
        lineOfNewArray++;
        for (int i = column - 1, j = 0; j < array.length; j++) {
            mas[lineOfNewArray][j] = array[j][i];
        }
        return mas;
    }
}
