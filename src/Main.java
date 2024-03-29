import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Locale.setDefault(Locale.US);                                                     
         Scanner sc = new Scanner(System.in);                                              
                                                                                           
         Double salario = 0.0;                                                             
         Double prestacaoServico = 0.0;                                                    
         Double ganhoCapital = 0.0;                                                        
         Double medico = 0.0;                                                              
         Double educacionais = 0.0;                                                        
                                                                                           
         Double impostoSalario = 0.0;                                                      
                                                                                           
         Double impostoPrestacaoServico = 0.0;                                             
         Double impostoGanhoCapital = 0.0;                                                 
         Double totalImposto = 0.0;                                                        
         Double totalImpostoComAbatimento;                                                 
         Double pretencaoAbatimento;                                                       
         Double abatimento;                                                                
         Double salarioMensal;                                                             
                                                                                           
                                                                                           
         System.out.print("Renda anual com salário: ");                                    
         salario = sc.nextDouble();                                                        
                                                                                           
         System.out.print("Renda anual com prestação de serviço: ");                       
         prestacaoServico = sc.nextDouble();                                               
                                                                                           
         System.out.print("Renda anual com ganho de capital: ");                           
         ganhoCapital = sc.nextDouble();                                                   
                                                                                           
         System.out.print("Gastos médicos: ");                                             
         medico = sc.nextDouble();                                                         
                                                                                           
         System.out.print("Gastos educacionais: ");                                        
         educacionais = sc.nextDouble();                                                   
         System.out.println(" ");                                                          
                                                                                           
                                                                                           
         salarioMensal = salario / 12;                                                     
                                                                                           
                                                                                           
         if (salarioMensal < 3000.0) {                                                     
             impostoSalario = 0.0;                                                         
         } else if (salarioMensal >= 3000.0 & salarioMensal < 5000.0) {                    
             impostoSalario = salario * 0.1;                                               
         } else {                                                                          
             impostoSalario = salario * 0.2;                                               
         }                                                                                 
                                                                                           
                                                                                           
         if (prestacaoServico > 0.0) {                                                     
             impostoPrestacaoServico = prestacaoServico * 0.15;                            
         }                                                                                 
                                                                                           
         if (ganhoCapital > 0.0) {                                                         
             impostoGanhoCapital = ganhoCapital * 0.2;                                     
         }                                                                                 
                                                                                           
         totalImposto = impostoSalario + impostoPrestacaoServico + impostoGanhoCapital;    
                                                                                           
         pretencaoAbatimento = medico + educacionais;                                      
                                                                                           
                                                                                           
         if (pretencaoAbatimento < totalImposto * 0.3) {                                   
             totalImpostoComAbatimento = totalImposto - pretencaoAbatimento;               
             abatimento = pretencaoAbatimento;                                             
         } else {                                                                          
             totalImpostoComAbatimento = totalImposto - totalImposto * 0.3;                
             abatimento = totalImposto * 0.3;                                              
         }                                                                                 
                                                                                           
         System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");                              
         System.out.println(" ");                                                          
                                                                                           
         System.out.println("CONSOLIDADO DE RENDA: ");                                     
         System.out.printf("Imposto sobre salário: %.2f %n", impostoSalario);              
         System.out.printf("Imposto sobre serviços: %.2f %n", impostoPrestacaoServico);    
         System.out.printf("Imposto sobre ganho de capital: %.2f %n", impostoGanhoCapital);
         System.out.println(" ");                                                          
                                                                                           
         System.out.println("DEDUÇÕES:");                                                  
         System.out.printf("Máximo dedutível: %.2f %n", totalImposto * 0.3);               
         System.out.printf("Gastos dedutíveis: %.2f %n", pretencaoAbatimento);             
         System.out.println(" ");                                                          
                                                                                           
         System.out.println("RESUMO:");                                                    
         System.out.printf("Imposto bruto total: %.2f %n", totalImposto);                  
         System.out.printf("Abatimento: %.2f %n", abatimento);                             
         System.out.printf("Imposto devido: %.2f %n", totalImpostoComAbatimento);          
                                                                                           
         sc.close();                                                                       
   
    }
}
