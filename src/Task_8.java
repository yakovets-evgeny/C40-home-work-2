public class Task_8 {
    public static void main(String[] args) {

        int n = 4;
        int space = n;

        for (int i=0; i<n; i++) {

            space--;

            for (int x=0; x<=space; x++) {
                System.out.print("  ");
            }

            int count = n - space;

            for (int x=0; x<count; x++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
