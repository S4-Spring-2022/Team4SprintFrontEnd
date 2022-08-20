
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
@SpringBootTest
@AutoConfigureMockMvc

public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void findAllUseresTest() throws Exception{
        this.mockMvc.perform(get("/users").param("username","sampleUser"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("sampleUser"));

    }

    @Test
    public void findUserByIdTest() throws Exception {
        this.mockMvc.perform(get("/users").param("id","4"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("4"));
    }

}
