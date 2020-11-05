public class Task_3 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[0][0] = 5;
        arr[0][1] = 6;
        arr[0][2] = 7;
        arr[0][3] = 2;
        arr[0][4] = 4;
        arr[1][0] = 0;
        arr[1][1] = 3;
        arr[1][2] = 4;
        arr[1][3] = 8;
        arr[1][4] = 1;
        arr[2][0] = 3;
        arr[2][1] = 7;
        arr[2][2] = 7;
        arr[2][3] = 0;
        arr[2][4] = 1;
        arr[3][0] = 2;
        arr[3][1] = 9;
        arr[3][2] = 5;
        arr[3][3] = 5;
        arr[3][4] = 0;
        arr[4][0] = 2;
        arr[4][1] = 3;
        arr[4][2] = 7;
        arr[4][3] = 4;
        arr[4][4] = 7;
/*
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }

 */
        int s = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (i == j) {
                    s += arr[i][j];
                }
            }
        }
        System.out.println("Сумма элементов главной диагонали = " + s);
    }
}