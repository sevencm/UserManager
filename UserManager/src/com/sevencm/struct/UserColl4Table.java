package com.sevencm.struct;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.sevencm.user.UserInfo;

public class UserColl4Table {
	//List<UserInfo> userList = new ArrayList<UserInfo>();
	
	public static void main(String[] args) {
		InputStream isInput = System.in;
		try {
			byte[] bInputByte= new byte[1024];
			List<UserInfo> userList = new ArrayList<UserInfo>();
						
			while(true)
			{
				;			
				
			}
//			while(isInput.read(bInputByte) != -1){
//				String InputStr = new String(bInputByte).trim();
//				switch(){
//				
//				}
//				
//				if (InputStr.equals("q!"))
//					break;
//				System.out.println(InputStr);
//				String[] strI = InputStr.split(" ");
//				for(int i=0;i<strI.length; i++){
//					System.out.println(strI[i]);
//					// ´æÈëÐÅÏ¢				
//				}
//				UserInfo userInfo = new UserInfo();
//				userInfo.setIntUserAge(Integer.getInteger(strI[0]));
//				
//				bInputByte = new byte[1024];
//			}
//			
//			isInput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
