
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.keyin.entity.User;

@ExtendWith(MockitoExtension.class)

public class UserTest {
    @Mock
    private User userUnderTest = Mockito.mock(User.class);

    @Test
    public void testGetId() {
        User userUnderTest = new User();
        userUnderTest.setId(1);
        assertEquals(1, userUnderTest.getId());

    }

    @Test
    public void testGetEmail() {
        User userUnderTest = new User();
        userUnderTest.setEmail("sampleEmail@Keyin.com");
        assertEquals("sampleEmail@Keyin.com", userUnderTest.getEmail());

    }

    @Test
    public void testGetUserName() {
        User userUnderTest = new User();
        userUnderTest.setUserName("sampleUser1010");
        assertEquals("sampleUser1010", userUnderTest.getUserName());

    }

    @Test
    public void testGetPassword() {
        User userUnderTest = new User();
        userUnderTest.setPassword("password123");
        assertEquals("password123", userUnderTest.getPassword());

    }

}
