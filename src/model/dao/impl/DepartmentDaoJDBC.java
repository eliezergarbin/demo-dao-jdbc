package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

	private Connection conn;
	
	public  DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {

	}

	@Override
	public void update(Department obj) {

	}

	@Override
	public void deleteById(Integer id) {


	}

	@Override
	public Department findById(Integer id) {
		return null;
	}

	@Override
	public List<Department> findAll() {
		return null;
	}

}
