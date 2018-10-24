/**
 * 
 */
package cn.com.wmc.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import ccn.com.wmac.mapper.UserMapper;
import cn.com.wmc.model.UserModel;
import cn.com.wmc.service.UserService;

/**
 @author： fu    @time：2018年10月23日 下午3:11:21 
 @说明： 一份耕耘，一份收获
**/
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	/* (non-Javadoc)
	 * @see cn.com.wmc.service.UserService#insert()
	 */
	@Override
	public void insertUser(UserModel userModel) {
		// TODO Auto-generated method stub
	  userMapper.insertUser(userModel);
	}
	
	@Override
	public UserModel selectUser(Long id) {
		return userMapper.selectUser(id);
	}
	
	
	
		/*public UserModel insert() {
		
		String resource = "mybatis-config.xml";
		
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		return 	userMapper.selectBlog(1);
	}*/
	

}
