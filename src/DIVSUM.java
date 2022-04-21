import java.io.*;

public class DIVSUM
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcases = Integer.parseInt(in.readLine());
        int[] values = new int[testcases];
        for(int i = 0; i<testcases; i++)
        {
            values[i]=Integer.parseInt(in.readLine());
        }
        for(int i = 0; i<testcases; i++)
        {
            int sum = 1;
            int testcase = values[i];
            double lim = Math.sqrt(testcase);
            for(int k = 2; k<lim; k++)
            {
                if(testcase % k == 0)
                {
                    sum += k + testcase / k;
                }
            }
            int intLim = (int) lim;
            if (intLim * intLim == testcase)
            {
                sum += lim;
            }
            if(testcase == 1)
                sum=0;
            out.write(sum + "\n");
        }
        out.flush();
    }
}
