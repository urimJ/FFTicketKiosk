package kiosk;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

//화면3 프레임
public class Screen_3 extends JFrame {

	Stack<String> stack=new Stack();

	Screen_3(){}

	//[키오스크명] 생성
	JPanel title1 = new JPanel();						//(패널): title1
	JLabel titleL1 = new JLabel("융프영화제 티켓 판매");	//(라벨): titleL1
	//[안내문구] 생성
	JPanel title2 = new JPanel();						//(패널): title2
	JLabel titleL2 = new JLabel("입장권이 발급되었습니다"); //(라벨): titleL2
	
	//[현재 페이지 표시] 패널 생성		(container)
	//(page 패널 위에 pg1,2,3 패널 위에 각각 pgL1,2,3 라벨 → 총 3중 구조(바탕, 패널 3개, 라벨 3개)
	JPanel page = new JPanel();
	
	//숫자 패널(pg1~4) 생성				(components)
	JPanel pg1 = new JPanel();
	JPanel pg2 = new JPanel();
	JPanel pg3 = new JPanel();
	
	// 숫자 라벨(pgL1~4) 생성
	JLabel pgL1 = new JLabel("1");
	JLabel pgL2 = new JLabel("2");
	JLabel pgL3 = new JLabel("3");
	
	//확인완료 버튼: finish
	JButton finish = new JButton("확인 완료");
	
	//[좌석 안내] 생성
	JPanel seatGuide = new JPanel();
	
	//좌석도 이미지
	ImageIcon seatImg = new ImageIcon("images/seat_hwazhil.jpg");
	JButton seatImgButton = new JButton(seatImg);
	
	//[티켓] 생성: ticketF 생성
	JPanel ticketF = new JPanel();
	
	//티켓(라벨)
	// -영화명: ticketInfo1
	// -상영 시간, 좌석 정보, 매수: ticketInfo2	
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
		
		//전체 프레임 설정
		setTitle("영화제 티켓 판매 키오스크");
		setSize(1100, 800); 	// 프레임 크기 1100*800
		//setResizable(false);	//프레임 크기 변경 못 하게 설정
		setLocationRelativeTo(null);	//프레임이 화면 가운데에 뜸
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 
							//프레임 종료 버튼 클릭 시 프레임 닫히고 프로그램 종료됨
		setVisible(true); 	// 프레임 출력
		
		//contentPane 생성 (배치관리자 없음)
		Container title = getContentPane();		
		title.setLayout(null);
		
		
		//좌석 배정
		Seat s = save;		// Seat 생성자 s
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
		//영화 별로 배정된 좌석 정보를 저장
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
		
		//[현재 페이지 표시] 패널 생성 및 설정
		page.setBounds(1100-143,25,108,30);
		page.setLayout(null);
		page.setBackground(new Color(255,0,0,0));	//투명
		add(page);

		//색상 지정
		Color green = new Color(0x006633, false);		//초록
		Color yellow = new Color(0xFDDA2A, false);		//노랑
		
		//pg1~4 치수 설정
		int pW = 30; int pH = 30;
		int pX = 0;
		int pP = pW+6;
		
		//pg1~4 설정	
		pg1.setLayout(null);
		pg1.setBounds(0,0,pW,pH);
		pg2.setBounds(pX+pP,0,pW,pH);
		pg3.setBounds(pX+pP*2,0,pW,pH);
		
		pg2.setLayout(null);
		pg1.setBackground(Color.GRAY);
		pg2.setBackground(Color.GRAY);
		pg3.setBackground(yellow);				//현재 페이지(yellow)
		
		pg3.setLayout(null);
		page.add(pg1);
		page.add(pg2);
		page.add(pg3);
		
		//pgL1~4 설정
		pgL1.setHorizontalAlignment(JLabel.CENTER);
		pgL1.setVerticalAlignment(JLabel.TOP);
		pgL1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		pgL1.setForeground(Color.DARK_GRAY);  
		pgL1.setSize(30,30);
		pg1.add(pgL1);
		
		pgL2.setHorizontalAlignment(JLabel.CENTER);
		pgL2.setVerticalAlignment(JLabel.TOP);
		pgL2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		pgL2.setForeground(Color.DARK_GRAY);
		pgL2.setSize(30,30);
		pg2.add(pgL2);
		
		pgL3.setHorizontalAlignment(JLabel.CENTER);
		pgL3.setVerticalAlignment(JLabel.TOP);
		pgL3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		pgL3.setForeground(Color.black);						//현재 페이지(Color.black)
		pgL3.setSize(30,30);
		pg3.add(pgL3);
		
		//타이틀 치수 설정
		int lft = 280;			//키오스크명(패널) 가로 길이
		int rgt = 1100 - lft;	//안내문구(패널) 가로 길이 (프레임 가로 길이 - 키오스크명(패널) 가로 길이)
		int hgt = 70;			//세로 길이
		
		//title1 설정
		title1.setLayout(null);
		title1.setBounds(0,0,lft,hgt);
		title1.setBackground(green);
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
		
		//finish 설정
		finish.setBounds(820, 615, 130, 80);				//800-185 = 615
		Color bColor = new Color(0x3333FF, false);				//버튼 색 지정
		finish.setBackground(bColor);
		finish.setFont(new Font("맑은 고딕", Font.BOLD, 21));
		finish.setForeground(Color.WHITE);
		add(finish);
		
		// 내용 치수
		int a = 190;			//190 (1100-(1000-lft))/2
		int b = 100;			//100 hgt+30
		int c = 620;			//620 900-lft(280)
		int d = 315;			//315 (800-hgt)/2-50
		
		//seatGuide 설정
		seatGuide.setLayout(null);
		seatGuide.setBounds(a,b, c,d);  		//190, 100, 620, 315
		seatGuide.setBackground(Color.WHITE);
		add(seatGuide);
		
		//좌석도 이미지 설정
		seatImgButton.setBounds(20, 10, 580, 290);
		seatImgButton.setBorderPainted(false);		//버튼 테두리 없앰
		seatImgButton.setFocusPainted(false);		//버튼 마우스 댔을 때 색 변화 없앰
		seatGuide.add(seatImgButton);
		
		//seatGuide.add(seat);
		
		//ticketF 설정
		ticketF.setLayout(null);
		ticketF.setBounds(a,b+d+20,c,d-50);			//190, 435, 620, 265
		ticketF.setBackground(Color.LIGHT_GRAY);
		ticketF.setBorder(new LineBorder(green, 5));
		add(ticketF);
		
		//티켓(라벨, 버튼) 설정
		// -영화명: ticketInfo1
		// -상영 시간, 매수, 좌석: ticketInfo2
		// -좌석 정보: ticketInfo3_1, ticketInfo3_2, ticketInfo3_3
		//포스터 이미지(버튼) poster
		
		//영화별 제목, 포스터(이미지) 및 상영시간 정보
		String time = "";
		ImageIcon pst = null;	
		if(n==1) {
			ticketInfo1.setText("덤블도어의 비밀");
			time = "13:00 ~ 14:40";
			pst = new ImageIcon("images/그림1.jpg");
		}else if(n==2) {
			ticketInfo1.setText("위대한 계약");
			time = "14:50 ~ 16:00";
			pst = new ImageIcon("images/그림2.jpg");
		}else if(n==3) {
			ticketInfo1.setText("말임씨를 부탁해");
			time = "16:20 ~ 16:50";
			pst = new ImageIcon("images/그림3.jpg");
		}else if(n==4) {
			ticketInfo1.setText("모비우스");
			time = "17:00 ~ 17:50";
			pst = new ImageIcon("images/그림4.jpg");
		}else if(n==5) {
			ticketInfo1.setText("슈퍼소닉 2");
			time = "18:00 ~ 19:40";
			pst = new ImageIcon("images/그림5.jpg");
		}
		
		ticketInfo1.setBounds(210,20,345,40);
		ticketInfo1.setFont(new Font("맑은 고딕", Font.PLAIN, 22));
		ticketInfo1.setForeground(Color.BLACK);
		ticketF.add(ticketInfo1);
		
		
		// 외부인, 내부인 0명일 때 예외 처리
		if(inner==0) {
			ticketInfo2.setText("<HTML> "+time+"<br>"
					+"<br>"
					+"외부인 "+String.valueOf(outer)+"명  총 "+String.valueOf(inner+outer)+"매<br>"
					+"좌석: ");
		}else if(outer==0){
			ticketInfo2.setText("<HTML> "+time+"<br>"
					+"<br>"
					+"내부인 "+String.valueOf(inner)+"명  총 "+String.valueOf(inner+outer)+"매<br>"
					+"좌석: ");
		}else {
			ticketInfo2.setText("<HTML> "+time+"<br>"
					+"<br>"
					+"내부인 "+String.valueOf(inner)+"명, 외부인 "+String.valueOf(outer)+"명   (총 "+String.valueOf(inner+outer)+"매)<br>"
					+"좌석: ");
		}
		ticketInfo2.setHorizontalAlignment(JLabel.LEFT);
		ticketInfo2.setBounds(210,55,345,170);
		ticketInfo2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		ticketInfo2.setVerticalAlignment(JLabel.TOP);
		ticketInfo2.setForeground(Color.BLACK);
		ticketF.add(ticketInfo2);	
		
		//stack과 반복문을 이용한 좌석 배정
		
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
		//10매 이하
		ticketInfo3_1.setText(text1);
		ticketInfo3_1.setBounds(260,138,345,170);
		ticketInfo3_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		ticketInfo3_1.setVerticalAlignment(JLabel.TOP);
		ticketInfo3_1.setForeground(Color.BLACK);
		ticketF.add(ticketInfo3_1);	
		//11매 이상 20매 이하
		ticketInfo3_2.setText(text2);
		ticketInfo3_2.setBounds(260,170,345,170);
		ticketInfo3_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		ticketInfo3_2.setVerticalAlignment(JLabel.TOP);
		ticketInfo3_2.setForeground(Color.BLACK);
		ticketF.add(ticketInfo3_2);	
		//21매 이상 30매 이하
		ticketInfo3_3.setText(text3);
		ticketInfo3_3.setBounds(260,200,345,170);
		ticketInfo3_3.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		ticketInfo3_3.setVerticalAlignment(JLabel.TOP);
		ticketInfo3_3.setForeground(Color.BLACK);
		ticketF.add(ticketInfo3_3);	
		//31매 이상(32매 이하)
		ticketInfo3_4.setText(text4);
		ticketInfo3_4.setBounds(260,230,345,170);
		ticketInfo3_4.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		ticketInfo3_4.setVerticalAlignment(JLabel.TOP);
		ticketInfo3_4.setForeground(Color.BLACK);
		ticketF.add(ticketInfo3_4);	
		
		yff.setText("영화 입장권");
		yff.setBounds(5,3, 190, 100);
		yff.setVerticalAlignment(JLabel.TOP);
		yff.setHorizontalAlignment(JLabel.LEFT);
		yff.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		yff.setForeground(green);
		ticketF.add(yff);
		
		yff2.setText("2022 융프영화제");
		yff2.setBounds(480,230, 190, 100);
		yff2.setVerticalAlignment(JLabel.TOP);
		yff2.setHorizontalAlignment(JLabel.LEFT);
		yff2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
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
		//화면3 생성
		Screen_3 frame = new Screen_3();
		
	}
}	
