import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

//import net.codejava.swing.jframe;


	// http://localhost:8080/RESTfulExample/json/product/get

public class chat_room extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		//private JFrame frame = new JFrame("CHATTY");
		
	
		private JTextField message = new JTextField(20);
		private JButton button = new JButton("send");
		private JLabel label = new JLabel("Enter your message: ");
		private JPanel background = new JPanel(new BorderLayout());
		
		public chat_room() {
			
			super("WELCOME TO CHATTY!");
			JFrame.setDefaultLookAndFeelDecorated(true);
			JTextArea textArea = new JTextArea(30, 20);
			setLayout(new GridBagLayout());
			GridBagConstraints constraint = new GridBagConstraints();
			
			JScrollPane scrollPane = new JScrollPane(textArea);
			
			//add(scrollPane, BorderLayout.CENTER);
			constraint.insets = new Insets(10, 10, 10, 10);
			
			constraint.gridx = 0;
			constraint.gridy = 0;
			constraint.gridheight = 3;
			
			add(label, constraint);

			//constraint.gridy = 3;
			constraint.anchor = GridBagConstraints.LAST_LINE_START;
			add(message, constraint);

			constraint.gridx = 0;
			constraint.gridwidth = 2;
			constraint.gridy = 4;
			add(button, constraint);

			setSize(300, 500);
			setVisible(true);
			
			JMenuBar menuBar = new JMenuBar();
			JMenu menuFile = new JMenu("File");
			JMenuItem menuItemExit = new JMenuItem("Exit");
			JMenuItem glassPane = new JMenuItem("Glass Pane Visible");
			menuFile.add(menuItemExit);
			menuFile.add(glassPane);
			glassPane.setEnabled(false);
			glassPane.addActionListener(new java.awt.event.ActionListener() {

	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent e) {
	                glassPane.setEnabled(true);
	                
	            }
	        });

	            

	        
			menuBar.add(menuFile);

			// adds menu bar to the frame
			setJMenuBar(menuBar);

//			addWindowListener(new WindowAdapter() {
//				public void windowClosing(WindowEvent event) {
//					int reply = JOptionPane.showConfirmDialog(chat_room.this,
//							"Are you sure you want to quit?",
//							"Exit",
//							JOptionPane.YES_NO_OPTION,
//							JOptionPane.QUESTION_MESSAGE);
//					if (reply == JOptionPane.YES_OPTION) {
//						dispose();
//					} else {
//						return;
//					}
//				}
//			});
		
//	  try {
//		URL url = new URL( OUR URL FOR MINISERVER );
//		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//		conn.setRequestMethod("GET");
//		conn.setRequestProperty("Accept", "application/json");
//
//		if (conn.getResponseCode() != 200) {
//			throw new RuntimeException("Failed : HTTP error code : "
//					+ conn.getResponseCode());
//		}
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(
//			(conn.getInputStream())));
//
//		String output;
//		System.out.println("Output from Server .... \n");
//		while ((output = br.readLine()) != null) {
//			System.out.println(output);
//		}
//
//		conn.disconnect();
//
//	  } catch (MalformedURLException e) {
//
//		e.printStackTrace();
//
//	  } catch (IOException e) {
//
//		e.printStackTrace();
//
//	  }
		}
	  
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new chat_room();
			}
		});
	}
}
