package joins;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class NaturalJoin 
{
    static String[] t;
    FileWriter fdb;
    FileWriter fout;
    FileReader fin;
    BufferedReader in;
    FileReader fin1;
    BufferedReader in1;
    BufferedWriter out;
    String st,st1="a";
    public NaturalJoin() throws Exception
    {
        fin=new FileReader("Customer.txt");
        in=new BufferedReader(fin);
        fout=new FileWriter("NaturalJoin.txt");
        out=new BufferedWriter(fout);
        for(;(st=in.readLine())!=null;)
        {
        
            fin1=new FileReader("Dealer.txt");
            in1=new BufferedReader(fin1);
            String tokens[]=st.split("\t");
            while((st1=in1.readLine())!=null)
            {
                String tokens1[]=st1.split("\t");
                if(tokens[13].equals(tokens1[1]))
                {
                    out.write(st+"\t"+st1);
                    out.newLine();
                }
            }
            in1.close();
            fin1.close();
        }
        in.close();
        fin.close();
        out.close();
        fout.close();
        
    }
    public static void main(String a[]) throws Exception
    {
       /* new NaturalJoin();
        DataFileTable.callData("NaturalJoin");
        */
    }
}