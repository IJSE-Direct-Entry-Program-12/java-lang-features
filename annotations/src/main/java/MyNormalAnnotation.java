public @interface MyNormalAnnotation {
    String author() default "DEP 12";
    String version() default "1.0.0";
    String copyright() default "Copyright 2023 Dep12.";
}
