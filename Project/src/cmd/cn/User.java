package cmd.cn;

import java.util.Map;
import java.util.Scanner;

public class User {
	public static Map<Integer, Person> map = null;

	public User() {
		Manage s = new Manage();
		map = s.map;
	}

	// �û�ģʽ
	public void enter_User() {
		Fountions s1 = new Fountions();
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("�û�ģʽ�˵�");
		System.out.println("1.��ֵ\n2.�鿴���˻����\n0.�˳�");
		System.out.println("��������һ��id");
		int id = input.nextInt();
		if (map.containsKey(id)) {
			System.out.println("�û���Ϣ:\n�˻�id\t����\t�绰����\t�˻����\t");
			System.out.println(map.get(id));
			System.out.println("������˵���:");
			try {
				n = input.nextInt();
			} catch (Exception e) {
				System.out.println("��������,����������");
				n = input.nextInt();
			}

			if (n == 1) {
				// �����ֵϵͳ
				s1.charge_money(id);
				System.out
						.println("--------------------------------------------------");
			} else if (n == 2) {
				// �û���ѯģʽ
				s1.lookMoney(id);
				System.out
						.println("--------------------------------------------------");
			}

		} else {
			System.out.println("���û������ڣ�");

		}

	}

}
