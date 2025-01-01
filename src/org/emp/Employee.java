package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
private void empName() {
	System.out.println("kishanth");
}
public static void main(String[]args) {
	Employee name= new Employee();
	name.empName();
	Client known= new Client();
	known.clientName();
	Project nameOfTheProject= new Project();
	nameOfTheProject.projectName();
	Company legacy= new Company();
	legacy.companyName();
}
}