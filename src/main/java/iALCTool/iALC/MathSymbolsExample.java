package iALCTool.iALC;

import javax.swing.*;

public class MathSymbolsExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Equação Quadrática");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

               // String iALC = "<HTML> 
                
                
                String equationText = "<html>"
                        + "A equação &#x227C; quadrática é dada por:<br>"
                        + "ax<sup>2</sup> + bx + c = 0<br>"
                        + "A solução é dada por:<br>"
                        + "x = (-b ± &#x221A;(b<sup>2</sup> - 4ac)) / 2a"
                        + "</html>";

                JLabel equationLabel = new JLabel(equationText);

                frame.getContentPane().add(equationLabel);

                frame.setSize(400, 150);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
