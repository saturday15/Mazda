package setting;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import main.MazdaDB;
import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;

public class SettingMazdaCX5 extends JPanel {


	private static final long serialVersionUID = 1L;
	
	private JTextField textField_oil;
	private JTextField textField_breaks;
	private JTextField textField_belt;
	
	public SettingMazdaCX5() {
		
		setLayout(new MigLayout("", "[85.00px][86.00][100.00px,grow]", "[][][][20.00][20.00][40.00][]"));

		final JLabel label = new JLabel("������ ����� ������ ");
		add(label, "cell 0 0,growx,aligny top");
		
				textField_oil = new JTextField();
				textField_oil.setText("");
				add(textField_oil, "cell 1 0,growx,aligny top");
				textField_oil.setColumns(10);
		
		JButton btnOilOld = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C", new ImageIcon("res/save.png"));
		add(btnOilOld, "cell 2 0");
		
		btnOilOld.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int oilOld = Integer.parseInt(textField_oil.getText());
					MazdaDB.getInstance().inDB("MazdaCX5_oil", "change", oilOld);

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null,	"������� ����� �����");
					}
				}
			});				




		JLabel label_2 = new JLabel("������ ����� ������ ");
		add(label_2, "cell 0 1,alignx left");
		
				textField_belt = new JTextField();
				add(textField_belt, "cell 1 2,growx");
				textField_belt.setColumns(10);
		
		JButton btnBeltOld = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C", new ImageIcon("res/save.png"));
		add(btnBeltOld, "cell 2 2");
		btnBeltOld.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int beltOld = Integer.parseInt(textField_belt.getText());
					MazdaDB.getInstance().inDB("MazdaCX5_belt", "change", beltOld);

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null,	"������� ����� �����");
					}

				}
			});				


		
		JLabel label_1 = new JLabel("������ ������� ������ ");
		add(label_1, "cell 0 2,alignx left");
		
				textField_breaks = new JTextField();
				add(textField_breaks, "cell 1 1,growx");
				textField_breaks.setColumns(10);
		
		JButton btnBreaksOld = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C", new ImageIcon("res/save.png"));
		add(btnBreaksOld, "cell 2 1");
		btnBreaksOld.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int oilOld = Integer.parseInt(textField_breaks.getText());
					MazdaDB.getInstance().inDB("MazdaCX5_breaks", "change", oilOld);

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null,	"������� ����� �����");
					}

				}
			});
				


	}

}
