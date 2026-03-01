package application.domain;

import java.util.List;

public class Person {
    int id;
    String name;
    String lastName;
    String email;
    String password;
    boolean state;

    //Constructors

    public Person(){

    }
    public Person(int id, String name, String lastName, String email, String password, boolean state) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.state = state;
    }
    public Person(String email){
        this.email = email;
    }

    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    //class methods

    public Person createUser(Person person){

        return person;
    }
    public Person updateUser(Person person){

        return person;
    }
    public List<Person> getUsers(){
        return null;
    }

    public Person getUserById(int id){
        return null;
    }

}
