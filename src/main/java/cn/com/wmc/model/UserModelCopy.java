package cn.com.wmc.model;

/*
 * 用户表
 */

public class UserModelCopy {
	
	//用户表的主键id
	private Long id;
	
	//用户表的姓名
	private String userName;
	
	//用户表的密码
	private String userSex;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", userName=" + userName + ", userSex=" + userSex + "]";
	}


	

}
