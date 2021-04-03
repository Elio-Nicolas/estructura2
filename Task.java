
 // clase Task donde estaran nuestros atributos y metodos
import java.time.*;

public class Task {
    
    private String descripcion=null;
    private Boolean estado=true;
    private int prioridad=0;
    private LocalDate fecha;
    

     Task( String desc , Boolean est,int priori,int año,int mes,int dia ){
        
       this.descripcion= desc;
       this.estado=est;
       this.prioridad=priori;
       
       this.fecha=LocalDate.of( año,mes, dia);
       
    }
public String getdescripcion (){
     return descripcion;
}

public void setdescripcion (String descripcion){
    this.descripcion = descripcion;
}     

public Boolean getestado (){
     return estado;
}

public void setestado (Boolean estado){
    this.estado = estado;
}   

public LocalDate getfecha (){
     return fecha;
}

public int getprioridad (){
     return prioridad;
}

public void setprioridad (int prioridad){
    this.prioridad = prioridad;
}   

}
