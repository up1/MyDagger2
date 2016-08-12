package demo.di;


import dagger.Component;

import javax.inject.Singleton;


@Singleton
@Component(modules = FirstModule.class)
interface FirstComponent {
    MyClass make();
}

public class Main {

    public static void main(String ... args) {
        FirstComponent firstComponent = DaggerFirstComponent.builder().build();
        firstComponent.make().callMethod();
    }

}


