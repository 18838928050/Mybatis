package ccn.com.wmac.mapper;

import cn.com.wmc.model.UserModel;

public interface UserMapper {
	
	//  @Select("SELECT * FROM func_user WHERE id = #{id}")
	  UserModel selectUser(Long id);
	  
	//  @Select("insert into func_user(name,sex) values(#{name}, #{sex})")
	  int insertUser(UserModel userModel);
	  
	  void deleteUserById(Long id);
		
	  UserModel updateById(UserModel userModel);
	  
	}