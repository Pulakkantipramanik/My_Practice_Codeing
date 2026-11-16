import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentCourseFilter {
    public static void main(String[] args) {
        Map<String, String> StudentCourse = new HashMap<>();
        StudentCourse.put("Pulak", "Course_1");
        StudentCourse.put("Shayam", "Course_2");
        StudentCourse.put("Sanjoy", "Course_1");
        StudentCourse.put("Sam", "Course_3");
        StudentCourse.put("Samsun", "Course_2");
        StudentCourse.put("Dhyan", "Course_1");


        Map<String, String> result = StudentCourse.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals("Course_1"))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        System.out.println("Student enrolled with Course_1");
        result.forEach((student, course) ->
                System.out.println("Student:   " + student + " |  Course: " + course));
    }
}