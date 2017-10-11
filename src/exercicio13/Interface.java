package exercicio13;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Interface extends JFrame{
	JLabel lblladoa = new JLabel("Lado A");
	JLabel lblladob = new JLabel("Lado B");
	JLabel lblarea = new JLabel("Àrea");
	JLabel lblperimetro = new JLabel("Perimetro");
	
	JTextField txta = new JTextField();
	JTextField txtb = new JTextField();
	JTextField txtarea = new JTextField();
	JTextField txtperimetro = new JTextField();

	

	JButton btnCalculo = new JButton("Calcular");
	
		double ladoa, ladob;
	
	public Interface(){
		Calculo calc = new Calculo();
		
	Container paine = this.getContentPane();
	
	paine.add(lblladoa); // label
	lblladoa.setBounds(20,20,245,40);
	
	paine.add(txta);// caixa
	txta.setBounds(80,30,140,20);
	
	paine.add(lblladob);// label
	lblladob.setBounds(20,100,245,40);
	
	paine.add(txtb);// caixa
	txtb.setBounds(80,110,140,20);
	
	paine.add(lblarea);// label
	lblarea.setBounds(20,140,245,40);
	
	paine.add(txtarea);// caixa
	txtarea.setBounds(80,150,140,20);
	
	paine.add(lblperimetro);// label
	lblperimetro.setBounds(20,180,245,40);
	
	paine.add(txtperimetro);// caixa
	txtperimetro.setBounds(80,190,140,20);
	
	paine.add(btnCalculo);
	btnCalculo.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent e){
			 ladoa = Double.parseDouble(txta.getText());
			 ladob = Double.parseDouble(txtb.getText());
			 txtarea.setText("" + calc.area(ladoa, ladob));
			 txtperimetro.setText("" + calc.perimetro(ladoa, ladob));
		 }
	 });
	btnCalculo.setBounds(90,400,100,40);
	
	txtarea.setEditable(false);
	txtperimetro.setEditable(false);
	this.setLayout(null);
	this.setVisible(true);
	this.setSize(350, 600);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}

public static void main(String args[]){
	Interface inte = new Interface();
}
}
