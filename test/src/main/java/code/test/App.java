package code.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Alien a=new Alien();
       a.setId(101);
       a.setAname("shiv");
       a.setColor("Blue");
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
       SessionFactory sf= con.buildSessionFactory();
       
       Session session=sf.openSession();
       Transaction tx=session.beginTransaction();
       
       session.save(a);
       tx.commit();
    }
}
