import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalSelectorGame extends JFrame {

    public AnimalSelectorGame() {
        setTitle("Επίλεξε το ζωάκι σου!");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3, 10, 10));

        // Λίστα με τα ζωάκια
        String[] animals = {"Σκύλος 🐶", "Γάτα 🐱", "Λαγός 🐰", "Αρκούδα 🐻", "Πάντα 🐼", "Αλεπού 🦊"};

        // Δημιουργία κουμπιού για κάθε ζωάκι
        for (String animal : animals) {
            JButton button = new JButton(animal);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            
            // Προσθήκη ενέργειας όταν πατιέται το κουμπί
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Εμφάνιση μηνύματος νίκης
                    JOptionPane.showMessageDialog(AnimalSelectorGame.this, 
                            "Συγχαρητήρια! Μόλις κέρδισες: " + animal + "!", 
                            "Κέρδισες!", 
                            JOptionPane.INFORMATION_MESSAGE);
                }
            });
            
            add(button);
        }

        // Κεντράρισμα του παραθύρου στην οθόνη
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Εκτέλεση του GUI στο Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AnimalSelectorGame().setVisible(true);
            }
        });
    }
}
