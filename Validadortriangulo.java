import java.util.Scanner;

public class Validadortriangulo{
    public static void main(String[] args) {
        //Declaração de vaiáveis 
        int a, b, c; //Lados de um triângulo
         
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação 
        System.out.println("\n\t\t\t -- Validador de Triângulo --\n");

        //Entrada
        System.out.print("informe o lado a: ");
        a = entrada.nextInt();
        System.out.print("informe o lado b: ");
        b = entrada.nextInt();
        System.out.print("inforem o lado c: ");
        c = entrada.nextInt();

        //Processamento
        if((a < (b+c))&&(b < (a+c))&&(c < (a+b))){
            //É triângulo
            System.out.printf("Sd, %d e Sd formas triângulo!\n", a, b, c);
        
        } else{
            //Não é triângulo
            System.out.printf("\n%d, %d e %d NÃO formam triângulo!\n", a, b, c);
        }





    }
}