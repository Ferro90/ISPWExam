package com.example.ispwexam;

public class Esame {
    public static void main(String[] args) {
        int k = divisioneBinaria(1, 0);
        System.out.println(k);

    }
    //a+b
    public static int   sommaBinaria(int a , int b){
        if(a>1 || b>1 || a<0 || b<0){
            return -1;
        }
        if((a==0 && b ==0)||(a==1 && b ==1)){
            return 0;
        }
        else{
            return 1;
        }

    }

    // a-b
    public  static int sottrazioneBinaria(int a , int b){
        if(a>1 || b>1 || a<0 || b<0){
            return -1;
        }
        if(a<b){
            return -1;
        }
        if(a>b){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static  int moltiplicazioneBinaria(int a , int b ){
        if(a>1 || b>1 || a<0 || b<0){
            return -1;
        }
        if(a==0 || b ==0 ){
            return 0;
        }
        else{
            return 1 ;
        }

    }
    public  static  int divisioneBinaria(int a , int b){
        if(a>1 || b>1 || a<0 || b<=0){
            return -1;
        }
        if(a==0){
            return 0;
        }
        else{
            return 1;
        }


    }
}
