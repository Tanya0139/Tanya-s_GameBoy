package tictactoe;
import java.util.*;


public class Tictactoe {
    
    static ArrayList<Integer> playerpositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpupositions = new ArrayList<Integer>();

    
    public static void main(String[] args) {
        char[][] gameboard = {{' ','|',' ','|',' '}, 
            {'-','+','-','+','-'}, 
            {' ','|',' ','|',' '}, 
            {'-','+','-','+','-'}, 
            {' ','|',' ','|',' '}};
        printGameBoard(gameboard);
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter your placement (1-9): ");
            int playerpos = sc.nextInt();
            while(playerpositions.contains(playerpos)||cpupositions.contains(playerpos)){
                System.out.println("Position taken eneter correct one.");
                playerpos = sc.nextInt();
            }
           
            placepiece(gameboard, playerpos, "player");
            
            String result = checkwinner();
            if(result.length()>0){
                printGameBoard(gameboard);
                System.out.println(result);
                break;
            }
            Random rand = new Random();
            int cpupos = rand.nextInt(9)+1;
            while(playerpositions.contains(cpupos)||cpupositions.contains(cpupos)){
                cpupos = rand.nextInt(9)+1;
            }
            
            
            placepiece(gameboard, cpupos, "cpu");

            printGameBoard(gameboard);
            
            result = checkwinner();
            if(result.length()>0){
                printGameBoard(gameboard);
                System.out.println(result);
                
                break;
            }
        }
        
    }
    
    
    public static void printGameBoard(char[][] gameboard){
        for(char[] row : gameboard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
    public static void placepiece(char[][] gameboard, int pos, String user){
        char symbol = ' ';
        
        if(user.equals("player")){
            symbol = 'X';
            playerpositions.add(pos);
        }else if(user.equals("cpu")){
            symbol = 'O';
            cpupositions.add(pos);
        }
        
        switch(pos){
            case 1:
                gameboard[0][0] = symbol;
                break;
            case 2:
                gameboard[0][2] = symbol;
                break;
            case 3:
                gameboard[0][4] = symbol;
                break;
            case 4:
                gameboard[2][0] = symbol;
                break;
            case 5:
                gameboard[2][2] = symbol;
                break;
            case 6:
                gameboard[2][4] = symbol;
                break;
            case 7:
                gameboard[4][0] = symbol;
                break;
            case 8:
                gameboard[4][2] = symbol;
                break;
            case 9:
                gameboard[4][4] = symbol;
                break;
            default:
                break;
                
        }
    }
    
    public static String checkwinner(){
        
        List toprow = Arrays.asList(1, 2,3);
        List midrow = Arrays.asList(4, 5,6);
        List botrow = Arrays.asList(7, 8,9);
        List leftcol = Arrays.asList(1, 4,7);
        List midcol = Arrays.asList(2, 5,8);
        List rightcol = Arrays.asList(3, 6,9);
        List cross1 = Arrays.asList(1, 5,9);
        List cross2 = Arrays.asList(3, 5,7);
        
        List<List> winning = new ArrayList<List>();
        winning.add(toprow);
        winning.add(midrow);
        winning.add(botrow);
        winning.add(leftcol);
        winning.add(midcol);
        winning.add(rightcol);
        winning.add(cross1);
        winning.add(cross2);
        for(List l : winning){
            if(playerpositions.containsAll(l)){
                return "congratulations you won!!";
            } else if(cpupositions.containsAll(l)){
                return "CPU won!! sorry :(";
            } else if(playerpositions.size()+cpupositions.size()==9){
                return "TIE!";
            }
        }
        return "";
    }
}
  


