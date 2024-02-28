package in.kunal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.kunal.Rest.MsgRestController;
import in.kunal.Service.MsgService;

@WebMvcTest(controllers = MsgRestController.class)
public class MsgControllerTest {
	
	@MockBean
	private MsgService msgservice;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testwelcome() throws Exception{
		
		when(msgservice.welcomemsg()).thenReturn("Hello");
        MockHttpServletRequestBuilder request =     MockMvcRequestBuilders.get("/welcome");	
           MvcResult result  =  mockMvc.perform(request).andReturn();
              MockHttpServletResponse response =     result.getResponse();
              
                String content =  response.getContentAsString();
                System.out.println(content);
                
            int status =   response.getStatus();
            assertEquals(200, status);
	}
	@Test
	public void greettest()throws Exception {
		when(msgservice.greetmsg()).thenReturn("Greet Testing : Hey Good Morning");
	    MockHttpServletRequestBuilder  requestBuilder=         	MockMvcRequestBuilders.get("/greet");
	   MvcResult result =  mockMvc.perform(requestBuilder).andReturn();
	     MockHttpServletResponse  response =  result.getResponse();
	   int Status =  response.getStatus();
	        assertEquals(200, Status);
	        
	}

}
