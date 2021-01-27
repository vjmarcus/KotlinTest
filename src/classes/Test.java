package classes;

public class Test {
    static class Cat {
        private String name;
        private int age;
        private Boolean breed;

        public Cat(String name, int age, Boolean breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        public Cat(String name) {
            this.name = name;
        }

        public Cat(int age) {
            this.age = age;
        }

        public Cat(Boolean breed) {
            this.breed = breed;
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Vards");
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.breed);
    }
}
