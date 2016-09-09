package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyEidtor extends JFrame {

	private JButton open, save, exit;
	private JTextArea editor;
	private File openFile;

	public MyEidtor() {
		// 繼承父類別
		super("MyEidtor");
		// 將版面設定成BorderLayout
		setLayout(new BorderLayout());
		open = new JButton("open");
		save = new JButton("save");
		exit = new JButton("exit");
		// 設置FlowLayout把open save exit放入
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);
		top.add(save);
		top.add(exit);
		// 把TOP放到borderLayout的北邊
		add(top, BorderLayout.NORTH);
		// 新增文字編輯器並放到中間
		editor = new JTextArea();
		// JScrollPane為產生卷軸
		JScrollPane jsp = new JScrollPane(editor);
		add(jsp, BorderLayout.CENTER);

		setSize(800, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doopen();
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dosave();
			}
		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

	private void doopen() {
		// 創造一個JFC為選擇的檔案
		JFileChooser jfc = new JFileChooser();
		// 判斷顯示的檔案和選擇的檔案是否相同
		if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			openFile = jfc.getSelectedFile();
			// System.out.println(openFile.getAbsolutePath());
			readFile();
		}

	}

	private void readFile() {
		if (openFile == null)
			return;
		// 開啟時text設為空值
		editor.setText("");
		try {
			FileReader reader = new FileReader(openFile);
			int c;
			// 把reader讀取放在C
			while ((c = reader.read()) != -1) {
				// 增加在後方
				editor.append("" + (char) c);
			}
			reader.close();
		} catch (Exception e) {

		}
	}

	private void dosave() {
		if (openFile == null)
			return;
		try {
			FileWriter write=new FileWriter(openFile);
			write.write(editor.getText());
			write.flush();
			write.close();
			JOptionPane.showMessageDialog(null,"save OK");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"save fail");
		}
		
	}

	public static void main(String[] args) {
		new MyEidtor();

	}

}
