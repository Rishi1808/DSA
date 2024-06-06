import java.util.Scanner;

public class RatChasesItsCheese {
    public static int c=0;
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        char[][] maze= new char[n][m];
        for (int i=0;i<n;i++)
        {
            String str=s.next();
            for (int j=0;j<m;j++)
            {
                maze[i][j]=str.charAt(j);
            }

        }
        int[][] ans = new int[n][m];

        path(maze, 0, 0, ans);
        System.out.println();

        if (c == 0) {
            System.out.println("NO PATH FOUND");
        }

    }
    public static  void path(char[][] maze,int cr,int cc,int[][] ans)
    {
        // base case
        if (cc<0|| cr<0|| cr>=maze.length|| cc>=maze[0].length|| maze[cr][cc]=='X')
        {
            return;
        }
        // recursion
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        if (cr== maze.length-1 && cc== maze[0].length-1)
        {

            print(ans);
            c++;
            return;
        }
        path(maze,cr-1,cc,ans); //uP
        path(maze,cr+1,cc,ans);//down
        path(maze,cr,cc-1,ans);//left

        path(maze,cr,cc+1,ans);//right
        maze[cr][cc]='O';
        ans[cr][cc]=0;
    }
    public static void print(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
