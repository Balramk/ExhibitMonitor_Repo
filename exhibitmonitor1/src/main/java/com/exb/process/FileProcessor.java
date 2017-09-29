package com.exb.process;

import java.io.File;
import java.text.ParseException;

import com.exb.provider.PollerCheck;

public class FileProcessor extends PollerCheck implements Runnable{
	@Override
	public void run() {
			File files[] = getFiles("D:\\Balram_Kushwah\\FileHolder\\inputfiles");
			
			if(files.length == 0){
				System.out.println("----Empty Directory----");
				return;
			}
			
			for(File file : files){
				try {
					if(!isValid(file) || isDuplicate(file) || !isOnTime(file)){
						deleteFile(file);
						System.out.println(file.getName() + " is deleted.");
					}
				
					else{
						//TODO
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
	}
}
