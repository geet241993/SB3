package com.element.bind;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {
	public static void main(String[]args) throws Exception {
		Address address=new Address();
		address.setCity("Barshi");
		address.setState("MH");
		address.setPincode(637878);
		
		Employee emp=new Employee();
		emp.setEmpid(101);
		emp.setName("Namrata");
		emp.setSalary(30000);
		emp.setAddress(address);
		
		JAXBContext context=JAXBContext.newInstance(Employee.class);
		Marshaller marsh=context.createMarshaller();
		marsh.marshal(emp, System.out);
	}

}
