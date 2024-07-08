import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface DEP {
    int batch() default 12;

    int studentCount();

    String[] studentNames() default {};
}
