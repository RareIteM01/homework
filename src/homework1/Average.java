package homework1;

public class Average {
    public static void main(String[] args) {
        int[] values = {19, 1567, 285, 90, 105};
        int result = 0;

        for (int s : values) {
            result += s;
        }
        System.out.println(" Average  =  " + result / values.length);
    }
}

