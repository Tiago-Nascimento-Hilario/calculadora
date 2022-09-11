package view;

import model.Memoria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teclado extends JPanel implements ActionListener {
    private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
    private final Color COR_CINZA_CLARO = new Color(99, 99, 99);
    private final Color COR_LARANJA  = new Color (242, 163, 60);
    public Teclado(){

        setLayout(new GridLayout(5,4));

        // linha 1
        adicionarBotao("%", COR_CINZA_ESCURO);
        adicionarBotao("+/-", COR_CINZA_ESCURO);
        adicionarBotao("A/C", COR_CINZA_ESCURO);
        adicionarBotao("/", COR_LARANJA);
        // linha 2
        adicionarBotao("7", COR_CINZA_CLARO);
        adicionarBotao("8", COR_CINZA_CLARO);
        adicionarBotao("9", COR_CINZA_CLARO);
        adicionarBotao("*", COR_LARANJA);
        // linha 3
        adicionarBotao("4", COR_CINZA_CLARO);
        adicionarBotao("5", COR_CINZA_CLARO);;
        adicionarBotao("6", COR_CINZA_CLARO);
        adicionarBotao("-", COR_LARANJA);
        // linha 4
        adicionarBotao("1", COR_CINZA_CLARO);
        adicionarBotao("2", COR_CINZA_CLARO);
        adicionarBotao("3", COR_CINZA_CLARO);
        adicionarBotao("+", COR_LARANJA);
        // linha 5
        adicionarBotao("", COR_CINZA_CLARO);
        adicionarBotao("0", COR_CINZA_CLARO);
        adicionarBotao(",", COR_CINZA_CLARO);
        adicionarBotao("=", COR_LARANJA);

    }

    private void adicionarBotao(String texto, Color cor){
        Botao botao = new Botao(texto,cor);
        botao.addActionListener(this);
        add(botao);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton){
            JButton botao = (JButton) e.getSource();
            Memoria.getInstancia().processaComando(botao.getText());
        }

    }
}
