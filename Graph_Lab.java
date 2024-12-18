
import java.util.LinkedList;
import java.util.Queue;
public class Graph_Lab {

  

public void addelement(int matrix[][],int u,int v ){
matrix[u][v]=1;
matrix[v][u]=1;
}
public void printmat(int matrix[][]){
for(int i=0; i<matrix.length; i++){
for(int j=0; j<matrix.length; j++){
System.out.print(matrix[i][j]+" ");

}
System.out.println();

}
}
public void bfs(int matrix[][],int start){
boolean visited[]=new boolean[matrix.length];
Queue<Integer> queue=new LinkedList<>();
queue.add(start);
visited[start]=true;
while(!queue.isEmpty()){
int node=queue.poll();
System.out.println(node+" ");
for(int i=0; i<matrix.length; i++){
if(matrix[node][i]==1 && !visited[i]){
queue.add(i);
visited[i]=true;
}
}
}
}

public static void main(String args[]){
int matrix[][]=new int[3][3];
Graph_Lab g= new Graph_Lab();
g.addelement(matrix,1,2);
g.addelement(matrix,0,1);
g.addelement(matrix,2,0);
g.addelement(matrix,1,1);
g.printmat(matrix);
g.bfs(matrix,1);



}
}
    
    

