package cmd.cn;

import java.util.Map;
import java.util.Scanner;

public class Manage {
	public static Map<Integer, Person> map = null;
	public static Fountions s1;

	public Manage() {
		map = Filet.read();
		s1 = new Fountions();

	}

	// ����Աģʽ
	public void enter_Manage() {
		Fountions s1 = new Fountions();
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("����Աģʽ�˵�");
		System.out.println("1.����\n2.��ѯ���п����˻�\n3.�û�ע��\n0.�˳�");
		System.out.print("������˵���:");
		try {
			n = input.nextInt();
		} catch (Exception e) {
			System.out.println("���������������³���");
			n = input.nextInt();
		}

		if (n == 1) {
			// ���뿪��ģʽ
			s1.add_User(s1.open_Card());
			System.out.println("--------------------------------------------------");

		} else if (n == 2) {
			// �û���Ϣչʾ
			s1.show_User();
			System.out.println("--------------------------------------------------");

		} else if (n == 3) {
			s1.delete_information();
			enter_Manage();

		}

		else if (n == 0) {
			// �˳�ϵͳ
			System.exit(0);

		}

	}
}