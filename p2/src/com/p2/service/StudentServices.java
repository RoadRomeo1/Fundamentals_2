package com.p2.service;

import com.p2.bean.Student;

public class StudentServices {
public int findNumbersOfNullMarks(Student stud[]) { 
	int count=0;
	int arr[];
	for(int i=0;i<stud.length;i++){
		arr=stud[i].getMarks();
		String str[];
		for(int j=0;j<str.length;j++)
		str[j]=arr[j].toString();
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==0){
				count++;
			}	
		}
		}
	System.out.println(count);
	return count;
}

public int findNumbersOfNullName(Student stud[]) {
	int count=0;
     for(int i=0;i<stud.length;i++) {
    	 if(stud[i].getName()==null) {
    		 count++;
    		 }
     }
	return count;
}

public int findNumbersOfNullObjects(Student stud[]) {
	int count=0;
	for(int i=0;i<stud.length;i++) {
		if(stud[i]==null) {
			count++;
		}
	}
	return count;
	}
}
