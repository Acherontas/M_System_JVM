/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package static_pkg;
import java.util.Scanner;

/**
 *
 * @author Aionnio
 */
public class byo_static {
    public String number;
    public Scanner console = new Scanner(System.in);
    public int xp=0;
    public int mp=100;
    public int xfirst[]=new int[mp];
    public int xsum=0;
    public String xxsum=new String();
    public String outter_number=new String();
    public int double_digit_return=0;
    public int counting=0;
    
public int get_number(){
    System.out.print("give me a number");
    String mio;
    mio=console.next();
    System.out.print("u give me number " + mio );
    number=mio;
    return 0;   
}

public int return_hallOfpart(int x){
    return 0;
}

public int Sstart_calculation_part(String number,int ask){
    if(ask==2){
    System.out.print("\n");
    System.out.print("--------------------------------------------------------------\n");
    System.out.print("calculation part byo with " + number );
    System.out.print("\n");}
    int xx=0;
    int yy=50;
    int crtt=number.length()-1;
    int char_cnt=0;
    String temp_mip=new String();
    int but_why=0;
    int why_onx=0,why_ony=0;
    xsum=0;
    xxsum=new String();
    if(crtt<yy){yy=crtt;}
    for(;;){
        why_onx=xx;why_ony=yy;
        while(xx<=yy){
            temp_mip=temp_mip+number.charAt(xx);
            xx+=1;
            char_cnt+=1;
        }
        if(ask==2){ System.out.print("temp number " + temp_mip + " char cnt " + char_cnt + "\n");  }
        if(counting!=1){
        if(ask==2){but_why=Sstart_calculation(temp_mip,2);}
        if(ask==3){but_why=Sstart_calculation(temp_mip,3);}}
        if(crtt>yy){xx=yy+1;yy=xx+50;
        if(yy>crtt){yy=crtt;}
        temp_mip=null;
        }    
        if(char_cnt==crtt+1 || xx >yy ){      
            break;}
    }
       
       if(ask==2){System.out.print("\n");
                  System.out.print(" leaving calculation part byo with " + xsum  + "\n");
                  System.out.print(" Reporting Sum -----> " + xsum +"\n");
                 }
       if(ask==1){ } 
       return but_why;
}

public int Sstart_calculation(String number,int askme){
    char k;
    int l=0;
    int x=0;
    String remove_dupl=new String();
    if(askme==2){
    System.out.print("       Internal Calculation with " + number +" ");}
    for(int i=0;i<=number.length()-1;i++){
        double_digit_return=0;
        x=1;
        k=number.charAt(i); 
        l=Character.getNumericValue(k);        
       if(askme==2 && (l!=23 && l!=21 && l!=30) ){ System.out.print(" "  + l + " ") ;}
       if(l>9 &&(l!=23 && l!=21 && l!=30) ){
            remove_dupl+=String.valueOf(l);
            k=remove_dupl.charAt(0);
            l=Character.getNumericValue(k);
            //System.out.print("Digit came out double removing " << remove_dupl.at(1) << "\n"; 
           if(l>9){ double_digit_return=1;}
        }
        if(double_digit_return==1){System.out.print("bad calculation somehow 2 digits returned counting to ten"); counting+=1;}
        //if(l==0){goto C;}
        if(l!=0 &&(l!=23 && l!=21 && l!=30)){
        while(x<=l){
            if(l==0){xsum=xsum+0;break;}
            if(l>0 && (l!=23 || l!=30 || l!=31)){xsum+=1; 
            x+=1;}
        }}
        //C:       
        if(counting==10){counting=0;break;}
    }
    xxsum+=String.valueOf(xsum);
    if(xsum<=9){
  //System.out.print("xp " + xp +"\n");
    xfirst[xp]=xsum;xp+=1;}
    if(askme==2){System.out.print(" ");
    System.out.print("       ----> " + xsum );
  //  if(askme==1){System.out.print("       ----> " << this->xsum <<"\n";}   
}
 // System.out.print("xsum of sum " + xsum);
  return xsum;
    }

public int clear_table(){
    for(int i=0;i<=xp;i++)
    {
        xfirst[i]=0;
    }
    return 0;
}

}



