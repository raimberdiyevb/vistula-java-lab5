public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i == j) {
                    matrix[i][j] = i;
                    sum += i;
                }
            }
        }
        for(int[] row : matrix){
            for( int n : row){
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.println("Sum : " + sum);
    }
}
