package com.p2.main;

import com.p2.bean.Student;
import com.p2.exception.NullMarksArrayException;
import com.p2.exception.NullNameException;
import com.p2.exception.NullStudentException;
import com.p2.service.StudentReport;
import com.p2.service.StudentServices;

public class StudentMain {
static Student data[]=new Student[4];

static {
for(int i=0;i<data.length;i++) {	
	data[i]=new Student();
	}

data[0]=new Student("sekar",new int[] {35,35,35});
data[1]=new Student(null,new int[] {11,22,33});
data[2]=null;
data[3]=new Student("Manoj",null);

}	


public static void main(String[] args) {
	StudentServices studServices=new StudentServices();
	StudentReport studReport=new StudentReport();
	System.out.println("Grades Calculation:");
	String x=null;
	
	for(int i=0;i<data.length;i++) {
		try {
			x=studReport.Validate(data[i]);
		}catch(NullNameException e) {
			x="NullNameException Occuered.";
		}catch (NullMarksArrayException e) {
		x="NullMarksException Occuered.";
		}catch (NullStudentException e) {
		x="NullStudentException Occuered.";
		}
		System.out.println("Grade: "+x);
     }
	
	System.out.println("Numbers of Objects with Marks array as null= "+studServices.findNumbersOfNullMarks(data));
	System.out.println("Numbers of Objects with Name as null= "+studServices.findNumbersOfNullName(data));
	System.out.println("Numbers if objects with Entirely null= "+studServices.findNumbersOfNullObjects(data));
	}
}

