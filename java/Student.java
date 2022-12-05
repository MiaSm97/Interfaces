public class Student extends CollegePerson implements ILearningPerson {


    @Override
    public void studyAtHome() {
        System.out.println("I'm a Student and I'm studying. Academic year: " + academicYear);

    }


    int academicYear;



    public Student(String name, String surname, int id, int year){

        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;


    }
}
    /*considering that a student is a CollegePerson that can learn, define a subclass Student that:
        implements the right interface and overrides the abstract method with an informative message
        has an attribute academicYear of type int
        has a constructor that takes 4 params (name, surname, id, year) and assigns their values to the right attributes*/
