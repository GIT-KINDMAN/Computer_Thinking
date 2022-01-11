public class sweaCT2 {
    public static void main(String[] args) {
        int x, y, z;
        for (x=1; x <= 100; x++) {
            for (y=1; y < 100; y++) {
                for (z=1; z < 100; z++) {
                    if (x+y+z == 100) {
                        System.out.print(x+" "+y+" "+z);
                        System.out.println();
                    }
                }
            }
        }
    }
}
