package database;

import java.sql.*;

public  class DbConnnect {

       
    public String[] title;
    public String[] body;
    private int count = 0;
    

    public void readDataBase() {
    	String url = "jdbc:mysql://localhost:3306/";
		String user = "ico";
		String password = "password";
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stt = con.createStatement();
			
			// Select db
			stt.execute("USE javawesite");
			
			title = new String[10];
			body = new String[10];
			
			// Get people with surname Bloggs
			ResultSet res = stt.executeQuery("SELECT * FROM page");
			while(res.next()){
					title[count] = res.getString("title");
					body[count] = res.getString("body");
					count++;
				}
		}catch(Exception e){
			e.printStackTrace();
		}
    }
    public String getTitle(int pos){
    	String a = "da";
    	
    	return a;
    }
}
