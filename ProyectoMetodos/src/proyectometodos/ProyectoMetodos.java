package proyectometodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProyectoMetodos {

    
    
    public void imprimirVector(){
    
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame el tamaño del vector: ");
        int tamVector = scan.nextInt();
        int v1[] = new int[tamVector];
        int i;
        int decimal1 = 0,decimal2 = 0;
        
        System.out.println("Vector generado: ");
        for(i = 0; i<tamVector; i++){
            v1[i] =(int)Math.floor(Math.random()*2);
            System.out.print(v1[i]+",");
        }System.out.println();
        System.out.println("Dame el pivote: ");
        int pivote = scan.nextInt();
        if(pivote > tamVector){
            System.out.println("El pivote supera el tamaño del vector");
        }else{
            int pivoteAux = pivote;
            int tamPivote2 = tamVector-pivote;
            for( i=0;i<pivote;i++){
                if( v1[i] == 1){
                    decimal1 += Math.pow(2,(pivoteAux-1));
                }
                pivoteAux--;
            }
            int tamPivote2Aux = tamPivote2;
            for(i=0; i<tamPivote2; i++){
                if(v1[i+pivote] == 1){
                    decimal2 += Math.pow(2,(tamPivote2Aux-1));
                }
                tamPivote2Aux--;
            }
        }
        System.out.println("El valor decimal 1 es: "+decimal1);
        System.out.println("El valor decimal 2 es: "+decimal2);
        
        
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Filas: ");
        int filas = scan.nextInt();
        
        System.out.println("Columnas: ");
        int col = scan.nextInt();
        
        int matriz[][] = new int[filas][col];
        System.out.println("Llenando la matriz");
        for(int i = 0; i<filas; i++){
            for(int j=0; j< col; j++){
                System.out.print("["+(i+1)+"]["+(j+1)+"]: ");
                matriz[i][j] = scan.nextInt();
                //System.out.println();
            }
        }
        System.out.println("Los valores de la matriz son:");
        for(int i = 0; i<filas; i++){
            for(int j=0; j< col; j++){
                System.out.print(matriz[i][j]+",");
            }System.out.println();
        }*/
        
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
