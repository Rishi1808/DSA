public class Maze_path
{
    public static void main(String[] args) {
        printPath(2,2 ,0,0,"");


    }
    public static  void printPath(int er,int ec,int cr,int cc,String ans){
        if (cr==er && cc==ec)
        {
            System.out.println(ans+" ");
            return;
        }
        if(cr>er || cc>ec)
        {
            return;
        }
        printPath(er,ec,cr+1,cc,ans+"v");
        printPath(er,ec,cr,cc+1,ans+"h");
    }
}
