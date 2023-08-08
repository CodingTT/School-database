
    public class Main {
        public static void main(String[] args) {
            School school = new School("Example School", "Cityville", 1980);

            // Adding teachers
            school.addTeacher(new Teacher("John", "Doe", "Math"));
            school.addTeacher(new Teacher("Jane", "Smith", "Science"));
            school.addTeacher(new Teacher("Michael", "Johnson", "History"));

            // Adding students
            school.addStudent(new Student("Alice", "Johnson", 9));
            school.addStudent(new Student("Bob", "Williams", 10));
            school.addStudent(new Student("Eve", "Brown", 11));
            school.addStudent(new Student("Charlie", "Davis", 9));
            school.addStudent(new Student("David", "Martinez", 12));
            school.addStudent(new Student("Grace", "Taylor", 10));
            school.addStudent(new Student("Henry", "Garcia", 11));
            school.addStudent(new Student("Isabella", "Lee", 9));
            school.addStudent(new Student("James", "Wilson", 12));
            school.addStudent(new Student("Olivia", "Anderson", 10));

            // Displaying teachers and students
            school.showAllTeachers();
            school.showAllStudents();

            // Removing students and teacher
            school.deleteStudent(new Student("Charlie", "Davis", 9));
            school.deleteStudent(new Student("Isabella", "Lee", 9));
            school.deleteTeacher(new Teacher("Jane", "Smith", "Science"));

            // Displaying teachers and students after removal
            school.showAllTeachers();
            school.showAllStudents();
        }
    }


