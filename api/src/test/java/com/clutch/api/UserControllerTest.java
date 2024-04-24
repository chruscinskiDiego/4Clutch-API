package com.clutch.api;
import com.clutch.api.controller.CrudController;
import com.clutch.api.controller.UserController;
import com.clutch.api.error.ApiError;
import com.clutch.api.model.User;
import com.clutch.api.repository.UserRepository;
import com.clutch.api.service.impl.UserServiceImpl;
import com.clutch.api.shared.GenericResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class UserControllerTest {

    private final String API_USERS = "/users";

    private UserController userController;
    private CrudController crudController;

    private UserServiceImpl userService;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("Post a new User when the User is valid receive a 201 CREATED")
    public void postUser_whenUserIsValid_receiveCreated() {
        ResponseEntity<Object> response =
                testRestTemplate.postForEntity(
                        API_USERS,
                        createValidUser(),
                        Object.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }

    @Test
    @DisplayName("Post a new User when the Username is null receive a 400 BAD_REQUEST")
    public void postUser_whenUsernameIsNull_receiveGenericMessageOfSizeError() {
        User user = createValidUser();
        user.setUsername(null);
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("username")).isEqualTo("Username cannot be null");
    }

    @Test
    @DisplayName("Post a new User when the Username is empty receive a 400 BAD_REQUEST")
    public void postUser_whenUsernameIsEmpty_receiveBadRequest() {
        User user = createValidUser();
        user.setUsername("");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("username")).isEqualTo("Username must be between {6} and {100} characters");
    }

    @Test
    @DisplayName("Post a new User when the Username contains special characters receive a 400 BAD_REQUEST")
    public void postUser_whenUsernameContainsSpecialCharactersAndNumbers_receiveBadRequest() {
        User user = createValidUser();
        user.setUsername("teste@1");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("username")).isEqualTo("Username can only contain letters");
    }

    @Test
    @DisplayName("Post a new User when the Username is less than 6 characters receive a 400 BAD_REQUEST")
    public void postUser_whenUserHasInvalidLength_receiveGenericMessageOfSizeError() {
        User user = createValidUser();
        user.setUsername("abc");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("username")).isEqualTo("Username must be between {6} and {100} characters");
    }

    @Test
    @DisplayName("Post a new User when the Username is more than 100 characters receive a 400 BAD_REQUEST")
    public void postUser_whenUsernameIsMoreThanOneHundredCharacters_receiveBadRequest() {
        User user = createValidUser();
        user.setUsername("a".repeat(101));
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("username")).isEqualTo("Username must be between {6} and {100} characters");
    }

    @Test
    @DisplayName("Post a new User when the Password is null receive a 400 BAD_REQUEST")
    public void postUser_whenPasswordIsNull_receiveBadRequest() {
        User user = createValidUser();
        user.setPassword(null);
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("password")).isEqualTo("Password cannot be null");
    }

    @Test
    @DisplayName("Post a new User when the Password is empty receive a 400 BAD_REQUEST")
    public void postUser_whenPasswordIsEmpty_receiveBadRequest() {
        User user = createValidUser();
        user.setPassword("");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("password")).isEqualTo("Password must be between {6} and {100} characters");
    }

    @Test
    @DisplayName("Post a new User when the Password doesn't contain uppercase receive a 400 BAD_REQUEST")
    public void postUser_whenPasswordDoesNotContainUppercase_receiveBadRequest() {
        User user = createValidUser();
        user.setPassword("teste23");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("password")).isEqualTo("Password must contain at least one lowercase letter, one uppercase letter, and one digit");
    }

    @Test
    @DisplayName("Post a new User when the Password doesn't contain uppercase receive a 400 BAD_REQUEST")
    public void postUser_whenPasswordDoesNotContainLowercase_receiveBadRequest() {
        User user = createValidUser();
        user.setPassword("TESTE23");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("password")).isEqualTo("Password must contain at least one lowercase letter, one uppercase letter, and one digit");
    }

    @Test
    @DisplayName("Post a new User when the Password doesn't contain a number receive a 400 BAD_REQUEST")
    public void postUser_whenPasswordDoesNotContainNumber_receiveBadRequest() {
        User user = createValidUser();
        user.setPassword("Testeee");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("password")).isEqualTo("Password must contain at least one lowercase letter, one uppercase letter, and one digit");
    }

    @Test
    @DisplayName("Post a new User when the Password is less than 6 characters receive a 400 BAD_REQUEST")
    public void postUser_whenPasswordIsLessThanSixCharacters_receiveBadRequest() {
        User user = createValidUser();
        user.setPassword("Test1");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("password")).isEqualTo("Password must be between {6} and {100} characters");
    }

    @Test
    @DisplayName("Post a new User when the Password is more than 100 characters receive a 400 BAD_REQUEST")
    public void postUser_whenPasswordIsMoreThanOneHundredCharacters_receiveBadRequest() {
        User user = createValidUser();
        user.setPassword("Test12".repeat(101));
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("password")).isEqualTo("Password must be between {6} and {100} characters");
    }

    @Test
    @DisplayName("Post a new User when the Email is null receive a 400 BAD_REQUEST")
    public void postUser_whenEmailIsNull_receiveBadRequest() {
        User user = createValidUser();
        user.setEmail(null);
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("email")).isEqualTo("Email cannot be null");
    }

    @Test
    @DisplayName("Post a new User when the Email is empty receive a 400 BAD_REQUEST")
    public void postUser_whenEmailIsEmpty_receiveBadRequest() {
        User user = createValidUser();
        user.setEmail("");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("email")).isEqualTo("Email must be between {6} and {100} characters");
    }

    @Test
    @DisplayName("Post a new User when the Email is less than 6 characters receive a 400 BAD_REQUEST")
    public void postUser_whenEmailIsLessThanSixCharacters_receiveBadRequest() {
        User user = createValidUser();
        user.setEmail("asd6@");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("email")).isEqualTo("Email must be between {6} and {100} characters");
    }

    @Test
    @DisplayName("Post a new User when the Email is more than 100 characters receive a 400 BAD_REQUEST")
    public void postUser_whenEmailIsMoreThanOneHundredCharacters_receiveBadRequest() {
        User user = createValidUser();
        user.setEmail("Test1@".repeat(101));
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("email")).isEqualTo("Email must be between {6} and {100} characters");
    }

    @Test
    @DisplayName("Post a new User when the Email is invalid receive a 400 BAD_REQUEST")
    public void postUser_whenEmailIsInvalid_receiveBadRequest() {
        User user = createValidUser();
        user.setEmail("asdasdasasd");
        ResponseEntity<ApiError> response = postSignup(user, ApiError.class);
        Map<String, String> validationErrors = response.getBody().getValidationErrors();
        assertThat(validationErrors.get("email")).isEqualTo("Email must contain at least one '@' character");
    }

    //USER VALIDE OBJECT--------------------------------------------
    private User createValidUser() {
        return User.builder()
                .username("testuser")
                .password("P4ssword")
                .email("teste@teste.com.br").build();
    }

    public <T> ResponseEntity<T> postSignup(Object request,  Class<T> responseType) {
        return testRestTemplate.postForEntity(API_USERS, request, responseType);
    }
}
