package kiosk;

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




public class Screen_2 extends JFrame {
	
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

	//������ ����
	JFrame Screen_2 = new JFrame();

	//���� ��ư

	JButton card = new JButton("�ſ� ī��");

	JButton money = new JButton("����");	

	Screen_2(){
		
	}
	
	//��ȭ���� ������, ��ȭ�� ���� �Ѱ� �ޱ�
	Screen_2(int n, Seat a){
		
		Seat s = a;
		if(n==1) {

			ImageIcon movieImg = new ImageIcon("images/�׸�1.jpg");
			JButton movieImgButton = new JButton(movieImg);
			movieImgButton.setBounds(0, 0, 300, 300);
			movieImgButton.setBorderPainted(false);
			movieImgButton.setFocusPainted(false);
			movie_info.add(movieImgButton);
			movie_title.setText("<HTML>�������� ���<br>13:00 ~ 14:40 </HTML>");
			
		} else if(n==2) {
			
			ImageIcon movieImg = new ImageIcon("images/�׸�2.jpg");
			JButton movieImgButton = new JButton(movieImg);
			movieImgButton.setBounds(0, 0, 300, 300);
			movieImgButton.setBorderPainted(false);
			movieImgButton.setFocusPainted(false);
			movie_info.add(movieImgButton);
			movie_title.setText("<HTML>������ ���<br>14:50 ~ 16:00 </HTML>");
			
		} else if(n==3) {
			
			ImageIcon movieImg = new ImageIcon("images/�׸�3.jpg");
			JButton movieImgButton = new JButton(movieImg);
			movieImgButton.setBounds(0, 0, 300, 300);
			movieImgButton.setBorderPainted(false);
			movieImgButton.setFocusPainted(false);
			movie_info.add(movieImgButton);
			movie_title.setText("<HTML>���Ӿ��� ��Ź��<br>16:20 ~ 16:50 </HTML>");
			
		} else if(n==4) {
			movie_title.setText("<HTML>���콺<br>17:00 ~ 17:50 </HTML>");
			ImageIcon movieImg = new ImageIcon("images/�׸�4.jpg");
			JButton movieImgButton = new JButton(movieImg);
			movieImgButton.setBounds(0, 0, 300, 300);
			movieImgButton.setBorderPainted(false);
			movieImgButton.setFocusPainted(false);
			movie_info.add(movieImgButton);
			
		} else {
			movie_title.setText("<HTML>���ۼҴ� 2<br>18:00 ~ 19:40 </HTML>");
			ImageIcon movieImg = new ImageIcon("images/�׸�5.jpg");
			JButton movieImgButton = new JButton(movieImg);
			movieImgButton.setBounds(0, 0, 300, 300);
			movieImgButton.setBorderPainted(false);
			movieImgButton.setFocusPainted(false);
			movie_info.add(movieImgButton);
		}

		setTitle("��ȭ�� Ƽ�� �Ǹ� Ű����ũ");
		
		Container c=getContentPane();

		//c.addMouseListener(new myMouseListener());

		

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

		back_button.setBackground(bColor);

		back_button.setFont(new Font("���� ���", Font.BOLD, 21));

		back_button.setForeground(Color.white);

		add(back_button);

		

		//movie_info ����

		movie_info.setLayout(null);

		movie_info.setLocation(180,180 );

		movie_info.setSize(300, 270);

		movie_info.setBackground(Color.white);

		c.add(movie_info);

		//movie_info.add(movie_image);

		

		//movie_title ����

		movie_title.setHorizontalAlignment(JLabel.CENTER);

		movie_title.setSize(1160, 450);

		movie_title.setFont(new Font("���� ���", Font.PLAIN, 20));

		movie_title.setForeground(Color.black);

		//title.add(title_l);

		c.add(movie_title);

		

		//info_box ����

		info_box.setLayout(null);

		info_box.setLocation(180,480 );

		info_box.setSize(300, 100);

		info_box.setBackground(Color.white);

		//title2.setVisible(true);

		add(info_box);		

		

		//info ����

		info.setHorizontalAlignment(JLabel.CENTER);

		info.setSize(250, 100);

		info.setFont(new Font("���� ���", Font.PLAIN, 15));

		info.setForeground(Color.black);

		//title.add(title_l);

		info_box.add(info);

		

		//������ ��ư ����

		plus_button.setLocation(740, 270);

		plus_button.setSize(50,50);

		c.add(plus_button);

		plus_button.addActionListener(new inner_MyActionListener());

		

		minus_button.setLocation(640, 270);

		minus_button.setSize(50, 50);

		c.add(minus_button);

		minus_button.addActionListener(new inner_MyActionListener());

		

		ticketnumber.setLocation(710, 240);

		ticketnumber.setSize(100,100);

		c.add(ticketnumber);

		

		inner.setLocation(520, 240);

		inner.setSize(130,100);

		inner.setFont(new Font("���� ���", Font.BOLD, 16));

		c.add(inner);

		

		//�ܺ��� ��ư ����

		c.setLayout(null);

		

		plus1_button.setLocation(740, 340);

		plus1_button.setSize(50,50);

		c.add(plus1_button);

		plus1_button.addActionListener(new outer_MyActionListener());

		

		minus1_button.setLocation(640, 340);

		minus1_button.setSize(50, 50);

		c.add(minus1_button);

		minus1_button.addActionListener(new outer_MyActionListener());

		

		ticketnumber1.setLocation(710, 310);

		ticketnumber1.setSize(100,100);

		c.add(ticketnumber1);

		

		outer.setLocation(520, 310);

		outer.setSize(130,100);

		outer.setFont(new Font("���� ���", Font.BOLD, 16));

		c.add(outer);

		

		// �� �ݾ�

		total_price.setLocation(520,380);

		total_price.setSize(100,100);

		total_price.setFont(new Font("���� ���", Font.BOLD, 21));

		c.add(total_price);

		

		price.setLocation(610,380);

		price.setSize(100,100);

		price.setFont(new Font("���� ���", Font.BOLD, 26));

		c.add(price);



		//��ư ����

		money.setBounds(650, 490, 130, 80);

		money.setBackground(bColor);

		money.setFont(new Font("���� ���", Font.BOLD, 21));

		money.setForeground(Color.WHITE);

		add(money);
		
		//�˾�
		//Screen_2_Money�� â ��ȯ
		money.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Screen_2_Money(n, ticket_number,ticket_number1, s);
				setVisible(false);
			}
		});

		

		//��ư card

		card.setBounds(500, 490, 130, 80);				

		card.setBackground(bColor);

		card.setFont(new Font("���� ���", Font.BOLD, 21));

		card.setForeground(Color.WHITE);

		add(card);
		
		//�˾�
		//Screen_2_Card�� â ��ȯ
		card.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Screen_2_Card(n, ticket_number,ticket_number1, s);
				setVisible(false);
			}
		});
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(1100,800);
		setLocationRelativeTo(null);	//�������� ȭ�� ����� ��
		setVisible(true);

		
		
		back_button.addActionListener(new ActionListener() {
			
			@Override
	
	                       public void actionPerformed(ActionEvent e) {
				
	                           new Screen_1(s);
	          
	                           setVisible(false);
			}
		});	
	}



	class inner_MyActionListener implements ActionListener{

		

		@Override

		public void actionPerformed(ActionEvent e) {

			// TODO Auto-generated method stub

			plus_button=(JButton)(e.getSource());

			minus_button=(JButton)(e.getSource());

			

			if(plus_button.getText().equals("+")) {

				ticket_number=ticket_number+1;

				ticketnumber.setText(String.valueOf(ticket_number));

				price.setText(String.valueOf(ticket_number*5000+ticket_number1*6000));

			}

			if(minus_button.getText().equals("-")) {

				if(ticket_number!=0) {

					ticket_number=ticket_number-1;

					ticketnumber.setText(String.valueOf(ticket_number));

					price.setText(String.valueOf(ticket_number*5000+ticket_number1*6000));

				}

			}

		}

	}

	class outer_MyActionListener implements ActionListener{



		@Override

		public void actionPerformed(ActionEvent e) {

			// TODO Auto-generated method stub

			plus1_button=(JButton)(e.getSource());

			minus1_button=(JButton)(e.getSource());

			if(plus1_button.getText().equals("+")) {

				ticket_number1=ticket_number1+1;

				ticketnumber1.setText(String.valueOf(ticket_number1));

				price.setText(String.valueOf(ticket_number*5000+ticket_number1*6000));

			}

			if(minus1_button.getText().equals("-")) {

				if(ticket_number1 != 0) {

					ticket_number1=ticket_number1-1;

					ticketnumber1.setText(String.valueOf(ticket_number1));

					price.setText(String.valueOf(ticket_number*5000+ticket_number1*6000));

				}

			}

		}

	}
	
	
	
	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		new Screen_2(); 

	}


}
