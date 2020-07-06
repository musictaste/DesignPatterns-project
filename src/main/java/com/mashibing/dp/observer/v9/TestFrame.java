package com.mashibing.dp.observer.v9;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame extends Frame {
	public void launch() {
		//按钮是事件源对象
		Button b = new Button("press me");
		//相当于添加多个观察者Observer
		b.addActionListener(new MyActionListener());
		b.addActionListener(new MyActionListener2());
		//将按钮添加到窗口
		this.add(b);
		//窗口把按钮包的严严实实
		this.pack();
		
		this.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		this.setLocation(400, 400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFrame().launch();
	}
	
	private class MyActionListener implements ActionListener { //相当于Observer

		public void actionPerformed(ActionEvent e) {
			//ActionEvent是事件本身，可以通过Event得到Source
			//通过事件ActionEvent得到事件源Button,修改Button的展示内容
			((Button)e.getSource()).setLabel("press me again!");
			System.out.println("button pressed!");
		}
		
	}
	
	private class MyActionListener2 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("button pressed 2!");
		}
		
	}
}
