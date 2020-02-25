package cleancode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util .*;
	
public class SiCi
	{
  void Sim() 
	{
		 double pr, rate, t, sim,com;
		 try
		 {
		  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		  Scanner sc=new Scanner (System. in);
	    
	    bw.write("Enter the amount:");
	      bw.flush(); 
	      pr=sc.nextDouble();
	    
	    bw.write("Enter the No.of years:");
	      bw.flush();
	      t=sc.nextDouble();
	   
	    bw.write("Enter the Rate of  interest");
	    bw.flush();
	    rate=sc.nextDouble();
	    
	    sim=(pr * t * rate)/100;
	    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    
	    bw.write("Simple Interest="+sim);
	    bw.write("Compound Interest="+com);
	   
	      bw.close();
	      sc.close();
	      
	    } catch (IOException ex) {
	    }
	    System.exit(0);
	  }

	}
	
