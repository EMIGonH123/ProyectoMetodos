package proyectometodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProyectoMetodos {

    public static void Combinacion(int num){
        for(int i=0;i<Math.pow(2,num);i++){
            int arreglo[]=new int[num];
            int temp=i;
            for(int l=0;l<arreglo.length;l++){
                arreglo[l]=temp%2;
                temp/=2;
            }
            String res="";
            for(int j=0;j<arreglo.length;j++){
                if(arreglo[j]==1){
                res+="["+(j+1)+"]";
                }
            }
            System.out.println("Combinacion "+(i+1)+"= "+res);
        }
    }
    

    public static void main(String[] args) {
        Combinacion(3);
        
        /*String er = "(\\*)?(a|b|c|d)?(\\+|-)";
        String cadena = "123.6*a+1243b-123d-123-";
        String tokens[] = cadena.split(er);
        int i=0;
        while(i<tokens.length){
            System.out.println(tokens[i]);
            i++;
        }*/
        /*File f;
        FileReader fr;
        BufferedReader br;
        
        String ruta = "C:\\Users\\Emi Gon H\\Desktop\\Archivos\\Entrada.txt";
        try {
            f = new File(ruta);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String linea;
            while( (linea = br.readLine()) != null ){
                System.out.println(linea);
            }
            
        } catch (Exception e) {
            System.out.println("El archivo no se encontro");
        }
        String operandos ="(\\d)+(\\.(\\d)+)?(\\*)?(a|b|c|d)"; 
        String ecuacion = operandos+"(\\s)*((\\+|-)(\\s)*"+operandos+"){0,3}(\\s)*";
        String er = ecuacion+"((\\+|-)(\\s)*(\\d)*)?(\\s)*(<=|>=|<|>|=)(\\s)*("+ecuacion+")?(\\s)*(\\+|-)?(\\s)*(\\d)+(\\s)*";
        Pattern pat = Pattern.compile(er);
        Matcher mat = pat.matcher("125*a-10 >=  576");
        if(mat.matches()){
            System.out.println("Cadena Valida");
        }else{
            System.out.println("Cadena Invalida");
        }*/
        //(5) gauss jordan

   }    
}
