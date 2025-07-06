/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m_system_jvm;
import java.util.Scanner;
import static_pkg.byo_static;
import msdtb_pkg.MSDTB;

/**
 *
 * @author Aionnio
 */
public class M_System_JVM {
    /**
     * @param args the command line arguments
     */
    
    public byo_static bnc=new byo_static();
       
    
    public static void main(String[] args) {
        // TODO code application logic here
        int kva=0;
        int mtp=0;
        Scanner console = new Scanner(System.in);
        System.out.print("use 0=default 1=for analysis 2 for ur own table array\n");
        System.out.print("if u press 2 15 tries will be done\n");
        kva=console.nextInt();
        if(kva>2){System.out.print("wrong parameters exiting"); return ;}
        if(kva<0){System.out.print("wrong parameters exiting"); return ;}
       // if(kva==1){System.out.print("column --> 1=1 <--key to press 2=2 3=4 4=8 5=7 6=5\n");}
       // if(kva==0){System.out.print("column --> 1=1 <--key to press 2=2 3=4 4=8 5=7 6=5\n");}
        System.out.print("bypass middle numbers show only results 2=show results 3=not show results \n");mtp=console.nextInt();
        MSDTB mst=new MSDTB();
        byo_static ncl=new byo_static();
        if(kva==2){
            System.out.print("no result except for sums\n");
            System.out.print("used for analytics only\n");
            mst.get_user_array();       
        }
        mst.get_number();
        if(kva==0){mst.clear_tmp();}
        if(kva==1){mst.clear_tmp();}
        if(kva==0){System.out.print("column --> 1=1 <--key to press 2=2 3=4 4=8 5=7 6=5\n");mst.get_first_digit();}
        if(kva==1){System.out.print("column --> 1=1 <--key to press 2=2 3=4 4=8 5=7 6=5\n");mst.get_first_digit();}
        mst.get_lengthi(mst.my_number);
        if(kva==0){mst.fill_tmp(mst.my_number,mst.first_digit);}
        if(kva==1){mst.fill_tmp(mst.my_number,mst.first_digit);}
        if(kva==2){kva=1;}
        int ll=ncl.Sstart_calculation_part(mst.my_number,mtp);  
        System.out.print(" ------------> main number is " + ll +"\n");
        if(ll>9){
            while(ll>9){
            ncl.outter_number=new String();
            ncl.outter_number+=Integer.toString(ll);
            ll=0;  
            ll=ncl.Sstart_calculation_part(ncl.outter_number,mtp);
            if(ll<=9){break;}
            }
        }
        System.out.print("reporting numbers ");
        for(int i=1;i<=ncl.xp;i++){System.out.print(ncl.xfirst[i] +" |--| ");}
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("---------------------------------------------------------------------------\n");
        System.out.print(" -------------> final main number to continue is " + ll +" <-------------\n");  
        System.out.print("---------------------------------------------------------------------------\n");
        System.out.print("\n");
        //if(ll==3){return 0;}
       // if(ll==6){return 0;}
       // if(ll==9){return 0;}
        ncl.clear_table(); 
        System.out.print("\n");
        System.out.print("Clearing Temp ");
        mst.clear_flc();
        System.out.print("Clearing done\n");
        mst.calculate_big(mst.my_number,0,mtp);
        mst.show_number();  
        ncl.number=mst.final_number;
        int l=ncl.Sstart_calculation_part(ncl.number,mtp);
        System.out.print("l is " + l +"\n");
        if(l>9){
            while(l>9){
            ncl.outter_number=new String();
            ncl.outter_number+=Integer.toString(l);
            l=0;
            l=ncl.Sstart_calculation_part(ncl.outter_number,mtp);
            if(l<=9){break;}
            }
        }
        System.out.print("reporting numbers ");
        for(int i=1;i<=ncl.xp;i++){System.out.print(ncl.xfirst[i] +" |--| ");}
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("---------------------------------------------------------------------------------------\n");
        System.out.print(" -------------> final secondary number as main to continue is " + l +" <-------------\n");  
        System.out.print("---------------------------------------------------------------------------------------\n");
        System.out.print("\n");
        mst.pass_byo_calc=l;
        System.out.print("Main cin number " + ll +"\n");
        System.out.print("finding the main\n");
        if(ll!=9){
        int u=mst.find_main();
        System.out.print("\n");
        System.out.print("main number possible result sum is " + u +"\n");
        System.out.print("\n");
        if(u==ll){System.out.print("RESULT IS SAME!!!\n");}
        if(u!=ll){
            System.out.print("\n");
            u=mst.find_main_by_idx(ll);
            System.out.print("\n");
            System.out.print("using the logic 5 @ 5 for the 5 ::= ");
            System.out.print(u+"\n");
        }
        if(ncl.double_digit_return==1){System.out.print("Double Digit return\n");}
        }    
        if(kva==1){
            System.out.print("\n");
            System.out.print("reporting analysis with number " + mst.my_number +"\n");
            System.out.print("Enter steps to stop default is 2 or 4 try 4 \n");
            int xcon=0;
            xcon=console.nextInt();
            ncl.clear_table();         
            mst.calculate_loopun(mst.my_number,xcon,mtp);
            // ncl.xfirst[0]=ll;
            //summarize the arrays for the fun of the fun 
            int xpr=mst.prt_tbl_counter();
            int xfpr=mst.xf_counter();
            double xft[]=new double[xpr];
            int xtf[]=new int[xfpr];        
            System.out.print("| main number sum " + ll +"\n");    
            System.out.println("Numbers returned in order and the sums of them\n");
            System.out.println(mst.my_number + " ------> " + ll);
            xft=mst.prt_tbl();
            xtf=mst.xf();      
            for(int i=0;i<=xpr;i++){
              System.out.println(xft[i] + " ------> " + xtf[i]);}        
            }
            }   
}
