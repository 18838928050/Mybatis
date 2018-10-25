
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import ccn.com.wmac.mapper.UserMapper;
import cn.com.wmc.model.UserModel;
import junit.framework.Assert;

/**
 * 
 */

/**
 * @author： fu @time：2018年10月23日 下午12:08:19 @说明： 一份耕耘，一份收获
 **/
public class Test extends BaseMapperTest{

	
	/*
	 * 查询用户测试方法
	 */
	@org.junit.Test
	public void testSelect() {

		/*String resourse = "config/mybatis-config.xml";
		InputStream inputStream = null;*/
		SqlSession sqlSession=getSession();
		try {
			// Resources 类为从类路径中加载资源
			/*inputStream = Resources.getResourceAsStream(resourse);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();*/
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			UserModel userModel = userMapper.selectUser(1l);
			Assert.assertNotNull(userModel);
			Assert.assertEquals("user1", userModel.getUserName());
			System.out.println(userModel.getEntryDate());
		} catch (Exception e) {
			sqlSession.close();
		}
	}
	
	/**
	 * 插入用户
	 */
	@org.junit.Test
	public void testInsert() {
		SqlSession sqlSession=getSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			UserModel userModel=new UserModel();
			userModel.setUserName("xiaocia");
			userModel.setUserSex("女");
			userModel.setEntryDate(new Date());
			int result=userMapper.insertUser(userModel);
			Assert.assertEquals(1, result);
			Assert.assertNotNull(userModel.getId());
		}finally{
			sqlSession.close();
		}
	}
	
	/**
	 * 根据Id删除一个用户
	 * 
	 */
	@org.junit.Test
	public void testDeleteById() {
		SqlSession sqlSession=getSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			UserModel user1=userMapper.selectUser(1l);
			Assert.assertNotNull(user1);
			userMapper.deleteUserById(1l);
			Assert.assertNull(user1);
		} finally {
			sqlSession.close();
		}
		}
		

	
	/*
	 * 更新用户
	 * 
	 */
	@org.junit.Test
	public UserModel testUpdate(){
		SqlSession sqlSession=getSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			UserModel userModel=new UserModel();
			userModel.setUserName("dd");
			userModel.setUserSex("ddsex");
			userModel.setEntryDate(new Date());
			userMapper.updateById(userModel);
		}finally {
			sqlSession.close();
		}
		return null;
		
	}
}
