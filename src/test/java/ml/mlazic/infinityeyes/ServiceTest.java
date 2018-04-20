package ml.mlazic.infinityeyes;

import ml.mlazic.infinityeyes.services.CountingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CountingService service;

    @Test
    public void countShouldReturnResultFromService() throws Exception {
        when(service.count("EngIneerIng")).thenReturn(2);
        this.mockMvc.perform(get("/counter?text=EngIneerIng"))
                .andDo(print())
                .andExpect(content().string(containsString("2")));
    }
}
