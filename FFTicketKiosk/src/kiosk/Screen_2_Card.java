package kiosk;

import java.awt.Color;

import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



import javax.swing.Icon;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FontUIResource;



public class Screen_2_Card extends JFrame {

	//�˾�
	//finish: �Ϸ� ��ư
	JButton finish = new JButton("Ȯ��");
	//popCard: �˾�â
	JPanel popCard = new JPanel();
	//popCardL: ����
	JLabel popCardL = new JLabel();
	
	int ticket_number=0;

	int ticket_number1=0;



	//[Ű����ũ��] ����

	JPanel title1 = new JPanel(); //(�г�): title1

	JLabel titleL1 = new JLabel("������ȭ�� Ƽ�� �Ǹ�");	//(��): titleL1

	

	//[�ȳ�����] ����

	JPanel title2 = new JPanel(); //(�г�): title2

	JLabel titleL2 = new JLabel("�ż��� ������ �� ���� ������ ������ �ּ���"); //(��): titleL2

 	

	JPanel movie_info = new JPanel();	

	JPanel info_box = new JPanel();

	JLabel info=new JLabel("<HTML>[�ȳ� ����] <br> "+

			"- ������: ���л�, ����, ���� ������ <br>"+

			" - �¼��� �ڵ� �����˴ϴ�.");

	int lft = 280;			//Ű����ũ��(�г�) ���� ����

	int rgt = 1100 - lft;	//�ȳ�����(�г�) ���� ���� (������ ���� ���� - Ű����ũ��(�г�) ���� ����)

	int hgt = 70;			//���� ����

	

	

	//[Ű����ũ ��ȣ] ����

	JPanel page = new JPanel();

	//���� �г�(pg1~3) ����				(components)

	JPanel pg1 = new JPanel();

	JPanel pg2 = new JPanel();

	JPanel pg3 = new JPanel();

	//pg1~3 ġ�� ����

	int pW = 30; int pH = 30;

	int pX = 0;

	int pP = pW+6;

	// ���� ��(pgL1~3) ����

	JLabel pgL1 = new JLabel("1");

	JLabel pgL2 = new JLabel("2");

	JLabel pgL3 = new JLabel("3");

	

	

	JLabel movie_title = new JLabel("<HTML>�������� ��� <br>" +

	"13:00 ~ 14:40");

	JLabel ticketnumber= new JLabel("0");

	JLabel ticketnumber1= new JLabel("0");

	JLabel inner =new JLabel("������ 5000��");

	JLabel outer = new JLabel("�ܺ���  6000��");

	JLabel total_price = new JLabel("�� �ݾ�");

	JLabel price = new JLabel("-");

	
	
	JButton back_button = new JButton("��������");

	

	JButton minus_button =new JButton("-");

	JButton plus_button =new JButton("+");

	

	JButton minus1_button =new JButton("-");

	JButton plus1_button =new JButton("+");

//	//������ ����
//	JFrame Screen_2_Card = new JFrame();

	//���� ��ư

	JButton card = new JButton("�ſ� ī��");

	JButton money = new JButton("����");	

	Screen_2_Card(){}
	
	Screen_2_Card(int n, int in, int out, Seat s, String t1, String t2, String t3, String t4){
		Seat a =s;
		setTitle("��ȭ�� Ƽ�� �Ǹ� Ű����ũ");


		Container c=getContentPane();


		//[���� ������ ǥ��] �г� ���� �� ����	(container)

		//(page �г� ���� pg1,2,3 �г� ���� ���� pgL1,2,3 �� �� �� 3�� ����(����, �г� 3��, �� 3��)		

		page.setBounds(1100-143,25,108,30);

		page.setLayout(null);

		page.setBackground(new Color(255,0,0,0));	//����

		add(page);

		//���� ����

		Color green = new Color(0x006633, false);		//�ʷ�

		Color yellow = new Color(0xFDDA2A, false);		//���

		//pg1~3 ����	

		pg1.setLayout(null);

		pg1.setBounds(0,0,pW,pH);

		pg2.setBounds(pX+pP,0,pW,pH);

		pg3.setBounds(pX+pP*2,0,pW,pH);

		

		pg2.setLayout(null);

		pg1.setBackground(Color.GRAY);

		pg2.setBackground(yellow);			//���� ������(yellow)

		pg3.setBackground(Color.GRAY);			

		

		pg3.setLayout(null);

		page.add(pg1);

		page.add(pg2);

		page.add(pg3);

		//pgL1~3 ����

		pgL1.setHorizontalAlignment(JLabel.CENTER);

		pgL1.setVerticalAlignment(JLabel.TOP);

		pgL1.setFont(new Font("���� ���", Font.BOLD, 20));

		pgL1.setForeground(Color.DARK_GRAY);

		pgL1.setSize(30,30);

		pg1.add(pgL1);

		

		pgL2.setHorizontalAlignment(JLabel.CENTER);

		pgL2.setVerticalAlignment(JLabel.TOP);

		pgL2.setFont(new Font("���� ���", Font.BOLD, 20));

		pgL2.setForeground(Color.black);			//���� ������(black)

		pgL2.setSize(30,30);

		pg2.add(pgL2);

		

		pgL3.setHorizontalAlignment(JLabel.CENTER);

		pgL3.setVerticalAlignment(JLabel.TOP);

		pgL3.setFont(new Font("���� ���", Font.BOLD, 20));

		pgL3.setForeground(Color.DARK_GRAY);

		pgL3.setSize(30,30);

		pg3.add(pgL3);

		

		//title1 ����

		c.setLayout(null);

		title1.setLayout(null);

		Color color1 = new Color(0x006633, false);//���� ����

		title1.setBounds(0,0,lft,hgt);

		title1.setBackground(color1);

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

		
		
		// �ڷΰ��� ��ư ����

		back_button.setBounds(40, 180, 130, 80);

		Color bColor = new Color(0x3333FF, false);				//��ư �� ����

		//back_button.setBackground(bColor);

		back_button.setFont(new Font("���� ���", Font.BOLD, 21));
		//�۾� ���� ������� ����(Screen_2������ �����ؾ� ��)	(�˾�)
		back_button.setForeground(Color.white);

		//�˾�
		back_button.setBackground(Color.DARK_GRAY);
		back_button.setEnabled(false);
		add(back_button);

		
		//��ư ����

		money.setBounds(650, 490, 130, 80);

		//money.setBackground(bColor);

		money.setFont(new Font("���� ���", Font.BOLD, 21));

		money.setForeground(Color.WHITE);
		//�˾�
		money.setBackground(Color.DARK_GRAY);
		money.setEnabled(false);
		add(money);

		

		//��ư card

		card.setBounds(500, 490, 130, 80);				

		//card.setBackground(bColor);

		card.setFont(new Font("���� ���", Font.BOLD, 21));

		card.setForeground(Color.WHITE);
		//�˾�
		card.setBackground(Color.DARK_GRAY);
		card.setEnabled(false);

		add(card);
		
		//�˾�
		//popCard �˾�â
		popCard.setLayout(null);
		popCard.setBounds(400, 220, 290, 230);
		Color pColor = new Color(0xFFFF99);
		popCard.setBackground(Color.white);
		//popCard.setBackground(yellow);
		popCard.setBorder(new LineBorder(bColor, 5));
		c.add(popCard);
		
		//popCardL ����
		popCardL.setHorizontalAlignment(JLabel.CENTER);
		popCardL.setText("<HTML>ī�带 �����ϼ���<br>"
				//					+"<br>"
									+ "������ �Ϸ�˴ϴ�");
		//popCardL.setText("ī�带 �����ϼ���");
		popCardL.setBounds(10, 30, 280, 100);
		popCardL.setFont(new Font("���� ���", Font.BOLD, 20));
		popCardL.setForeground(Color.black);
		popCard.add(popCardL);
		
		//�˾�
		//finish ����
		//finish.setBounds(580, 310, 120, 80);
		finish.setBounds(85, 140, 120, 60);
		finish.setBackground(bColor);
		finish.setFont(new Font("���� ���", Font.BOLD, 21));
		finish.setForeground(Color.WHITE);
		popCard.add(finish);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(1100,800);
		setLocationRelativeTo(null);	//�������� ȭ�� ����� ��
		setVisible(true);
		
		finish.addActionListener(new ActionListener() {
			
			@Override

                           public void actionPerformed(ActionEvent e) {

                           new Screen_3(n,in,out,a, t1, t2, t3, t4);
              
                           setVisible(false);
			}
		});
	

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		new Screen_2_Card(); 

	}


}
