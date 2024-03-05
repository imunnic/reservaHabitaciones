package reservahabitaciones;

import java.util.HashSet;
import java.util.Set;

public class Equipo {
  private Integer id;
  private String nombre;
  private int cantidad;
  private Set<Tema> temas;
  
  public Integer getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = Integer.valueOf(id);
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public int getCantidad() {
    return cantidad;
  }
  
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
  
  public Set<Tema> getTemas() {
    return temas;
  }
  
  public void setTemas(Set<Tema> temas) {
    this.temas = temas;
  }
  
  public Equipo() {
    temas = new HashSet<Tema>();
  }
  
  public Equipo(int id, String nombre, int cantidad, Set<Tema> temas) {
    setId(id);
    setNombre(nombre);
    setCantidad(cantidad);
    setTemas(temas);
  }
  
  @Override
  public int hashCode() {
    return getId().intValue();
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj.getClass().isAssignableFrom(Equipo.class)) {      
      return hashCode() == obj.hashCode();
    } else {
      return false;
    }
  }
}
