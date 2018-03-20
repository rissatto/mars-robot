package gov.nasa.robot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RobotApplicationTests {

	private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;
	
    @Before
    public void init() {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

	@Test
	public void testMMRMMRMM() throws Exception {
		/*
		 * Movimento com rotações para direita:
		 * curl -s --request POST http://localhost:8080/rest/mars/MMRMMRMM
		 * Saída esperada: (2, 0, S)
		 */
		mockMvc.perform(post("/mars/MMRMMRMM"))
        .andExpect(status().isOk())
        .andExpect(content().string("(2, 0, S)"));
	}
	
	@Test
	public void testMML() throws Exception {
		/*
		 * Movimento para esquerda:
		 * curl -s --request POST http://localhost:8080/rest/mars/MML
		 * Saída esperada: (0, 2, W)
		 */
		mockMvc.perform(post("/mars/MML"))
        .andExpect(status().isOk())
        .andExpect(content().string("(0, 2, W)"));
	}
	
	@Test
	public void testMML2() throws Exception {
		/*
		 * Repetição da requisição com movimento para esquerda:
		 * curl -s --request POST http://localhost:8080/rest/mars/MML
		 * Saída esperada: (0, 2, W)
		 */
		mockMvc.perform(post("/mars/MML"))
        .andExpect(status().isOk())
        .andExpect(content().string("(0, 2, W)"));
	}
	
	@Test
	public void testAAA() throws Exception {
		/*
		 * Comando inválido:
		 * curl -s --request POST http://localhost:8080/rest/mars/AAA
		 * Saída esperada: 400 Bad Request
		 */
		mockMvc.perform(post("/mars/AAA"))
		.andExpect(status().isBadRequest());
	}
	
	@Test
	public void testMMMMMMMMMMMMMMMMMMMMMMMM() throws Exception {
		/*
		 * Posição inválida:
		 * curl -s --request POST http://localhost:8080/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM
		 * Saída esperada: 400 Bad Request
		 */
		mockMvc.perform(post("/mars/MMMMMMMMMMMMMMMMMMMMMMMM"))
		.andExpect(status().isBadRequest());
	}

}
