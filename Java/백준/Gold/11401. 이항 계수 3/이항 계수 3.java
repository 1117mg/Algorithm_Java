import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    final static long P = 1000000007;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Long N = Long.parseLong(st.nextToken());
        Long K = Long.parseLong(st.nextToken());
        
        long numer = fac(N);
        
        long denom = fac(K)*fac(N-K)%P;
        
        bw.write(numer*pow(denom,P-2)%P+"");
        bw.flush();
        bw.close();
    }
    
    static long fac(long N)
    {
        long fac = 1L;
        
        while(N>1)
        {
            fac = (fac*N)%P;
            N--;
        }
        return fac;
    }
    
    static long pow(long base, long expo)
    {
        long result =1;
        
        while(expo>0)
        {
            if(expo%2==1)
            {
                result *=base;
                result %=P;
            }
            base = (base*base)%P;
            expo /=2;
        }
        return result;
    }
}