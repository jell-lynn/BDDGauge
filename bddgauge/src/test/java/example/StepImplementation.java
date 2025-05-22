package example;

import com.thoughtworks.gauge.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {

    private Login login = new Login();

    @Step("I am a registered user")
    public void iAmRegisteredUser() {
    }

    @Step("I have navigated to the login page")
    public void iHaveNavigatedToLoginPage() {
    }

    @Step("I am on the login page")
    public void iAmOnTheLoginPage() {
    }

    @Step("I enter my valid username and password")
    public void enterValidCredentials() {
        login.login("testuser", "password123");
    }

    @Step("I enter my valid username but an incorrect password")
    public void enterIncorrectPassword() {
        login.login("testuser", "wrongpassword");
    }

    @Step("I leave the username and password fields empty")
    public void enterEmptyFields() {
        login.login("", "");
    }

    @Step("I click on the <Login> button")
    public void clickButton(String button) {
    }

    @Step("I should be redirected to the dashboard")
    public void shouldRedirectToDashboard() {
        assertThat(login.getCurrentPage()).isEqualTo("dashboard");
    }

    @Step("I should see a welcome message")
    public void shouldSeeWelcomeMessage() {
        assertThat(login.getMessage()).isEqualTo("Welcome, testuser!");
    }

    @Step("I should remain on the login page")
    public void shouldRemainOnLoginPage() {
        assertThat(login.getCurrentPage()).isEqualTo("login");
    }

    @Step("I should see an error message saying <expectedMessage>")
    public void shouldSeeErrorMessage(String expectedMessage) {
        assertThat(login.getMessage()).isEqualTo(expectedMessage);
    }
}