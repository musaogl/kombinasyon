import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int n,r,total=1,totalR=1,totalNR=1;
        Scanner input=new Scanner(System.in);
        System.out.print("1.kümenin kaç elamanlı : ");
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            total*=i;
        }
        System.out.print("2.kümenin kaç elamanlı : ");
        r=input.nextInt();
        for (int j=1;j<=r;j++){
            totalR*=j;
        }
        for(int b=1;b<=(n-r);b++){
            totalNR*=b;
        }
         int c =total/(totalR*totalNR);
        System.out.println(n+" ve "+ r +" Kombinasyon : " + c);
    }
}
