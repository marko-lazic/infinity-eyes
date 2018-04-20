package ml.mlazic.infinityeyes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HttpRequestTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void countShouldReturn_GETResult() throws Exception {
        this.mockMvc.perform(get("/counter?text=EngIneerIng"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("2")));
    }

    @Test
    public void retrieveCountShouldReturn_POSTResult() throws Exception {
        this.mockMvc.perform(post("/counter")
                .contentType(MediaType.APPLICATION_JSON)
                .content("EngIneerIng"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("2")));
    }

}
