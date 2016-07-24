package view;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class NewRegister {

	private JFrame frmDadosDoRegistro;
	private JTextField textFieldPrice;
	private JTextField textFieldTv;
	private JTextField textFieldDay;
	private JTextField textFieldStartHour;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldYear;
	private JTextField textFieldMonth;
	private JTextField textFieldStartMinute;
	private JTextField textFieldFinishHour;
	private JTextField textFieldFinishMinute;
	private JCheckBox chckbxEditDateTime;
	private float hourPrice = 2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String laf = UIManager.getSystemLookAndFeelClassName();
					UIManager.setLookAndFeel(laf);
					NewRegister window = new NewRegister();
					window.frmDadosDoRegistro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDadosDoRegistro = new JFrame();
		frmDadosDoRegistro.setTitle("Preencha os dados do registro");
		frmDadosDoRegistro.setResizable(false);
		frmDadosDoRegistro.setBounds(100, 100, 590, 90);
		frmDadosDoRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDadosDoRegistro.getContentPane().setLayout(null);
		
		JLabel lblPrice = new JLabel("Pre\u00E7o");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setBounds(10, 11, 46, 14);
		frmDadosDoRegistro.getContentPane().add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPrice.setBounds(66, 8, 86, 20);
		frmDadosDoRegistro.getContentPane().add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		JLabel lblPago = new JLabel("Pago");
		lblPago.setHorizontalAlignment(SwingConstants.CENTER);
		lblPago.setBounds(314, 11, 46, 14);
		frmDadosDoRegistro.getContentPane().add(lblPago);
		
		JLabel lblTv = new JLabel("TV");
		lblTv.setHorizontalAlignment(SwingConstants.CENTER);
		lblTv.setBounds(162, 11, 46, 14);
		frmDadosDoRegistro.getContentPane().add(lblTv);
		
		textFieldTv = new JTextField();
		textFieldTv.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTv.setBounds(218, 8, 86, 20);
		frmDadosDoRegistro.getContentPane().add(textFieldTv);
		textFieldTv.setColumns(10);
		
		JLabel lblDate = new JLabel("Data");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setBounds(10, 36, 46, 14);
		frmDadosDoRegistro.getContentPane().add(lblDate);
		
		textFieldDay = new JTextField();
		textFieldDay.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDay.setEditable(false);
		textFieldDay.setBounds(66, 33, 20, 20);
		frmDadosDoRegistro.getContentPane().add(textFieldDay);
		textFieldDay.setColumns(10);
		
		textFieldMonth = new JTextField();
		textFieldMonth.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMonth.setEditable(false);
		textFieldMonth.setColumns(10);
		textFieldMonth.setBounds(92, 33, 20, 20);
		frmDadosDoRegistro.getContentPane().add(textFieldMonth);
		
		textFieldYear = new JTextField();
		textFieldYear.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldYear.setEditable(false);
		textFieldYear.setColumns(10);
		textFieldYear.setBounds(118, 33, 34, 20);
		frmDadosDoRegistro.getContentPane().add(textFieldYear);
		
		JLabel lblSlash = new JLabel("/");
		lblSlash.setHorizontalAlignment(SwingConstants.CENTER);
		lblSlash.setBounds(86, 36, 6, 14);
		frmDadosDoRegistro.getContentPane().add(lblSlash);
		
		JLabel lblSlash2 = new JLabel("/");
		lblSlash2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSlash2.setBounds(112, 36, 6, 14);
		frmDadosDoRegistro.getContentPane().add(lblSlash2);
		
		JLabel lblBegin = new JLabel("In\u00EDcio");
		lblBegin.setHorizontalAlignment(SwingConstants.CENTER);
		lblBegin.setBounds(162, 36, 46, 14);
		frmDadosDoRegistro.getContentPane().add(lblBegin);
		
		textFieldStartHour = new JTextField();
		textFieldStartHour.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldStartHour.setEditable(false);
		textFieldStartHour.setBounds(218, 33, 38, 20);
		frmDadosDoRegistro.getContentPane().add(textFieldStartHour);
		textFieldStartHour.setColumns(10);
		
		textFieldStartMinute = new JTextField();
		textFieldStartMinute.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldStartMinute.setEditable(false);
		textFieldStartMinute.setColumns(10);
		textFieldStartMinute.setBounds(266, 33, 38, 20);
		frmDadosDoRegistro.getContentPane().add(textFieldStartMinute);
		
		JLabel lblColon = new JLabel(":");
		lblColon.setHorizontalAlignment(SwingConstants.CENTER);
		lblColon.setBounds(256, 36, 10, 14);
		frmDadosDoRegistro.getContentPane().add(lblColon);
		
		textFieldFinishHour = new JTextField();
		textFieldFinishHour.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFinishHour.setEditable(false);
		textFieldFinishHour.setColumns(10);
		textFieldFinishHour.setBounds(366, 33, 38, 20);
		frmDadosDoRegistro.getContentPane().add(textFieldFinishHour);
		
		textFieldFinishMinute = new JTextField();
		textFieldFinishMinute.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFinishMinute.setEditable(false);
		textFieldFinishMinute.setColumns(10);
		textFieldFinishMinute.setBounds(414, 33, 38, 20);
		frmDadosDoRegistro.getContentPane().add(textFieldFinishMinute);
		
		JLabel lblColon2 = new JLabel(":");
		lblColon2.setHorizontalAlignment(SwingConstants.CENTER);
		lblColon2.setBounds(404, 36, 10, 14);
		frmDadosDoRegistro.getContentPane().add(lblColon2);
		
		JLabel lblEnd = new JLabel("Fim");
		lblEnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnd.setBounds(314, 36, 46, 14);
		frmDadosDoRegistro.getContentPane().add(lblEnd);
		
		chckbxEditDateTime = new JCheckBox("Editar Data/Hora");
		chckbxEditDateTime.setBounds(471, 34, 107, 19);
		frmDadosDoRegistro.getContentPane().add(chckbxEditDateTime);
		
		JRadioButton rdbtnYes = new JRadioButton("Sim");
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setBounds(366, 9, 46, 18);
		frmDadosDoRegistro.getContentPane().add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("N\u00E3o");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(410, 11, 46, 14);
		frmDadosDoRegistro.getContentPane().add(rdbtnNo);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.setBounds(485, 7, 89, 23);
		frmDadosDoRegistro.getContentPane().add(btnAdd);
		
		chckbxEditDateTime.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				if (chckbxEditDateTime.isSelected()) {
					textFieldDay.setEditable(true);
					textFieldMonth.setEditable(true);
					textFieldYear.setEditable(true);
					textFieldStartHour.setEditable(true);
					textFieldStartMinute.setEditable(true);
				} else{
					textFieldDay.setEditable(false);
					textFieldMonth.setEditable(false);
					textFieldYear.setEditable(false);
					textFieldStartHour.setEditable(false);
					textFieldStartMinute.setEditable(false);
				}
			}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
			
		});
				
		KeyListener calculateFinalHour = new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(!textFieldPrice.getText().isEmpty() && !textFieldStartHour.getText().isEmpty() && !textFieldStartMinute.getText().isEmpty()){
					float price = Float.parseFloat(textFieldPrice.getText());
					int startHour = Integer.parseInt(textFieldStartHour.getText());
					int startMinute = Integer.parseInt(textFieldStartMinute.getText());
					
					float fraction = (price/hourPrice)%1;
					int plusHour = (int)((price/hourPrice) - fraction);
					int plusMinute = (int) (fraction * 60);
					
					if ((startMinute + plusMinute) >= 60) {
						plusHour = plusHour + 1;
						plusMinute = plusMinute - 60;
					}
					if ((startHour + plusHour) >= 24)
						plusHour = plusHour - 24;
					
					String complement;
					
					if ((startHour + plusHour) < 10)
						complement = "0";
					else
						complement = "";
					textFieldFinishHour.setText(complement + (startHour + plusHour));
					
					if ((startMinute + plusMinute) < 10)
						complement = "0";
					else
						complement = "";
					textFieldFinishMinute.setText(complement + (startMinute + plusMinute));
				}else{
					textFieldFinishHour.setText(textFieldStartHour.getText());
					textFieldFinishMinute.setText(textFieldStartMinute.getText());
				}
			}
			
			@Override
			public void keyTyped(KeyEvent e) {}			
			@Override
			public void keyPressed(KeyEvent e) {}
			
		};
		
		textFieldPrice.addKeyListener(calculateFinalHour);
		textFieldStartHour.addKeyListener(calculateFinalHour);
		textFieldStartMinute.addKeyListener(calculateFinalHour);
		
		Calendar calendar = Calendar.getInstance();
		
		if (calendar.get(Calendar.DAY_OF_MONTH) < 10)
			textFieldDay.setText("0" + calendar.get(Calendar.DAY_OF_MONTH));
		else
			textFieldDay.setText(Integer.toString(calendar.get(Calendar.DAY_OF_MONTH)));
		if (calendar.get(Calendar.MONTH) < 9)
			textFieldMonth.setText("0" + (calendar.get(Calendar.MONTH)+1));
		else
			textFieldMonth.setText(Integer.toString((calendar.get(Calendar.MONTH)+1)));
		textFieldYear.setText(Integer.toString(calendar.get(Calendar.YEAR)));
		
		if (calendar.get(Calendar.HOUR_OF_DAY) < 10)
			textFieldStartHour.setText("0" + calendar.get(Calendar.HOUR_OF_DAY));
		else
			textFieldStartHour.setText(Integer.toString(calendar.get(Calendar.HOUR_OF_DAY)));
		if (calendar.get(Calendar.MINUTE) < 10)
			textFieldStartMinute.setText("0" + calendar.get(Calendar.MINUTE));
		else
			textFieldStartMinute.setText(Integer.toString(calendar.get(Calendar.MINUTE)));
		
	}
	
	public JFrame getFrame(){
		return this.frmDadosDoRegistro;
	}
	
}
