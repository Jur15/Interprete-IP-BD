import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class MainWindow {

	private JFrame frame;
	private JTextField textTabla;
	private JTextField textPredic;
	private JTextField textTabRes;
	private JTextField textALInst;
	private JTextField textSQLInst;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelHome = new JPanel();
		frame.getContentPane().add(panelHome, "name_459995105347781");
		GridBagLayout gbl_panelHome = new GridBagLayout();
		gbl_panelHome.columnWidths = new int[]{59, 146, 0, 0};
		gbl_panelHome.rowHeights = new int[]{51, 0, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelHome.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelHome.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelHome.setLayout(gbl_panelHome);
		
		JLabel lblTitulo = new JLabel("INT\u00C9RPRETE DE \u00C1LGEBRA RELACIONAL");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 3;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 0);
		gbc_lblTitulo.gridx = 0;
		gbc_lblTitulo.gridy = 1;
		panelHome.add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblSeleccOper = new JLabel("Seleccione una operaci\u00F3n");
		lblSeleccOper.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblSeleccOper = new GridBagConstraints();
		gbc_lblSeleccOper.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccOper.anchor = GridBagConstraints.NORTH;
		gbc_lblSeleccOper.gridx = 0;
		gbc_lblSeleccOper.gridy = 5;
		panelHome.add(lblSeleccOper, gbc_lblSeleccOper);
		
		JComboBox cmbBoxOperacion = new JComboBox();
		cmbBoxOperacion.setModel(new DefaultComboBoxModel(new String[] {"Selecci\u00F3n", "Proyecci\u00F3n generalizada", "Uni\u00F3n", "Diferencia de conjuntos", "Producto cartesiano", "Intersecci\u00F3n", "Divisi\u00F3n", "Renombrar relaci\u00F3n/atributos", "Concatenaci\u00F3n", "Concatenaci\u00F3n natural", "Agregaci\u00F3n", "Agrupaci\u00F3n"}));
		GridBagConstraints gbc_cmbBoxOperacion = new GridBagConstraints();
		gbc_cmbBoxOperacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbBoxOperacion.insets = new Insets(0, 0, 5, 5);
		gbc_cmbBoxOperacion.gridx = 1;
		gbc_cmbBoxOperacion.gridy = 5;
		panelHome.add(cmbBoxOperacion, gbc_cmbBoxOperacion);
		
		JButton btnContinuar = new JButton("Continuar");
		GridBagConstraints gbc_btnContinuar = new GridBagConstraints();
		gbc_btnContinuar.insets = new Insets(0, 0, 5, 0);
		gbc_btnContinuar.gridx = 2;
		gbc_btnContinuar.gridy = 5;
		panelHome.add(btnContinuar, gbc_btnContinuar);
		
		JButton btnVerTablasDe = new JButton("Ver tablas de la BD");
		GridBagConstraints gbc_btnVerTablasDe = new GridBagConstraints();
		gbc_btnVerTablasDe.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerTablasDe.gridx = 0;
		gbc_btnVerTablasDe.gridy = 8;
		panelHome.add(btnVerTablasDe, gbc_btnVerTablasDe);
		
		JButton btnVerTablasTemporales = new JButton("Ver tablas temporales");
		GridBagConstraints gbc_btnVerTablasTemporales = new GridBagConstraints();
		gbc_btnVerTablasTemporales.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerTablasTemporales.gridx = 1;
		gbc_btnVerTablasTemporales.gridy = 8;
		panelHome.add(btnVerTablasTemporales, gbc_btnVerTablasTemporales);
		
		JButton btnVerReferenciaCruzada = new JButton("Ver referencia cruzada");
		GridBagConstraints gbc_btnVerReferenciaCruzada = new GridBagConstraints();
		gbc_btnVerReferenciaCruzada.insets = new Insets(0, 0, 5, 0);
		gbc_btnVerReferenciaCruzada.gridx = 2;
		gbc_btnVerReferenciaCruzada.gridy = 8;
		panelHome.add(btnVerReferenciaCruzada, gbc_btnVerReferenciaCruzada);
		
		JButton btnAyuda = new JButton("Ayuda");
		GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
		gbc_btnAyuda.insets = new Insets(0, 0, 5, 5);
		gbc_btnAyuda.gridx = 0;
		gbc_btnAyuda.gridy = 15;
		panelHome.add(btnAyuda, gbc_btnAyuda);
		
		JButton btnSalir = new JButton("Salir");
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalir.gridx = 1;
		gbc_btnSalir.gridy = 15;
		panelHome.add(btnSalir, gbc_btnSalir);
		
		JButton btnAcercaDe = new JButton("Acerca de");
		GridBagConstraints gbc_btnAcercaDe = new GridBagConstraints();
		gbc_btnAcercaDe.insets = new Insets(0, 0, 5, 0);
		gbc_btnAcercaDe.gridx = 2;
		gbc_btnAcercaDe.gridy = 15;
		panelHome.add(btnAcercaDe, gbc_btnAcercaDe);
		
		JPanel panelSelec = new JPanel();
		frame.getContentPane().add(panelSelec, "name_461351832647262");
		GridBagLayout gbl_panelSelec = new GridBagLayout();
		gbl_panelSelec.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelSelec.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelSelec.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0};
		gbl_panelSelec.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelSelec.setLayout(gbl_panelSelec);
		
		JLabel lblSeleccin = new JLabel("Selecci\u00F3n");
		lblSeleccin.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblSeleccin = new GridBagConstraints();
		gbc_lblSeleccin.insets = new Insets(0, 0, 5, 0);
		gbc_lblSeleccin.gridwidth = 4;
		gbc_lblSeleccin.gridx = 0;
		gbc_lblSeleccin.gridy = 1;
		panelSelec.add(lblSeleccin, gbc_lblSeleccin);
		
		JLabel lblTabla = new JLabel("Tabla");
		GridBagConstraints gbc_lblTabla = new GridBagConstraints();
		gbc_lblTabla.anchor = GridBagConstraints.EAST;
		gbc_lblTabla.insets = new Insets(0, 0, 5, 5);
		gbc_lblTabla.gridx = 0;
		gbc_lblTabla.gridy = 5;
		panelSelec.add(lblTabla, gbc_lblTabla);
		
		textTabla = new JTextField();
		GridBagConstraints gbc_textTabla = new GridBagConstraints();
		gbc_textTabla.insets = new Insets(0, 0, 5, 5);
		gbc_textTabla.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTabla.gridx = 2;
		gbc_textTabla.gridy = 5;
		panelSelec.add(textTabla, gbc_textTabla);
		textTabla.setColumns(10);
		
		JLabel lblPredicado = new JLabel("Predicado");
		GridBagConstraints gbc_lblPredicado = new GridBagConstraints();
		gbc_lblPredicado.anchor = GridBagConstraints.EAST;
		gbc_lblPredicado.insets = new Insets(0, 0, 5, 5);
		gbc_lblPredicado.gridx = 0;
		gbc_lblPredicado.gridy = 7;
		panelSelec.add(lblPredicado, gbc_lblPredicado);
		
		textPredic = new JTextField();
		GridBagConstraints gbc_textPredic = new GridBagConstraints();
		gbc_textPredic.insets = new Insets(0, 0, 5, 5);
		gbc_textPredic.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPredic.gridx = 2;
		gbc_textPredic.gridy = 7;
		panelSelec.add(textPredic, gbc_textPredic);
		textPredic.setColumns(10);
		
		JLabel lblTablaResultante = new JLabel("Tabla resultante");
		GridBagConstraints gbc_lblTablaResultante = new GridBagConstraints();
		gbc_lblTablaResultante.anchor = GridBagConstraints.EAST;
		gbc_lblTablaResultante.insets = new Insets(0, 0, 5, 5);
		gbc_lblTablaResultante.gridx = 0;
		gbc_lblTablaResultante.gridy = 9;
		panelSelec.add(lblTablaResultante, gbc_lblTablaResultante);
		
		textTabRes = new JTextField();
		GridBagConstraints gbc_textTabRes = new GridBagConstraints();
		gbc_textTabRes.insets = new Insets(0, 0, 5, 5);
		gbc_textTabRes.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTabRes.gridx = 2;
		gbc_textTabRes.gridy = 9;
		panelSelec.add(textTabRes, gbc_textTabRes);
		textTabRes.setColumns(10);
		
		JButton btnContinuar_1 = new JButton("Continuar");
		GridBagConstraints gbc_btnContinuar_1 = new GridBagConstraints();
		gbc_btnContinuar_1.gridwidth = 4;
		gbc_btnContinuar_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnContinuar_1.gridx = 0;
		gbc_btnContinuar_1.gridy = 12;
		panelSelec.add(btnContinuar_1, gbc_btnContinuar_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 4;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 15;
		panelSelec.add(textArea, gbc_textArea);
		
		JPanel panelResult = new JPanel();
		frame.getContentPane().add(panelResult, "name_461900474131568");
		GridBagLayout gbl_panelResult = new GridBagLayout();
		gbl_panelResult.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelResult.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelResult.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelResult.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelResult.setLayout(gbl_panelResult);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblResultado = new GridBagConstraints();
		gbc_lblResultado.gridwidth = 3;
		gbc_lblResultado.insets = new Insets(0, 0, 5, 0);
		gbc_lblResultado.gridx = 0;
		gbc_lblResultado.gridy = 1;
		panelResult.add(lblResultado, gbc_lblResultado);
		
		JLabel lblInstruccinDeAlgebra = new JLabel("Instrucci\u00F3n de algebra relacional:");
		GridBagConstraints gbc_lblInstruccinDeAlgebra = new GridBagConstraints();
		gbc_lblInstruccinDeAlgebra.insets = new Insets(0, 0, 5, 5);
		gbc_lblInstruccinDeAlgebra.gridx = 1;
		gbc_lblInstruccinDeAlgebra.gridy = 3;
		panelResult.add(lblInstruccinDeAlgebra, gbc_lblInstruccinDeAlgebra);
		
		textALInst = new JTextField();
		textALInst.setEditable(false);
		GridBagConstraints gbc_textALInst = new GridBagConstraints();
		gbc_textALInst.insets = new Insets(0, 0, 5, 5);
		gbc_textALInst.fill = GridBagConstraints.HORIZONTAL;
		gbc_textALInst.gridx = 1;
		gbc_textALInst.gridy = 4;
		panelResult.add(textALInst, gbc_textALInst);
		textALInst.setColumns(10);
		
		JLabel lblInstruccinDeSql = new JLabel("Instrucci\u00F3n SQL:");
		GridBagConstraints gbc_lblInstruccinDeSql = new GridBagConstraints();
		gbc_lblInstruccinDeSql.insets = new Insets(0, 0, 5, 5);
		gbc_lblInstruccinDeSql.gridx = 1;
		gbc_lblInstruccinDeSql.gridy = 6;
		panelResult.add(lblInstruccinDeSql, gbc_lblInstruccinDeSql);
		
		textSQLInst = new JTextField();
		textSQLInst.setEditable(false);
		GridBagConstraints gbc_textSQLInst = new GridBagConstraints();
		gbc_textSQLInst.insets = new Insets(0, 0, 5, 5);
		gbc_textSQLInst.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSQLInst.gridx = 1;
		gbc_textSQLInst.gridy = 7;
		panelResult.add(textSQLInst, gbc_textSQLInst);
		textSQLInst.setColumns(10);
		
		JLabel lblTablaRes = new JLabel("Tabla resultante:");
		GridBagConstraints gbc_lblTablaRes = new GridBagConstraints();
		gbc_lblTablaRes.insets = new Insets(0, 0, 5, 5);
		gbc_lblTablaRes.gridx = 1;
		gbc_lblTablaRes.gridy = 9;
		panelResult.add(lblTablaRes, gbc_lblTablaRes);
		
		table = new JTable();
		
		JScrollPane scrollPane = new JScrollPane(table);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 10;
		panelResult.add(scrollPane, gbc_scrollPane);
		
		JButton btnVolverIni = new JButton("Volver a inicio");
		GridBagConstraints gbc_btnVolverIni = new GridBagConstraints();
		gbc_btnVolverIni.insets = new Insets(0, 0, 5, 5);
		gbc_btnVolverIni.gridx = 1;
		gbc_btnVolverIni.gridy = 12;
		panelResult.add(btnVolverIni, gbc_btnVolverIni);
	}
}
