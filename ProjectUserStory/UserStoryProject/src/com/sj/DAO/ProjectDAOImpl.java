package com.sj.DAO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.sj.Project;
import com.sj.DBconnector.Dbconnector;
//import com.sun.tools.javac.util.List;

public class ProjectDAOImpl implements ProjectDAO{
	 Connection con;
@Override
	public void insertProject(Project p) {
	
	try
	{
		con=(Connection) Dbconnector.getConnection();
		PreparedStatement pst=(PreparedStatement) con.prepareStatement("insert into project values(?,?,?,?)");
		pst.setInt(1, p.getId());
		pst.setString(2, p.getTitle());
		pst.setString(3, p.getDescription());
		pst.setString(4, p.getDomain());
		pst.execute();
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
		
}
public List<Project> showAll()
{
	try
	{
		con=(Connection) Dbconnector.getConnection();
		Statement st=(Statement) con.createStatement();
		ResultSet rs=st.executeQuery("select * from project");
		List<Project> list=new ArrayList<Project>();
		while(rs.next())
		{
			Project p=new Project();
			p.setId(rs.getInt(1));
			p.setTitle(rs.getString(2));
			p.setDescription(rs.getString(3));
			p.setDomain(rs.getString(4));
			list.add(p);
			
		}
		return list;
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return null;
	
}
		
}
