package com.kn.mainclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kn.entityclass.Student;

public class App {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		Student s1 = new Student(1, "Amit", 67);
		Student s2 = new Student(2, "Anuj", 70);
		Student s3 = new Student(3, "Alex", 45);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		System.out.println("Inserted Student Information Successfully :");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		txn.commit();
	}

}
