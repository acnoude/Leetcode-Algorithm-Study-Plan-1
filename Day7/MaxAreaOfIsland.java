package Day7;
// You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

// The area of an island is the number of cells with a value 1 in the island.

// Return the maximum area of an island in grid. If there is no island, return 0.
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c= grid[0].length;
        boolean[][] visited = new boolean[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                   count =Math.max(count,DFS(i,j,visited,grid));
                }
            }
        }
        return count;
    }

    private int DFS(int i, int j,boolean[][] visited,int[][] grid) {
        
            if(isSafe(i,j,visited,grid)){
                visited[i][j]=true;
                return (1+DFS(i+1,j,visited,grid)+DFS(i,j+1,visited,grid)+DFS(i-1,j,visited,grid)+DFS(i,j-1,visited,grid));
            }else{
                return 0;
            }
        
    }

    private boolean isSafe(int i, int j, boolean[][] visited, int[][] grid) {
        return (i>=0 && i<grid.length &&j>=0 && j<grid[0].length && (!visited[i][j] && grid[i][j]==1));
    } 

    public static void main(String[] args) {
        int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
                                  { 0, 1, 0, 0, 1 },
                                  { 1, 0, 0, 1, 1 },
                                  { 0, 0, 0, 0, 0 },
                                  { 1, 0, 1, 0, 1 } };

                                  MaxAreaOfIsland m = new MaxAreaOfIsland();
                                  m.maxAreaOfIsland(M);                        
    }
}
