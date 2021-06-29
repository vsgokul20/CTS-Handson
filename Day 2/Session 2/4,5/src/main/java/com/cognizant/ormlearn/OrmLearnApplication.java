package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.query.Param;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	public static CountryService countryService;
	public static EmployeeService employeeService;
	public static DepartmentService departmentService;
	public static SkillService skillService;
	

	public static void main(String[] args) {
		 ApplicationContext context =SpringApplication.run(OrmLearnApplication.class, args);
		 countryService = context.getBean(CountryService.class);
		 employeeService=context.getBean(EmployeeService.class);
		 departmentService=context.getBean(DepartmentService.class);
		 skillService=context.getBean(SkillService.class);
			testGetAllPermanentEmployees(); 
		testGetAverageSalary();
			//testGetAllEmployeesNative();
		 /*testGetEmployee();
		 testAddEmployee();
			testUpdateEmployee();
			testGetDepartment();
			testAddSkillToEmployee();*/
			LOGGER.info("Inside main");
	}
	private static void testGetAllPermanentEmployees() {

		 LOGGER.info("Start");

		 List<Employee> employee = employeeService.getPermanentEmployee();

		 LOGGER.debug("employee={}", employee);

		 LOGGER.info("End");

		 }
	public static void testGetAverageSalary() {
		LOGGER.info("Start");
		
		double result =employeeService.getAverageSalary(11);
		LOGGER.debug("Average salary:{}", result);

		LOGGER.info("End");

		
	}
	
	public static void testGetAllEmployeesNative() {
		LOGGER.info("Start");
		
		List<Employee> result =employeeService.getAllEmployeesNative();
		LOGGER.debug("All Employees:{}", result);

		LOGGER.info("End");

		
	}

	
		
	
	/*private static void testGetEmployee() {

		LOGGER.info("Start");

		Employee employee = employeeService.get(1);

		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());

		LOGGER.info("End");

		}
private static void testAddEmployee() {
		
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("aishu");
		employee.setSalary(35000.00);
		try {
			employee.setDateOfBirth(new SimpleDateFormat("YYYY-MM-DD").parse("2000-06-12"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		employee.setPermanent(true);
		
		Department dept= departmentService.get(11);
		employee.setDepartment(dept);
		employeeService.save(employee);
		
		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());
	}

	private static void testUpdateEmployee() {
		LOGGER.info("Start");

		Employee employee = employeeService.get(1);
		Department dept= departmentService.get(11);
		employee.setDepartment(dept);
		employeeService.save(employee);
		
		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());

		LOGGER.info("End");
	}
	
	private static void testGetDepartment() {
		LOGGER.info("Start");

		 Department dept= departmentService.get(11);

		LOGGER.debug("Department:{}", dept);

		LOGGER.debug("Department:{}", dept.getEmployeeList());

		LOGGER.info("End");

	}
	
	private static void testAddSkillToEmployee() {
		
		Employee employee = employeeService.get(1);
		Skill skill = skillService.get(1);
		
		Set<Skill> set=employee.getSkillList();
		set.add(skill);
		
		employee.setSkillList(set);
		
		employeeService.save(employee);
	}*/
	
}
