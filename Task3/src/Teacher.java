import java.util.ArrayList;

public class Teacher extends Person{

    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    public Teacher (String name, ArrayList<String> canTeach){

        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();

    }

    public ArrayList<String> getCanTeach(){

        return canTeach;

    }

    public ArrayList<String> getCurrentCourses(){

        return currentCourses;

    }

    @Override
    public boolean addCourse(String course) {

        if(canTeach.contains(course)){

            currentCourses.add(course);
            return true;

        }else {

            return false;

        }

    }

}
