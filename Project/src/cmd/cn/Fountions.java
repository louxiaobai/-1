package cmd.cn;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Fountions implements Funtion_Interface {

	public static Map<Integer, Person> map = null;

	public Fountions() {
		map = Manage.map;
	}

	@Override
	// �û�����
	public Person open_Card() {
		// TODO Auto-generated method stub
		String name;
		int id;
		String telephone;
		double money;
		Scanner input = new Scanner(System.in);
		System.out.println("�����뿪���˵�����:");
		name = input.next();
		System.out.println("�������˻�id:");
		id = input.nextInt();
		while (true) {
			if (boolean_id(id)) {
				System.out.println("id�����ظ���������һ���µ�id");
				id = input.nextInt();
			}
				if (!boolean_id(id)) {
					break;
				}
			
		}
		System.out.println("������绰����:");
		telephone = input.next();
		System.out.println("������Ԥ������:");
		try {
			money = input.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("������������������");
			Scanner input1 = new Scanner(System.in);
			money = input1.nextDouble();

		}
		return new Person(id, name, telephone, money);
	}

	@Override
	// ����û�
	public void add_User(Person s) {
		// TODO Auto-generated method stub
		map.put(s.getId(), s);
		Filet.write(map);
		System.out.println("�����ɹ����μ�����id:" + s.getId() + ",�μǸ�id�����Ժ�ĵ�½��");

	}

	// ����û���Ϣ
	public void show_User() {
		// TODO Auto-generated method stub
		System.out.println("�û���Ϣ:\n�˻�id\t����\t�绰����\t�˻����\t");
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			Object key = it.next();
			Object value = map.get(key);
			System.out.println(value);

		}

	}

	@Override
	// ע���û���Ϣ
	public void delete_information() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫע����id:");
		int id = input.nextInt();
		if (map.containsKey(id)) {
			map.remove(id);
			Filet.write(map);
			System.out.println("�û�ע���ɹ�!");
			System.out
					.println("--------------------------------------------------");

		} else {

			System.out.println("��Ҫע�����û������ڣ�");
			System.out
					.println("--------------------------------------------------");

		}

	}

	@Override
	// �û���Ǯ
	public void charge_money(int id) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		if (map.containsKey(id)) {
			Person s = (Person) map.get(id);
			System.out.println("������Ҫ��ֵ��Ǯ��:");
			double money = input.nextDouble();
			s.setMoney(s.getMoney() + money);
			Filet.write(map);
			System.out.println("��ֵ�ɹ�!\n" + s.getName() + "��ֵ" + money + "Ԫ!");

		}

	}

	@Override
	// ��ѯ�û����
	public void lookMoney(int id) {
		// TODO Auto-generated method stub
		if (map.containsKey(id)) {
			Person s = (Person) map.get(id);
			System.out.println("�û����Ϊ:" + s.getMoney() + "Ԫ��");

		}

	}

	@Override
	// �ж�id�Ƿ����
	public boolean boolean_id(int id) {

		if (map.containsKey(id)) {

			return true;

		}
		return false;
	}

}
