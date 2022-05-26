package kiosk;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

//ȭ��3 ������
public class Screen_3 extends JFrame {

	Stack<String> stack=new Stack();

	Screen_3(){}

	//[Ű����ũ��] ����
	JPanel title1 = new JPanel();						//(�г�): title1
	JLabel titleL1 = new JLabel("������ȭ�� Ƽ�� �Ǹ�");	//(��): titleL1
	//[�ȳ�����] ����
	JPanel title2 = new JPanel();						//(�г�): title2
	JLabel titleL2 = new JLabel("������� �߱޵Ǿ����ϴ�"); //(��): titleL2
	
	//[���� ������ ǥ��] �г� ����		(container)
	//(page �г� ���� pg1,2,3 �г� ���� ���� pgL1,2,3 �� �� �� 3�� ����(����, �г� 3��, �� 3��)
	JPanel page = new JPanel();
	
	//���� �г�(pg1~4) ����				(components)
	JPanel pg1 = new JPanel();
	JPanel pg2 = new JPanel();
	JPanel pg3 = new JPanel();
	
	// ���� ��(pgL1~4) ����
	JLabel pgL1 = new JLabel("1");
	JLabel pgL2 = new JLabel("2");
	JLabel pgL3 = new JLabel("3");
	
	//Ȯ�οϷ� ��ư: finish
	JButton finish = new JButton("Ȯ�� �Ϸ�");
	
	//[�¼� �ȳ�] ����
	JPanel seatGuide = new JPanel();
	
	//�¼��� �̹���
	ImageIcon seatImg = new ImageIcon("images/seat_hwazhil.jpg");
	JButton seatImgButton = new JButton(seatImg);
	
	//[Ƽ��] ����: ticketF ����
	JPanel ticketF = new JPanel();
	
	//Ƽ��(��)
	// -��ȭ��: ticketInfo1
	// -�� �ð�, �¼� ����, �ż�: ticketInfo2	
	JLabel ticketInfo1 = new JLabel();
	JLabel ticketInfo2 = new JLabel();
	JLabel ticketInfo3_1 = new JLabel();
	JLabel ticketInfo3_2 = new JLabel();
	JLabel ticketInfo3_3 = new JLabel();
	JLabel ticketInfo3_4 = new JLabel();
	JLabel yff = new JLabel();
	JLabel yff2 = new JLabel();
	
	JFrame Screen_3 = new JFrame();
	
	public Screen_3(int n, int inner, int outer,Seat save) {
		
		//��ü ������ ����
		setTitle("��ȭ�� Ƽ�� �Ǹ� Ű����ũ");
		setSize(1100, 800); 	// ������ ũ�� 1100*800
		//setResizable(false);	//������ ũ�� ���� �� �ϰ� ����
		setLocationRelativeTo(null);	//�������� ȭ�� ����� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 
							//������ ���� ��ư Ŭ�� �� ������ ������ ���α׷� �����
		setVisible(true); 	// ������ ���
		
		//contentPane ���� (��ġ������ ����)
		Container title = getContentPane();		
		title.setLayout(null);
		
		
		//�¼� ����
		Seat s = save;		// Seat ������ s
		int test = 0;
		
		//stack
		if(stack.isEmpty()){
			stack.push("A8");
			stack.push("A7");
			stack.push("A6");
			stack.push("A5");
			stack.push("A4");
			stack.push("A3");
			stack.push("A2");
			stack.push("A1");
			
			stack.push("B1");
			stack.push("B2");
			stack.push("B3");
			stack.push("B4");
			stack.push("B5");
			stack.push("B6");
			stack.push("B7");
			stack.push("B8");
			
			stack.push("C8");
			stack.push("C7");
			stack.push("C6");
			stack.push("C5");
			stack.push("C4");
			stack.push("C3");
			stack.push("C2");
			stack.push("C1");
			
			stack.push("D1");
			stack.push("D2");
			stack.push("D3");
			stack.push("D4");
			stack.push("D5");
			stack.push("D6");
			stack.push("D7");
			stack.push("D8");
		}
		//��ȭ ���� ������ �¼� ������ ����
		if(n==1) {
			for(int a=0;a<s.getSave1();a++) {
				System.out.println(stack.pop());
			}
		}
		if(n==2) {
			for(int a=0;a<s.getSave2();a++) {
				System.out.println(stack.pop());
			}
		}
		if(n==3) {
			for(int a=0;a<s.getSave3();a++) {
				System.out.println(stack.pop());
			}
		}
		if(n==4) {
			for(int a=0;a<s.getSave4();a++) {
				System.out.println(stack.pop());
			}
		}
		if(n==5) {
			for(int a=0;a<s.getSave5();a++) {
				System.out.println(stack.pop());
			}
		}
		
		//[���� ������ ǥ��] �г� ���� �� ����
		page.setBounds(1100-143,25,108,30);
		page.setLayout(null);
		page.setBackground(new Color(255,0,0,0));	//����
		add(page);

		//���� ����
		Color green = new Color(0x006633, false);		//�ʷ�
		Color yellow = new Color(0xFDDA2A, false);		//���
		
		//pg1~4 ġ�� ����
		int pW = 30; int pH = 30;
		int pX = 0;
		int pP = pW+6;
		
		//pg1~4 ����	
		pg1.setLayout(null);
		pg1.setBounds(0,0,pW,pH);
		pg2.setBounds(pX+pP,0,pW,pH);
		pg3.setBounds(pX+pP*2,0,pW,pH);
		
		pg2.setLayout(null);
		pg1.setBackground(Color.GRAY);
		pg2.setBackground(Color.GRAY);
		pg3.setBackground(yellow);				//���� ������(yellow)
		
		pg3.setLayout(null);
		page.add(pg1);
		page.add(pg2);
		page.add(pg3);
		
		//pgL1~4 ����
		pgL1.setHorizontalAlignment(JLabel.CENTER);
		pgL1.setVerticalAlignment(JLabel.TOP);
		pgL1.setFont(new Font("���� ���", Font.BOLD, 20));
		pgL1.setForeground(Color.DARK_GRAY);  
		pgL1.setSize(30,30);
		pg1.add(pgL1);
		
		pgL2.setHorizontalAlignment(JLabel.CENTER);
		pgL2.setVerticalAlignment(JLabel.TOP);
		pgL2.setFont(new Font("���� ���", Font.BOLD, 20));
		pgL2.setForeground(Color.DARK_GRAY);
		pgL2.setSize(30,30);
		pg2.add(pgL2);
		
		pgL3.setHorizontalAlignment(JLabel.CENTER);
		pgL3.setVerticalAlignment(JLabel.TOP);
		pgL3.setFont(new Font("���� ���", Font.BOLD, 20));
		pgL3.setForeground(Color.black);						//���� ������(Color.black)
		pgL3.setSize(30,30);
		pg3.add(pgL3);
		
		//Ÿ��Ʋ ġ�� ����
		int lft = 280;			//Ű����ũ��(�г�) ���� ����
		int rgt = 1100 - lft;	//�ȳ�����(�г�) ���� ���� (������ ���� ���� - Ű����ũ��(�г�) ���� ����)
		int hgt = 70;			//���� ����
		
		//title1 ����
		title1.setLayout(null);
		title1.setBounds(0,0,lft,hgt);
		title1.setBackground(green);
		//title1.setVisible(true);
		add(title1);
		
		//title2 ����
		title2.setLayout(null);
		title2.setLocation(lft, 0);
		title2.setSize(rgt, hgt);
		title2.setBackground(Color.DARK_GRAY);
		//title2.setVisible(true);
		add(title2);		
		
		//titleL1 ����
		titleL1.setHorizontalAlignment(JLabel.CENTER);
		titleL1.setSize(lft, hgt);
		titleL1.setFont(new Font("���� ���", Font.PLAIN, 25));
		titleL1.setForeground(Color.WHITE);
		//title.add(title_l);
		title1.add(titleL1);
		
		//titleL2 ����
		titleL2.setHorizontalAlignment(JLabel.LEFT);
		titleL2.setBounds(20,0,rgt, hgt);
		titleL2.setFont(new Font("���� ���", Font.BOLD, 26));
		titleL2.setForeground(Color.WHITE);
		//titleR.add(titleL2);
		title2.add(titleL2);
		
		//finish ����
		finish.setBounds(820, 615, 130, 80);				//800-185 = 615
		Color bColor = new Color(0x3333FF, false);				//��ư �� ����
		finish.setBackground(bColor);
		finish.setFont(new Font("���� ���", Font.BOLD, 21));
		finish.setForeground(Color.WHITE);
		add(finish);
		
		// ���� ġ��
		int a = 190;			//190 (1100-(1000-lft))/2
		int b = 100;			//100 hgt+30
		int c = 620;			//620 900-lft(280)
		int d = 315;			//315 (800-hgt)/2-50
		
		//seatGuide ����
		seatGuide.setLayout(null);
		seatGuide.setBounds(a,b, c,d);  		//190, 100, 620, 315
		seatGuide.setBackground(Color.WHITE);
		add(seatGuide);
		
		//�¼��� �̹��� ����
		seatImgButton.setBounds(20, 10, 580, 290);
		seatImgButton.setBorderPainted(false);		//��ư �׵θ� ����
		seatImgButton.setFocusPainted(false);		//��ư ���콺 ���� �� �� ��ȭ ����
		seatGuide.add(seatImgButton);
		
		//seatGuide.add(seat);
		
		//ticketF ����
		ticketF.setLayout(null);
		ticketF.setBounds(a,b+d+20,c,d-50);			//190, 435, 620, 265
		ticketF.setBackground(Color.LIGHT_GRAY);
		ticketF.setBorder(new LineBorder(green, 5));
		add(ticketF);
		
		//Ƽ��(��, ��ư) ����
		// -��ȭ��: ticketInfo1
		// -�� �ð�, �ż�, �¼�: ticketInfo2
		// -�¼� ����: ticketInfo3_1, ticketInfo3_2, ticketInfo3_3
		//������ �̹���(��ư) poster
		
		//��ȭ�� ����, ������(�̹���) �� �󿵽ð� ����
		String time = "";
		ImageIcon pst = null;	
		if(n==1) {
			ticketInfo1.setText("�������� ���");
			time = "13:00 ~ 14:40";
			pst = new ImageIcon("images/�׸�1.jpg");
		}else if(n==2) {
			ticketInfo1.setText("������ ���");
			time = "14:50 ~ 16:00";
			pst = new ImageIcon("images/�׸�2.jpg");
		}else if(n==3) {
			ticketInfo1.setText("���Ӿ��� ��Ź��");
			time = "16:20 ~ 16:50";
			pst = new ImageIcon("images/�׸�3.jpg");
		}else if(n==4) {
			ticketInfo1.setText("���콺");
			time = "17:00 ~ 17:50";
			pst = new ImageIcon("images/�׸�4.jpg");
		}else if(n==5) {
			ticketInfo1.setText("���ۼҴ� 2");
			time = "18:00 ~ 19:40";
			pst = new ImageIcon("images/�׸�5.jpg");
		}
		
		ticketInfo1.setBounds(210,20,345,40);
		ticketInfo1.setFont(new Font("���� ���", Font.PLAIN, 22));
		ticketInfo1.setForeground(Color.BLACK);
		ticketF.add(ticketInfo1);
		
		
		// �ܺ���, ������ 0���� �� ���� ó��
		if(inner==0) {
			ticketInfo2.setText("<HTML> "+time+"<br>"
					+"<br>"
					+"�ܺ��� "+String.valueOf(outer)+"��  �� "+String.valueOf(inner+outer)+"��<br>"
					+"�¼�: ");
		}else if(outer==0){
			ticketInfo2.setText("<HTML> "+time+"<br>"
					+"<br>"
					+"������ "+String.valueOf(inner)+"��  �� "+String.valueOf(inner+outer)+"��<br>"
					+"�¼�: ");
		}else {
			ticketInfo2.setText("<HTML> "+time+"<br>"
					+"<br>"
					+"������ "+String.valueOf(inner)+"��, �ܺ��� "+String.valueOf(outer)+"��   (�� "+String.valueOf(inner+outer)+"��)<br>"
					+"�¼�: ");
		}
		ticketInfo2.setHorizontalAlignment(JLabel.LEFT);
		ticketInfo2.setBounds(210,55,345,170);
		ticketInfo2.setFont(new Font("���� ���", Font.PLAIN, 20));
		ticketInfo2.setVerticalAlignment(JLabel.TOP);
		ticketInfo2.setForeground(Color.BLACK);
		ticketF.add(ticketInfo2);	
		
		//stack�� �ݺ����� �̿��� �¼� ����
		
		String text1 = "";
		String text2 = "";
		String text3 = "";
		String text4 = "";
		
		for(int i=0;i<inner+outer;i++) {
			int k = i+1;
			if(k<11) {
				text1 += stack.pop();
				text1 += " ";
			}else if(k>10 && k<21) {
				text2 += stack.pop();
				text2 += " ";
			}else if(k>20 && k<31) {							
				text3 += stack.pop();
				text3 += " ";
			}else {
				text4 += stack.pop();
				text4 += " ";
			}
		}
		//10�� ����
		ticketInfo3_1.setText(text1);
		ticketInfo3_1.setBounds(260,138,345,170);
		ticketInfo3_1.setFont(new Font("���� ���", Font.PLAIN, 20));
		ticketInfo3_1.setVerticalAlignment(JLabel.TOP);
		ticketInfo3_1.setForeground(Color.BLACK);
		ticketF.add(ticketInfo3_1);	
		//11�� �̻� 20�� ����
		ticketInfo3_2.setText(text2);
		ticketInfo3_2.setBounds(260,170,345,170);
		ticketInfo3_2.setFont(new Font("���� ���", Font.PLAIN, 20));
		ticketInfo3_2.setVerticalAlignment(JLabel.TOP);
		ticketInfo3_2.setForeground(Color.BLACK);
		ticketF.add(ticketInfo3_2);	
		//21�� �̻� 30�� ����
		ticketInfo3_3.setText(text3);
		ticketInfo3_3.setBounds(260,200,345,170);
		ticketInfo3_3.setFont(new Font("���� ���", Font.PLAIN, 20));
		ticketInfo3_3.setVerticalAlignment(JLabel.TOP);
		ticketInfo3_3.setForeground(Color.BLACK);
		ticketF.add(ticketInfo3_3);	
		//31�� �̻�(32�� ����)
		ticketInfo3_4.setText(text4);
		ticketInfo3_4.setBounds(260,230,345,170);
		ticketInfo3_4.setFont(new Font("���� ���", Font.PLAIN, 20));
		ticketInfo3_4.setVerticalAlignment(JLabel.TOP);
		ticketInfo3_4.setForeground(Color.BLACK);
		ticketF.add(ticketInfo3_4);	
		
		yff.setText("��ȭ �����");
		yff.setBounds(5,3, 190, 100);
		yff.setVerticalAlignment(JLabel.TOP);
		yff.setHorizontalAlignment(JLabel.LEFT);
		yff.setFont(new Font("���� ���", Font.BOLD, 16));
		yff.setForeground(green);
		ticketF.add(yff);
		
		yff2.setText("2022 ������ȭ��");
		yff2.setBounds(480,230, 190, 100);
		yff2.setVerticalAlignment(JLabel.TOP);
		yff2.setHorizontalAlignment(JLabel.LEFT);
		yff2.setFont(new Font("���� ���", Font.BOLD, 16));
		yff2.setForeground(green);
		ticketF.add(yff2);
		
		JButton poster = new JButton(pst);
		poster.setBounds(6, 31, 190, 200);
		poster.setBorderPainted(false);
		poster.setFocusPainted(false);
		//poster.setEnabled(false);
		ticketF.add(poster);
	
		finish.addActionListener(new ActionListener() {
			
			@Override

               public void actionPerformed(ActionEvent e) {
				
				if(n==1) {
				s.setSave1(s.getSave1()+inner+outer);
				}
				if(n==2) {
					s.setSave2(s.getSave2()+inner+outer);
					}
				if(n==3) {
					s.setSave3(s.getSave3()+inner+outer);
					}
				if(n==4) {
					s.setSave4(s.getSave4()+inner+outer);
					}
				if(n==5) {
					s.setSave5(s.getSave5()+inner+outer);
					}
                   new Screen_1(s);
  
                   setVisible(false);
			}
		});
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ȭ��3 ����
		Screen_3 frame = new Screen_3();
		
	}
}	
