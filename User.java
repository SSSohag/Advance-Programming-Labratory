public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public User getUserInfo(int userId) {
        // Fetch user information from the database
        return new User("Sohag Chandra", "sohag220238.cseku.ac.bd");
    }
}

