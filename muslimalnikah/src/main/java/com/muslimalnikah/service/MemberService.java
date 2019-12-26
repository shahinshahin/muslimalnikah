package com.muslimalnikah.service;


import java.util.List;

import com.muslimalnikah.list.Gender;
import com.muslimalnikah.list.Nationality;
import com.muslimalnikah.list.Occupation;
import com.muslimalnikah.list.State;
import com.muslimalnikah.model.MemberDetailModel;




public interface MemberService {
	   void save(MemberDetailModel memberdetail);
	   
	   List<Gender> list();
	
	   List<State> statelist();
	   List<Occupation> occlist();
	   List<Nationality> nationlist();
	}
	 
