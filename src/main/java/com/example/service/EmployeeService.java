package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Employee;
import com.example.repository.EmployeeRepository;

/**
 * 従業員情報を操作するサービス.
 * 
 * @author igamasayuki
 *
 */
@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * 従業員情報を全件取得します.
	 * 
	 * @return 従業員情報一覧
	 */
	public List<Employee> showList() {
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}

	public List<Employee> showTenEmployees(Integer pageLimit) {
		List<Employee> employeeList = employeeRepository.findTenEmployees(pageLimit);
		return employeeList;
	}

	public List<Employee> showSearchList(String searchName){
		List<Employee> employeeList = employeeRepository.findByName(searchName);
		return employeeList;
	}

	public List<String> getAllEmployeeNames(){
		List<Employee> employeeList = employeeRepository.findAll();
		List<String> employeeNameList = new ArrayList<>();
		for (Employee employee : employeeList){
			employeeNameList.add(employee.getName());
		}
		return employeeNameList;
	}


	public synchronized void insert(Employee employee){
		int nextId = employeeRepository.findMaxId() + 1;
		employee.setId(nextId);
		employeeRepository.insert(employee);
	}

	/**
	 * 従業員情報を取得します.
	 * 
	 * @param id ID
	 * @return 従業員情報
	 * @throws org.springframework.dao.DataAccessException 検索されない場合は例外が発生します
	 */
	public Employee showDetail(Integer id) {
		Employee employee = employeeRepository.load(id);
		return employee;
	}

	/**
	 * 従業員情報を更新します.
	 * 
	 * @param employee 更新した従業員情報
	 */
	public void update(Employee employee) {
		employeeRepository.update(employee);
	}
}
