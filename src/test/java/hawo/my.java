package hawo;

import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import utils.JDBCUtils;

public class my {

	public my() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void ttt() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSource());
//		List<String> strings=jdbcTemplate.query("show databases;", new BeanPropertyRowMapper<String>(String.class));
//		for (String s: strings) {
//			System.out.println(s);
//		}
		int n=jdbcTemplate.update("create database ttt;");
		if (n>0) {
			System.out.println("ok");
		}
	}

}
