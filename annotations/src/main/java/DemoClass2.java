@DEP(studentCount = 10, studentNames = {"Kasun", "Tharindu", "Nuwan", "Chamara"})
public class DemoClass2 {

    @DEP(studentCount = 10)
    int instanceVariable;

    @DEP(studentCount = 10, studentNames = {"Kasun", "Tharindu", "Nuwan", "Chamara"})
    public static void printDepDetails(@DEP(studentCount = 20) String id,
                                       @DEP(studentCount = 20) String name) {
        @DEP(studentCount = 20)
        int localVariable = 20;
    }
}
