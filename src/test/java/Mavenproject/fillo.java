package Mavenproject;

import com.codoid.products.exception.FilloException;


import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;





public class fillo {

	public static void main(String[] args) throws FilloException {
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection("C:\\Users\\rajeshsv\\Desktop\\Selenium.xlsx");
      /*  String strQuery="Select * from Sheet1 where Name='Bala'";
        Recordset recordset=connection.executeQuery(strQuery);*/
        String strQuery1="INSERT INTO sheet1(Name,Country) VALUES('Test1','UK')";
        String strQuery2="Update Sheet1 Set Country='US' where Name='John'";
        String strQuery3="INSERT INTO sheet1(Name,Country) VALUES('Bala','Us')";
        
        
        connection.executeUpdate(strQuery1);
        connection.executeUpdate(strQuery2);
        connection.executeUpdate(strQuery3);
         
      //  while(recordset.next()){
      //  System.out.println(recordset.getField("Name"));
      //  }     
      // recordset.close();
        connection.close();
    }
}
