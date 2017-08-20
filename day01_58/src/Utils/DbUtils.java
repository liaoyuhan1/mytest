package Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {
	
	public static Connection getConneciton(){
		//四要素
		//1,驱动
		String driver ="oracle.jdbc.OracleDriver";
		//2连接
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		//3用户名
		String user="scott";
		//4密码
		String password="tiger";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url,user,password);
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		Connection conneciton = DbUtils.getConneciton();
		System.out.println(conneciton);
	}
}
