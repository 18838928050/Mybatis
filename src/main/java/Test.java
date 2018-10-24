import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.com.wmc.model.UserModel;

/**
 * 
 */

/**
 * @author： fu @time：2018年10月23日 下午12:08:19 @说明： 一份耕耘，一份收获
 **/
public class Test {

	@org.junit.Test
	public void test() throws IOException {
		try {
			String resourse = "mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resourse);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sessionFactory.openSession();
			//	session.clearCache();
			UserModel userModel = session.selectOne("ccn.com.wmac.mapper.UserMapper.selectUser", 1);
			System.out.println(userModel.getUserSex()+",,,,,");
			System.out.println(userModel.getUserName());
		} catch (Exception e) {
		}
	}
}
