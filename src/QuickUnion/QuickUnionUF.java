package QuickUnion;

public class QuickUnionUF {
    private int[] id;
    private int[] size;

    //Creating an array and putting the numbers own index in itself
    public QuickUnionUF(int N) {
        id = new int[N];
        size = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
            size[i] = 1;
        }
    }
    public int root(int i){
        while(id[i] != i){
            i = id[i];
        }
        return i;
    }
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        if(i == j){
            return;
        }
        //If size at i is less than size at j, we set index of i = j to link to new root
        if(size[i] < size[j]){
            id[i] = j;
            size[j] += size[i];
        }
        else{
            id[j] = i;
            size[i] += size[j];
        }
    }
    public void printArray(){
        for (int num : id){
            System.out.print(num + " ");
        }
    }
}
