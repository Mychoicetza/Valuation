/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superviser;

import dbUtil.dbConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;


public class PrintReport  extends JFrame{    
    
    Connection conn; // Database Connection
    // Database Connection
    PreparedStatement pst = null;
    ResultSet rs = null;   

    public PrintReport() throws HeadlessException, SQLException {
        this.conn = dbConnection.getConnection();
    }
   
    public void showReport(){
         try {
             
             JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\Engnoellemar\\Documents\\NetBeansProjects\\Valuation\\src\\report11.jrxml");
             String query = "select * from block order by OWNERFN";
             JRDesignQuery jrquery = new JRDesignQuery();
             jrquery.setText(query);
             jasperDesign.setQuery(jrquery);
             
             JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
             JasperPrint JasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
             JRViewer viewer = new JRViewer(JasperPrint);
             
             /*JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\RAM ALAPURE\\Documents\\NetBeansProjects\\User Info App\\src\\org\\ramalapure\\userinfoapp\\newReport.jrxml");
             JasperPrint JasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
             JRViewer viewer = new JRViewer(JasperPrint);*/
             viewer.setOpaque(true);
             viewer.setVisible(true);
             
             this.add(viewer);
             this.setSize(900,500); // JFrame size
             this.setVisible(true);
            
         } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, e.getMessage());
         }
   
    }
}


