
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@ManagedBean
@SessionScoped
public class Employee implements Serializable {
    private int empid;
    private String name;
    private float salary;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    private long mobile;
    private String emailid;
    
     HibernateUtil helper;
    Session session;
    
    public void addEmployee()
    {
       Configuration cfg = new Configuration();
   cfg.configure("hibernate.cfg.xml");
        SessionFactory sf= cfg.buildSessionFactory();
        
       session = sf.openSession();
        session.beginTransaction();
       Employee emp = new Employee();
       emp.setEmpid(8);
      emp.setName(name);
       emp.setMobile(mobile);
       emp.setEmailid(emailid);
        emp.setSalary(salary);
        session.save(emp);
        session.getTransaction().commit();
        session.close();
        
    }
}

    

