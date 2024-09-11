import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SmartWasteManagementSystemGUI {
    private JFrame frame;
    private JButton monitorButton;
    private JButton manageBinsButton;
    private JButton manageEcoPointsButton;
    private JButton generateReportsButton;
    private SystemAdmin admin;

    public SmartWasteManagementSystemGUI() {
        admin = new SystemAdmin("Afridi", "Afridi@gmail.com");

        frame = new JFrame("Smart Waste Management System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        monitorButton = new JButton("Monitor System Status");
        manageBinsButton = new JButton("Manage Bins and Routes");
        manageEcoPointsButton = new JButton("Manage Eco-Points and Rewards");
        generateReportsButton = new JButton("Generate Reports");

        monitorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin.monitorSystem();
            }
        });

        manageBinsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin.manageBinsAndRoutes();
            }
        });

        manageEcoPointsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin.manageEcoPoints();
            }
        });

        generateReportsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin.generateReports();
            }
        });

        frame.add(monitorButton);
        frame.add(manageBinsButton);
        frame.add(manageEcoPointsButton);
        frame.add(generateReportsButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SmartWasteManagementSystemGUI::new);
    }
}
