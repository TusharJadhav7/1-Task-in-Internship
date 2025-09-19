package college.overview.controller;


import college.overview.entity.StudentEntity;
import college.overview.service.impl.StudentServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(" /College")
public class StudentController {

    @Autowired
    StudentServiceimpl studentServiceimpl;

    @PostMapping("/CreateStudentINFO")
    public ResponseEntity<String> createStudent(@RequestBody StudentEntity studentEntity){

        String msg = studentServiceimpl.studentRegisteretion(studentEntity);
        return new ResponseEntity<>(msg , HttpStatus.CREATED);
    }

    @GetMapping("/AllData")
    public List<StudentEntity> getAllStudents (){
        return studentServiceimpl.getAllStudents();
    }

    @GetMapping ("/getStudentData")
    public ResponseEntity<StudentEntity>  getStudent(@RequestParam Integer studetId){

      StudentEntity studentEntity  = studentServiceimpl.getStudentById(studetId);
        return new ResponseEntity<>(studentEntity , HttpStatus.FOUND);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updDateStudentData( @RequestParam Integer studentId ,@RequestBody StudentEntity studentEntity){

        String msg = studentServiceimpl.updateStudent(studentId ,studentEntity);

        return new ResponseEntity<>(msg , HttpStatus.ACCEPTED);

    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteStudent ( @RequestParam Integer studentId){
      String msg =  studentServiceimpl.deleteStudent(studentId);
        return new ResponseEntity<>("Student deleted successfully" , HttpStatus.ACCEPTED);
    }

}
