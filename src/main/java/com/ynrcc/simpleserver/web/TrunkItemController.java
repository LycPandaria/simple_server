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
	
	// 指定映射路径
	@RequestMapping(value="/select")
	// @ResponseBody会将集合数据转换json格式返回客户端
    @ResponseBody
	public TrunkItem selectItemByCode(Integer trunkType, String itemCode) {
		System.out.println(trunkType + " " + itemCode);
		return trunkItemService.selectItemByCode(trunkType, itemCode);
	}
}
