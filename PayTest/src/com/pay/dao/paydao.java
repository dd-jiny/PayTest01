package com.pay.dao;

import java.util.List;

import com.pay.dto.paydto;

public interface paydao  {
	
String SELECTLIST_SQL = " SELECT PROJECTNAME, TOTALPRICE, USERNAME, ADDRESS, PHONE  " 
					  + " FROM ORDERPAGE " ;
	
String INSERT_SQL = " INSERT INTO ORDERPAGE "
				  + " VALUES( ?, ?, ?, ?, ?) " ;


public List <paydto> selectList();
public int insert(paydto dto);

}

