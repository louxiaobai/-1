package cmd.cn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class In_System {

	Manage manage = new Manage();
	User user = new User();

	public void enter_System() {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ��: 1-����Աģʽ 2-�û� 0-�˳�");
		try {
			n = input.nextInt();
		} catch (InputMismatchException e) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("��������,������������d");
			n = input1.nextInt();

		}
		if (n == 1) {
			// �������Աģʽ
			manage.enter_Manage();
			enter_System();

		} else if (n == 2) {
			// �����û�ģʽ
			user.enter_User();
			enter_System();

		} else if (n == 0) {
            //�˳�ϵͳ
			System.exit(0);

		}

	}

}
