import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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
 * 日期：2018年10月24日 下午6:30:01
 *
 * 描述：
 * @version V1.0
 *
 */

public class BaseMapperTest {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	public static void init() throws IOException {

		String resourse = "config/mybatis-config.xml";
//		InputStream inputStream = null;
//			inputStream = Resources.getResourceAsStream(resourse);
			
			Reader reader=Resources.getResourceAsReader(resourse);
			
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		
	}
	
	public SqlSession getSession(){
		return sqlSessionFactory.openSession();
		
	}
}
