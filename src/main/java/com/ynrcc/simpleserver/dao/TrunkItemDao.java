package com.ynrcc.simpleserver.dao;

import org.apache.ibatis.annotations.Param;

import com.ynrcc.simpleserver.model.TrunkItem;

public interface TrunkItemDao {
	// �����Ҫ�� mapper.xml ��ʹ�ò���������Ҫ�ڴ���������Ȼֻ��ֻ��#{param1},#{0}����...
	public TrunkItem selectItemByCode(
			@Param("trunkType") Integer trunkType, 
			@Param("itemCode") String itemCode);
}
