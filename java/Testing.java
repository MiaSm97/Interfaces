public class Testing {
    public static void main(String[] args) {
        Student student = new Student("Gino", "Rossi", 4, 2);
        Professor professor = new Professor("Rino", "Blu", 6, "English");
        Assistant assistant = new Assistant("Teo", "Nero", 7, true);

        student.goToCollege();
        student.studyAtHome();
        professor.goToCollege();
        professor.teachToOtherPeople();
        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }



}

    /*define a Java testing class where you:
        create 3 objects, 1 for each subclass type
        invoke the goToCollege() method for each of the newly created objects
        invoke the implemented methods from interfaces (1 for Student, 1 for Professor and 2 for Assistant)*/
