package demo.di;

import javax.inject.Inject;

class Dependency1 {
    public void doSomething() {}
}


public class MyClass {

    @Inject
    private Dependency1 dependency1;

    @Inject
    public MyClass(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    @Inject
    public void callMethod(Dependency1 dependency1) {
        dependency1.doSomething();
    }
}
