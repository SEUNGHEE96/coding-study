package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int[] f;
	static int code1 = 1;
	static int code2 = 1;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        f = new int[num+1];
        for(int i=1; i<=num; i++) {
        	f[i] = i;
        }
        
        fib(num);
        fibonacci(num);
        
        bw.write(String.valueOf(code1) + " " + String.valueOf(code2));
        bw.flush();
        bw.close();
    }
    private static int fib(int n) {
        if (n == 1 || n == 2) {
        	return 1;
        }
        code1 ++;
        return (fib(n - 1) + fib(n - 2));
    }
	private static int fibonacci(int n) {
        if (n == 1 || n == 2) {
        	return 1;
        }
	    for (int i=3; i<n; i++) {
	    	code2++;
	        f[i] = f[i - 1] + f[i - 2];
	    }
	    return f[n];
	}
}
/*
54954185	dnffktmdgml	 24416	맞았습니다!!	14204	460	Java 11 / 수정	1267	10초 전
*/