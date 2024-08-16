package UserInterface;

import javax.swing.*;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.*;

public class OJMainUI {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame OJFrame = new JFrame("EcuaFauna 2K24A");
        OJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        OJFrame.setSize(800, 600); // Ajusta el tamaño según sea necesario
        OJFrame.setLayout(new BorderLayout(10, 10)); // Espacio entre los bordes y los componentes

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBackground(new Color(240, 240, 240)); // Fondo gris claro

        JLabel titleLabel = new JLabel("EcuaFauna 2K24A", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Verdana", Font.BOLD, 32)); // Tamaño de letra grande y estilizada
        titleLabel.setForeground(Color.BLACK);

        titlePanel.add(titleLabel, BorderLayout.CENTER);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.GRAY);
        titlePanel.add(separator, BorderLayout.SOUTH);

        OJInfoPanel OJInfoPanel = new OJInfoPanel();

        OJExperimentationPanel OJExperimentationPanel = new OJExperimentationPanel();

        OJFeedButtonsPanel OJFeedButtonsPanel = new OJFeedButtonsPanel();

        OJActionButtonsPanel OJActionButtonsPanel = new OJActionButtonsPanel();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBackground(new Color(240, 240, 240)); // Fondo gris claro

        mainPanel.add(OJInfoPanel, BorderLayout.NORTH);
        mainPanel.add(OJExperimentationPanel, BorderLayout.CENTER);
        mainPanel.add(OJFeedButtonsPanel, BorderLayout.SOUTH);

        OJFrame.add(titlePanel, BorderLayout.NORTH);
        OJFrame.add(mainPanel, BorderLayout.CENTER);
        OJFrame.add(OJActionButtonsPanel, BorderLayout.SOUTH);

        OJFrame.setVisible(true);
    }
}