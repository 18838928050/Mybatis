package ccn.com.wmac.mapper;

import cn.com.wmc.model.UserModel;

public interface UserMapper {
	
	//  @Select("SELECT * FROM func_user WHERE id = #{id}")
	  UserModel selectUser(Long id);
	  
	//  @Select("insert into func_user(name,sex) values(#{name}, #{sex})")
	  void insertUser(UserModel userModel);
	  
	}