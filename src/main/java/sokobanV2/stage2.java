package sokobanV2;

public class stage2 {
    String map = "  #######  ###  O  ####    o    ## Oo P oO ####  o  ### #   O  #   ########  ";
    char[] chars = map.toCharArray();
    int playerIdx = getIdx(chars);
    int width = 11;

    public int getIdx(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'P') return i;
        }
        return -1;
    }

    public void printMap() {
        System.out.println();
        for (int i = 0; i < 77; i++) {
            System.out.print(chars[i]);
            if (i % 11 == 10) System.out.println();
        }
    }

    public void move(String str) {
        for (int i = 0; i < str.length(); i++) {
            char chrUp = str.toUpperCase().charAt(i);
            char chr = str.charAt(i);
            try {
                if (chr == 'w' || chr == 'a' || chr == 's' || chr == 'd') {
                    moveIndividual(chr);
                } else {
                    printMap();
                    System.out.println();
                    System.out.println(chrUp + ": (경고!) 해당 명령을 수행할 수 없습니다!");
                }
            } catch (Exception e) {
                printMap();
                System.out.println();
                System.out.println(chrUp + ": (경고!) 해당 명령을 수행할 수 없습니다!");
            }
        }
    }

    public void moveIndividual(char chr) {
        switch (chr) {
            case 'w':
                moveW(chr);
                break;
            case 'a':
                moveA(chr);
                break;
            case 's':
                moveS(chr);
                break;
            case 'd':
                moveD(chr);
                break;
        }
    }

    public void moveW(char chr) {
        if ( (playerIdx - width) >= 0 && chars[playerIdx - width] == ' ') {
            chars[playerIdx - width] = 'P';
            chars[playerIdx] = ' ';
            playerIdx = playerIdx - width;
            printMap();
            System.out.println("\nW: 위쪽으로 이동합니다.");
        } else {
            printMap();
            System.out.println("\nW: (경고!) 해당 명령을 수행할 수 없습니다!");
        }
    }

    public void moveA(char chr) {
        if ((playerIdx/ width) == (playerIdx - 1)/ width && chars[playerIdx - 1] == ' ') {
            chars[playerIdx - 1] = 'P';
            chars[playerIdx] = ' ';
            playerIdx = playerIdx - 1;
            printMap();
            System.out.println("\nA: 왼쪽으로 이동합니다.");
        } else {
            printMap();
            System.out.println("\nA: (경고!) 해당 명령을 수행할 수 없습니다!");
        }
    }

    public void moveS(char chr) {
        if ( (playerIdx + width) <= chars.length && chars[playerIdx + width] == ' ') {
            chars[playerIdx + width] = 'P';
            chars[playerIdx] = ' ';
            playerIdx = playerIdx + width;
            printMap();
            System.out.println("\nS: 아래쪽으로 이동합니다.");
        } else {
            printMap();
            System.out.println("\nS: (경고!) 해당 명령을 수행할 수 없습니다!");
        }
    }

    public void moveD(char chr) {
        if ((playerIdx/ width) == (playerIdx + 1)/ width && chars[playerIdx + 1] == ' ') {
            chars[playerIdx + 1] = 'P';
            chars[playerIdx] = ' ';
            playerIdx = playerIdx + 1;
            printMap();
            System.out.println("\nD: 오른쪽으로 이동합니다.");
        } else {
            printMap();
            System.out.println("\nD: (경고!) 해당 명령을 수행할 수 없습니다!");
        }
    }
}
