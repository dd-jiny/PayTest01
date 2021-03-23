package com.pay.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.pay.db.SqlMapConfig_Pay;
import com.pay.dto.paydto;

public class paydaoimpl extends SqlMapConfig_Pay implements paydao {

	private String namespace = "paymapper.";
	@Override
	public int insert(paydto dto) {
		int res = 0; 
		try(SqlSession session = getSqlSessionFactory().openSession(true);){
			res = session.insert(namespace + "insert", dto);
			         
			}catch(Exception e) {
			 e.printStackTrace();
			  }
			      
		return res;
	}
	
	public List<paydto> selectList() {
		
		List<paydto> list = new ArrayList<paydto>();
		
		SqlSession session = null;
		
		try {
		session = getSqlSessionFactory().openSession(false);
		
		list = session.selectList(namespace+"selectList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	

}
