package arrays._1450_Number_of_Students_Doing_Homework_at_a_Given_Time;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int output = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) output++;
        }
        return output;
    }
}
