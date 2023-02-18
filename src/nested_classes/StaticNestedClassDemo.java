package nested_classes;

public class StaticNestedClassDemo {

    public static void main(String[] args) {
        // accessing a static nested class
        OuterClass.StaticNestedClass nestedClass = new OuterClass.StaticNestedClass();
        nestedClass.display();

        OuterClassOne outerClassOne = new OuterClassOne();
        OuterClassOne.InnerClass innerClass = outerClassOne.new InnerClass();
        innerClass.display();
    }
}
