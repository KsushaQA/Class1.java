package homework4;
/*3)  Создать класс Конспект. Класс должен содержать следующие поля:
        название предмета;
        ФИО студента;
        количество страниц;
        год выпуска;
        цвет обложки.
        Название заведения, где учится студент;*/


public class HW3 {
    public static class Konspect {
        public String projectName;
        public String studentFullName;
        public int numbersOfPages;
        public int yearOfIssue;
        public String coverColor;
        public String nameOfInstitution;
        public  Konspect(String projectName, String studentFullName, int numbersOfPages, int yearOfIssue, String
                coverColor, String nameOfInstitution){
            this.projectName = projectName;
            this.studentFullName = studentFullName;
            this.numbersOfPages = numbersOfPages;
            this.yearOfIssue = yearOfIssue;
            this.coverColor = coverColor;
            this.nameOfInstitution = nameOfInstitution;
        }
        public String getProjectName() {
            return projectName;
        }
        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }
        public String getStudentFullName() {
            return studentFullName;
        }
        public void setStudentFullName(String studentFullName) {
            this.studentFullName = studentFullName;
        }
        public int getNumbersOfPages() {
            return numbersOfPages;
        }
        public void setNumbersOfPages(int numbersOfPages) {
            this.numbersOfPages = numbersOfPages;
        }
        public int getYearOfIssue() {
            return yearOfIssue;
        }
        public void setYearOfIssue(int yearOfIssue) {
            this.yearOfIssue = yearOfIssue;
        }
        public String getCoverColor() {
            return coverColor;
        }
        public void setCoverColor(String coverColor) {
            this.coverColor = coverColor;
        }
        public String getNameOfInstitution() {
            return nameOfInstitution;
        }
        public void setNameOfInstitution(String nameOfInstitution) {
            this.nameOfInstitution = nameOfInstitution;
        }
    }
}
