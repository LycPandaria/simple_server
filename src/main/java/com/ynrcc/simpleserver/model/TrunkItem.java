package com.ynrcc.simpleserver.model;

import java.io.Serializable;

/**
 * 尾箱物品对照Entity
 * @author Liyingcong
 * @version 2018-12-03
 */
public class TrunkItem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String trunkType;		// 尾箱类型
	private String itemCode;		// 物品代码
	private String itemName;		// 物品名称
	
	public TrunkItem() {
	}

	public String getTrunkType() {
		return trunkType;
	}

	public void setTrunkType(String trunkType) {
		this.trunkType = trunkType;
	}
	
	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itmeCode) {
		this.itemCode = itmeCode;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}