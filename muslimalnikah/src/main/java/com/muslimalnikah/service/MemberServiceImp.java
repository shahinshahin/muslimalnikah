package com.muslimalnikah.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.muslimalnikah.list.Gender;
import com.muslimalnikah.list.Nationality;
import com.muslimalnikah.list.Occupation;
import com.muslimalnikah.list.State;
import com.muslimalnikah.model.MemberDetailModel;


@Service
public class MemberServiceImp implements MemberService {
 
   @Autowired
   private MemberDao memberDao;
   
 
   public MemberServiceImp() {
	super();
	// TODO Auto-generated constructor stub
}

@Transactional
   public void save(MemberDetailModel memberdetail) {
      memberDao.save(memberdetail);
   }
 
   @Transactional(readOnly = true)
   public List<Gender> list() {
      return memberDao.list();
   }
   @Transactional(readOnly = true)
@Override
public List<State> statelist() {
	// TODO Auto-generated method stub
	 return memberDao.statelist();
}
   @Transactional(readOnly = true)
@Override
public List<Occupation> occlist() {
	 return memberDao.occlist();
}
   @Transactional(readOnly = true)
@Override
public List<Nationality> nationlist() {
	 return memberDao.nationlist();
}



  




}