package demo.di;

import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;

class Dependency1 {
    public void doSomething() {
        System.out.println("Call Dependency1.doSomething()");
    }
}

class Dependency2 {
    public void doSomething() {
        System.out.println("Call Dependency2.doSomething()");
    }
}

@Module
class FirstModule {

    @Provides
    public Dependency1 providesDependency1() {
        return new Dependency1();
    }

    @Provides
    public Dependency2 providesDependency2() {
        return new Dependency2();
    }

}


public class MyClass {


    private Dependency1 dependency1;

    @Inject
    Dependency2 dependency2;

    @Inject
    public MyClass(Dependency1 dependency1) {
        this.dependency1 = dependency1;
        dependency1.doSomething();
    }

    public void callMethod() {
        dependency2.doSomething();
    }
}
