/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
package QuickUnion;

public class Main {
    public static void main(String[] args) {
        QuickUnionUF qu = new QuickUnionUF(9);
        qu.union(1, 5);
        qu.union(8, 4);
        qu.union(4, 3);
        qu.union(1, 8);
        qu.printArray();
    }
}
