package school.sorokin.javacore.basics;

public class VariablesLesson {
    public static void main(String[] args) {
        byte temperature = 25;
        short schoolMembers = 1582;
        int citizens = 1542365;
        long time = System.currentTimeMillis();
        float tau = 6.283_185_307_179_586f;
        double pi = 3.14159265358979;
        boolean flag = true;
        char gender = 'M';

        System.out.println("Temperature: " + temperature);
        System.out.println("School members: " + schoolMembers);
        System.out.println("Citizens: " + citizens);
        System.out.println("Time: " + time);
        System.out.println("TAU: " + tau);
        System.out.println("PI: " + pi);
        System.out.println("Is true? " + flag);
        System.out.println("Gender: " + gender);

        int casting = (int) time;
        System.out.println("Casting: " + casting);

        char a = 'A';
        for (int i = 0; i < 5; i++) {
            System.out.println(a + i);
        }
    }
}
