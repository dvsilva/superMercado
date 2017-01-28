package face;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controle.Login;

public class JanelaLoginNoSistema extends JFrame {
	public static int logado;
	private JPanel contentPane;
	private JLabel rotulo1;
	private JLabel rotulo2;
	private JLabel rotulo3;
	private JTextField campo1;
	private JPasswordField campo2;
	private JButton botao1;

	int vezes = 0;
	
	public JanelaLoginNoSistema() {
		
		super("Login do Sistema");
		setBounds(100, 50, 270, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		getContentPane().setLayout(null);
		
		rotulo1 = new JLabel("LOGIN NO SISTEMA");
		rotulo1.setBounds(80, 20, 120, 20);
		getContentPane().add(rotulo1);
		
		rotulo2 = new JLabel("Usuário:");
		rotulo2.setBounds(20, 60, 100, 20);
		getContentPane().add(rotulo2);
		
		rotulo3 = new JLabel("Senha:");
		rotulo3.setBounds(20, 90, 100, 20);
		getContentPane().add(rotulo3);
		
		campo1 = new JTextField();
		campo1.setBounds(80, 60, 150, 20);
		campo1.setToolTipText("Digite aqui o seu usuário");
		getContentPane().add(campo1);
		
		campo2 = new JPasswordField();
		campo2.setBounds(80, 90, 100, 20);
		campo2.setToolTipText("Digite aqui sua senha");
		getContentPane().add(campo2);
		
		botao1 = new JButton("Entrar no Sistema");
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String usuario = campo1.getText();
				String senha = campo2.getText();
				Login l1 = new Login();
				l1.Logar(usuario,senha);
				
				if (logado == 1) {
					setVisible(false);
				}
				
				++ vezes;
	         	if (vezes == 3){
	         		JOptionPane.showMessageDialog(null, "Quantidade de tentativas excedida\nTente novamente mais tarde");
	         		System.exit(0);
	         	}
			}
		});
		botao1.setBounds(80, 120, 150, 20);
		getContentPane().add(botao1);
		setVisible(true);
	}

}
