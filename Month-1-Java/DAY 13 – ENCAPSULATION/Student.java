class Student {

    private String name;
    private int age;

    // Setter
    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Getter
    int getAge() {
        return age;
    }
}
