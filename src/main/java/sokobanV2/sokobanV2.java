package sokobanV2;

import java.util.Scanner;

public class sokobanV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stage2 st2 = new stage2();
        System.out.println("Stage 2");
        st2.printMap();

        while (true) {
            System.out.print("\nSOKOBAN> ");
            String s = sc.nextLine().toLowerCase();
            if (s.equals("q")) break;
            st2.move(s);
        }
        System.out.println("Bye~");
    }
}
