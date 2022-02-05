package actividadgithub;

import java.util.ArrayList;

public class Courses {
	
	String courseName;
	String professorName;
	int year;
	//tipo de lista dentro de <>
	ArrayList<Student> listStudents = new ArrayList<Student>();
	
	//tipo, lo que regresa, nombre funcion, parametros
	public void enroll(Student student){ //tipo de dato y nombre en los ()
		listStudents.add(student);
	      
	}
	
	//Metodo overload: se llaman igual y tienen el mismo tipo de datos como void
	//lo que cambia son los parametros que recibe por los [] es un array
	public void enroll(Student[] students){
		for(int i = 0; i < students.length; i++) {
			listStudents.add(students[i]);
		}

	 }
	
	public void unEnroll(Student student){
		if(listStudents.contains(student)) {
			listStudents.remove(student);
		}

	}

	public int countStudents(){
	       return listStudents.size();
	}
	   
	public int bestGrade(){
		
		  int bestGrade = 0;
	       for(int i = 0; i < listStudents.size(); i++) {
	    	   if(bestGrade < listStudents.get(i).grade) {
	    		   bestGrade = listStudents.get(i).grade;
	    	   }
	       }
	       return bestGrade;
	}
	
	public static void main(String[] args) {
		Courses collection = new Courses();
		Student student1 = new Student("Larissa", "De La Vega", 1565237, 80, 5);
		collection.enroll(student1);
		System.out.println(collection.countStudents());
		Student student2 = new Student("Sofi", "Rob", 1665237, 100, 10);
		collection.enroll(student2);
		System.out.println(collection.countStudents());
		System.out.println(collection.bestGrade());
		collection.unEnroll(student2);
		System.out.println(collection.countStudents());
		System.out.println(collection.bestGrade());
		
		Student student3 = new Student("Pola", "Glez", 1765237, 90, 10);
		Student student4 = new Student("Alexa", "Luquin", 2065237, 80, 7);
		
		Student[] studentArray = {student3,student4}; //lo voy a inicializar en el momento, por eso sin el new Student
		collection.enroll(studentArray);
		System.out.println(collection.countStudents());
		
		
		
		
	}

}
