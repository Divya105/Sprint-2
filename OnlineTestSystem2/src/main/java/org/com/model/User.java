package org.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="user2")
public class User {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	

   public Long userId ;
   public String userName ;
  
   @OneToOne
   @JoinColumn(name="testId")
    public Test userTest;
    public Boolean isAdmin ;
    public String userPassword ;
   
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userTest=" + userTest + ", isAdmin=" + isAdmin
			+ ", userPassword=" + userPassword + "]";
}

public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public Test getUserTest() {
	return userTest;
}

public void setUserTest(Test userTest) {
	this.userTest = userTest;
}

public Boolean getIsAdmin() {
	return isAdmin;
}

public void setIsAdmin(Boolean isAdmin) {
	this.isAdmin = isAdmin;
}

public String getUserPassword() {
	return userPassword;
}

public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
   
   
   
   
}