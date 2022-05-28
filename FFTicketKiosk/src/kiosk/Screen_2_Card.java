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

	//팝업
	//finish: 완료 버튼
	JButton finish = new JButton("확인");
	//popCard: 팝업창
	JPanel popCard = new JPanel();
	//popCardL: 문구
	JLabel popCardL = new JLabel();
	
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

//	//프레임 생성
//	JFrame Screen_2_Card = new JFrame();

	//결제 버튼

	JButton card = new JButton("신용 카드");

	JButton money = new JButton("현금");	

	Screen_2_Card(){}
	
	Screen_2_Card(int n, int in, int out, Seat s, String t1, String t2, String t3, String t4){
		Seat a =s;
		setTitle("영화제 티켓 판매 키오스크");


		Container c=getContentPane();


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

		//back_button.setBackground(bColor);

		back_button.setFont(new Font("맑은 고딕", Font.BOLD, 21));
		//글씨 색깔 흰색으로 수정(Screen_2에서도 수정해야 함)	(팝업)
		back_button.setForeground(Color.white);

		//팝업
		back_button.setBackground(Color.DARK_GRAY);
		back_button.setEnabled(false);
		add(back_button);

		
		//버튼 현금

		money.setBounds(650, 490, 130, 80);

		//money.setBackground(bColor);

		money.setFont(new Font("맑은 고딕", Font.BOLD, 21));

		money.setForeground(Color.WHITE);
		//팝업
		money.setBackground(Color.DARK_GRAY);
		money.setEnabled(false);
		add(money);

		

		//버튼 card

		card.setBounds(500, 490, 130, 80);				

		//card.setBackground(bColor);

		card.setFont(new Font("맑은 고딕", Font.BOLD, 21));

		card.setForeground(Color.WHITE);
		//팝업
		card.setBackground(Color.DARK_GRAY);
		card.setEnabled(false);

		add(card);
		
		//팝업
		//popCard 팝업창
		popCard.setLayout(null);
		popCard.setBounds(400, 220, 290, 230);
		Color pColor = new Color(0xFFFF99);
		popCard.setBackground(Color.white);
		//popCard.setBackground(yellow);
		popCard.setBorder(new LineBorder(bColor, 5));
		c.add(popCard);
		
		//popCardL 문구
		popCardL.setHorizontalAlignment(JLabel.CENTER);
		popCardL.setText("<HTML>카드를 투입하세요<br>"
				//					+"<br>"
									+ "결제가 완료됩니다");
		//popCardL.setText("카드를 투입하세요");
		popCardL.setBounds(10, 30, 280, 100);
		popCardL.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		popCardL.setForeground(Color.black);
		popCard.add(popCardL);
		
		//팝업
		//finish 설정
		//finish.setBounds(580, 310, 120, 80);
		finish.setBounds(85, 140, 120, 60);
		finish.setBackground(bColor);
		finish.setFont(new Font("맑은 고딕", Font.BOLD, 21));
		finish.setForeground(Color.WHITE);
		popCard.add(finish);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(1100,800);
		setLocationRelativeTo(null);	//프레임이 화면 가운데에 뜸
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
