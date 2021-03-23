package com.pay.biz;

import java.util.List;

import com.pay.dao.paydao;
import com.pay.dao.paydaoimpl;
import com.pay.dto.paydto;

public class paybizimpl implements paybiz {
	
	paydao dao = new paydaoimpl();
	
	public List<paydto> selectList() {
		
		return dao.selectList();
	}
	
	@Override
	public int insert(paydto dto) {
		// TODO Auto-generated method stub
		return dao.insert(dto);
	}

}
