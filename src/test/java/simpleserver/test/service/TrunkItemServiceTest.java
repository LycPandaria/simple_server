package simpleserver.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ynrcc.simpleserver.model.TrunkItem;
import com.ynrcc.simpleserver.service.TrunkItemService;

import simpleserver.test.SpringTest;

public class TrunkItemServiceTest extends SpringTest{
	@Autowired
	private TrunkItemService service;
	
	@Test
	public void selectItemByCodeTest() {
		TrunkItem item = service.selectItemByCode(1, "39");
		System.out.println(item.getItemName());
	}
}
