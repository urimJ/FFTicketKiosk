package kiosk;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Screen_1 extends JFrame {

   private String string;
   
   //버튼 변수 선언
   JButton btn_img_1;
   JButton btn_img_2;
   JButton btn_img_3;
   JButton btn_img_4;
   JButton btn_img_5;

   
   //버튼 이미지

   ImageIcon img = new ImageIcon("images/그림1.jpg");
   ImageIcon img2 = new ImageIcon("images/그림2.jpg");
   ImageIcon img3 = new ImageIcon("images/그림3.jpg");
   ImageIcon img4 = new ImageIcon("images/그림4.jpg");
   ImageIcon img5 = new ImageIcon("images/그림5.jpg");

 

   String dum = "<HTML>덤블도어의 비밀<br>13:00 ~ 14:40 </HTML>";
   String great = "<HTML>위대한 계약<br>14:50 ~ 16:00 </HTML>";
   String mal = "<HTML>말임씨를 부탁해<br>16:20 ~ 16:50 </HTML>";
   String mobius = "<HTML>모비우스<br>17:00 ~ 17:50 </HTML>";
   String sonic = "<HTML>수퍼소닉 2<br>18:00 ~ 19:40 </HTML>";
    
   public Screen_1(Seat c) {
	  
	  Seat save1 = c;
	   
      setTitle("영화제 티켓 판매 키오스크");
      setSize(1100,800);    // 프레임 크기 1100*800
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //프레임 종료 버튼 클릭 시 프레임 닫히고 프로그램 종료됨
      setLocationRelativeTo(null);	//프레임이 화면 가운데에 뜸
      setVisible(true);    // 프레임 출력


      //contentPane 생성 (배치관리자 없음)

      Container title = getContentPane();      
      title.setLayout(null);

      

      //[키오스크명] 생성

      JPanel title1 = new JPanel();                  //(패널): title1
      JLabel titleL1 = new JLabel("융프영화제 티켓 판매");   //(라벨): titleL1

      //[안내문구] 생성

      JPanel title2 = new JPanel();                  //(패널): title2
      JLabel titleL2 = new JLabel("관람하실 영화를 선택하세요"); //(라벨): titleL2
      JPanel movie1 = new JPanel(); //판넬 생성
      //JPanel moviePanel = new Movie();
      //JPanel moviePanel = new Movie(); //MoviePanel 생성
      //[현재 페이지 표시] 패널 생성 및 설정   (container)
      //(page 패널 위에 pg1,2,3 패널 위에 각각 pgL1,2,3 라벨 → 총 3중 구조(바탕, 패널 3개, 라벨 3개)

      JPanel page = new JPanel();

      page.setBounds(1100-143,25,108,30);
      page.setLayout(null);
      page.setBackground(new Color(255,0,0,0));   //투명
      add(page);

 

      //색상 지정

      Color green = new Color(0x006633, false);      //초록
      Color yellow = new Color(0xFDDA2A, false);      //노랑

      

      //숫자 패널(pg1~3) 생성            (components)

      JPanel pg1 = new JPanel();
      JPanel pg2 = new JPanel();
      JPanel pg3 = new JPanel();

      

      //pg1~3 치수 설정

      int pW = 30; int pH = 30;
      int pX = 0;
      int pP = pW+6;


      //pg1~3 설정   

      pg1.setLayout(null);
      pg1.setBounds(0,0,pW,pH);
      pg2.setBounds(pX+pP,0,pW,pH);
      pg3.setBounds(pX+pP*2,0,pW,pH);

      

      pg2.setLayout(null);
      pg1.setBackground(yellow);         //현재 페이지(yellow)
      pg2.setBackground(Color.GRAY);         
      pg3.setBackground(Color.GRAY);         

      

      pg3.setLayout(null);
      page.add(pg1);
      page.add(pg2);
      page.add(pg3);

      

      // 숫자 라벨(pgL1~3) 생성

      JLabel pgL1 = new JLabel("1");
      JLabel pgL2 = new JLabel("2");
      JLabel pgL3 = new JLabel("3");

      

      //pgL1~3 설정

      pgL1.setHorizontalAlignment(JLabel.CENTER);
      pgL1.setVerticalAlignment(JLabel.TOP);
      pgL1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
      pgL1.setForeground(Color.black);         //현재 페이지(black)
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
      pgL3.setForeground(Color.DARK_GRAY);
      pgL3.setSize(30,30);
      pg3.add(pgL3);

            

      //타이틀 치수 설정

      int lft = 280;         //키오스크명(패널) 가로 길이
      int rgt = 1100 - lft;   //안내문구(패널) 가로 길이 (프레임 가로 길이 - 키오스크명(패널) 가로 길이)
      int hgt = 70;         //세로 길이

      

      //title1 설정

      title1.setLayout(null);
      Color color1 = new Color(0x006633, false);      //배경색 지정
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

      

      //movie 설정

      movie1.setLayout(null);
      movie1.setBounds(0,85,lft,730);
      movie1.setSize(1100,690);

      //movie1.setBackground(color1);

      movie1.setForeground(Color.WHITE);
      add(movie1);

      //movie1.setSize(800-70);

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


      //영화 이미지 레이아웃 설정
      GridLayout grid = new GridLayout(2,3);
      grid.setVgap(30);
      movie1.setLayout(grid);


      //이미지 사이즈 설정
      btn_img_1 = new JButton(img);
      btn_img_1.setPreferredSize(new Dimension(100,100));
      btn_img_2 = new JButton(img2);
      btn_img_2.setPreferredSize(new Dimension(100,100));
        
      btn_img_3 = new JButton(img3);
      btn_img_3.setPreferredSize(new Dimension(100,100));
      btn_img_4 = new JButton(img4);
      btn_img_4.setPreferredSize(new Dimension(100,100));
      btn_img_5 = new JButton(img5);
      btn_img_5.setPreferredSize(new Dimension(100,100));

 
      movie1.add(btn_img_1);
      movie1.add(btn_img_2);
      movie1.add(btn_img_3);
      movie1.add(btn_img_4);
      movie1.add(btn_img_5);
      add(movie1);

      setVisible(true);

        //이미지 문구
      btn_img_1.setText(dum);
      btn_img_2.setText(great);
      btn_img_3.setText(mal);
      btn_img_4.setText(mobius);
      btn_img_5.setText(sonic);

        

        //버튼 텍스트 폰트, 텍스트 크기

      btn_img_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      btn_img_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      btn_img_3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      btn_img_4.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      btn_img_5.setFont(new Font("맑은 고딕", Font.BOLD, 15));

      btn_img_1.setVerticalTextPosition(JButton.BOTTOM);
      btn_img_2.setVerticalTextPosition(JButton.BOTTOM);
      btn_img_3.setVerticalTextPosition(JButton.BOTTOM);
      btn_img_4.setVerticalTextPosition(JButton.BOTTOM);
      btn_img_5.setVerticalTextPosition(JButton.BOTTOM);
      
      //버튼 색깔 오류 방지
      btn_img_1.setBackground(null);
      btn_img_2.setBackground(null);
      btn_img_3.setBackground(null);
      btn_img_4.setBackground(null);
      btn_img_5.setBackground(null);

      //버튼 글씨 색깔 오류 방지
      btn_img_1.setForeground(Color.black);
      btn_img_2.setForeground(Color.black);
      btn_img_3.setForeground(Color.black);
      btn_img_4.setForeground(Color.black);
      btn_img_5.setForeground(Color.black);
      
      //좌석 매진 시 예외 처리
      String sO = "매진";		//soldOut
      if(save1.getSave1()==-100) {			
    	  btn_img_1.setEnabled(false);
    	  btn_img_1.setText(sO);
      }
      if(save1.getSave2()==-100) {
    	  btn_img_2.setEnabled(false);
    	  btn_img_2.setText(sO);
      }
      if(save1.getSave3()==-100) {
    	  btn_img_3.setEnabled(false);
    	  btn_img_3.setText(sO);
      }
      if(save1.getSave4()==-100) {
    	  btn_img_4.setEnabled(false);
    	  btn_img_4.setText(sO);
      }
      if(save1.getSave5()==-100) {
    	  btn_img_5.setEnabled(false);
    	  btn_img_5.setText(sO);
      }
      
      
        //1번 영화의 경우
        btn_img_1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              String moviedata = btn_img_1.getText();
            
              new Screen_2(1, save1);
              setVisible(false);
              
           }
        });

        btn_img_2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String moviedata = btn_img_2.getText();
               
               new Screen_2(2, save1);
               setVisible(false);

            }
         });
        
        btn_img_3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String moviedata = btn_img_3.getText();
               
               new Screen_2(3, save1);
               setVisible(false);
               
            }
         });
        
        btn_img_4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String moviedata = btn_img_4.getText();
              
               new Screen_2(4, save1);
               setVisible(false);
               
            }
         });
        
        btn_img_5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String moviedata = btn_img_5.getText();
               
               new Screen_2(5, save1);
               setVisible(false);
               
            }
         });
   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      //전체 프레임
	   
	  Seat save = new Seat();
      Screen_1 frame = new Screen_1(save);

   }

}