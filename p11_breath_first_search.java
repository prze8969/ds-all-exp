import java.util.*;

public class p11_breath_first_search {
    int[][] adj;
    int vertices;

    p11_breath_first_search(int v){
        adj = new int[v][v];
        vertices = v;
    }

    void add_edges(int m , int n){
        adj[m][n] = 1;
        adj[n][m] = 1;
    }

    LinkedList<Integer> neighbours(int idx){
        LinkedList<Integer> nbr = new LinkedList<>();
        for(int i = 0 ; i < vertices ; i ++){
            if(adj[idx][i] ==1){
                nbr.add(i);
            }
        }
        return nbr;
    }

    void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[vertices];

        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int tmp = q.poll();
            System.out.print(tmp + " ");
            LinkedList<Integer> nbr = neighbours(tmp);
            
            for(int n : nbr){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }
            }
        }


        }


}
