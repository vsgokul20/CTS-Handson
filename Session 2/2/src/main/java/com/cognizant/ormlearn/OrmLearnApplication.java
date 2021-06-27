package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;

import org.springframework.context.ApplicationContext;

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
			LOGGER.info("Inside main");
	}
	private static void testGetAllPermanentEmployees() {

		 LOGGER.info("Start");

		 List<Employee> employee = employeeService.getPermanentEmployee();

		 LOGGER.debug("employee={}", employee);

		 LOGGER.info("End");

		 }
}
