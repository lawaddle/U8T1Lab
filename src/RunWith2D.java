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

        int[][] ahh = {{5, 2},
                {1, 3},
                {7, 9}};
        System.out.println(FunWith2DArrays.totalElements(ahh));

    }
}
