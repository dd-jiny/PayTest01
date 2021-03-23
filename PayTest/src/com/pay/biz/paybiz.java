package com.pay.biz;

import java.util.List;

import com.pay.dto.paydto;

public interface paybiz {

	public int insert(paydto dto);
	public List<paydto> selectList();
}
