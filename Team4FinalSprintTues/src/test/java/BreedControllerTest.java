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

public class BreedControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void findAllBreedTest() throws Exception {

        this.mockMvc.perform(get("/breeds").param("breed", "Dalmatian"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("Dalmatian"));
    }

    @Test
    public void findBreedByIdTest() throws Exception {

        this.mockMvc.perform(get("/breeds").param("id", "1"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("1"));

    }

    // @Test
    // public void newBreedCreationTest() throws Exception{
    //
    // MockHttpServletRequest request = new MockHttpServletRequest();
    // RequestContextHolder.setRequestAttributes(new
    // ServletRequestAttributes(request));
    //
    // Breed testBreed = new Breed(4,"Golden Retriever","Canus
    // Lupus","Scotland",14);
    // ResponseEntity<Object> responseEntity = BreedController.newBreed(testBreed);
    //
    // assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
    // assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo("/1");
    //
    // }

}
