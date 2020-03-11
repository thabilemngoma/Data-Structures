public class ConwayGameOfLife {
    public static void main(String[] args)
    {
        int M = 10, N = 10;

        int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };


        System.out.println("Input");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (grid[i][j] == 0)
                    System.out.print("+");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(nextGeneration(grid, M, N));
    }
    static String nextGeneration(int grid[][], int M, int N)
    {
        int[][] future = new int[M][N];

        for (int l = 1; l < M - 1; l++)
        {
            for (int m = 1; m < N - 1; m++)
            {
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        aliveNeighbours += grid[l + i][m + j];


                aliveNeighbours -= grid[l][m];

                if ((grid[l][m] == 1) && (aliveNeighbours < 2))
                    future[l][m] = 0;


                else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
                    future[l][m] = 0;

                else if ((grid[l][m] == 1) && (aliveNeighbours == 2|| aliveNeighbours==3))
                    future[l][m] = 1;


                else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
                    future[l][m] = 1;
                else
                    future[l][m] = grid[l][m];
            }
        }

        System.out.println("Next Generation");
        StringBuilder nxtGeneration = new StringBuilder();
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (future[i][j] == 0)
                    nxtGeneration.append("+");
                else
                    nxtGeneration.append("#");
            }
            nxtGeneration.append("\n");
        }
        return nxtGeneration.toString();
    }

}
