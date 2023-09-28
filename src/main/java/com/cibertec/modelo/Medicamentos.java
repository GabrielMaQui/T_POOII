package com.cibertec.modelo;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "medicamentos")
public class Medicamentos{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmedicamento;
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precio;
    private int stock;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaVencimiento;
    private String proveedor;
    
    public Medicamentos() {
    	super();
    }

   
	public Medicamentos(int idmedicamento, String nombre, String descripcion, String categoria, double precio, int stock, Date fechaVencimiento,String proveedor) {
        super();
		this.idmedicamento = idmedicamento;
		this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.fechaVencimiento = fechaVencimiento;
        this.proveedor = proveedor;
    }
	
    public void setIdmedicamento(int idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    public Date getFechaVencimiento() {
		return fechaVencimiento;
	}


	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


	public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    @Override
   	public String toString() {
   		return "Medicamento [idmedicamento=" + idmedicamento + ", nombre=" + nombre + ", descripcion=" + descripcion
   				+ ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock + ", fechaVencimiento="
   				+ fechaVencimiento + ", proveedor=" + proveedor + "]";
   	}

}
