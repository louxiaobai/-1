package cmd.cn;

public interface Funtion_Interface {
	// �û�����
	public Person open_Card();

	// ����û�
	public void add_User(Person s);

	// �û�ע��
	public void delete_information();

	// ����û���Ϣ
	public void show_User();

	// �û���ֵ����
	public void charge_money(int id);

	// ��ѯ�û����
	public void lookMoney(int id);

	// �ж�id�Ƿ����
	public boolean boolean_id(int id);

}
