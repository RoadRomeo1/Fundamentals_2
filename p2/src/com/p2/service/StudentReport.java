package com.p2.service;
import com.p2.bean.Student;
import com.p2.exception.NullMarksArrayException;
import com.p2.exception.NullNameException;
import com.p2.exception.NullStudentException;

public class StudentReport {
public String findGrade(Student stud) {
	String str = null;
	int sum=0;
	int marks[]=stud.getMarks();
    String res=null;
	for(int i=0;i<marks.length;i++) {
		if(marks[i]<35) {
			str="F";
			res="f";
		}
	}
	
	for(int i=0;i<marks.length;i++) {
		sum=sum+marks[i];
		}
	
  	if(sum<=150&&res!="f") {
		str="D";
		}
	else if(sum>150&&sum<=200&&res!="f"){
		str="C";
	}
	else if(sum>200&&sum<=250&&res!="f") {
		str="B";
		}
	else if(sum>250&&sum<=300&&res!="f") {
		str="A";
	}
	
	return str;
			
}

public String Validate(Student stud) throws NullStudentException,NullNameException,NullMarksArrayException {
	String str=null;
	
	if(stud==null) {
		throw new NullStudentException();
	}
	else {
		if(stud.getName()==null) {
			throw new NullNameException();
		}
		else if(stud.getMarks()==null) {
		 throw new NullMarksArrayException();
		}
		else {
		StudentReport data=new StudentReport();		
		str=data.findGrade(stud);
		}
	}
	
	
	return str;
}
}
