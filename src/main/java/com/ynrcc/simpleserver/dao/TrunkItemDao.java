package com.ynrcc.simpleserver.dao;

import org.apache.ibatis.annotations.Param;

import com.ynrcc.simpleserver.model.TrunkItem;

public interface TrunkItemDao {
	// 如果想要在 mapper.xml 中使用参数，则需要在此声明，不然只能只用#{param1},#{0}这种...
	public TrunkItem selectItemByCode(
			@Param("trunkType") Integer trunkType, 
			@Param("itemCode") String itemCode);
}
