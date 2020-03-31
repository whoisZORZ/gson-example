import java.util.Arrays;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        String s1 = gson.toJson(3.141593);
        String s2 = gson.toJson("Hello, world!");
        String s3 = gson.toJson(false);
        String s4 = gson.toJson(null);
        String s5 = gson.toJson(new int[] {3, 26, 31, 46, 66});

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        double result1 = gson.fromJson(s1, Double.class);
        String result2 = gson.fromJson(s2, String.class);
        boolean result3 = gson.fromJson(s3, Boolean.class);
        Object result4 = gson.fromJson(s4, Object.class);
        int[] result5 = gson.fromJson(s5, int[].class);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(Arrays.toString(result5));
    }    

}