package demo.di;

class Dependency1 {}
class Dependency2 {}

final class DependencyFactory {
    private static Dependency1 dependency1;
    private static Dependency2 dependency2;

    public static Dependency1 provideDependency1() {
        if(dependency1 == null) {
            dependency1 = new Dependency1();
        }
        return dependency1;
    }

    public static Dependency2 provideDependency2() {
        if(dependency2 == null) {
            dependency2 = new Dependency2();
        }
        return dependency2;
    }
}

public class MyClass {
    private Dependency1 dependency1;

    public MyClass(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }
}
