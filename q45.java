import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q45 extends JFrame implements ActionListener {
    private JTextField inputTextField;
    private JTextField resultTextField;
    private JButton countVowelButton;
    private JButton resetButton;
    private JButton exitButton;

    public q45() {
        setTitle("Vowel Counter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        inputTextField = new JTextField();
        inputTextField.setBounds(175, 25, 125, 25);
        resultTextField = new JTextField();
        resultTextField.setEditable(false); // Result field should be non-editable
        resultTextField.setBounds(175, 75, 125, 25);

        countVowelButton = new JButton("Count Vowel");
        countVowelButton.setBounds(5, 125, 120, 25);
        resetButton = new JButton("Reset");
        resetButton.setBounds(130, 125, 100, 25);
        exitButton = new JButton("Exit");
        exitButton.setBounds(235, 125, 120, 25);

        // Add action listeners
        countVowelButton.addActionListener(this);
        resetButton.addActionListener(this);
        exitButton.addActionListener(this);

        // Add components to the frame
        JLabel stringLabel =  new JLabel("Enter String: ");
        stringLabel.setBounds(5, 25, 120, 25);
        add(stringLabel);
        JLabel countVowel = new JLabel("Number of Vowels: ");
        countVowel.setBounds(5, 75, 120, 25);
        add(countVowel);
        add(resultTextField);
        add(countVowelButton);
        add(resetButton);
        add(exitButton);
        add(inputTextField);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countVowelButton) {
            String input = inputTextField.getText();
            int vowelCount = countVowels(input);
            resultTextField.setText(String.valueOf(vowelCount));
        } else if (e.getSource() == resetButton) {
            inputTextField.setText("");
            resultTextField.setText("");
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    private int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new q45();
    }
}
