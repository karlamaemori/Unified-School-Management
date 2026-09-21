public class SchoolManagementSystemApp {
    public static void main(String[] args) {
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        System.out.println(attendanceAdapter.integrateSystem());
        System.out.println(gradingAdapter.integrateSystem());
        System.out.println(libraryAdapter.integrateSystem());
    }
}