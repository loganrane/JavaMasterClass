package AdvancedOOP;

// Generic Class.
class Login<T> {
    private T name;
    private T password;
    public Login(T name, T password){
        this.name = name;
        this.password = password;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getPassword() {
        return password;
    }

    public void setPassword(T password) {
        this.password = password;
    }
}

class Person {
    private String name;
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

public class MainGeneric {
    public static void main(String[] args) {
        Login<String> login = new Login<>("Arpit", "Hell");
        System.out.println(login.getName());

        // Reusability with another type.
        Login<Integer> loginInt = new Login<>(12, 11233);
        System.out.println(loginInt.getName());

        Person p = new Person();
        p.setName("Alpha");
        p.setPass("pass");

        Login<Person> loginObj = new Login<>(p, p);
        System.out.println(loginObj.getName().getName());
    }
}
