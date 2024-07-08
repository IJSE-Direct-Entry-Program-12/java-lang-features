@MyMarkerAnnotation()
public class DemoClass {

    @MyMarkerAnnotation
    int instanceVariable;

    @MyMarkerAnnotation()
    public static void myMethod1(){
    }

//    @MySingleElementAnnotation(value = 10)
    @MySingleElementAnnotation(10)

    @MySingleElementAnnotationFake(myValue = 10)
//    @MySingleElementAnnotationFake(10)
    public void myMethod2(){

    }
}
