package J31.J10;
import java.util.Random;
import java.util.Scanner;
public class MineField {
    int rowNumber, colNumber,size;
    int map[][];
    int board[][];
    boolean game = true;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    MineField(int rowNumber,int colNumber){
        this.colNumber = colNumber;
        this.rowNumber = rowNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run(){
        int row,col,success = 0;
        prepareGame();
        print(map);
        System.out.println("Game started");
        while(game){

            print(board);
            System.out.println("Row :");
            row = scanner.nextInt();
            System.out.println("Column :");
            col = scanner.nextInt();
            if(row < 0 || row >= rowNumber){
                System.out.println("Invalid coordinate");
                continue;
            }
            if(col < 0 || col >= colNumber){
                System.out.println("Invalid coordinate");
                continue;
            }


            if(map[row][col] != -1){
                check(row,col);
                success++;
                if(success == size - size/4){
                    System.out.println("You Won!");
                    break;
                }
                
            }else{
                game = false;
                System.out.println("Game over!");
            }
        }
    }
    public void check(int r,int c){
        if(map[r][c] == 0){
            if((c < colNumber -1) && (map[r][c+1] == -1)){
                board[r][c]++;
            }
            if((r < rowNumber-1) && (map[r+1][c] == -1)){
                board[r][c]++;
            }
            if((r > 0)  &&(map[r-1][c] == -1)){
                board[r][c]++;
            }
            if((c > 0) && (map[r][c] == -1)){
                board[r][c-1]++;
            }
            if(board[r][c] == 0){
                board[r][c] = -2;
            }
        }

        
    }

    public void prepareGame(){
        int randRow,randCol,count = 0;
        while(count != (size/4)){
            randRow = random.nextInt(rowNumber);
            randCol = random.nextInt(colNumber);
            if(map[randRow][randCol] != -1){
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
