package com.as;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Developer");
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		
		Champion_Driver cd1=new Champion_Driver();
		cd1.setName("ganesh");
		cd1.setPhno(123456789l);
		cd1.setAverageroundpassed(4);
		
		Champion_Driver cd2=new Champion_Driver();
		cd2.setName("hemanth");
		cd2.setPhno(123854789l);
		cd2.setAverageroundpassed(3);
		
		Hallikar_Bull hb1=new Hallikar_Bull();
		hb1.setName("Sipayi");
		hb1.setAverageroundpassed(5);
		hb1.setTopSpeed(9.2);
		hb1.setCost(100000);
		
		Hallikar_Bull hb2=new Hallikar_Bull();
		hb2.setName("Gagan");
		hb2.setAverageroundpassed(5);
		hb2.setTopSpeed(9.2);
		hb2.setCost(820000);
		
		Hallikar_Bull hb3=new Hallikar_Bull();
		hb3.setName("Vali");
		hb3.setAverageroundpassed(3);
		hb3.setTopSpeed(9.8);
		hb3.setCost(320000);
		
		Hallikar_Bull hb4=new Hallikar_Bull();
		hb4.setName("Sunami");
		hb4.setAverageroundpassed(4);
		hb4.setTopSpeed(9.4);
		hb4.setCost(500255);
		
		Hallikar_Bull hb5=new Hallikar_Bull();
		hb5.setName("Hebulli");
		hb5.setAverageroundpassed(5);
		hb5.setTopSpeed(9.3);
		hb5.setCost(365000);
		
		List<Hallikar_Bull> list1=new ArrayList<Hallikar_Bull>();
		list1.add(hb1);
		list1.add(hb2);
		
		List<Hallikar_Bull> list2=new ArrayList<Hallikar_Bull>();
		list2.add(hb3);
		list2.add(hb4);
		list2.add(hb5);
		
		cd1.setBulls(list1);
		cd2.setBulls(list2);
		
		entityTransaction.begin();
		manager.persist(cd1);
		manager.persist(cd2);
		manager.persist(hb1);
		manager.persist(hb2);
		manager.persist(hb3);
		manager.persist(hb4);
		manager.persist(hb5);
		entityTransaction.commit();
	}

}
