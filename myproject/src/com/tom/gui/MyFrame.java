package com.tom.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	JLabel info;
	
	public MyFrame(){
		setSize(400, 300);
		JButton b = new JButton("HELLO");
		info = new JLabel("aaa");
		setLayout(new FlowLayout());
		add(b);
		add(info);
		//MyActionListener listener = new MyActionListener(this);
//		InnerActionListener listener = new InnerActionListener();
//		b.addActionListener(listener);
//		b.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Anony");
//				info.setText("DDD");
//				
//				
//			}
//		});
		b.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

	class InnerActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("InnerActionListener");
			info.setText("PPP");
		}
	}
	
	
	public static void main(String[] args) {
		new MyFrame();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		info.setText("UUU");
		
	}

}
