public @interface MySecondAnnotation /* extends MyFirstAnnotation */{

    public static final int x = 10;

    public static class Customer{}

    public static enum MyEnum{}

    public static record MyRecord(){}

    public static interface MyTopLevelInterface{}

//    int marks() default MyUtilityClass.add(20,30);

    int marks() default 10 + 20;

    String name() default "Thraindu" + " Kasun";
}

class MyUtilityClass {
    static int add(int num1, int num2){
        return num1 + num2;
    }
}
