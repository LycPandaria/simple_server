package com.ynrcc.simpleserver.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ynrcc.simpleserver.service.TrunkItemService;

@Controller
public class TrunkItemController {
	@Autowired
	private TrunkItemService trunkItemService;
	
	
}
