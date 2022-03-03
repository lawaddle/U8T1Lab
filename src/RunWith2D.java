import java.util.Arrays;

public class RunWith2D {
    public static void main(String[] args)
    {
//        String [] [] seatingChart = {
//                {"Abby", "Don",  "George", "Kim"},
//                {"Brian", "Elenor", "Harry", "Lenny"},
//                {"Cathy", "Fred", " Jill", "Matt"}
//        };
//        for (String[] names: seatingChart) {
//            System.out.println(Arrays.toString(names));
//        }
//        System.out.println();
//
//        seatingChart[1][2] = "Paul";
//        for (String[] names: seatingChart) {
//            System.out.println(Arrays.toString(names));
//        }
//        System.out.println();
//
//        String temp = seatingChart[0][0];
//        seatingChart[0][0] = seatingChart[2][3];
//        seatingChart[2][3] = temp;
//        for (String[] names: seatingChart) {
//            System.out.println(Arrays.toString(names));
//        }
//        System.out.println();
//
//        String[] tempRow = seatingChart[0];
//        seatingChart[0] = seatingChart[1];
//        seatingChart[1] = tempRow;
//        for (String[] names: seatingChart) {
//            System.out.println(Arrays.toString(names));
//        }
//        System.out.println();
//
//        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

//        int[][] arr1 = new int[2][3];
//        int[][] arr2 = new int[3][2];
//        for (int[] nums: arr1) {
//            System.out.println(Arrays.toString(nums));
//        }
//        for (int[] nums: arr2) {
//            System.out.println(Arrays.toString(nums));
//        }
//
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[0][2] = 3;
//        arr1[1][0] = 4;
//        arr1[1][1] = 5;
//        arr1[1][2] = 6;
//        for (int[] nums: arr1) {
//            System.out.println(Arrays.toString(nums));
//        }
//
//        arr2[0][0] = 1;
//        arr2[0][1] = 4;
//        arr2[1][0] = 2;
//        arr2[1][1] = 5;
//        arr2[2][0] = 3;
//        arr2[2][1] = 6;
//        for (int[] nums: arr2) {
//            System.out.println(Arrays.toString(nums));
//        }
//        System.out.println(arr1[0][2] + arr2[2][0]);

//        int[][] ahh = {{5, 2},
//                {1, 3},
//                {7, 9}};
//        System.out.println(FunWith2DArrays.totalElements(ahh));
//        int[][] ahhh = {{1, 2, 3},
//                {6, 5, 4}};
//        System.out.println(FunWith2DArrays.totalElements(ahhh));
//        int[][] woo = {{1, 2, 3, 4},
//                {7, 8, 9, 10}};
//        System.out.println(FunWith2DArrays.totalElements(woo));
//        int[][] wow = {{4, 5, 2},
//                {1, 9, 7},
//                {8, 10, 13}};
//        System.out.println(FunWith2DArrays.totalElements(wow));
//        int[][] oww = {{4, 5, 2, 4, 1},
//                {1, 9, 7, 8, 2},
//                {8, 10, 13, 4, 3}};
//        System.out.println(FunWith2DArrays.totalElements(oww));
//        int[][] hhha = {{4, 5, 2, 4, 8, 9, 10},
//                {1, 9, 7, 8, 6, 1, 2}};
//        System.out.println(FunWith2DArrays.totalElements(hhha));
//        int[][] hho = {{4},
//                {7},
//                {8},
//                {2}};
//        System.out.println(FunWith2DArrays.totalElements(hho));
//        int[][] waa = {{4}};
//        System.out.println(FunWith2DArrays.totalElements(waa));
//        int[][] whh = {{}};
//        System.out.println(FunWith2DArrays.totalElements(whh));

//        String[][] pop = {{"hi", "bye", "stuff", "go"},
//                {"time", "up", "you", "good"},
//                {"map", "low", "bow", "mom"}};
//        FunWith2DArrays.fourCorners(pop);
//        System.out.println();
//
//        String[][] ree = {{"time", "up", "bye"},
//                {"hi", "hit", "up"},
//                {"map", "bam", "low"},
//                {"bow", "mom", "joy"}};
//        FunWith2DArrays.fourCorners(ree);
//        System.out.println();
//
//        String[][] pre = {{"phone", "mouse", "keyboard"}};
//        FunWith2DArrays.fourCorners(pre);
//        System.out.println();
//
//        String[][] ere = {{"cat"},
//                {"dog"},
//                {"hamster"},
//                {"bird"}};
//        FunWith2DArrays.fourCorners(ere);
//        System.out.println();
//
//        String[][] per = {{"time"}};
//        FunWith2DArrays.fourCorners(per);


//        // TEST CODE FOR average
//        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(FunWith2DArrays.average(testArr1));
//        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
//        System.out.println(FunWith2DArrays.average(testArr2));
//        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
//        System.out.println(FunWith2DArrays.average(testArr3));
//        int[][] testArr4 = {{4}, {7}, {8}, {2}};
//        System.out.println(FunWith2DArrays.average(testArr4));
//        int[][] testArr5 = {{4}};
//        System.out.println(FunWith2DArrays.average(testArr5));

        // TEST CODE FOR indexFound
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "stuff")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "good")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "map")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "joy")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "bam")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "cat")));



    }
}
