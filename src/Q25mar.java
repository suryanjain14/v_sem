public class Q25mar {
    public static void main(String[] args) {
        int max = 0;
        int[][][] a = new int[3][4][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4l; j++) {
                for (int k = 0; k < 6; k++) {
                    a[i][j][k] = (int) (Math.random() * 1000);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4l; j++) {
                for (int k = 0; k < 6; k++) {
                    int temp = a[0][0][0];
                    if (temp < a[i][j][k]) {
                        max = a[i][j][k];
                    }

                }
            }
        }
        System.out.println(max);
    }
}
