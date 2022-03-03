public class FunWith2DArrays {
    public static int totalElements (int[][] array2d)
    {
        return array2d.length * array2d[0].length;
    }

    public static void fourCorners (String[][] corned)
    {
        System.out.println(corned[0][0]);
        System.out.println(corned[0][corned[0].length-1]);
        System.out.println(corned[corned.length-1][0]);
        System.out.println(corned[corned.length-1][corned[0].length-1]);

    }

    public static double average (int[][] aray2D)
    {
        double sum = 0;
        for (int[] rows: aray2D) {
            for (int ele: rows) {
                sum+=ele;
            }
        }
        return sum/totalElements(aray2D);
    }

    public static int[] indexFound(String[][] str2d, String find)
    {
        for (int i = 0; i < str2d.length; i++) {
            for (int j = 0; j < str2d[0].length; j++) {
                if (str2d[i][j].equals(find))
                {
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        int[] sad = {-1,-1};
        return sad;
    }

}
