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



	//[키오스크명] 생성

	JPanel title1 = new JPanel(); //(패널): title1

	JLabel titleL1 = new JLabel("융프영화제 티켓 판매");	//(라벨): titleL1

	

	//[안내문구] 생성

	JPanel title2 = new JPanel(); //(패널): title2

	JLabel titleL2 = new JLabel("매수를 선택한 후 결제 수단을 선택해 주세요"); //(라벨): titleL2

 	

	JPanel movie_info = new JPanel();	

	JPanel info_box = new JPanel();

	JLabel info=new JLabel("<HTML>[안내 사항] <br> "+

			"- 내부인: 재학생, 교수, 교내 종사자 <br>"+

			" - 좌석은 자동 배정됩니다.");

	int lft = 280;			//키오스크명(패널) 가로 길이

	int rgt = 1100 - lft;	//안내문구(패널) 가로 길이 (프레임 가로 길이 - 키오스크명(패널) 가로 길이)

	int hgt = 70;			//세로 길이

	

	

	//[키오스크 번호] 생성

	JPanel page = new JPanel();

	//숫자 패널(pg1~3) 생성				(components)

	JPanel pg1 = new JPanel();

	JPanel pg2 = new JPanel();

	JPanel pg3 = new JPanel();

	//pg1~3 치수 설정

	int pW = 30; int pH = 30;

	int pX = 0;

	int pP = pW+6;

	// 숫자 라벨(pgL1~3) 생성

	JLabel pgL1 = new JLabel("1");

	JLabel pgL2 = new JLabel("2");

	JLabel pgL3 = new JLabel("3");

	

	

	JLabel movie_title = new JLabel("<HTML>덤블도어의 비밀 <br>" +

	"13:00 ~ 14:40");

	JLabel ticketnumber= new JLabel("0");

	JLabel ticketnumber1= new JLabel("0");

	JLabel inner =new JLabel("내부인 5000원");

	JLabel outer = new JLabel("외부인  6000원");

	JLabel total_price = new JLabel("총 금액");

	JLabel price = new JLabel("-");

	

	JButton back_button = new JButton("이전으로");

	

	JButton minus_button =new JButton("-");

	JButton plus_button =new JButton("+");

	

	JButton minus1_button =new JButton("-");

	JButton plus1_button =new JButton("+");

	//프레임 생성
	JFrame Screen_2 = new JFrame();

	//결제 버튼

	JButton card = new JButton("신용 카드");

	JButton money = new JButton("현금");	

	Screen_2(){
		
	}
	
	//영화별로 포스터, 영화명 정보 넘겨 받기
	Screen_2(int n, Seat a){
		
		Seat s = a;
		if(n==1) {

			ImageIcon movieImg = new ImageIcon("images/그림1.jpg");
			JButton movieImgButton = new JButton(movieImg);
			movieImgButton.setBounds(0, 0, 300, 300);
			movieImgButton.setBorderPainted(false);
			movieImgButton.setFocusPainted(false);
			movie_info.add(movieImgButton);
			movie_title.setText("<HTML>덤블도어의 비밀<br>13:00 ~ 14:40 </HTML>");
			
		} else if(n==2) {
			
			ImageIcon movieImg = new ImageIcon("images/그림2.jpg");
			JButton movieImgButton = new JButton(movieImg);
			movieImgButton.setBounds(0, 0, 300, 300);
			movieImgButton.setBorderPainted(false);
			movieImgButton.setFocusPainted(false);
			movie_info.add(movieImgButton);
			movie_title.setText("<HTML>위대한 계약<br>14:50 ~ 16:00 </HTML>");
			
		} else if(n==3) {
			
			ImageIcon movieImg = new ImageIcon("images/그림3.jpg");
			JButton movieImgButton = new JButton(movieImg);
			movieImgButton.setBounds(0, 0, 300, 300);
			movieImgButton.setBorderPainted(false);
			movieImgButton.setFocusPainted(false);
			movie_info.add(movieImgButton);
			movie_title.setText("<HTML>말임씨를 부탁해<br>16:20 ~ 16:50 </HTML>");
			
		} else if(n==4) {
			movie_title.setText("<HTML>모비우스<br>17:00 ~ 17:50 </HTML>");
			ImageIcon movieImg = new ImageIcon("images/그림4.jpg");
			JButton movieImgButton = new JButton(movieImg);
			movieImgButton.setBounds(0, 0, 300, 300);
			movieImgButton.setBorderPainted(false);
			movieImgButton.setFocusPainted(false);
			movie_info.add(movieImgButton);
			
		} else {
			movie_title.setText("<HTML>수퍼소닉 2<br>18:00 ~ 19:40 </HTML>");
			ImageIcon movieImg = new ImageIcon("images/그림5.jpg");
			JButton movieImgButton = new JButton(movieImg);
			movieImgButton.setBounds(0, 0, 300, 300);
			movieImgButton.setBorderPainted(false);
			movieImgButton.setFocusPainted(false);
			movie_info.add(movieImgButton);
		}

		setTitle("영화제 티켓 판매 키오스크");
		
		Container c=getContentPane();

		//c.addMouseListener(new myMouseListener());

		

		//[현재 페이지 표시] 패널 생성 및 설정	(container)

		//(page 패널 위에 pg1,2,3 패널 위에 각각 pgL1,2,3 라벨 → 총 3중 구조(바탕, 패널 3개, 라벨 3개)		

		page.setBounds(1100-143,25,108,30);

		page.setLayout(null);

		page.setBackground(new Color(255,0,0,0));	//투명

		add(page);

		//색상 지정

		Color green = new Color(0x006633, false);		//초록

		Color yellow = new Color(0xFDDA2A, false);		//노랑

		//pg1~3 설정	

		pg1.setLayout(null);

		pg1.setBounds(0,0,pW,pH);

		pg2.setBounds(pX+pP,0,pW,pH);

		pg3.setBounds(pX+pP*2,0,pW,pH);

		

		pg2.setLayout(null);

		pg1.setBackground(Color.GRAY);

		pg2.setBackground(yellow);			//현재 페이지(yellow)

		pg3.setBackground(Color.GRAY);			

		

		pg3.setLayout(null);

		page.add(pg1);

		page.add(pg2);

		page.add(pg3);

		//pgL1~3 설정

		pgL1.setHorizontalAlignment(JLabel.CENTER);

		pgL1.setVerticalAlignment(JLabel.TOP);

		pgL1.setFont(new Font("맑은 고딕", Font.BOLD, 20));

		pgL1.setForeground(Color.DARK_GRAY);

		pgL1.setSize(30,30);

		pg1.add(pgL1);

		

		pgL2.setHorizontalAlignment(JLabel.CENTER);

		pgL2.setVerticalAlignment(JLabel.TOP);

		pgL2.setFont(new Font("맑은 고딕", Font.BOLD, 20));

		pgL2.setForeground(Color.black);			//현재 페이지(black)

		pgL2.setSize(30,30);

		pg2.add(pgL2);

		

		pgL3.setHorizontalAlignment(JLabel.CENTER);

		pgL3.setVerticalAlignment(JLabel.TOP);

		pgL3.setFont(new Font("맑은 고딕", Font.BOLD, 20));

		pgL3.setForeground(Color.DARK_GRAY);

		pgL3.setSize(30,30);

		pg3.add(pgL3);

		

		//title1 설정

		c.setLayout(null);

		title1.setLayout(null);

		Color color1 = new Color(0x006633, false);//배경색 지정

		title1.setBounds(0,0,lft,hgt);

		title1.setBackground(color1);

		//title1.setVisible(true);

		add(title1);

		

		//title2 설정

		title2.setLayout(null);

		title2.setLocation(lft, 0);

		title2.setSize(rgt, hgt);

		title2.setBackground(Color.DARK_GRAY);

		//title2.setVisible(true);

		add(title2);		

		

		//titleL1 설정

		titleL1.setHorizontalAlignment(JLabel.CENTER);

		titleL1.setSize(lft, hgt);

		titleL1.setFont(new Font("맑은 고딕", Font.PLAIN, 25));

		titleL1.setForeground(Color.WHITE);

		//title.add(title_l);

		title1.add(titleL1);

		

		//titleL2 설정

		titleL2.setHorizontalAlignment(JLabel.LEFT);

		titleL2.setBounds(20,0,rgt, hgt);

		titleL2.setFont(new Font("맑은 고딕", Font.BOLD, 26));

		titleL2.setForeground(Color.WHITE);

		//titleR.add(titleL2);

		title2.add(titleL2);

		

		// 뒤로가기 버튼 설정

		back_button.setBounds(40, 180, 130, 80);

		Color bColor = new Color(0x3333FF, false);				//버튼 색 지정

		back_button.setBackground(bColor);

		back_button.setFont(new Font("맑은 고딕", Font.BOLD, 21));

		back_button.setForeground(Color.white);

		add(back_button);

		

		//movie_info 설정

		movie_info.setLayout(null);

		movie_info.setLocation(180,180 );

		movie_info.setSize(300, 270);

		movie_info.setBackground(Color.white);

		c.add(movie_info);

		//movie_info.add(movie_image);

		

		//movie_title 설정

		movie_title.setHorizontalAlignment(JLabel.CENTER);

		movie_title.setSize(1160, 450);

		movie_title.setFont(new Font("맑은 고딕", Font.PLAIN, 20));

		movie_title.setForeground(Color.black);

		//title.add(title_l);

		c.add(movie_title);

		

		//info_box 설정

		info_box.setLayout(null);

		info_box.setLocation(180,480 );

		info_box.setSize(300, 100);

		info_box.setBackground(Color.white);

		//title2.setVisible(true);

		add(info_box);		

		

		//info 설정

		info.setHorizontalAlignment(JLabel.CENTER);

		info.setSize(250, 100);

		info.setFont(new Font("맑은 고딕", Font.PLAIN, 15));

		info.setForeground(Color.black);

		//title.add(title_l);

		info_box.add(info);

		

		//내부인 버튼 생성

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

		inner.setFont(new Font("맑은 고딕", Font.BOLD, 16));

		c.add(inner);

		

		//외부인 버튼 생성

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

		outer.setFont(new Font("맑은 고딕", Font.BOLD, 16));

		c.add(outer);

		

		// 총 금액

		total_price.setLocation(520,380);

		total_price.setSize(100,100);

		total_price.setFont(new Font("맑은 고딕", Font.BOLD, 21));

		c.add(total_price);

		

		price.setLocation(610,380);

		price.setSize(100,100);

		price.setFont(new Font("맑은 고딕", Font.BOLD, 26));

		c.add(price);



		//버튼 현금

		money.setBounds(650, 490, 130, 80);

		money.setBackground(bColor);

		money.setFont(new Font("맑은 고딕", Font.BOLD, 21));

		money.setForeground(Color.WHITE);

		add(money);
		
		//팝업
		//Screen_2_Money로 창 전환
		money.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Screen_2_Money(n, ticket_number,ticket_number1, s);
				setVisible(false);
			}
		});

		

		//버튼 card

		card.setBounds(500, 490, 130, 80);				

		card.setBackground(bColor);

		card.setFont(new Font("맑은 고딕", Font.BOLD, 21));

		card.setForeground(Color.WHITE);

		add(card);
		
		//팝업
		//Screen_2_Card로 창 전환
		card.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Screen_2_Card(n, ticket_number,ticket_number1, s);
				setVisible(false);
			}
		});
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(1100,800);
		setLocationRelativeTo(null);	//프레임이 화면 가운데에 뜸
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
