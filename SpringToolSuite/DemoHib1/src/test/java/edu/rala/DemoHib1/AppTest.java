package edu.rala.DemoHib1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    
    public static void main(String args[]) {
    	Student std = new Student();
    	std.setStudentId(1);
    	std.setStudentName("Sonu");
    	std.setStudentAge(22);
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
      	SessionFactory sf = con.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction tx = s.beginTransaction();    	
    	s.save(std);
    	tx.commit();
    }
    
    
}
