import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: sessionFactory.java 
 *
 * @Date:  2018年10月24日  下午6:30:01
 *
 * @Package 
 */

/**
 * @author fuhuifang
 * 
 *         日期：2018年10月24日 下午6:30:01
 *
 *         描述：
 * @version V1.0
 *
 */

public class BaseMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@BeforeClass
	public static void init() throws IOException {

		try {
			String resourse = "config/mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resourse);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException ignore) {
			ignore.printStackTrace();
		}
	}
	public SqlSession getSession() {
		return sqlSessionFactory.openSession();

	}
}
