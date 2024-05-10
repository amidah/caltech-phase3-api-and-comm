package com.spring.jdbc.demo.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.demo.model.Dish;

public class DB {
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	
	public DB() {
		
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("[DB] Setter Injection on DataSource and JdbcTemplate Initialized");
	}
	
	public void insertDish(Dish dish){
		String sql = "insert into Dish values(null, ?, ?)";
		int result = jdbcTemplate.update(sql, dish.getName(), dish.getPrice());
		System.out.println("Dish " + dish.getName() + " Inserted in Table");
	}
	
	public void getAllDishes() {
		String sql = "select * from Dish";
		List<Dish> dishList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Dish.class));
		System.out.println(dishList);
	}
}
