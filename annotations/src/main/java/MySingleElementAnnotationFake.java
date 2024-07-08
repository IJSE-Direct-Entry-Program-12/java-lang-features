public @interface MySingleElementAnnotationFake {
    int myValue();
    // Even though this has only one element inside the body, we can't call this as a single element
    // annotation, this is actually a normal annotation
}
