package com.linksaver.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveIntoFile {
	
	private String urlString;
	private String linkLabel;
	
	public SaveIntoFile(String urlString, String linkLabel) throws IOException {
		this.urlString = urlString;
		this.linkLabel = linkLabel;
		
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(new FileWriter("data.txt", true));
			outputStream.println(this.urlString + "\n" + this.linkLabel + "---------------------------");
		} finally {
			if (outputStream != null) {
                outputStream.close();
            }
		}
	}
	
	public static void main(String[] args) {
	}
}
