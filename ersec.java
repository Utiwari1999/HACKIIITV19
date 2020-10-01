import java.util.*;
import java.io.*;
class septone
{
	public static void main(String []args)
	{
		FastScanner KB = new FastScanner();
	    PrintWriter pw = new PrintWriter(System.out);
		StringBuilder out = new StringBuilder();
		int T,i,j,k,N;
		T=KB.nextInt();
		for(k=1;k<=T;k++)
		{
			N=KB.nextInt();
			int arr[]= new int[N];
			for(j=0;j<N;j++)
			{
				arr[j]=KB.nextInt();
			}
			Arrays.sort(arr);
			long sum=0;
			for(j=0;j<N;j++)
			{
				if(arr[j]!=j+1)
				{
					sum=-1;
				}
			}

			if(sum<=0)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
				
		}
		pw.print(out.toString());
		pw.flush();
	}
	
	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
