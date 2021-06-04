import java.util.ArrayList;

class Person {

    private String name, surname, email;
    int phoneNo;

    public Person(String name, String surname, String email, int phoneNo) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", email=" + email + ", phoneNo=" + phoneNo + '}';
    }
}
