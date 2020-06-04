import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test {
	
	private JFrame frmAdressBook;
	private JTextField textField;
	private JTextField name_text;
	private JTextField street_text;
	private JTextField city_text;
	private JTextField search_text;
	private JTextField gender_text;
	private JTextField zip_text;
	person person1 = new person();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ArrayList<String> persons = new ArrayList<String>();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frmAdressBook.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdressBook = new JFrame();
		frmAdressBook.setTitle("Adress Book");
		frmAdressBook.setBounds(100, 100, 668, 396);
		frmAdressBook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdressBook.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" ID");
		lblNewLabel.setBounds(92, 44, 69, 33);
		frmAdressBook.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Name");
		lblNewLabel_1.setBounds(92, 90, 69, 33);
		frmAdressBook.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" City");
		lblNewLabel_2.setBounds(92, 182, 69, 33);
		frmAdressBook.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" Street");
		lblNewLabel_3.setBounds(92, 136, 69, 33);
		frmAdressBook.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" Search/Update ID");
		lblNewLabel_4.setBounds(304, 52, 111, 16);
		frmAdressBook.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(" Gender");
		lblNewLabel_5.setBounds(304, 190, 56, 16);
		frmAdressBook.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(" Zip");
		lblNewLabel_6.setBounds(450, 190, 39, 16);
		frmAdressBook.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(143, 49, 81, 22);
		frmAdressBook.getContentPane().add(textField);
		textField.setColumns(10);
		
		name_text = new JTextField();
		name_text.setBounds(143, 95, 458, 22);
		frmAdressBook.getContentPane().add(name_text);
		name_text.setColumns(10);
		
		street_text = new JTextField();
		street_text.setBounds(143, 141, 458, 22);
		frmAdressBook.getContentPane().add(street_text);
		street_text.setColumns(10);
		
		city_text = new JTextField();
		city_text.setBounds(143, 187, 116, 22);
		frmAdressBook.getContentPane().add(city_text);
		city_text.setColumns(10);
		
		search_text = new JTextField();
		search_text.setBounds(423, 49, 178, 22);
		frmAdressBook.getContentPane().add(search_text);
		search_text.setColumns(10);
		
		gender_text = new JTextField();
		gender_text.setBounds(360, 187, 39, 22);
		frmAdressBook.getContentPane().add(gender_text);
		gender_text.setColumns(10);
		
		zip_text = new JTextField();
		zip_text.setBounds(485, 187, 116, 22);
		frmAdressBook.getContentPane().add(zip_text);
		zip_text.setColumns(10);
		
		JButton add_buton = new JButton("Add");
		add_buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		add_buton.setBounds(40, 277, 56, 25);
		frmAdressBook.getContentPane().add(add_buton);
		
		JButton first_buton = new JButton("First");
		first_buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		first_buton.setBounds(102, 277, 59, 25);
		frmAdressBook.getContentPane().add(first_buton);
		
		JButton next_buton = new JButton("Next");
		next_buton.setBounds(166, 277, 62, 25);
		frmAdressBook.getContentPane().add(next_buton);
		
		JButton previous_buton = new JButton("Previous");
		previous_buton.setBounds(236, 277, 81, 25);
		frmAdressBook.getContentPane().add(previous_buton);
		
		JButton last_buton = new JButton("Last");
		last_buton.setBounds(323, 277, 65, 25);
		frmAdressBook.getContentPane().add(last_buton);
		
		JButton search_buton = new JButton("Search ByID");
		search_buton.setBounds(394, 277, 111, 25);
		frmAdressBook.getContentPane().add(search_buton);
		
		JButton clean_buton = new JButton("Clean TextFields");
		clean_buton.setBounds(511, 277, 127, 25);
		frmAdressBook.getContentPane().add(clean_buton);
	}
}
