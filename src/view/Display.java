package view;

import model.Memoria;
import model.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObservador {
    private final JLabel label = new JLabel(Memoria.getInstancia().getTextoAtual());
    public Display() {
        Memoria.getInstancia().adicionarObservador(this);
        setBackground(Color.black);
        label.setForeground(Color.white);
        label.setFont(new Font("courier",Font.PLAIN,30));
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}
