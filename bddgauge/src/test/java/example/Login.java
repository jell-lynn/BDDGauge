package example;

public class Login {
    private final String registeredUsername = "testuser";
    private final String registeredPassword = "password123";

    private boolean loggedIn = false;
    private String message = "";
    private String currentPage = "login";

    public void login(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            message = "Username and Password are required";
            currentPage = "login";
            loggedIn = false;
        } else if (username.equals(registeredUsername) && password.equals(registeredPassword)) {
            message = "Welcome, " + username + "!";
            currentPage = "dashboard";
            loggedIn = true;
        } else {
            message = "Invalid credentials";
            currentPage = "login";
            loggedIn = false;
        }
    }

    public String getMessage() {
        return message;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}

