package proyectometodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProyectoMetodos {

    public static void main(String[] args) {
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
        }*/
        String operandos ="(\\d)+(\\.(\\d)+)?(\\*)?(a|b|c|d)"; 
        String ecuacion = operandos+"(\\s)*((\\+|-)(\\s)*"+operandos+"){0,3}(\\s)*";
        String er = ecuacion+"((\\+|-)(\\s)*(\\d)*)?(\\s)*(<=|>=|<|>|=)(\\s)*("+ecuacion+")?(\\s)*(\\+|-)?(\\s)*(\\d)+(\\s)*";
        Pattern pat = Pattern.compile(er);
        Matcher mat = pat.matcher("125*a-10 >=  576");
        if(mat.matches()){
            System.out.println("Cadena Valida");
        }else{
            System.out.println("Cadena Invalida");
        }
   }    
}
