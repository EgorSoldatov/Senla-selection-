import java.util.Scanner;
public class otr {

	public static int VektorMulti(int ax, int ay, int bx, int by)
	{
		return (ax*by - bx*ay);
    }
	
	public static void main(String args[]) {
		int x1,y1,x2,y2;
		int x3,y3,x4,y4;
		int v1,v2,v3,v4;
		Scanner scn = new Scanner(System.in);
		System.out.print("������ ����� ������� ������� ");
		x1 = scn.nextInt();
		y1 = scn.nextInt();
		System.out.print("������ ����� ������� ������� ");
		x2 = scn.nextInt();
		y2 = scn.nextInt();
		System.out.print("������ ����� ������� ������� ");
		x3 = scn.nextInt();
		y3 = scn.nextInt();
		System.out.print("������ ����� ������� ������� ");
		x4 = scn.nextInt();
		y4 = scn.nextInt();
		
		v1 = VektorMulti(x4-x3,y4-y3,x1-x3,y1-y3);
		v2 = VektorMulti(x4-x3,y4-y3,x2-x3,y2-y3);
		v3 = VektorMulti(x2-x1,y2-y1,x3-x1,y3-y1);
		v4 = VektorMulti(x2-x1,y2-y1,x4-x1,y4-y1);
		if ((v1 * v2 < 0) && (v3 * v4 < 0))
		System.out.print("������������");	
		else
		System.out.print("�� ������������");
	}
	
}
