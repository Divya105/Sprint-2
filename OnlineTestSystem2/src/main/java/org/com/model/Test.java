package org.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;


@Entity
public class Test {

	@Id
	
	@JoinColumn(name="testId")
	private int testId;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}
	
	
	
	
}
