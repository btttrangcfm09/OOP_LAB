package hust.soict.trang.swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberGrid extends JFrame {
	   private JButton[] btnNumbers = new JButton[10]; // Một mảng chứa 10 nút bấm (JButton) đại diện cho các số từ 0 đến 9 
	    private JButton btnDelete, btnReset;//Hai nút bấm khác
	    private JTextField tfDisplay;

	    public NumberGrid() {
	        tfDisplay = new JTextField(30);
	        tfDisplay.setComponentOrientation(
	            ComponentOrientation.RIGHT_TO_LEFT);//Cài đặt hướng nhập liệu từ phải sang trái 

	        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
	        //Một JPanel chứa các nút bấm, sử dụng GridLayout với 4 hàng và 3 cột.
	        addButtons(panelButtons);

	        Container cp = getContentPane();//Lấy phần nội dung chính của JFrame.
	        cp.setLayout(new BorderLayout());
	        cp.add(tfDisplay, BorderLayout.NORTH);//Đặt tfDisplay ở phía trên cùng.
	        cp.add(panelButtons, BorderLayout.CENTER);//Đặt panelButtons ở trung tâm.

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Đóng chương trình khi nhấn nút đóng cửa sổ.
	        setTitle("Number Grid");// đặt tiêu đề cho cửa sổ
	        setSize(200, 200);
	        setVisible(true);
	    }
	    void addButtons(JPanel panelButtons) {
	        ButtonListener btnListener = new ButtonListener();
	        
	        for (int i = 1; i <= 9; i++) {
	            btnNumbers[i] = new JButton("" + i);//Tạo nút bấm và đặt tên nút bằng số hiện tại của vòng lặp.
	            panelButtons.add(btnNumbers[i]);// Thêm nút bấm vào panelButtons
	            btnNumbers[i].addActionListener(btnListener);//
	        }

	        btnDelete = new JButton("DEL");
	        panelButtons.add(btnDelete);
	        btnDelete.addActionListener(btnListener);

	        btnNumbers[0] = new JButton("0");
	        panelButtons.add(btnNumbers[0]);
	        btnNumbers[0].addActionListener(btnListener);

	        btnReset = new JButton("C");
	        panelButtons.add(btnReset);
	        btnReset.addActionListener(btnListener);
	    }
	    private  class ButtonListener implements ActionListener{
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		String button = e.getActionCommand();
	    		if(button.charAt(0) >= '0' && button.charAt(0) <= '9') {
	    			tfDisplay.setText(tfDisplay.getText() + button);
	    		}
	    		else if (button.equals("DEL")) {
	    			// handles the "DEL"
	    			String text = tfDisplay.getText();
	    			if(!text.isEmpty()) {
	    				tfDisplay.setText(text.substring(0,text.length()-1));
	    			}
	    		}
	    		else {
	    			// handles the "DEL"
	    			tfDisplay.setText("");// xoa toan bo
	    		}
	    	}
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new NumberGrid();
	}

}
