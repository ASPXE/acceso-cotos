
package com.proyecto.objects;

/**
 *
 * @author aspxe
 */
public class CasasDTO {
    
    private int idCasas;
    private String numInt;
    private String calle;
    private String nombrePersona;
    private String telefono;
    
    // Constructor vacio
    public CasasDTO(){
        
        
    }
    
    // Constructor con todas las variables
    public CasasDTO(int idCasas, String numInt, String Calle,
            String numbrePersona, String telefono){
        this.idCasas = idCasas;
        this.numInt = numInt;
        this.calle = calle;
        this.nombrePersona = nombrePersona;
        this.telefono = telefono;
        
    }
    
    // Constructor sin idCasas
    public CasasDTO(String numInt, String calle, String nombrePersona,
            String telefono){
        this.numInt = numInt;
        this.calle = calle;
        this.nombrePersona = nombrePersona;
        this.telefono = telefono;
    }
    
    // Metodos get y set

    public int getIdCasas() {
        return this.idCasas;
    }

    public void setIdCasas(int idCasas) {
        this.idCasas = idCasas;
    }

    public String getNumInt() {
        return this.numInt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNombrePersona() {
        return this.nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Metodo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CasasDTO{");
        sb.append("idCasas=").append(idCasas);
        sb.append(", numInt=").append(numInt);
        sb.append(", calle=").append(calle);
        sb.append(", nombrePersona=").append(nombrePersona);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
    
    
}
