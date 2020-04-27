package com.occamsrazor.web.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class FileTest {
//	public final static String FILE_PATH = "C:\\Users\\user\\spring-workspace\\occamsrazor\\src\\main\\resources\\static\\member\\";
//	public void main(String[] args) {
//		try {
//			File file = new File(FILE_PATH+"list.txt");  // Io로 잡아야 함 , list.txt에 저장, write가 작성, read는 읽는 녀석
//			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
//			BufferedReader reader = new BufferedReader(new FileReader(file));
//			List<String> list= new ArrayList<>();
//			while(true) {
//				switch(JOptionPane.showInputDialog("0,1,2")) {
//				case "0": return;
//				case "1": 
//					String message = JOptionPane.showInputDialog("messege input");
//					writer.write(message);
//					writer.newLine();
//					writer.flush();
//					break;
//				case "2": 
//					while((message = reader.readLine()) != null) {
//						list.add(message+"/");
//					}
//					JOptionPane.showMessageDialog(null, list);
//					reader.close(); // 다 읽었으면 닫아주기
//					break;
//				}
//			}
//		} catch(Exception e) {
//			
//		}
//	}
}
