package face;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaPrincipal extends JFrame{

	private JPanel contentPane;
	
	public JanelaPrincipal() {
		
		super("Sistema de Cadastro");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		getContentPane().setLayout(new MigLayout("", "[][][216px]", "[19px][][19px][23px][]"));
		
		JButton btnNewButton = new JButton("Administra\u00E7\u00E3o de Clientes");
		getContentPane().add(btnNewButton, "cell 1 0,alignx left,growy");
		
		JButton btnAdministrao = new JButton("Administra\u00E7\u00E3o de usu\u00E1rios");
		getContentPane().add(btnAdministrao, "cell 1 1,alignx right,aligny top");
		
		JButton btnNewButton_1 = new JButton("Sobre...");
		getContentPane().add(btnNewButton_1, "cell 1 2,alignx left,growy");
		
		
		this.setVisible(true);
		
	}
}
