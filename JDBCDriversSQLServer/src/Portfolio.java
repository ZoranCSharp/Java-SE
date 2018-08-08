import java.sql.*;

public class Portfolio implements Runnable {
	
	
	
	public void run() {
		
		
		
		
		
		String connectionURL = "jdbc:sqlserver://localhost:1433;" + "databaseName = FIRM;integratedSecurity = true;";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		con = DriverManager.getConnection(connectionURL);
		String sqlQuery = "Select * From Portfolio";
		stmt = con.createStatement();
		rs = stmt.executeQuery(sqlQuery);
		
		while(rs.next()) {
			
			
			String symbol = rs.getString(2);
			Integer quantity = rs.getInt(3);
			Float price = rs.getFloat(4);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Symbol: ");
			sb.append(symbol);
			sb.append(" , quantity: ");
			sb.append(quantity);
			sb.append(" , total shares: ");
			sb.append(price*quantity);
			System.out.println(sb.toString());
		}
		
		
			
			
			
		}catch(SQLException sql) {
			
			System.out.println("SQL Error: " + sql.getMessage() + ", the db error code is " + sql.getErrorCode());
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
