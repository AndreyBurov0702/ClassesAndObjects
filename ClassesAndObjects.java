public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Andrey";
        person1.age = 36;
        System.out.println("my name is "+person1.name +","+ "i am "+person1.age+" old");
        Person person2 = new Person();
        person2.name = "Evgenia";
        person2.age = 34;
        System.out.println("my name is "+person2.name +","+ "i am "+person2.age+" old");
    }
}
class Person{
                                                           //У класса могут быть:
                                                           //1. Данные (поля)
                                                           //2. Действия, которые может совершать (методы)
    String name;
    int age;
}