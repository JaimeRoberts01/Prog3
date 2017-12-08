import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Class to define window in which attendance report is displayed.
 */
@SuppressWarnings("serial")
public class ReportFrame extends JFrame {
	
	
	private JTextArea attReport;
	
	
	public ReportFrame () {
		
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setTitle("Attendance Report");
	setSize(700, 300);
	setResizable(false);
	attReport = new JTextArea();
	attReport.setFont(new Font("Courier", Font.PLAIN, 14));
	attReport.setEditable(false);
	add(attReport);
	setVisible(true);
	reportFormatter();
	
}
	
	public void reportFormatter () {

		attReport.setBorder (new EmptyBorder (8,8,8,8));
		
		String idHeader = "ID"; String classHeader = "Class"; String tutorHeader = "Tutor"; 
		String attendanceHeader = "Attendance";String avgattendanceHeader = "Average Attendance";
		String header = String.format("%-5s %-10s %-15s %-20s %-20s", idHeader, classHeader, tutorHeader, attendanceHeader, avgattendanceHeader);
		attReport.append (header +"\n");
		String bar = "-------------------------------------------------------------------------------------";
		attReport.append(bar+ "\n");
		
	}
}