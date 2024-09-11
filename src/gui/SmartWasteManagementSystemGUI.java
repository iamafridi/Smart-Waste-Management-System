package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import src.SystemAdmin;

public class SmartWasteManagementSystemGUI extends JFrame {
    private SystemAdmin admin;
    private JTextArea textArea;

    public SmartWasteManagementSystemGUI() {
        admin = new SystemAdmin("Emily", "emily@example.com");

        setTitle("Smart Waste Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1));

        JButton monitorButton = new JButton("Monitor System Status");
        JButton manageBinsButton = new JButton("Manage Bins and Routes");
        JButton manageEcoPointsButton = new JButton("Manage Eco-Points");
        JButton generateReportsButton = new JButton("Generate Reports");

        buttonPanel.add(monitorButton);
        buttonPanel.add(manageBinsButton);
        buttonPanel.add(manageEcoPointsButton);
        buttonPanel.add(generateReportsButton);

        add(buttonPanel, BorderLayout.WEST);

        monitorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(admin.getSystemStatus());
            }
        });

        manageBinsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(admin.manageBinsAndRoutes());
            }
        });

        manageEcoPointsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(admin.manageEcoPoints());
            }
        });

        generateReportsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(admin.generateReport());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SmartWasteManagementSystemGUI();
            }
        });
    }
}
