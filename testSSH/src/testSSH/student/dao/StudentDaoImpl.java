package testSSH.student.dao;
import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import testSSH.student.entity.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDaoInte {
	@SuppressWarnings("unchecked")
	public List<Student> listEntity(String hql){
		return (List<Student>)super.getHibernateTemplate().find(hql);
	}
}
