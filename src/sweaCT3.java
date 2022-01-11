/**
 *

import java.util.Scanner;

public class sweaCT3 {


    static void surjective(int[] x, int[] y, String list){
        for (int i=0;i<x.length;i++) {
            x[i] = y[i];
            if () {}
            else () {}
        }
    }
}

    // 순서를 지키면서 n 개중에서 r 개를 뽑는 경우
// 사용 예시: perm(arr, output, visited, 0, n, 3);
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;;
            }
        }
    }

    public static void main(String[] args) {

        int m, n;
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        String list = "";

        int x[] = new int[m];
        int y[] = new int[n];

        int init = 0;
        for(int i=0;i<m;i++) x[i]= init+1;
        for(int i=m;i<m+n;i++) y[i]= init+1;

        surjective(x,y, list);

    }
}

/**
 import java.util.Scanner;

 public class sweaCT3 {

 static void surjective(int m, int n, String list){
 = 1;
 for (i=0;i<n;i++) {

 }
 }



 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 int current = 1;
 int m, n;
 String li="";

 m = sc.nextInt();
 n = sc.nextInt();

 surjective(m,n,li);

 }
 }
 /*

