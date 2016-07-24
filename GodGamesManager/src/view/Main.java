package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Main {

	private JFrame frmGodGamesManager;
	
	private JTable tableRegisters;
	private JTable tableTotal;
	private DefaultTableModel tableModelRegisters = new DefaultTableModel();
	private DefaultTableModel tableModelTotal = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String laf = UIManager.getSystemLookAndFeelClassName();
					UIManager.setLookAndFeel(laf);
					Main window = new Main();
					window.frmGodGamesManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGodGamesManager = new JFrame();
		frmGodGamesManager.setTitle("God Games Manager");
		frmGodGamesManager.setBounds(100, 100, 700, 460);
		frmGodGamesManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmGodGamesManager.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelRegisters = new JPanel();
		tabbedPane.addTab("Registros", null, panelRegisters, null);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JScrollPane scrollPaneRegisters = new JScrollPane();
		
		JScrollPane scrollPaneTotal = new JScrollPane();
		
		JButton btnEdit = new JButton("Editar");
		
		JButton btnRemove = new JButton("Remover");
		
		tableModelRegisters.addColumn("Hora inicial");
		tableModelRegisters.addColumn("Hora final");
		tableModelRegisters.addColumn("TV");
		tableModelRegisters.addColumn("Pago");
		tableModelRegisters.addColumn("Preço");
		
		tableRegisters = new JTable(tableModelRegisters);
		tableRegisters.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		tableRegisters.getColumnModel().getColumn(0).setPreferredWidth(30);
		tableRegisters.getColumnModel().getColumn(1).setPreferredWidth(30);
		tableRegisters.getColumnModel().getColumn(2).setPreferredWidth(30);
		tableRegisters.getColumnModel().getColumn(3).setPreferredWidth(30);
		tableRegisters.getColumnModel().getColumn(4).setPreferredWidth(30);
		
		scrollPaneRegisters.setViewportView(tableRegisters);
		
		tableModelTotal.addColumn("Total dia");
		tableModelTotal.addColumn("Total mes");
		tableModelTotal.addColumn("Total ano");
		
		tableTotal = new JTable(tableModelTotal);
		tableTotal.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		scrollPaneTotal.setViewportView(tableTotal);
		
		JButton btnToday = new JButton("Hoje");
		
		JButton btnMonth = new JButton("M\u00EAs");
		
		JButton btnYear = new JButton("Ano");
		
		JButton btnDate = new JButton("Data");
		GroupLayout gl_panelRegisters = new GroupLayout(panelRegisters);
		gl_panelRegisters.setHorizontalGroup(
			gl_panelRegisters.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRegisters.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelRegisters.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelRegisters.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnToday, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnMonth, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnYear, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDate, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRemove, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addComponent(scrollPaneRegisters, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
						.addComponent(scrollPaneTotal, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
					.addGap(10))
		);
		gl_panelRegisters.setVerticalGroup(
			gl_panelRegisters.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRegisters.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panelRegisters.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRemove)
						.addComponent(btnEdit)
						.addComponent(btnAdd)
						.addComponent(btnToday)
						.addComponent(btnMonth)
						.addComponent(btnYear)
						.addComponent(btnDate))
					.addGap(11)
					.addComponent(scrollPaneRegisters, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(scrollPaneTotal, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		panelRegisters.setLayout(gl_panelRegisters);
		
		tableTotal.getColumnModel().getColumn(0).setPreferredWidth(50);
		tableTotal.getColumnModel().getColumn(1).setPreferredWidth(50);
		tableTotal.getColumnModel().getColumn(2).setPreferredWidth(50);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				NewRegister newRegister = new NewRegister();
				newRegister.getFrame().setVisible(true);
//				frmGodGamesManager.setVisible(false);
			}
		});
	}
}
