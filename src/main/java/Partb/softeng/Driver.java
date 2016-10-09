package Partb.softeng;

import java.util.ArrayList;

import org.joda.time.LocalDate;

import CSIT.bct.Course;
import CSIT.bct.Module;
import CSIT.bct.Student;

public class Driver {
	public static void main(String[] args) {

		ArrayList<Student> StudentList = new ArrayList <Student>();
		Student s1 = new Student (13492098, "Niamh", "Walsh", "11-01-94", 22);
		Student s2 = new Student (13482982, "Jack", "Brennan", "02-04-94", 22);
		Student s3 = new Student (13492076, "Rachel", "Morley", "07-11-94", 22);
		
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		
		ArrayList<Module> ModuleList = new ArrayList <Module>();
		Module m1 = new Module ("Maths", 4673, StudentList);
		Module m2 = new Module ("Business", 4318, StudentList);
		Module m3 = new Module ("German", 4908, StudentList);
		
		ModuleList.add(m1);
		ModuleList.add(m2);
		ModuleList.add(m3);
	
		Course c1 = new Course ("Arts", new LocalDate(2013-9-01), new LocalDate(2016-05-25), ModuleList);
		
		
		System.out.println(c1);
		
	}	
}
