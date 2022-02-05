package collectionsGithub1;

public class Main
{
    public static void main( String[] args )
    {
        courseService courseService = new courseService();

        String courseId = "math_01";
        String studentId = "120120";
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);

        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
    }


}