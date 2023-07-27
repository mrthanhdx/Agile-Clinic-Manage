package Doctor_UI;

import java.util.List;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.text.html.HTML;

/**
 *
 * @author trant
 */
public class AppointmentRepo {

    public List<Appointment> getList() {
        Connection conn = ConnectionProvider.getConnection();
        List<Appointment> list = new ArrayList<>();
        String sqlSelect = "select * from medical";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            PreparedStatement stmt = conn.prepareStatement(sqlSelect);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(new Appointment(rs.getString("medicalid"), rs.getString("patientname"), rs.getInt("age"),
                        rs.getString("gender"), rs.getString("occupation"), rs.getString("doctor"),
                        sdf.format(rs.getDate("dateapm")), rs.getInt("clinic"), rs.getString("note")));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveData(String medical, String patientname, int age, String gender, String occ, String doctor, String date, int clinic, String note) {
        Connection conn = ConnectionProvider.getConnection();
        String sqlInsert = String.format("insert into medical values('%s','%s',%d,'%s','%s','%s','%s',%d,'%s')",
                medical, patientname, age, gender, occ, doctor, date, clinic, note);
//        System.out.println(sqlInsert);
        try {
            PreparedStatement stmt = conn.prepareStatement(sqlInsert);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteData(String ID) {
        Connection conn = ConnectionProvider.getConnection();
        String sqlDelete = String.format("delete from medical where medicalid = '%s'", ID);
//        System.out.println(sqlDelete);
        try {
            PreparedStatement stmt = conn.prepareStatement(sqlDelete);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateData(String medicalID, String patientname, int age, String gender, String occ, String doctor,
            String date, int clinic, String note) {
        Connection conn = ConnectionProvider.getConnection();
        String sqlUpdate = String.format("update MEDICAL set "
                + "PATIENTNAME= '%s',age=%d,Gender='%s',occupation ='%s',doctor = '%s',dateapm='%s',clinic =%d,Note ='%s'where medicalid ='%s'" ,
                patientname, age, gender, occ, doctor, date, clinic, note,medicalID);
        try {
            PreparedStatement stmt = conn.prepareStatement(sqlUpdate);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
