package gui;
import java.awt.*;
import java.awt.event.*;
public class Eventinner extends Frame implements ActionListener{
    TextField tf;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bdel,beq,bper,bdiv,bsub,bmul,badd,bc;
    Eventinner(){
        setSize(410, 435);
        tf=new TextField();
        tf.setBounds(20, 40, 252, 55);
        bc=new Button("C");
        bc.setBounds(272, 40, 124, 55);
        b1=new Button("1");
        b1.setBounds(20, 95, 126, 55);
        b2=new Button("2");
        b2.setBounds(146, 95, 126, 55);
        badd=new Button("+");
        badd.setBounds(272, 95, 124, 55);
        b3=new Button("3");
        b3.setBounds(20, 150, 126, 55);
        b4=new Button("4");
        b4.setBounds(146, 150, 126, 55);
        bmul=new Button("*");
        bmul.setBounds(272, 150, 124, 55);
        b5=new Button("5");
        b5.setBounds(20, 205, 126, 55);
        b6=new Button("6");
        b6.setBounds(146, 205, 126, 55);
        bsub=new Button("-");
        bsub.setBounds(272, 205, 124, 55);
        b7=new Button("7");
        b7.setBounds(20, 260, 126, 55);
        b8=new Button("8");
        b8.setBounds(146, 260, 126, 55);
        bdiv=new Button("/");
        bdiv.setBounds(272, 260, 124, 55);
        b9=new Button("9");
        b9.setBounds(20, 315, 126, 55);
        b0=new Button("0");
        b0.setBounds(146, 315, 126, 55);
        bper=new Button("%");
        bper.setBounds(272, 315, 124, 55);
        bdot=new Button(".");
        bdot.setBounds(20, 370, 126, 55);
        bdel=new Button("del");
        bdel.setBounds(146, 370, 126, 55);
        beq=new Button("=");
        beq.setBounds(272, 370, 124, 55);
//register listner
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this); b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b9.addActionListener(this);
        b8.addActionListener(this);
        b0.addActionListener(this);
        bc.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bper.addActionListener(this);
        bdiv.addActionListener(this);
        bdot.addActionListener(this);
        bdel.addActionListener(this);

        //add component
        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(bc);add(bmul);add(badd);add(bsub);add(b7);add(b8);add(bdiv);add(b9);add(b0);add(bper);add(bdot);
        add(tf);add(bdel);add(beq);
        setLayout(null);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
       Button btn=(Button)e.getSource();
       if(btn== bc){
            tf.setText("");
       }
       else if(btn==b1){
        tf.setText(("")+1);
       }
       else if(btn==b2){
        tf.setText(("")+2);
       }
       else if(btn==b3){
        tf.setText(("")+3);
       }
       else if(btn==b4){
        tf.setText(("")+4);
       }
       else if(btn==b5){
        tf.setText(("")+5);
       }
       else if(btn==b6){
        tf.setText(("")+6);
       }
       else if(btn==b7){
        tf.setText(("")+7);
       }
       else if(btn==b8){
        tf.setText(("")+8);
       }
       else if(btn==b9){
        tf.setText(("")+9);
       }
       else if(btn==b0){
        tf.setText(("")+0);
       }
       else if(btn==badd){
        tf.setText(("+"));
       }
       else if(btn==bsub){
        tf.setText(("-"));
       }
       else if(btn==bmul){
        tf.setText(("*"));
       }
       else if(btn==bdot){
        tf.setText(".");
       }
       else if(btn== beq){
        tf.setText("=");
       }
       else if(btn== bper){
        tf.setText("%");
       }
       else if(btn == bdiv){
        tf.setText("/");
       }
       else {
        tf.setText((" "));
       }
       
    }
    public static void main(String ar[]){
        new Eventinner();
    }


    
}
