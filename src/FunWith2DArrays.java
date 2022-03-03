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

}
