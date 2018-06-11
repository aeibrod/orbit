package orbit.utils.ui;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

import org.lwjgl.opengl.Display;

public class LoadingDialog {

	protected final int width = 400;
	protected final int height = 100;

	protected String title = "";
	protected String status = "";
	protected int progress = 0;

	protected boolean indeterminate = false;

	protected JFrame dialog;
	protected JLabel jtitle = new JLabel();
	protected JLabel jstatus = new JLabel();
	protected JProgressBar jprogress = new JProgressBar();

	public LoadingDialog(){ }


	public LoadingDialog setTitle(String title){
		this.title = title;
		update();
		return this;
	}
	public LoadingDialog setStatus(String status){
		this.status = status;
		update();
		return this;
	}
	public LoadingDialog setProgress(int progress){
		this.progress = progress;
		update();
		return this;
	}
	public LoadingDialog setIndeterminate(boolean indeterminate){
		this.indeterminate = indeterminate;
		return this;
	}


	public LoadingDialog create(){

		dialog = new JFrame();

		JPanel panel = new JPanel();

		dialog.setTitle(title);
		dialog.setBounds(
			(Display.getX() + Display.getWidth() / 2) - (width / 2),
			(Display.getY() + Display.getHeight() / 2) - (height / 2),
			width, height
		);
		dialog.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		dialog.setAlwaysOnTop(true);
		dialog.setResizable(false);

		panel.setLayout(new GridLayout(3, 1));
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		jtitle.setFont(new Font(jtitle.getFont().getName(), Font.BOLD, 13));
		jstatus.setFont(new Font(jstatus.getFont().getName(), Font.PLAIN, 11));

		update();

		panel.add(jtitle);
		panel.add(jprogress);
		panel.add(jstatus);

		dialog.setContentPane(panel);
		dialog.setVisible(true);

		return this;
	}

	public void destroy(){
		dialog.dispose();
	}

	public void update(){
		jtitle.setText(title);
		jstatus.setText(status);

		if (indeterminate){
			jprogress.setIndeterminate(true);
		} else {
			jprogress.setValue(progress);
		}
	}

}