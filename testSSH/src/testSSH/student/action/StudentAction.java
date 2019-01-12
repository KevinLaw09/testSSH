package testSSH.student.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import testSSH.student.entity.Student;
import testSSH.student.service.StudentServiceInte;


public class StudentAction extends ActionSupport{

    private StudentServiceInte studentService;
   
    private List<Student> listStu;
    
    public String listStu(){
        System.out.println("===method:listStu()===");
        //调用模型层查询所有学生的信息
        listStu = studentService.listStu("from Student");
        for(Student s : listStu) {
        	
        	
        	
        	System.out.print("id为"+s.getStuId());
        	
        	
        	
        	System.out.println("，name为"+s.getStuName());
        }
        return "listStu";
    }
    
    public void setStudentService(StudentServiceInte studentService) {
        this.studentService = studentService;
    }
    public List<Student> getListStu() {
        return listStu;
    }
    public void setListStu(List<Student> listStu) {
        this.listStu = listStu;
    }
}
