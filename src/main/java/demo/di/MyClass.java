package demo.di;

class Dependency1 {

}

public class MyClass {
    private Dependency1 dependency1;

    public MyClass(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }
}
