import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> s1passedCourses = new ArrayList<>();
        s1passedCourses.add("International økonomi");
        s1passedCourses.add("Erhvervsjura");
        s1passedCourses.add("Java 1.0");

        ArrayList<String> s2passedCourses = new ArrayList<>();
        s2passedCourses.add("Afsætning");
        s2passedCourses.add("Virksomhedsøkonomi");

        ArrayList<String> s3passedCourses = new ArrayList<>();
        s3passedCourses.add("Dansk");
        s3passedCourses.add("Engelsk");

        ArrayList<String> s4passedCourses = new ArrayList<>();
        s4passedCourses.add("Fysik");
        s4passedCourses.add("Kemi");

        Student s1 = new Student("William", s1passedCourses);
        Student s2 = new Student("Benedicte", s2passedCourses);
        Student s3 = new Student("Karl", s3passedCourses);
        Student s4 = new Student("Smart", s4passedCourses);

        ArrayList<String> t1canTeach = new ArrayList<>();
        t1canTeach.add("Java 1.0");
        t1canTeach.add("Fysik");
        t1canTeach.add("Dansk");

        ArrayList<String> t2canTeach = new ArrayList<>();
        t2canTeach.add("Java 1.0");
        t2canTeach.add("Engelsk");
        t2canTeach.add("Virksomhedsøkonomi");

        ArrayList<String> t3canTeach = new ArrayList<>();
        t3canTeach.add("Java 1.0");
        t3canTeach.add("Erhvervsjura");
        t3canTeach.add("Afsætning");

        Teacher t1 = new Teacher("Signe", t1canTeach);
        Teacher t2 = new Teacher("Tine", t2canTeach);
        Teacher t3 = new Teacher("Tess", t3canTeach);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);

        for(Person person : persons){

            boolean addedCourse = person.addCourse("Java 1.0");

            if(!addedCourse){

                if(person instanceof Student){

                    System.out.println(person.getName()+ " har allerde gennemført dette kursus");

                }else if (person instanceof Teacher){

                    System.out.println(person.getName()+ " kan ikke undervise i dette fag");

                }

            }

        }

        System.out.println(s1.getName()+ "s nuværende kursus: "+s1.getCurrentCourses());
        System.out.println(s2.getName()+ "s nuværende kursus: "+ s2.getCurrentCourses());
        System.out.println(s3.getName()+ "s nuværende kursus: "+ s3.getCurrentCourses());
        System.out.println(s4.getName()+ "s nuværende kursus: "+ s4.getCurrentCourses());
        System.out.println(t1.getName()+" er lærer i: "+ t1.getCurrentCourses());
        System.out.println(t2.getName()+" er lærer i: "+ t2.getCurrentCourses());
        System.out.println(t3.getName()+" er lærer i: "+ t3.getCurrentCourses());

    }

}
