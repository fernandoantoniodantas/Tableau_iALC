package iALCTool.iALC;

import java.awt.*;

public class teste extends Frame {
    public teste() {
        super("DrawString Example");
        setSize(300, 150);
        setVisible(true);
    }

    public void paint(Graphics g) {
        String text = "For every element x in the set X, \u2200 P(x) is true.";
        // \u2200 é o caractere Unicode para "∀" (para todos).

        // Verifica se a fonte suporta o caractere Unicode
        Font font = getSupportedFont();
        g.setFont(font);
        System.out.println(g.getFont());

        // Desenha a string nas coordenadas (20, 50)
        g.drawString(text, 20, 50);
    }

    private Font getSupportedFont() {
        // Tenta obter uma fonte que suporte o caractere Unicode
        String fontName = "Arial";
        String text = "\u2200"; // Caractere Unicode "∀"

        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String availableFontName : fontNames) {
            Font font = new Font(availableFontName, Font.PLAIN, 14);
            if (font.canDisplay(text.charAt(0))) {
                return font;
            }
        }

        // Se nenhuma fonte for encontrada, retorna a fonte padrão
        return new Font(fontName, Font.PLAIN, 14);
    }

    public static void main(String[] args) {
        new teste();
    }
}
