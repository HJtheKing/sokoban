import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class sokobanV1 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        skvData skvData1 = createSkvData1(sc);
        createLstInt(skvData1);

        skvData skvData2 = createSkvData2(sc);
        createLstInt(skvData2);

        toString(skvData1);
        toString(skvData2);

    }

    private static void toString(skvData data) {
        System.out.println("Stage " + data.stage + "\n");
        for (int i = 0; i < data.lst.size(); i++) {
            System.out.print(data.lst.get(i));
            if (i % (data.lst.size() / data.crNum) == (data.lst.size() / data.crNum) - 1) {
                System.out.println();
            }
        }
        System.out.println("\n가로크기: " + data.lst.size()/ data.crNum);
        System.out.println("세로크기: " + data.crNum);
        System.out.println("구멍의 수: " + data.numOfHole);
        System.out.println("공의 수: " + data.numOfBall);
        System.out.println("플레이어 위치: " + ((data.playerIdx / (data.lst.size()/ data.crNum)) + 1) + "행 " + (data.playerIdx % (data.lst.size()/ data.crNum) + 1) + "열\n");
    }

    public static skvData createSkvData1(Scanner sc) throws Exception{
        skvData data = new skvData();
        data.stage = 1;
        String s;
        int crNum = 0;
        sc.nextLine();
        while (!(s = sc.nextLine()).equals("=====")) {
            data.map += s;
            for (int i = 0; i < s.length(); i++) {
                data.lst.add(s.charAt(i));
            }
            crNum++;
        }
        data.crNum = crNum;
        return data;
    }

    public static skvData createSkvData2(Scanner sc)  throws Exception{
        skvData data = new skvData();
        data.stage = 2;
        String s;
        int crNum = 0;
        sc.nextLine();
        while (!(s = sc.nextLine()).isBlank()) {
            data.map += s;
            for (int i = 0; i < s.length(); i++) {
                data.lst.add(s.charAt(i));
            }
            crNum++;
        }
        data.crNum = crNum;

        return data;
    }

    static class  skvData{
        String map = "";
        int stage;
        int crNum;
        List<Character> lst = new ArrayList<>();
        List<Integer> lstInt = new ArrayList<>();
        int numOfHole = 0;
        int numOfBall = 0;
        int playerIdx;
    }

    public static void createLstInt(skvData data) {
        for (int i = 0; i < data.lst.size(); i++) {
            switch (data.lst.get(i)) {
                case ' ':
                    data.lstInt.add(0);
                    break;
                case 'O':
                    data.lstInt.add(1);
                    data.numOfHole++;
                    break;
                case 'o':
                    data.lstInt.add(2);
                    data.numOfBall++;
                    break;
                case 'P':
                    data.lstInt.add(3);
                    data.playerIdx = i;
                    break;
                case '#':
                    data.lstInt.add(4);
                    break;
            }
        }
    }
}
