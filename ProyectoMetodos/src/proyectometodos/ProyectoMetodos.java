package proyectometodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProyectoMetodos {

   public static int Mj(double x){
        double val = (Math.log(x)/Math.log(2));
        Pattern pat = Pattern.compile("(\\d)+\\.(0)+");
        Matcher mat = pat.matcher(String.valueOf(val));
        int mj = (int)val;
        if( mat.matches() ){
            return mj;
        }else{
            return (mj+1);
        }
    }
    
    public static int validarLimites( Double limites[], int bitsPresicion ){
        double vc = ( limites[1]-limites[0] )*( Math.pow(10, bitsPresicion) );
        int mj = Mj(vc);
        double vi = Math.pow(2, (mj-1) );
        double vd = ( Math.pow(2, mj) ) -1;
        System.out.println("Lado izquierdo: "+vi);
        System.out.println("Lado central: "+vc);
        System.out.println("Lado derecho: "+vd);
        if( (vc > vi) && (vc < vd) ){
            return mj;
        }else{
            return 0;
        }
        
    }
    
    public static int obtenerValor(int vector[], int tamVector, int pivote, int tamPivote){
        int auxTamPivote = tamPivote;
        int i, decimal=0;
        for(i=0; i<tamPivote; i++){
            if(vector[i+pivote] == 1){
                decimal += Math.pow(2,(auxTamPivote-1));
            }
            auxTamPivote--;
        }
        return decimal;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        HashSet<Double[]> limites =  new HashSet<Double[]>();
        
        System.out.println("Numero de variables: ");
        int numVariables = scan.nextInt();
        
        Integer valoresDeBits[] = new Integer[numVariables];
        
        //Capturamos los limites
        for(int i = 0; i<numVariables; i++){
            Double limite[] = new Double[2];
            System.out.println("Limite inferior: ");
            limite[0] = scan.nextDouble();
            System.out.println("Limite superior: ");
            limite[1] = scan.nextDouble();
            limites.add(limite);
        }
        
        
        System.out.println("Numero de Bits de precision: ");
        int numBitsP = scan.nextInt();
        
        System.out.println("Numero de Poblaciones: ");
        int numPoblaciones = scan.nextInt();
        
        System.out.println("Numero de individuos: ");
        int numIndividuos = scan.nextInt();
        
        int numBitsTotales = 0;
        Iterator<Double[]> iterator = limites.iterator();
        int i= 0;
        while( iterator.hasNext() ){
            valoresDeBits[i] = validarLimites(iterator.next(),numBitsP);
            numBitsTotales += valoresDeBits[i];
            System.out.println("Mj"+i+": "+valoresDeBits[i]);
            i++;
        }
        
        for( i=0; i<numIndividuos; i++){
            int vector[] = new int[numBitsTotales];
            for(int j = 0; j<numBitsTotales; j++){
                vector[j] =(int)Math.floor(Math.random()*2);
                System.out.print(vector[j]+",");
            }System.out.println();
            for(int k=0; k<valoresDeBits.length; k++){
                int valorDeCadenaBits = 0;
                if( k == 0 ){
                    valorDeCadenaBits = obtenerValor(vector, vector.length,0, valoresDeBits[k]);
                }else if( k == (valoresDeBits.length-1) ){
                    valorDeCadenaBits = obtenerValor(vector, vector.length,valoresDeBits[k-1], valoresDeBits[k]);
                }else{
                    valorDeCadenaBits = obtenerValor(vector, vector.length,valoresDeBits[k-1], valoresDeBits[k]);
                }
                
                System.out.println("Valor "+(k+1)+": "+valorDeCadenaBits);
            }System.out.println();
        }
        
        
        /*Scanner scan = new Scanner(System.in);
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
        */
        
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
