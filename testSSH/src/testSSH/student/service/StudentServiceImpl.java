package testSSH.student.service;

import java.util.List;

import testSSH.student.dao.StudentDaoInte;
import testSSH.student.entity.Student;
import testSSH.student.service.StudentServiceInte;

public class StudentServiceImpl implements StudentServiceInte {

    private StudentDaoInte studentDao;

    @Override
    public List<Student> listStu(String hql) {
        List<Student> listStu = studentDao.listEntity(hql);
        return listStu;
    }
    public StudentDaoInte getstudentDao() {
        return studentDao;
    }

    public void setstudentDao(StudentDaoInte studentDao) {
        this.studentDao = studentDao;
    }
}

