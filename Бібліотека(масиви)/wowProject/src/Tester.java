import ua.com.vita.krainik.firstPackage.*;

public class Tester {
	/**
	 * Class Tester
	 * for Arrays
	 * 
	 * Do not copy, it is my program.
	 * @author Vita Krainik
	 * @version 4.0 since 11.11.2012
	 */
	public static void main(String[] args) {
		Array ar = new Array();
		ar.printmass();//��������
		ar.delEnd();//��������
		System.out.println("������ 6 ��������");
		for (int i = 0; i<6; i++)
		ar.addEnd(DataInput.getInt());
		ar.printmass();
		System.out.println("��������� ��������");
		ar.delEnd();
		System.out.println("��������");
		ar.printmass();
		System.out.println("������� �� ���������");
		ar.sortSpad();
		System.out.println("������� �� ����������");
		ar.sortZrost();
		System.out.println("�������� 10, 4, 0, 3 ��������");
		System.out.println(ar.getElement(10));
		System.out.println(ar.getElement(4));
		System.out.println(ar.getElement(0));
		System.out.println(ar.getElement(3));
		ar.findElement(4);
		ar.findElement(10);		
		System.out.println("��������");
		ar.printmass();
		System.out.println("��������� �����");
		ar.clear();
		System.out.println("��������");
		ar.printmass();
		System.out.println("���� ����");
	}

}
