package com.study.myproject;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.study.dao.MemberDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/root-context.xml")
public class DataSourceTest 
{
	@Inject
	private DataSource dataSource;
	
	@Test
	public void testConnection() throws Exception
	{
		try(Connection connection = dataSource.getConnection())
		{
			System.out.println(connection);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Inject
	private MemberDAO memberdao;

	
}
