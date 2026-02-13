package PAT.JFS;
import java.util.*;
public class SinkNodesInAGraph {
    public static void main(String[] args) {
        int adj_matrix [][] = new int[5][5];
        int zero_count = 0;
        int sink_count=0;
        adj_matrix = new int[][]{{0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
        for(int i = 0; i<5;i++){
            for(int j=0; j<5; j++){
                if(adj_matrix[i][j] == 0)
                    zero_count++;
            }
            if(zero_count == 5) {
                System.out.println("Sink Node: " + (char)(65+i)); //explicit type casting from int to char
                sink_count++; //ASCII value of A is 65
            }
            zero_count = 0;
        }
        System.out.println("The no of sink nodes are " + sink_count);
    }
}
