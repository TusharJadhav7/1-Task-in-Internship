package college.overview.service;

import college.overview.entity.StudentEntity;
import college.overview.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService  {



    public String studentRegisteretion(StudentEntity studentEntity);

    public List<StudentEntity> getAllStudents();

    public StudentEntity getStudentById(Integer studetId);

    public String updateStudent( Integer studentId , StudentEntity studentDetails);

    public String deleteStudent(Integer studentId);

}
