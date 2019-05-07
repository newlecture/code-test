package y2019.m05.d03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JdbcMemberDao implements MemberDao {

	String url = "jdbc:oracle:thin:@192.168.0.15:1521/xepdb1";
	
	
	@Override
	public Member get(String id) {	
		
		//String sql = "SELECT * FROM MEMBER WHERE ID LIKE '%"+query+"%'";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"newlec\"", "l4class");
		Statement st  = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {

			String id = rs.getString("ID");
			String pwd = rs.getString("PWD");
			String name = rs.getString("NAME");
			
			System.out.printf("ID:%s, PWD:%s, NAME:%s\n", id, pwd, name);
		}	

		rs.close();
		st.close();
		con.close();

		return null;
	}

	@Override
	public List<Member> getList() {
		//String url = "jdbc:oracle:thin:@192.168.0.15:1521/xepdb1";
		String sql = "SELECT * FROM MEMBER";

		List<Member> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "\"newlec\"", "l4class");
			Statement st  = con.createStatement();
			ResultSet rs = st.executeQuery(sql);					
			
			while(rs.next()) {
				
				Member member = new Member(
						rs.getString("id"),
						rs.getString("pwd"),
						rs.getString("name"),
						rs.getInt("gender"),
						rs.getInt("age"),
						rs.getString("birthday"),
						rs.getString("phone"),
						rs.getDate("regdate")
				);						
				list.add(member);				
			}	

			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Member> getList(String query) {
		//String url = "jdbc:oracle:thin:@192.168.0.15:1521/xepdb1";
		String sql = "SELECT * FROM MEMBER WHERE ID LIKE '%"+query+"%'";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "\"newlec\"", "l4class");
			Statement st  = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {

				String id = rs.getString("ID");
				String pwd = rs.getString("PWD");
				String name = rs.getString("NAME");
				
				System.out.printf("ID:%s, PWD:%s, NAME:%s\n", id, pwd, name);
			}	

			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
