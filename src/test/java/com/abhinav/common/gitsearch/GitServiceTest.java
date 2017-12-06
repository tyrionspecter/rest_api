package com.abhinav.common.gitsearch;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.http.ResponseEntity;

import com.abhinav.common.controller.GitModel;
import com.abhinav.common.controller.GitService;

public class GitServiceTest {

	
	@Spy
	GitService gitService;
	
	@Mock
	GitModel gitModel;
	
    @Test(expected=NullPointerException.class)
   public void testSaveGitModel() throws Exception {
      
        gitService.addrepo(gitModel);
    	assertNotNull(gitModel);        
        
    }
}
