
package buscaminas;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Tania
 */
public class Cuadritos extends JPanel{
    
    private int valor;
    
    public Cuadritos(){
        this.setLayout(new CardLayout());
        this.setBackground(Color.WHITE);
        JButton mina = new JButton();
        mina.setHorizontalAlignment(0);
        mina.setText("1");
        this.add(mina);
        
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
