package com.example.demo.DataModel;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Viajes {
    public @Id @GeneratedValue Long id;
    public String Cliente;
    public String Reserva;
    public String Viaje;

    private Viajes(){}

    public Viajes(String Cliente, String Reserva, String Viaje){
        this.Cliente = Cliente;
        this.Reserva = Reserva;
        this.Viaje = Viaje;
    }
}
