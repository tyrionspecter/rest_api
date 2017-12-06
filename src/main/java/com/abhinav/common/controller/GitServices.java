package com.abhinav.common.controller;

import java.util.List;

public interface GitServices {
	
	public List<GitModel> getallrepo();
	public GitModel  addrepo(GitModel gitmodel);
	public String delete(String id);
}






