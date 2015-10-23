package com.tom.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	MyFrame myframe;
	public MyActionListener(MyFrame myframe){
		this.myframe = myframe;
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("actionPerformed");
		myframe.info.setText("KKK");
	}

}
