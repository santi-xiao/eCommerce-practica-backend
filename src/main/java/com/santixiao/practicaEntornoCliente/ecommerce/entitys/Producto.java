package com.santixiao.practicaEntornoCliente.ecommerce.entitys;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="productos")
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String descripcion;
	private Double precio;
	@ManyToOne
	@JoinColumn(name ="oferta")
	@JsonBackReference
	private Oferta oferta;
	private Integer cantidad;
	private Boolean activo;
	@ManyToMany()
	@JoinTable(
			name = "producto_categoria",
			joinColumns = @JoinColumn(name = "id_producto"),
			inverseJoinColumns = @JoinColumn(name= "id_categoria")
			)
	private List<Categoria> categorias;
	private Boolean publico;
	
	public List<Categoria> getCategorias(){
		return this.categorias;
	}
	
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Oferta getOferta() {
		return oferta;
	}
	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Boolean getPublico() {
		return publico;
	}
	public void setPublico(Boolean publico) {
		this.publico = publico;
	}
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", oferta=" + oferta + ", cantidad=" + cantidad + ", activo=" + activo + ", categorias=" + categorias
				+ ", publico=" + publico + "]";
	}
}
