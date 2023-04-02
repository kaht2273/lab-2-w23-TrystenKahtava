package lab2;

public class PracticeExercise_2_1 {

    public static void main(String[] args) {
//"Write a program that initializes a string with "Mississippi".
// Then replace all "i" with "ii" and print the length of the resulting string.
// In that string, replace all "ss" with "s" and print the length of the resulting string."
        String x = "Mississppi";
        System.out.println(x + " " + x.length());

        x = x.replace("i","ii");
        System.out.println(x + " " + x.length());

        x = x.replace("s","ss");
        System.out.println(x + " " + x.length());
    }
}
