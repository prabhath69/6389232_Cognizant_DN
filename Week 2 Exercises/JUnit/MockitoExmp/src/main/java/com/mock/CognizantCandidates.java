package com.mock;

import java.util.List;

public class CognizantCandidates {
	private CognizantList list;
	
	public CognizantCandidates(CognizantList list) {
		this.list=list;
	}
	
	public List<String> getSelectedCandidateName() {
		return list.getData();
	}
}
