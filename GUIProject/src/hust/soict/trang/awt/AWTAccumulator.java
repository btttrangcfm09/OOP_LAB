package hust.soict.trang.awt;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {//Frame là một container trong AWT để tạo cửa sổ giao diện.
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0; // Accumulated sum, init to 0

    // Constructor to setup the GUI components and event handlers
    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2));

        add(new Label("Enter an Integer: "));
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener()); // khi người dùng nhập giá trị nhấn enter sẽ gọi đến addActionListener trong TFInputListener để xử lý

        add(new Label("The Accumulated Sum is: "));
        tfOutput = new TextField(10);
        tfOutput.setEditable(false);//thiết lập tfOutput thành read-only
        add(tfOutput);

        setTitle("AWT Accumulator"); // đặt tiêu đề của cửa sổ
        setSize(350, 120);// kích cỡ cửa cửa sổ
        setVisible(true);// hiển thị cửa sổ lên màn hình
    }

    public static void main(String[] args) {
        new AWTAccumulator();
    }
    
    // lớp xử lý sự kiện, triển khia ActionListener
    private class TFInputListener implements ActionListener {
        @Override
        // được gọi khi người dùng nhấn enter tron tfInput
        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(tfInput.getText());// lấy giá trị từ in put chuyển thành số nguyên
            sum += numberIn;
            tfInput.setText(""); // xoa noi dung trong o nhap du lieu sau khi nhan enter
            tfOutput.setText(sum + "");//hien thi tong moi trong tfOutput
        }
    }
}
