    class Student {
        private final String firstName;
        private final String lastName;
        private final int grade;
        private final int studentNumber;
        private static int studentCount = 1;

        public Student(String firstName, String lastName, int grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
            this.studentNumber = studentCount++;
        }


        public String toString() {
            return "Name: " + firstName + " " + lastName + " Grade: " + grade + " Student Number: " + studentNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getGrade() {
            return grade;
        }

        public int getStudentNumber() {
            return studentNumber;
        }
    }

