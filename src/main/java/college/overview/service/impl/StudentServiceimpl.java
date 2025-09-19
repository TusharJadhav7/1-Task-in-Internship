package college.overview.service.impl;

import college.overview.entity.StudentEntity;
import college.overview.repo.StudentRepo;
import college.overview.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;


    @Override
    public String studentRegisteretion(StudentEntity studentEntity) {
         StudentEntity save  = studentRepo.save(studentEntity);

         String msg =null;
         if(msg!=null){
             msg="Student is registered successfully ";
         }else {
             msg="Student register is not successfully";
         }

        return msg;
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity getStudentById(Integer studetId) {
         StudentEntity save1 =  studentRepo.findById(studetId).orElseThrow(() -> new RuntimeException("Student not found"));

        return  save1;
    }

    @Override
    public String updateStudent(Integer studentId, StudentEntity studentDetails) {
        StudentEntity student = studentRepo.findById(studentId).get();

        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());

         StudentEntity save =  studentRepo.save(student);

        String msg =null;
        if(save!=null){
            msg="Student is update successfully ";
        }else {
            msg="Student update is not successfully";
        }

        return msg;
    }

    @Override
    public String deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);

        return "";
    }
}
