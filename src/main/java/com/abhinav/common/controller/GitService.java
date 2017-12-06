package com.abhinav.common.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.actuate.info.GitInfoContributor;
import org.springframework.stereotype.Service;

@Service
public class GitService implements GitServices{
	
	@Autowired
	GitRdbmRepositoy  gitRdbmRepository;
	List<GitModel> repolist = new ArrayList<>();
//new GitModel("google", "abhinav", 23, 45, "google.com"),
//new GitModel("facebook", "avalanche", 45, 56, "facebook.com"),
//new GitModel("twitter", "karna", 12, 345, "twitter.com")));
	

@Override
	public List<GitModel> getallrepo() {
		List<GitModel> repolist = (List<GitModel>)gitRdbmRepository.findAll();
		return repolist;
	}

	@Override
	public GitModel addrepo(GitModel gitmodel) {
		gitRdbmRepository.save(gitmodel);
		return gitmodel;
		
	}

	@Override
	public  String delete(String id) {
		// TODO Auto-generated method stub
		gitRdbmRepository.delete(id);
		System.out.println("deleting data..");
		return null;
	}
	
	
	
}