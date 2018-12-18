package pr4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PFour extends JFrame
{
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
	int milan = 0, madrid = 0;
	JButton mil = new JButton("AC Milan");
	JButton mad = new JButton("Real Madrid");
	JTextField score = new JTextField("0 : 0");
	JTextField lastScore = new JTextField("None");
	JTextField winner = new JTextField("DRAW");
	Font font = new Font("Times New Roman", Font.PLAIN, 12);
	
	PFour(){
		super("Example Application");
		if (RIGHT_TO_LEFT) {
            setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		if (shouldFill) {
			c.fill = GridBagConstraints.HORIZONTAL;
		}
		setSize(500, 250);
		
		if (shouldWeightX) {
			c.weightx = 20.0;
		}
	
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;      
		c.weightx = 0.5;
		c.gridwidth = 0;
		c.gridx = 0;
		c.gridy = 1;
		add(new JLabel("Last Scorer: "), c);
		c.gridx = 1;
		add(lastScore, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;      
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 2;
		add(new JLabel("Result: "), c);
		c.gridx = 1;
		add(score, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;      
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 3;
		add(new Label("Winner: "), c);
		c.gridx = 1;
		add(winner, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(mil, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 20.0;
		c.gridx = 1;
		c.gridy = 0;
		add(mad, c);
		
		mil.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
					milan++;
					score.setText(milan + " : " + madrid);
					lastScore.setText("AC Milan");
					if (milan > madrid)
						winner.setText("AC Milan");
					else if (milan < madrid)
						winner.setText("Real Madrid");
					else
						winner.setText("Draw");
				
			}
		});
		
		mad.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
					madrid++;
					score.setText(milan + " : " + madrid);
					lastScore.setText("Real Madrid");
					if (milan > madrid)
						winner.setText("AC Milan");
					else if (milan < madrid)
						winner.setText("Real Madrid");
					else
						winner.setText("Draw");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new PFour();
	}
}