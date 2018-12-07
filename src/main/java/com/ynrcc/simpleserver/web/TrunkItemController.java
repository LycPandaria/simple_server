package com.ynrcc.simpleserver.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ynrcc.simpleserver.model.TrunkItem;
import com.ynrcc.simpleserver.service.TrunkItemService;

@Controller
@RequestMapping(value="/trunk")
public class TrunkItemController {
	@Autowired
	private TrunkItemService trunkItemService;
	
	// ָ��ӳ��·��
	@RequestMapping(value="/select")
	// @ResponseBody�Ὣ��������ת��json��ʽ���ؿͻ���
    @ResponseBody
	public TrunkItem selectItemByCode(Integer trunkType, String itemCode) {
		System.out.println(trunkType + " " + itemCode);
		return trunkItemService.selectItemByCode(trunkType, itemCode);
	}
}
