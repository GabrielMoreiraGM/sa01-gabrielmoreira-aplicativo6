package br.com.senaitagua.sa1.app6;
import javax.swing.JOptionPane;
import br.com.senaitagua.sa1.bo.TotalGeralBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalGeralBO tgf = new TotalGeralBO();
		
		double p1 = Double.parseDouble(JOptionPane.showInputDialog("Preço: "));
		double v1 = Double.parseDouble(JOptionPane.showInputDialog("Valor-unitário: "));
		
		JOptionPane.showMessageDialog(null,"Total geral: R$ "+ tgf.CalcTotal(p1, v1));

	}

}
