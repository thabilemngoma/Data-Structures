import static org.junit.jupiter.api.Assertions.*;

class ConwayGameOfLifeTest {
    int[][] grid = {{0,0,1,1,1,0,0,0,0,0},
                    {0,0,0,1,1,0,0,0,0,0},
                    {0,0,0,1,1,0,0,0,0,0}
    };
    @org.junit.jupiter.api.Test
    void nextGeneration() {
        assertEquals("++++++++++\n+++++#++++\n++++++++++\n",ConwayGameOfLife.nextGeneration(grid,3,10));
    }
}