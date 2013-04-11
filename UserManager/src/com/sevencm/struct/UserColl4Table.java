package com.sevencm.struct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sevencm.mathod.UserManMathod;
import com.sevencm.user.UserInfo;

public class UserColl4Table {
	// List<UserInfo> userList = new ArrayList<UserInfo>();

	public static void main(String[] args) {
		InputStream isInput = System.in;
		try {
			byte[] bInputByte = new byte[1024];
			List<UserInfo> userList = new ArrayList<UserInfo>();
			boolean booleanFlag = true;
			while (booleanFlag) {
				System.out.println("请选择功能:");
				System.out.println("1、录入用户信息");
				System.out.println("2、修改用户信息");
				System.out.println("3、删除用户信息");
				System.out.println("4、查询正常用户信息");
				System.out.println("5、查询已删用户信息");
				System.out.println("6、退出系统");

					Scanner scan = new Scanner(System.in);
				//	System.out.println(scan.next());
					int intSelect = scan.nextInt();
					switch (intSelect) {
					case 1:
						System.out.println("========================按以下排列顺序输入相应的信息，用TAB键隔开========================");

						System.out.println("用户ID\tNAME\tAGE\t ADDRESS\t MAIL\tSEX\tPASSWORD ");
						BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
						String str = buffer.readLine();
						UserManMathod manMathod = new UserManMathod();					
						userList.add(manMathod.addUserInfo(str));						
						break;
					case 2:
						System.out.println("修改");
						break;
					case 3:
						System.out.println("删除");
						break;
					case 4:
						System.out.println("==============================正常人员列表如下==============================");
						 new UserManMathod().getUserInfo(userList);
						
						break;
					case 5:
						System.out.println("查询已删");
						break;
					case 6:
						System.out.println("退出系统");
						booleanFlag = false;
						break;
					default:
						System.out.println("输入有误，请重新输入");
						break;

					}

				}

			
			// while(isInput.read(bInputByte) != -1){
			// String InputStr = new String(bInputByte).trim();
			// switch(){
			//
			// }
			//
			// if (InputStr.equals("q!"))
			// break;
			// System.out.println(InputStr);
			// String[] strI = InputStr.split(" ");
			// for(int i=0;i<strI.length; i++){
			// System.out.println(strI[i]);
			// // 存入信息
			// }
			// UserInfo userInfo = new UserInfo();
			// userInfo.setIntUserAge(Integer.getInteger(strI[0]));
			//
			// bInputByte = new byte[1024];
			// }
			//
			// isInput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
