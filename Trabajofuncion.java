package Trabajofuncion;

public class Trabajofuncion{
public static void main(String[] args) {
        
    double p;
    int i,m;
    p=20;
    
    for(i=1;i<=p;i++)
    {
        double aleatoria=(double)(Math.random()* -5)+5;
        System.out.print(""+i+"=..\t");
        System.out.println(funtion(aleatoria));
        
        
        
    }
    System.out.println("Fin del bucle de aleatoria");
}

public static double  funtion (double aleatoria){
        double resultado;
        float m;
        m=(float) ((double)Math.pow(2.7182,(aleatoria))*(aleatoria));
        resultado=Math.sin(m);
        
        return resultado;
    }    
}
    


