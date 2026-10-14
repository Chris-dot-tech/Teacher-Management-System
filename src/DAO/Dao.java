package DAO;

import java.util.List;

import DTO.Teacher;

public interface Dao {

	  void addTeacher(Teacher teacher);
		
		void fetchAll();
		
		void getTeacherById(int id);
		
		void updateTeacher( Teacher teacher);
		
		void deleteTeacher(int id);
	
}
