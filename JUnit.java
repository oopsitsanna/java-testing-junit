package junit;

public class JUnit {

    public static void main(String[] args) {
    new User("John", 35, Gender.MALE);
    new User("Mary", 34, Gender.FEMALE);
    new User("Lisa", 7, Gender.FEMALE);


    System.out.println("All users:");
    User.getAllUsers().forEach(System.out::println);
    System.out.println("All users: MALE");
    User.getAllUsers(Gender.MALE).forEach(System.out::println);
    System.out.println("All users: FEMALE");
    User.getAllUsers(Gender.FEMALE).forEach(System.out::println);
    System.out.println("================================================");
    System.out.println("       all users: " + User.getHowManyUsers());
    System.out.println("  all users MALE: " + User.getHowManyUsers(Gender.MALE));
    System.out.println("all users FEMALE: " + User.getHowManyUsers(Gender.FEMALE));
    System.out.println("================================================");
    System.out.println("       sum of all users' age: " + User.getAllAgeUsers());
    System.out.println("  sum of all users' age MALE: " + User.getAllAgeUsers(Gender.MALE));
    System.out.println("sum of all users' age FEMALE: " + User.getAllAgeUsers(Gender.FEMALE));
    System.out.println("================================================");
    System.out.println("       median of all users' age: " + User.getAverageAgeOfAllUsers());
    System.out.println("  median of all users' age MALE: " + User.getAverageAgeOfAllUsers(Gender.MALE));
    System.out.println("median of all users' age FEMALE: " + User.getAverageAgeOfAllUsers(Gender.FEMALE));
    System.out.println("================================================");
}
    
}

