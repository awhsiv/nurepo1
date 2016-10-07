package jBasix;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class Login extends JFrame {

	// components declarations
	JLabel lbluserName, lblpwd, lblTravelDestination, lblBook;
	JTextField txtUserName;
	JPasswordField pwd;
	JButton btnSubmit, btnCancel, btnReset;
	JList<String> lstDestination;
	JComboBox<String> cmbBook;
	JCheckBox chkOption;
	JRadioButton rdChoice1, rdChoise2;
	JToolBar tbTools;
	JMenuBar mnuBar;
	JMenu mnu;
	JMenuItem mnuitem1, mnuitem2;
	JPopupMenu pop;
	ButtonGroup bg;

	// model
	DefaultListModel<String> mdlDestination;
	DefaultComboBoxModel<String> mdlBook;

	private void instantiation() {
		lbluserName = new JLabel("Username");
		lblBook = new JLabel("Books");
		lblpwd = new JLabel("Password");
		lblTravelDestination = new JLabel("Travel Destination");

		txtUserName = new JTextField(10);
		pwd = new JPasswordField(10);
		btnSubmit = new JButton("Submit");
		btnCancel = new JButton("Cancel");
		btnReset = new JButton("Reset");

		mdlBook = new DefaultComboBoxModel<String>();
		mdlDestination = new DefaultListModel<>();
		mdlBook.addElement("Deception");
		mdlBook.addElement("Angels");
		mdlBook.addElement("Demons");
		mdlBook.addElement("DaVinci");
		mdlDestination.addElement("Kulu");
		mdlDestination.addElement("Manali");
		mdlDestination.addElement("KAshi");
		mdlDestination.addElement("Gaya");
		mdlDestination.addElement("Haridwar");

		lstDestination = new JList<String>(mdlDestination);
		cmbBook = new JComboBox<String>(mdlBook);
		chkOption = new JCheckBox();
		bg = new ButtonGroup();
		rdChoice1 = new JRadioButton("AAA");
		rdChoise2 = new JRadioButton("BBB");
		tbTools = new JToolBar("ToolBar");
		mnuBar = new JMenuBar();
		mnu = new JMenu("Menu");
		pop = new JPopupMenu();
		mnuitem1 = new JMenuItem("Menu Item");
		mnuitem2 = new JMenuItem("Menu Item2");

	}

	private void prepareGUI() {
		this.setTitle("Login");
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);

		this.add(mnuBar);
		this.add(mnu);

		this.add(lbluserName);
		this.add(txtUserName);
		this.add(lblpwd);
		this.add(pwd);
		this.add(lblTravelDestination);
		this.add(lstDestination);
		this.add(lblBook);
		this.add(cmbBook);
		this.add(chkOption);
		bg.add(rdChoice1);
		bg.add(rdChoise2);
		this.add(rdChoice1);
		this.add(rdChoise2);
		this.add(btnSubmit);
		this.add(btnCancel);
		this.add(btnReset);
		pop.add(mnuitem1);
		pop.add(mnuitem2);

		// spop.show(this.getContentPane(), 5, 5);

	}

	private void handleGUI() {

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger())
					pop.show(e.getComponent(), e.getX(), e.getY());

			}
		});
	}

	public Login() {
		instantiation();
		prepareGUI();
		handleGUI();
	}

	public static void main(String[] args) {
		new Login();
	}

}
