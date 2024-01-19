
package com.proyecto.objects;

/**
 *
 * @author aspxe
 */
public class VigilantesDTO {
    
    private int idVigilantes;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombreUsuario;
    private String passwd;
    private String horario;
    
    // Constructor vacio
    public VigilantesDTO(){
        
    }
    
    // Constructor con todas las variables
    public VigilantesDTO(int idVigilantes, String nombres, String
            apellidoPaterno, String apellidoMaterno, String nombreUsuario,
            String passwd, String horario){
        this.idVigilantes = idVigilantes;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombreUsuario = nombreUsuario;
        this.passwd = passwd;
        this.horario = horario;
    }
    
    // Constructor sin idVigilantes
    public VigilantesDTO(String nombres, String
            apellidoPaterno, String apellidoMaterno, String nombreUsuario,
            String passwd, String horario){
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombreUsuario = nombreUsuario;
        this.passwd = passwd;
        this.horario = horario;
    }
    
    // Constructor sin idVigilantes y apellidoMaterno
    public VigilantesDTO(String nombres, String
            apellidoPaterno, String nombreUsuario,
            String passwd, String horario){
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.nombreUsuario = nombreUsuario;
        this.passwd = passwd;
        this.horario = horario;
    }
    
    // Constructor con solo nombreUsuario y passwd
    public VigilantesDTO(String nombreUsuario, String passwd){
        this.nombreUsuario = nombreUsuario;
        this.passwd = passwd;
    }
    
    // Metodos get y set

    public int getIdVigilantes() {
        return this.idVigilantes;
    }

    public void setIdVigilantes(int idVigilantes) {
        this.idVigilantes = idVigilantes;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    // Metodo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VigilantesDTO{");
        sb.append("idVigilantes=").append(idVigilantes);
        sb.append(", nombres=").append(nombres);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
        sb.append(", nombreUsuario=").append(nombreUsuario);
        sb.append(", passwd=").append(passwd);
        sb.append(", horario=").append(horario);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
