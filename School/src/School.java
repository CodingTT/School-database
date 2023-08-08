import java.util.ArrayList;
    class School {
        private final ArrayList<Teacher> teachers;
        private final ArrayList<Student> students;
        private final String name;
        private final String location;
        private final int yearEstablished;

        public School(String name, String location, int yearEstablished) {
            this.name = name;
            this.location = location;
            this.yearEstablished = yearEstablished;
            this.teachers = new ArrayList<>();
            this.students = new ArrayList<>();
        }

        public void addTeacher(Teacher teacher) {
            teachers.add(teacher);
        }

        public void deleteTeacher(Teacher teacher) {
            teachers.remove(teacher);
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void deleteStudent(Student student) {
            students.remove(student);
        }

        public void showAllTeachers() {
            System.out.println("Teachers:");
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }

        public void showAllStudents() {
            System.out.println("Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }

        public String getName() {
            return name;
        }

        public String getLocation() {
            return location;
        }

        public int getYearEstablished() {
            return yearEstablished;
        }
    }


