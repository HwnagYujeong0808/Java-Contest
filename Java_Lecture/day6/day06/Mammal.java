package day06;
// �߻� Ŭ���� 
// �ν��Ͻ�ȭ �� �� ���� Ŭ���� 
public abstract class Mammal {
	int eye, nose, ear;
	String name , species;
	// method Overriding 
	// ������ 
	// ��� �ڼ� Ŭ������ �� �޼��带 �������̵� �ϱ� ������
	// ���� �����ص� �ʿ䰡 ��� X 
	abstract void eating();
	// �߻� �޼��� , �޼��� body X 
	// �̱��� �޼��� 
	abstract void sleeping();
	void see() {
		System.out.println("���� �־�� ");
	}
}
