package com.muslimalnikah.service;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.muslimalnikah.list.Gender;
import com.muslimalnikah.list.Nationality;
import com.muslimalnikah.list.Occupation;
import com.muslimalnikah.list.State;
import com.muslimalnikah.model.MemberDetailModel;



@Repository
public class MemberDaoImp implements MemberDao {
	
 
   public MemberDaoImp() {
		super();
		// TODO Auto-generated constructor stub
	}

@Autowired
   private SessionFactory sessionFactory;
 
 


@Override
public void save(MemberDetailModel member) {
	sessionFactory.getCurrentSession().save(member);
}

@Override
public List<Gender> list() {
	@SuppressWarnings("unchecked")
    TypedQuery<Gender> query = sessionFactory.getCurrentSession().createQuery("from Gender",Gender.class);
    return query.getResultList();
}

@Override
public List<State> statelist() {
	TypedQuery<State> query = sessionFactory.getCurrentSession().createQuery("from State",State.class);
    return query.getResultList();
}

@Override
public List<Occupation> occlist() {
	TypedQuery<Occupation> query = sessionFactory.getCurrentSession().createQuery("from Occupation",Occupation.class);
    return query.getResultList();
}

@Override
public List<Nationality> nationlist() {
	TypedQuery<Nationality> query = sessionFactory.getCurrentSession().createQuery("from Nationality",Nationality.class);
    return query.getResultList();
}


}
