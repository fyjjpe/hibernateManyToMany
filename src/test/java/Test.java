import com.entity.Employee;
import com.entity.Project;
import com.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by yuanjie.fang on 2018/2/28.
 * 多对多关联关系测试
 */
public class Test {
    public static void main(String[] args) {
        Project p1 = new Project(1001,"项目一");
        Project p2 = new Project(1002,"项目二");
        Employee e1 = new Employee(1,"张三");
        Employee e2 = new Employee(2,"李四");

        //参加项目一的员工有张三和李四
        p1.getEmployees().add(e1);
        p1.getEmployees().add(e2);

        //参加项目二的员工有张三
        p2.getEmployees().add(e1);

        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.save(p1);
        session.save(p2);
        tx.commit();
        HibernateUtil.colseSession(session);
    }
}
