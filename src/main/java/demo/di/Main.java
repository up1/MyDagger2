package demo.di;


public class Main {

    public void call() {

        MyClass myClass = new MyClass(DependencyFactory.provideDependency1());

    }

}
