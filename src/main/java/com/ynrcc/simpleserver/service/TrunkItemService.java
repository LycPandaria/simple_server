package com.ynrcc.simpleserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynrcc.simpleserver.dao.TrunkItemDao;
import com.ynrcc.simpleserver.model.TrunkItem;

@Service
public class TrunkItemService {
	
	@Autowired
	private TrunkItemDao dao;
	
	public TrunkItem selectItemByCode(Integer trunkType, String itemCode) {
		return dao.selectItemByCode(trunkType, itemCode);
	}
}
