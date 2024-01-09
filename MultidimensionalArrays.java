class MultidimensionalArrays{
    public static void main(String args[]){
        // int [][]f = new int[2][3];
        // OR
        int [][]f;
        f = new int[2][3];
        f[0][0] = 1;
        f[0][1] = 2;
        f[0][2] = 3;
        f[1][0] = 2;
        f[1][1] = 3;
        f[1][2] = 4;
        for(int i=0;i<f.length;i++)
        {
            for(int j=0;j<f[i].length;j++)
            {
                System.out.print(f[i][j]);
                System.out.print(' ');
            }
            System.out.println(" ");
        }
    }
}