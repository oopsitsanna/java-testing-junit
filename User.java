/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author hakin
 */
public class User {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    
    /* field to store all users*/
    private static Map<Integer, User> allUsers;
    
    /* field to store ID for new users */
    private static int countId = 0;
    
    /* constructor */
    public User(String name, int age, Gender gender) {
    if (allUsers == null) {
        allUsers = new HashMap<>();
    }
    this.name = name;
    this.age = age;
    this.gender = gender;
    
    if(!hasUser()){
    countId++;
    this.id = countId;
    allUsers.put(id, this);
    }
    }
    
    /* check if the object in the list*/
    private boolean hasUser(){
        for (User user : allUsers.values()){
            if (user.equals(this) && user.hashCode() == this.hashCode()){
                return true;
            }
                }
        return false;
    }
    
    /* override toString method*/
    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    
    /* help find the same objects in the list*/
    @Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return age == user.age &&
            Objects.equals(name, user.name) &&
            gender == user.gender;
}
    
    /* help find the same objects in the list*/
    @Override
    public int hashCode(){
        return Objects.hash(name, age, gender);
    }
    
    /* return list of all users*/
    public static List<User> getAllUsers(){
    return new ArrayList<>(allUsers.values());
}
    /* return list depends of the parameters Gender */
    public static List<User> getAllUsers(Gender gender){
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()){
            if (user.gender == gender){
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }
    
    /* return how many users in the list */
    public static int getHowManyUsers(){
    return allUsers.size();
}
    /* return list depends of the users' gender*/
    public static int getHowManyUsers(Gender gender){
        return getAllUsers(gender).size();
    }
    
    /* count all users depends of age and gender */
    
    /* return age of the users*/
    public static int getAllAgeUsers(){
    int countAge = 0;
    for (User user : allUsers.values()){
        countAge += user.age;
    }
    return countAge;
}
    /* count users depends of their age */
    public static int getAllAgeUsers(Gender gender){
    int countAge = 0;
    for (User user : getAllUsers(gender)){
        countAge += user.age;
    }
    return countAge;
}
    
    /* count median age of the users*/
    public static int getAverageAgeOfAllUsers(){
    return getAllAgeUsers() / getHowManyUsers();
}
    /* count median users' age depends of the gender */
    public static int getAverageAgeOfAllUsers(Gender gender){
        return getAllAgeUsers(gender) / getHowManyUsers(gender);
    }
}

