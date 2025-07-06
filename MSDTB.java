/*
 * Click nbfs://nbhost/SystemFileSystem/TemplcharAtes/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/TemplcharAtes/Classes/Class.java to edit this templcharAte
 */
package msdtb_pkg;
import java.util.Scanner;
import static_pkg.byo_static;

/**
 *
 * @author Aionnio
 */
public class MSDTB {
    public Scanner console = new Scanner(System.in);
    public int xp=10;
    public int xpi=7;
    public int fltmp=100000;
    public int xp_cnt=0;
    public int one_x[]={0,1,2,3,4,5,6,7,8,9};
    public int two_x[]={0,5,1,6,2,7,3,8,4,0};
    public int three_x[]={0,7,5,3,1,8,6,4,2,0};
    public int four_x[]={0,8,7,6,5,4,3,2,1,0};
    public int five_x[]={0,4,8,3,7,2,6,1,5,0};
    public int six_x[]={0,2,4,6,8,1,3,5,7,0};
    public int three_tsx[]={0,3,6,3,6,3,6,3,6,3};
    public int six_tsx[]={0,6,3,6,3,6,3,6,3,6};
    public int re_one[]={1,5,7,8,4,2};
    public int re_two[]={2,1,5,7,8,4};
    public int re_three[]={4,2,1,5,7,8};
    public int re_four[]={5,7,8,4,2,1};
    public int re_five[]={7,8,4,2,1,5};
    public int re_six[]={8,4,2,1,5,7};
    public int re_thrtsx[]={3,6,3,6,3,6};
    public int re_sixsx[]={6,3,6,3,6,3};
    public int re_tmp[]=new int[xp];
    public int tmp_x[]=new int[xp];
    public int flc_tmp[]=new int[fltmp];
    public int user_array[]=new int[xp];
    public String my_number=new String();
    public String final_number=new String();
    public int first_digit=0;
    public int sum_of_calc=0;
    public int pass_byo_calc=0;
    public int m_digit=0;
    public int main_sum_digit=0;
    public int big_calc_sum=0;
    //dealing with zero is hard actually for now its easy
    public String zero_dealer=new String();
    public int dealer=0;
    public int pretty_see=0;
    public int pretty_saw=100;
    public double pretty_tbl[]=new double[pretty_saw];
    private byo_static  nclb=new byo_static();
public int clear_flc(){for(int i=0;i<=100000-1;i++){flc_tmp[i]=0; } 
return 0; 
}

public int clear_tmp(){
    for(int i=0;i<=9;i++){tmp_x[i]=0;}
    return 0;
}

public int get_number(){
    System.out.print("enter a number \n");
    String nmb=new String();
    nmb=console.next();
    my_number+=nmb;
    return 0;
}

public int get_first_digit(){
    int x=0;
    System.out.print("for number \n" );
    System.out.print("enter the first digit\n");
    x=console.nextInt();
    if(x<=9){first_digit=x;
    System.out.print("ur first digit is " + first_digit +"\n");
    }
    if(x>9){System.out.print("xamilotero apo 10\n"); return -1;}
    return 0;
}

public int fill_tmp(String number, int first_digit){
    number+=my_number;
    first_digit=first_digit;
    int xi=0;
    if(first_digit==1){
        clear_tmp();
        tmp_x[0]=0; tmp_x[5]=5;
        tmp_x[1]=1; tmp_x[6]=6;
        tmp_x[2]=2; tmp_x[7]=7;
        tmp_x[3]=3; tmp_x[8]=8;
        tmp_x[4]=4; tmp_x[9]=9;    
        xi=1;     
        m_digit=xi;
        return 0;
    }
    if(first_digit==2){
        clear_tmp();
        tmp_x[0]=0; tmp_x[5]=7;
        tmp_x[1]=5; tmp_x[6]=3;
        tmp_x[2]=1; tmp_x[7]=8;
        tmp_x[3]=6; tmp_x[8]=4;
        tmp_x[4]=2; tmp_x[9]=0;
        xi=2;
        m_digit=xi;
        return 0;
    }
    if(first_digit==3){  }  
    if(first_digit==4){
        clear_tmp();
        tmp_x[0]=0; tmp_x[5]=8;
        tmp_x[1]=7; tmp_x[6]=6;
        tmp_x[2]=5; tmp_x[7]=4;
        tmp_x[3]=3; tmp_x[8]=2;
        tmp_x[4]=1; tmp_x[9]=0;
        xi=3;
        m_digit=xi;
        return 0;
    }
    if(first_digit==5){
        clear_tmp();
        tmp_x[0]=0; tmp_x[5]=1;
        tmp_x[1]=2; tmp_x[6]=3;
        tmp_x[2]=4; tmp_x[7]=5;
        tmp_x[3]=6; tmp_x[8]=7;
        tmp_x[4]=8; tmp_x[9]=0;
        xi=6;
        m_digit=xi;
        return 0;
    }
    if(first_digit==6){  }    
    if(first_digit==7){
        clear_tmp();
        tmp_x[0]=0; tmp_x[5]=2;
        tmp_x[1]=4; tmp_x[6]=6;
        tmp_x[2]=8; tmp_x[7]=1;
        tmp_x[3]=3; tmp_x[8]=5;
        tmp_x[4]=7; tmp_x[9]=0;
        xi=5;
        m_digit=xi;
        return 0;
    }
    if(first_digit==8){
        clear_tmp();
        tmp_x[0]=0; tmp_x[5]=4;
        tmp_x[1]=8; tmp_x[6]=3;
        tmp_x[2]=7; tmp_x[7]=2;
        tmp_x[3]=6; tmp_x[8]=1;
        tmp_x[4]=5; tmp_x[9]=0;
        xi=4;
        m_digit=xi;
        return 0;
    }
    if(first_digit==9){  }     
    m_digit=xi;
    return 0;
}

public int calculate_one(String number){
    System.out.print("entering calculation\n");
    number=new String();
    number+=my_number;
    System.out.print("with number " + number +"\n");
    char l;
    int k=0;
    xp_cnt=0;
    String sfg=new String();
    for(int i=0;i<=1000;i++){flc_tmp[i]=0;
    }
    final_number=new String();
    for(int i=0;i<=number.length()-1;i++){
        l=number.charAt(i);
        k=Character.getNumericValue(l);
        if(k>9){
            sfg=new String();
            sfg+=Integer.toString(k);
            l=sfg.charAt(0);
            k=Character.getNumericValue(l);
        }
        flc_tmp[xp_cnt]=tmp_x[k];
        final_number+=Integer.toString(flc_tmp[i]);
        xp_cnt+=1;
    }
    System.out.print("leaving calculation\n");
    return 0;
}

public String insert_part(int xxi, int yyi, String sti,int msg){
    if(msg==2){System.out.print("entering insert part " + xxi + " " + yyi + " " + sti);}
    char l;
    int k=0;     
    int stepping=0;
    String dung=new String();
    //dung=new String();
    String safeg=new String();
    for(int kl=xxi;kl<=yyi;kl++){
        if(xxi==yyi+1){break;}
            l=sti.charAt(stepping);
            k=Character.getNumericValue(l);
            if(k>9){
                safeg=new String();
                safeg+=Integer.toString(k);
                l=safeg.charAt(0);
                k=Character.getNumericValue(l);
            }
            if(sti.charAt(stepping)=='0'){k=0;}
            flc_tmp[xxi]=tmp_x[k];
            final_number+=Integer.toString(flc_tmp[xxi]);
            dung+=Integer.toString(tmp_x[k]);
            xp_cnt+=1;
            stepping+=1;          
        }
    if(msg==2){System.out.print(" -----> "+dung +" and leaving insert part\n");}
    return final_number;
}

public int calculate_big(String number,int own,int msg){
    if(msg==2){System.out.print("entering calculation big\n");}
    number=new String();
    if(own==0){number+=my_number;}
    if(own==1){number+=final_number;}
    big_calc_sum=0;
    if(msg==2){ System.out.print("with number " + number + " and size of " + my_number.length() +"\n");}
    char l;
    int k=0;
    xp_cnt=0;  
    final_number=new String();
    int xx=0;
    int yy=50;
    int crtt=my_number.length()-1;
    int char_cnt=0;
    String temp_mip=new String();
    String but_why=new String();
    int why_onx=0,why_ony=0;
    if(crtt<yy){yy=crtt;}
    for(;;){
        why_onx=xx;why_ony=yy;
        while(xx<=yy){
            temp_mip+=number.charAt(xx);
            xx+=1;
            char_cnt+=1;
        }
       if(msg==2){ System.out.print("temp number " + temp_mip +" char cnt " + char_cnt + "\n");}
        xp_cnt=0; 
        but_why=new String();
        but_why=insert_part(why_onx,why_ony,temp_mip,own);
        if(crtt>yy){
            xx=yy+1;yy=xx+50;
            if(yy>crtt){yy=crtt;}
            temp_mip=new String();
        }    
        if(char_cnt==crtt+1 || xx >yy ){
            break;}
    }   
    if(dealer==0){zero_dealer=final_number; dealer+=1;}
    if(msg==0){System.out.print("leaving calculation big\n");}
    return 0;
}

public int show_number(){
    sum_of_calc=0;
    for(int i=0;i<=1000;i++){sum_of_calc=sum_of_calc+flc_tmp[i];}
    System.out.print("--------------> " + final_number + " as the new secondary <-------- \n");
    return 0;
}

public int show_calculation_result(){
    System.out.print(sum_of_calc);
    return 0;
}

public int get_user_array(){
    int x=0;clear_tmp(); 
    for(int i=0;i<=9;i++){user_array[i]=0;}
    int mst=0;
    System.out.print("want to start from 0 or 1; : ");
    mst=console.nextInt();
    if(mst>1){return 0;}
    for(int i=mst;i<=9;i++){
        System.out.print(i + " " + "Enter a value: ");
        x=console.nextInt();
        if(x<=9){user_array[i]=x;}
    }
    System.out.print("The array is \n");
    for(int i=0;i<=9;i++){System.out.print(user_array[i] +" " );       }
    System.out.print("\n"); 
    tmp_x[0]=user_array[0]; tmp_x[5]=user_array[5];
    tmp_x[1]=user_array[1]; tmp_x[6]=user_array[6];
    tmp_x[2]=user_array[2]; tmp_x[7]=user_array[7];
    tmp_x[3]=user_array[3]; tmp_x[8]=user_array[8];
    tmp_x[4]=user_array[4]; tmp_x[9]=user_array[9];
    m_digit=12;
    return 0;
}

public int get_lengthi(String nmb){
    int x=0;
    x=my_number.length()-1;
    System.out.print("the size is " + x +"\n");
//    if(x==2){
//        String tmpnu;
//        tmpnu.clear();
//        tmpnu+=my_number;
//        my_number.clear();
//        tmpnu+=to_String(0);
//        my_number+=tmpnu;
//        tmpnu.clear();
//        System.out.print("adding a zero cause sum is get crazy somehow\n";
//        System.out.print("new main number is " << my_number <<"\n";
//    }
    return x;
}

public int find_main(){
    System.out.print("\n");
    System.out.print("Reporting M-ofX- System as: " + "M" + m_digit +"\n");
    int posx=m_digit;
    int calcsum=pass_byo_calc;  
    System.out.print("\n");
    System.out.print("passing position  " + posx + " with sum  " + calcsum +"\n");
    System.out.print("\n");
    System.out.print("------------\n");
    for(int i=0;i<=5;i++){if(calcsum==re_one[i] && i==posx-1){System.out.print("one " + re_one[0] +"\n");main_sum_digit=re_one[0];}}
    for(int i=0;i<=5;i++){if(calcsum==re_two[i] && i==posx-1){System.out.print("two " + re_two[0] +"\n");main_sum_digit=re_two[0];}}
    for(int i=0;i<=5;i++){if(calcsum==re_three[i] && i==posx-1){System.out.print("three " + re_three[0] +"\n");main_sum_digit=re_three[0];}}
    for(int i=0;i<=5;i++){if(calcsum==re_four[i] && i==posx-1){System.out.print("four " + re_four[0] +"\n");main_sum_digit=re_four[0];}}
    for(int i=0;i<=5;i++){if(calcsum==re_five[i] && i==posx-1){System.out.print("five " + re_five[0] +"\n");main_sum_digit=re_five[0];}}
    for(int i=0;i<=5;i++){if(calcsum==re_six[i] && i==posx-1){System.out.print("five " + re_six[0] +"\n");main_sum_digit=re_six[0];}   }
    for(int i=0;i<=5;i++){if(calcsum==re_thrtsx[i] && i==posx-1){System.out.print("@3 " + re_thrtsx[0] +"\n");main_sum_digit=re_thrtsx[0];}}   
    for(int i=0;i<=5;i++){if(calcsum==re_sixsx[i] && i==posx-1){System.out.print("@6 " + re_sixsx[0] +"\n");main_sum_digit=re_sixsx[0];}}  
    System.out.print("------------\n");
    return main_sum_digit;
}

public int find_main_by_idx(int mainn){
    System.out.print("\n");
    System.out.print("Index Report M-ofX- System as: " + "M" + m_digit +"\n");
    int posx=m_digit;
    int calcsum=pass_byo_calc;  
    System.out.print("\n");
    System.out.print("passing position  " + posx + " with sum  " + calcsum +" and main " +mainn +"\n");
    System.out.print("\n");
    System.out.print("------------\n");
    main_sum_digit=-1;
    for(int i=0;i<=5;i++){if(mainn==re_one[i] && posx==mainn){System.out.print("one " + re_one[0] +"\n");main_sum_digit=re_one[0];}}
    for(int i=0;i<=5;i++){if(mainn==re_two[i] && posx==mainn){System.out.print("two " + re_two[0] +"\n");main_sum_digit=re_two[0];}}
    for(int i=0;i<=5;i++){if(mainn==re_three[i] && posx==mainn){System.out.print("three " + re_three[0] +"\n");main_sum_digit=re_three[0];}}
    for(int i=0;i<=5;i++){if(mainn==re_four[i] && posx==mainn){System.out.print("four " + re_four[0] +"\n");main_sum_digit=re_four[0];}}
    for(int i=0;i<=5;i++){if(mainn==re_five[i] && posx==mainn){System.out.print("five " + re_five[0] +"\n");main_sum_digit=re_five[0];}}
    for(int i=0;i<=5;i++){if(mainn==re_six[i] && posx==mainn){System.out.print("five " + re_six[0] +"\n");main_sum_digit=re_six[0];}}
    for(int i=0;i<=5;i++){if(mainn==re_thrtsx[i] && posx==mainn){System.out.print("@3 " + re_thrtsx[0] +"\n");main_sum_digit=re_thrtsx[0];}}   
    for(int i=0;i<=5;i++){if(mainn==re_sixsx[i] && posx==mainn){System.out.print("@6 " + re_sixsx[0] +"\n");main_sum_digit=re_sixsx[0];}}  
    System.out.print("------------\n");
    return main_sum_digit;    
}

public String fix_the_starting_zero(String starting){
    String rmv=new String();
    for(int i=1;i<=starting.length()-1;i++){rmv+=starting.charAt(i);}
    System.out.print("removing starting zero from " +starting +" to " + rmv +"\n");
    return rmv;
}

public int zero_check_at_part_and_stop(String one,String with_zeros,int mgs){
    if(mgs==0){System.out.print("\n");
    System.out.print("using zero check part " + one + " with " + with_zeros +"\n");}
    int check_counter=0;
    int stop=0;
    int x=0;
    String temp_s=new String();
    temp_s+=with_zeros.replace('0', '9');  
    if(one == null ? temp_s == null : one.equals(temp_s)){
        if(mgs==0){System.out.print("have to stop\n");}
    x=x+1;
    }   
    if(mgs==0){System.out.print("returning from zero check part " + check_counter + " " + stop + " value of " + x + "\n");}
    return x;
}

public int calculate_loopun(String nmb,int xsteps,int bypass){   
    int x_status=0;
    int lbi=0;
    int frt=0;  
    int ct=0;
    nclb.clear_table();
    String klo;
    String temp_zero=new String();
    int mop=0;
    int kop=0;
    for(;;){      
        mop=0;
        if(frt==0){
            nmb=new String();
            nmb+=my_number;
            calculate_big(nmb,0,bypass);  
            nclb.number=new String();
            nclb.number+=nmb;
            if(final_number.charAt(0)=='0'){
                klo=new String(); klo=fix_the_starting_zero(final_number);
                nclb.number=new String();temp_zero=new String();temp_zero+=final_number;
                final_number=new String();
                final_number+=klo;
            }
            lbi=nclb.Sstart_calculation_part(final_number,bypass);
            if(lbi>9){
                while(lbi>9){
                nclb.outter_number=new String();
                nclb.outter_number+=Integer.toString(lbi);
                lbi=0;   
                if(nclb.outter_number.charAt(0)=='0'){ 
                    klo=new String();klo=fix_the_starting_zero(nclb.outter_number);
                    temp_zero=new String();temp_zero+=nclb.outter_number;
                    nclb.outter_number=new String();
                    nclb.outter_number+=klo;
                }
                lbi=nclb.Sstart_calculation_part(nclb.outter_number,bypass);
                //std::this_thread::sleep_for(std::chrono::milliseconds(100));
                if(lbi<=9){break;}
               }
            }
        }
        if(frt>=1){
            ct+=1;
            nmb=new String();
            nmb+=final_number;
            calculate_big(final_number,1,bypass);
            nclb.number=new String();
            nclb.number+=final_number;
            if(nclb.number.charAt(0)=='0'){
                klo=new String();temp_zero=new String();temp_zero+=nclb.number;
                klo=fix_the_starting_zero(nclb.number);
                nclb.number=new String();
                final_number=new String();
                nclb.number+=klo;
                final_number+=klo;               
            }
            lbi=nclb.Sstart_calculation_part(nclb.number,bypass);
            if(lbi>9){
                while(lbi>9){
                nclb.outter_number=new String();
                nclb.outter_number+=Integer.toString(lbi);
                lbi=0;   
                if(nclb.outter_number.charAt(0)=='0'){
                    klo=new String(); temp_zero=new String();temp_zero+=nclb.outter_number;
                    klo=fix_the_starting_zero(nclb.outter_number);
                    nclb.outter_number=new String();
                    nclb.outter_number+=klo;                  
                }
                lbi=nclb.Sstart_calculation_part(nclb.outter_number,bypass);
                //std::this_thread::sleep_for(std::chrono::milliseconds(100));
                if(lbi<=9){break;}
                }
            }
        }  
        if(bypass==2){
        System.out.print("\n");
        System.out.print("----------------\n");
        System.out.print(final_number +  " " + temp_zero +"\n");}
        if(temp_zero.length()>final_number.length()){final_number=new String();final_number+=temp_zero;}
        if(bypass==2){
        System.out.print("----------------\n");
        System.out.print("\n");}
        frt+=1;     
        if((final_number==my_number || final_number==zero_dealer) && ct>=1){x_status=1;}
        pretty_tbl[pretty_see]=Double.valueOf(final_number);
        pretty_see+=1;
        if(x_status==1){break;} 
        mop=zero_check_at_part_and_stop(my_number,final_number,bypass);       
        if(kop==xsteps){
            if(bypass==2){
            System.out.print("Getting 9 out of 0 and reverse\n");
            }
            break;}
        if(ct==15 ){break;}
        if(ct==15 && m_digit==12){break;}  
        kop=kop+1;     
    }  
    
//    System.out.print("summary of sums per turn \n");
//    for(int i=0;i<=nclb.xp;i++){System.out.print(nclb.xfirst[i] + "," );}
    return 0;
}  

public int prt_tbl_counter(){
return pretty_see;
}

public double[] prt_tbl(){  
   return pretty_tbl; 
}

public int xf_counter(){
return nclb.xp;
}

public int[] xf(){
return nclb.xfirst;
}

}
