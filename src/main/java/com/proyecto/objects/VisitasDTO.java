
package com.proyecto.objects;

import java.sql.Timestamp;

/**
 *
 * @author aspxe
 */
public class VisitasDTO {
    
    private int idVisitas;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int numeroCasa; // llave foranea
    private String matriculaVehiculo;
    private Timestamp fechaEntrada;
    private Timestamp fechaSalida;
    private String tipo;
    private String dependencia;
    private String cedula;
    private int vigilante; // llave foranea
    
    // Constructor con todas las variables
    public VisitasDTO(int idVisitas, String nombres, String apellidoPaterno,
            String apellidoMaterno, int numeroCasa, String matriculaVehiculo,
            Timestamp fechaEntrada, Timestamp fechaSalida, String tipo,
            String dependencia, String cedula, int vigilante){
        this.idVisitas = idVisitas;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numeroCasa = numeroCasa;
        this.matriculaVehiculo = matriculaVehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipo = tipo;
        this.dependencia = dependencia;
        this.cedula = cedula;
        this.vigilante = vigilante;
    }
    
    // Constructor sin idVisitas
    public VisitasDTO(String nombres, String apellidoPaterno,
            String apellidoMaterno, int numeroCasa, String matriculaVehiculo,
            Timestamp fechaEntrada, Timestamp fechaSalida, String tipo,
            String dependencia, String cedula, int vigilante){
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numeroCasa = numeroCasa;
        this.matriculaVehiculo = matriculaVehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipo = tipo;
        this.dependencia = dependencia;
        this.cedula = cedula;
        this.vigilante = vigilante;
    }
    
    // Constructor sin idVisitas y apellidoMaterno
    public VisitasDTO(String nombres, String apellidoPaterno,int numeroCasa, String matriculaVehiculo,
            Timestamp fechaEntrada, Timestamp fechaSalida, String tipo,
            String dependencia, String cedula, int vigilante){
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCasa = numeroCasa;
        this.matriculaVehiculo = matriculaVehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipo = tipo;
        this.dependencia = dependencia;
        this.cedula = cedula;
        this.vigilante = vigilante;
    }
    
    // Constructor sin idVisitas, apellidoMaterno y matriculaVehiculo
    public VisitasDTO(String nombres, String apellidoPaterno,int numeroCasa,
            Timestamp fechaEntrada, Timestamp fechaSalida, String tipo,
            String dependencia, String cedula, int vigilante){
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCasa = numeroCasa;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipo = tipo;
        this.dependencia = dependencia;
        this.cedula = cedula;
        this.vigilante = vigilante;
    }
    
        /* Constructor sin idVisitas, apellidoMaterno, matriculaVehiculo
        y fechaSalida
        */
    public VisitasDTO(String nombres, String apellidoPaterno,int numeroCasa,
            Timestamp fechaEntrada, String tipo,
            String dependencia, String cedula, int vigilante){
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCasa = numeroCasa;
        this.fechaEntrada = fechaEntrada;
        this.tipo = tipo;
        this.dependencia = dependencia;
        this.cedula = cedula;
        this.vigilante = vigilante;
    }
    
    /* Constructor sin idVisitas, apellidoMaterno, matriculaVehiculo
        ,fechaSalida y dependencia
        */
    public VisitasDTO(String nombres, String apellidoPaterno,int numeroCasa,
            Timestamp fechaEntrada, String tipo, String cedula, int vigilante){
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCasa = numeroCasa;
        this.fechaEntrada = fechaEntrada;
        this.tipo = tipo;
        this.cedula = cedula;
        this.vigilante = vigilante;
    }
    
    /* Constructor sin idVisitas, apellidoMaterno, matriculaVehiculo
        ,fechaSalida, dependencia y cedula
        */
    
    public VisitasDTO(String nombres, String apellidoPaterno,int numeroCasa,
            Timestamp fechaEntrada, String tipo, int vigilante){
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCasa = numeroCasa;
        this.fechaEntrada = fechaEntrada;
        this.tipo = tipo;
        this.vigilante = vigilante;
    }
    
    // Metodos get y set

    public int getIdVisitas() {
        return this.idVisitas;
    }

    public void setIdVisitas(int idVisitas) {
        this.idVisitas = idVisitas;
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

    public int getNumeroCasa() {
        return this.numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getMatriculaVehiculo() {
        return this.matriculaVehiculo;
    }

    public void setMatriculaVehiculo(String matriculaVehiculo) {
        this.matriculaVehiculo = matriculaVehiculo;
    }

    public Timestamp getFechaEntrada() {
        return this.fechaEntrada;
    }

    public void setFechaEntrada(Timestamp fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Timestamp getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(Timestamp fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDependencia() {
        return this.dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getVigilante() {
        return this.vigilante;
    }

    public void setVigilante(int vigilante) {
        this.vigilante = vigilante;
    }
    
    // Metodo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VisitasDTO{");
        sb.append("idVisitas=").append(idVisitas);
        sb.append(", nombres=").append(nombres);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
        sb.append(", numeroCasa=").append(numeroCasa);
        sb.append(", matriculaVehiculo=").append(matriculaVehiculo);
        sb.append(", fechaEntrada=").append(fechaEntrada);
        sb.append(", fechaSalida=").append(fechaSalida);
        sb.append(", tipo=").append(tipo);
        sb.append(", dependencia=").append(dependencia);
        sb.append(", cedula=").append(cedula);
        sb.append(", vigilante=").append(vigilante);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
