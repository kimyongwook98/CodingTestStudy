package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B2439_2 {

    public static void main(String[] args) throws IOException { //BufferedReader + StringBuilder
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                sb.append(' ');
            }
            for (int k = 1; k <= i; k++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
