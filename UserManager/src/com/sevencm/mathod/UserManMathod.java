package com.sevencm.mathod;

import java.util.Iterator;
import java.util.List;

import com.sevencm.user.UserInfo;

public class UserManMathod {
	public UserInfo addUserInfo(String str){
		String[] strUserInfo = str.split(" ");
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
		System.out.println("用户ID       用户名                       用户年龄                                用户地址                                                  用户性别                用户邮件                  用户密码"	);
		while(iUserInfo.hasNext()){
			UserInfo uI = iUserInfo.next();
			
			System.out.println(uI.getStrUserID() + "  " + uI.getStrUserName() +  "  " + uI.getIntUserAge()+  "  " + uI.getStrUserAddress()+  "  " +uI.getStrUserSex()+  "  " +uI.getStrUserMail()+  "  " +uI.getStrUserPassword());
		}
	}
}
