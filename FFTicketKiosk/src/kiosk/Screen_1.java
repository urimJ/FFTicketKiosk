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
   
   //��ư ���� ����
   JButton btn_img_1;
   JButton btn_img_2;
   JButton btn_img_3;
   JButton btn_img_4;
   JButton btn_img_5;

   
   //��ư �̹���

   ImageIcon img = new ImageIcon("images/�׸�1.jpg");
   ImageIcon img2 = new ImageIcon("images/�׸�2.jpg");
   ImageIcon img3 = new ImageIcon("images/�׸�3.jpg");
   ImageIcon img4 = new ImageIcon("images/�׸�4.jpg");
   ImageIcon img5 = new ImageIcon("images/�׸�5.jpg");

 

   String dum = "<HTML>�������� ���<br>13:00 ~ 14:40 </HTML>";
   String great = "<HTML>������ ���<br>14:50 ~ 16:00 </HTML>";
   String mal = "<HTML>���Ӿ��� ��Ź��<br>16:20 ~ 16:50 </HTML>";
   String mobius = "<HTML>���콺<br>17:00 ~ 17:50 </HTML>";
   String sonic = "<HTML>���ۼҴ� 2<br>18:00 ~ 19:40 </HTML>";
    
   public Screen_1(Seat c) {
	  
	  Seat save1 = c;
	   
      setTitle("��ȭ�� Ƽ�� �Ǹ� Ű����ũ");
      setSize(1100,800);    // ������ ũ�� 1100*800
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //������ ���� ��ư Ŭ�� �� ������ ������ ���α׷� �����
      setLocationRelativeTo(null);	//�������� ȭ�� ����� ��
      setVisible(true);    // ������ ���


      //contentPane ���� (��ġ������ ����)

      Container title = getContentPane();      
      title.setLayout(null);

      

      //[Ű����ũ��] ����

      JPanel title1 = new JPanel();                  //(�г�): title1
      JLabel titleL1 = new JLabel("������ȭ�� Ƽ�� �Ǹ�");   //(��): titleL1

      //[�ȳ�����] ����

      JPanel title2 = new JPanel();                  //(�г�): title2
      JLabel titleL2 = new JLabel("�����Ͻ� ��ȭ�� �����ϼ���"); //(��): titleL2
      JPanel movie1 = new JPanel(); //�ǳ� ����
      //JPanel moviePanel = new Movie();
      //JPanel moviePanel = new Movie(); //MoviePanel ����
      //[���� ������ ǥ��] �г� ���� �� ����   (container)
      //(page �г� ���� pg1,2,3 �г� ���� ���� pgL1,2,3 �� �� �� 3�� ����(����, �г� 3��, �� 3��)

      JPanel page = new JPanel();

      page.setBounds(1100-143,25,108,30);
      page.setLayout(null);
      page.setBackground(new Color(255,0,0,0));   //����
      add(page);

 

      //���� ����

      Color green = new Color(0x006633, false);      //�ʷ�
      Color yellow = new Color(0xFDDA2A, false);      //���

      

      //���� �г�(pg1~3) ����            (components)

      JPanel pg1 = new JPanel();
      JPanel pg2 = new JPanel();
      JPanel pg3 = new JPanel();

      

      //pg1~3 ġ�� ����

      int pW = 30; int pH = 30;
      int pX = 0;
      int pP = pW+6;


      //pg1~3 ����   

      pg1.setLayout(null);
      pg1.setBounds(0,0,pW,pH);
      pg2.setBounds(pX+pP,0,pW,pH);
      pg3.setBounds(pX+pP*2,0,pW,pH);

      

      pg2.setLayout(null);
      pg1.setBackground(yellow);         //���� ������(yellow)
      pg2.setBackground(Color.GRAY);         
      pg3.setBackground(Color.GRAY);         

      

      pg3.setLayout(null);
      page.add(pg1);
      page.add(pg2);
      page.add(pg3);

      

      // ���� ��(pgL1~3) ����

      JLabel pgL1 = new JLabel("1");
      JLabel pgL2 = new JLabel("2");
      JLabel pgL3 = new JLabel("3");

      

      //pgL1~3 ����

      pgL1.setHorizontalAlignment(JLabel.CENTER);
      pgL1.setVerticalAlignment(JLabel.TOP);
      pgL1.setFont(new Font("���� ���", Font.BOLD, 20));
      pgL1.setForeground(Color.black);         //���� ������(black)
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
      pgL3.setForeground(Color.DARK_GRAY);
      pgL3.setSize(30,30);
      pg3.add(pgL3);

            

      //Ÿ��Ʋ ġ�� ����

      int lft = 280;         //Ű����ũ��(�г�) ���� ����
      int rgt = 1100 - lft;   //�ȳ�����(�г�) ���� ���� (������ ���� ���� - Ű����ũ��(�г�) ���� ����)
      int hgt = 70;         //���� ����

      

      //title1 ����

      title1.setLayout(null);
      Color color1 = new Color(0x006633, false);      //���� ����
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

      

      //movie ����

      movie1.setLayout(null);
      movie1.setBounds(0,85,lft,730);
      movie1.setSize(1100,690);

      //movie1.setBackground(color1);

      movie1.setForeground(Color.WHITE);
      add(movie1);

      //movie1.setSize(800-70);

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


      //��ȭ �̹��� ���̾ƿ� ����
      GridLayout grid = new GridLayout(2,3);
      grid.setVgap(30);
      movie1.setLayout(grid);


      //�̹��� ������ ����
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

        //�̹��� ����
      btn_img_1.setText(dum);
      btn_img_2.setText(great);
      btn_img_3.setText(mal);
      btn_img_4.setText(mobius);
      btn_img_5.setText(sonic);

        

        //��ư �ؽ�Ʈ ��Ʈ, �ؽ�Ʈ ũ��

      btn_img_1.setFont(new Font("���� ���", Font.BOLD, 15));
      btn_img_2.setFont(new Font("���� ���", Font.BOLD, 15));
      btn_img_3.setFont(new Font("���� ���", Font.BOLD, 15));
      btn_img_4.setFont(new Font("���� ���", Font.BOLD, 15));
      btn_img_5.setFont(new Font("���� ���", Font.BOLD, 15));

      btn_img_1.setVerticalTextPosition(JButton.BOTTOM);
      btn_img_2.setVerticalTextPosition(JButton.BOTTOM);
      btn_img_3.setVerticalTextPosition(JButton.BOTTOM);
      btn_img_4.setVerticalTextPosition(JButton.BOTTOM);
      btn_img_5.setVerticalTextPosition(JButton.BOTTOM);
      
      //��ư ���� ���� ����
      btn_img_1.setBackground(null);
      btn_img_2.setBackground(null);
      btn_img_3.setBackground(null);
      btn_img_4.setBackground(null);
      btn_img_5.setBackground(null);

      //��ư �۾� ���� ���� ����
      btn_img_1.setForeground(Color.black);
      btn_img_2.setForeground(Color.black);
      btn_img_3.setForeground(Color.black);
      btn_img_4.setForeground(Color.black);
      btn_img_5.setForeground(Color.black);
      
      //�¼� ���� �� ���� ó��
      String sO = "����";		//soldOut
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
      
      
        //1�� ��ȭ�� ���
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
      //��ü ������
	   
	  Seat save = new Seat();
      Screen_1 frame = new Screen_1(save);

   }

}