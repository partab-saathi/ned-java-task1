/*Q7:
Calculate Total and Percentage
Task: Calculate the total and percentage of marks obtained in three subjects. */
public class Q7 {
    public static void main(String[] args) {
        int sub1;
        int sub2;
        int sub3;
        sub1 = 55;
        sub2 = 65;
        sub3 = 75;
        int total;
        total = sub1 + sub2 + sub3;
        float percentage;
        percentage = ((float)total / 300)*100;
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
        System.out.println("Marks in Subject 3: " + sub3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
