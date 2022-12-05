public class Assistant extends CollegePerson implements ILearningPerson, ITeachingPerson {


    @Override
    public void studyAtHome() {

        System.out.println("I'm an Assistant but I'm still studying");

    }

    @Override
    public void teachToOtherPeople() {

        System.out.println("I'm an Assistant but I'm teaching too. Will I be a PhD? " + isGoingToBeAPhD);

    }

    boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD){

        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;

    }
}

    /*considering that an assistant is a CollegePerson that can learn and teach, define a subclass Assistant that:
        implements the right interfaces and overrides the abstract methods with informative messages
        has an attribute of type boolean called isGoingToBeAPhD
        has a constructor that takes 4 params (name, surname, id, willBeAPhD) and assigns their values to the right attributes*/
