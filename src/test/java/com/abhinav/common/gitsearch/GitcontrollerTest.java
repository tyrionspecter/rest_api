package com.abhinav.common.gitsearch;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.http.ResponseEntity;

import com.abhinav.common.controller.GitModel;
import com.abhinav.common.controller.Gitcontroller;


public class GitcontrollerTest {
	@Spy
    private Gitcontroller gitController;
    
    @Mock
    GitModel gitModel;
//    
//    @Mock
//    TaskToScheduler taskToScheduler;
    
    @Test(expected=NullPointerException.class)
   public void testSelectJob() throws Exception {
      
        ResponseEntity<String> string=(gitController.addrepo(gitModel));
        assertNotNull(string);        
        
    }

}
