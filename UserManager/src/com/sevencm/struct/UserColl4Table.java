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
				System.out.println("��ѡ����:");
				System.out.println("1��¼���û���Ϣ");
				System.out.println("2���޸��û���Ϣ");
				System.out.println("3��ɾ���û���Ϣ");
				System.out.println("4����ѯ�����û���Ϣ");
				System.out.println("5����ѯ��ɾ�û���Ϣ");
				System.out.println("6���˳�ϵͳ");

					Scanner scan = new Scanner(System.in);
				//	System.out.println(scan.next());
					int intSelect = scan.nextInt();
					switch (intSelect) {
					case 1:
						System.out.println("========================����������˳��������Ӧ����Ϣ����TAB������========================");

						System.out.println("�û�ID\tNAME\tAGE\t ADDRESS\t MAIL\tSEX\tPASSWORD ");
						BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
						String str = buffer.readLine();
						UserManMathod manMathod = new UserManMathod();					
						userList.add(manMathod.addUserInfo(str));						
						break;
					case 2:
						System.out.println("�޸�");
						break;
					case 3:
						System.out.println("ɾ��");
						break;
					case 4:
						System.out.println("==============================������Ա�б�����==============================");
						 new UserManMathod().getUserInfo(userList);
						
						break;
					case 5:
						System.out.println("��ѯ��ɾ");
						break;
					case 6:
						System.out.println("�˳�ϵͳ");
						booleanFlag = false;
						break;
					default:
						System.out.println("������������������");
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
			// // ������Ϣ
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
