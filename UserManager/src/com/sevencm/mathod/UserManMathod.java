package com.sevencm.mathod;

import java.util.Iterator;
import java.util.List;

import com.sevencm.user.UserInfo;

public class UserManMathod {
	public UserInfo addUserInfo(String str){
		String[] strUserInfo = str.split("\t");
		UserInfo userInfo = new UserInfo();
		userInfo.setStrUserID(strUserInfo[0]);
		userInfo.setStrUserName(strUserInfo[1]);
		userInfo.setIntUserAge(Integer.valueOf(strUserInfo[2]));
		userInfo.setStrUserAddress(strUserInfo[3]);
		userInfo.setStrUserMail(strUserInfo[4]);
		userInfo.setStrUserSex(strUserInfo[5]);
		userInfo.setStrUserPassword(strUserInfo[6]);		
		return userInfo;
	}
	
	public void getUserInfo(List<UserInfo> userList){
		Iterator<UserInfo> iUserInfo = userList.iterator();
		System.out.println("用户ID\t用户名\t用户年龄\t用户地址\t用户性别\t用户邮件\t用户密码"	);
		while(iUserInfo.hasNext()){
			UserInfo uI = iUserInfo.next();
			
			System.out.println(uI.getStrUserID() + "\t" + uI.getStrUserName() +  "\t" + uI.getIntUserAge()+  "\t" + uI.getStrUserAddress()+  "\t" +uI.getStrUserSex()+  "\t" +uI.getStrUserMail()+  "\t" +uI.getStrUserPassword());
		}
	}
}
