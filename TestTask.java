

import java.util.Scanner;

public class TestTask {
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);

       Task arr[]= new Task[3];
       int opcion;
       int prioridad,i,marca=0,elimina;
       String descripcion;
       Boolean estado;
       int tar;
       int año;
       int mes;
       int dia;
       
       do{
           System.out.println("        MENU       ");
           System.out.println(" 0- salir          ");
           System.out.println(" 1- Agregar tarea  ");
           System.out.println(" 2- mostrar tarea ");
           System.out.println(" 3- Marcar tarea   ");
           System.out.println(" 4- Eliminar tarea  ");
           opcion=sc.nextInt();
          
           
           switch(opcion){
               
               case 1: 
                   
                 //  LocalTime fecha= LocalTime.of();
                  // LocalTime fech=fecha;
                   
                   for( i=0 ; i<3;++i){
                   
                  System.out.println(" Ingrese Descripcion ");
                  descripcion=sc.next();
                  System.out.println(" Ingrese Estado ");
                  estado=sc.nextBoolean();
                  System.out.println(" Ingrese prioridad ");
                  prioridad=sc.nextInt();
                  System.out.println(" Imgrese año");
                  año=sc.nextInt();
                  System.out.println(" Imgrese mes");
                  mes=sc.nextInt();
                  System.out.println(" Imgrese dia");
                  dia=sc.nextInt();
                  Task Tarea= new Task(descripcion,estado,prioridad,año,mes,dia);
                  arr[i]= Tarea;
                  
                   }
               break;
                
               case 2:
                   
                   for( i=0 ; i<3 ; ++i){
                       
                       System.out.println(" descripcion : "+ arr[i].getdescripcion());
                       System.out.println(" estado : "+ arr[i].getestado());                        
                       System.out.println(" Fecha : "+ arr[i].getfecha());
                       System.out.println(" Prioridad : "+arr[i].getprioridad());
                   }
                break; 
                
               case 3:
                   
                   for(i=0 ; i<3 ;++i){
                       
                       if( arr[i].getdescripcion()!=null){
                           
                           System.out.println( " Tarea : "+ i+1);
                           System.out.println(" prioridad :"+arr[i].getprioridad());
                       }
                   }
                   
                   System.out.println(" Ingrese a que tarea le desea cambiar prioridad ");
                   tar= sc.nextInt();
                    
                         while( tar <= i ){
                        
                        if( tar == i){
                            
                            System.out.println(" Ingrese nueva prioridad");
                            prioridad= sc.nextInt();
                            arr[i-1].setprioridad(prioridad);
                            marca=1;
                        }  
                        i++;
                    }
                         
                     if(marca == 1)System.out.println(" Prioridad modificada");     
                   
               break;
               
               case 4:
                   
                   System.out.println(" Elija tarea que desea eliminar ");
                   
                   for(i=0 ; i<3 ;++i){
                       
                       if( arr[i].getdescripcion()!=null){
                           
                           System.out.println( " Tarea : "+ (i+1));
                       }
                   }
                    elimina= sc.nextInt();
                    
                    while( elimina <= i ){
                        
                        if( elimina == i){
                            
                            arr[i-1]=null;
                                    
                          /*  arr[i-1].setdescripcion(null);
                            arr[i-1].setestado(false);
                            arr[i-1].setprioridad(0);
                            arr[i-1].getfecha();*/
                            marca=1;
                        } 
                        
                        i++;
                    }
                    
                    if(marca == 1)System.out.println(" Tarea eliminada");
                    
                 break;
                 
                   }
               
               
       }while(opcion != 0);
    }
}
