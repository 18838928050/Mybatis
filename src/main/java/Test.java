import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ccn.com.wmac.mapper.UserMapper;
import cn.com.wmc.model.UserModel;

/**
 * 
 */

/**
 * @author： fu @time：2018年10月23日 下午12:08:19 @说明： 一份耕耘，一份收获
 **/
public class Test {

	@org.junit.Test
	public void test() {

		String resourse = "config/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			// Resources 类为从类路径中加载资源
			inputStream = Resources.getResourceAsStream(resourse);
		} catch (Exception e) {
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		UserModel userModel = userMapper.selectUser(1L);
		System.out.println(userModel.getUserName());
		System.out.println(userModel.getUserSex());
	}
}
