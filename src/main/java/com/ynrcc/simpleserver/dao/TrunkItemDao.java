package com.ynrcc.simpleserver.dao;

import org.apache.ibatis.annotations.Param;

import com.ynrcc.simpleserver.model.TrunkItem;

public interface TrunkItemDao {
	// 要在 Mapper 文件中使用别名，需要在Dao层函数中用 Param 注释申明，不然只能用#{0},#{1}或者#{param1}
	public TrunkItem selectItemByCode(
			@Param("trunkType") Integer trunkType, 
			@Param("itemCode") String itemCode);
}
