package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile("restock.in");
        StdOut.setFile("restock.out");
        Warehouse w = new Warehouse();
        int n = StdIn.readInt();
        for(int i = 0; i < n; i++) {
            String str = StdIn.readString();
            if(str.equals("add")) {
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                w.addProduct(id, name, stock, day, demand);
            }
            else if(str.equals("restock")) {
                int id = StdIn.readInt();
                int stock = StdIn.readInt();
                w.restockProduct(id, stock);
            }

        }
        StdOut.print(w);
	// Uset his file to test restock
    }
}
