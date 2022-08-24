package main.java.com.exercises;

public class Pattern {
    public static String createPicture(int n) {
        String sign1, sign2,sign3, sign4, pattern="";
        int number = n;
        int i;
        int j;
        int min;

        for (i = 1; i <= number; i++)
        {
            for (j = 1; j <= number; j++)
            {
                min = i < j ? i : j;
                int value= number-min+1;
                sign1=String.valueOf(value);
                pattern+=sign1;
            }
            for (j = number - 1; j >= 1; j--)
            {
                min = i < j ? i : j;
                int value2= number-min+1;
                sign2=String.valueOf(value2);
                pattern+=sign2;
            }
            pattern+="\n";
        }
        for (i = number - 1; i >= 1; i--)
        {
            for (j = 1; j <= number; j++)
            {
                min = i < j ? i : j;
                int value3= number-min+1;
                sign3=String.valueOf(value3);
                pattern+=sign3;
            }
            for (j = number - 1; j >= 1; j--)
            {
                min = i < j ? i : j;
                int value4= number-min+1;
                sign4=String.valueOf(value4);
                pattern+=sign4;
            }
            pattern+="\n";
        }

        return pattern;
    }
}
