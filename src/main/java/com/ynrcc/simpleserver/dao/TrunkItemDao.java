package com.ynrcc.simpleserver.dao;

import org.apache.ibatis.annotations.Param;

import com.ynrcc.simpleserver.model.TrunkItem;

public interface TrunkItemDao {
	// Ҫ�� Mapper �ļ���ʹ�ñ�������Ҫ��Dao�㺯������ Param ע����������Ȼֻ����#{0},#{1}����#{param1}
	public TrunkItem selectItemByCode(
			@Param("trunkType") Integer trunkType, 
			@Param("itemCode") String itemCode);
}
