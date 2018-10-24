import org.apache.ibatis.jdbc.SQL;

/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: PriviegeProvider.java 
 *
 * @Date:  2018年10月24日  下午6:24:00
 *
 * @Package 
 */

/**
 * @author fuhuifang
 * 
 * 日期：2018年10月24日 下午6:24:00
 *
 * 描述：
 * @version V1.0
 *
 */

public class PriviegeProvider {

	/** 
	 *  
	 */

	private String	selectById(final Long id) {
		return new SQL(){
		{
					SELECT("id,user_name,user_sex");
					FROM("func_user");
					WHERE("id=#{id}");
				
				}
	   }.toString();
	
}

}