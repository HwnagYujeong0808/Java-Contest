package day06;
// ��� : 
public class SuperMan extends Person {

	SuperMan(){
		super();
		// �θ�Ŭ������ �⺻�����ڸ� ȣ��
		// this �� �ڽ��� ����Ű�� ��������
		// super �θ� 
		// ���� �⺻������ : this() 
		// �θ��� �⺻������ : super()
		System.out.println("���۸� Ŭ������ ������");
	}
	void laser() {
		System.out.println("������ �߻�~~ ");
	}
	void fly() {
		System.out.println("�޷��޷� ���ƿ� ");
	}
	
}
