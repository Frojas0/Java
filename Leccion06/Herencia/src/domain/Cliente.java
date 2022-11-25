package domain;

import java.util.Date;

public class Cliente extends Persona{
    //Atributos
    private int idCliente;
    private static int contadorCliente; //Para el incremento
    private Date fechaRegistro;
    private boolean vip;

    //Constructores
    public Cliente(Date fechaRegistro, String nombre, boolean vip, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion); //Super hereda de la clase padre persona, va siempre primero
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente; //Incremento para un id unico por cliente
    }

    //Metodos Setter and Getter
    public int getIdCliente() {
        return this.idCliente;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public boolean isVip() {
        return this.vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    //Metodo toString con StringBuilder
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
