package com.sj.DAO;

import java.util.List;

import com.sj.Project;

public interface ProjectDAO {
	public void insertProject(Project p);

	public List<Project> showAll();

}
