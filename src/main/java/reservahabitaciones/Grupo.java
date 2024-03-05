package reservahabitaciones;

import java.util.HashSet;
import java.util.Set;

public class Grupo {
  private Integer id;
  private String nombre;
  private int cantidad;
  private Set<Tema> asignaturas;
  
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
  
  public Set<Tema> getAsignaturas() {
    return asignaturas;
  }
  
  public void setAsignaturas(Set<Tema> asignaturas) {
    this.asignaturas = asignaturas;
  }
  
  public Grupo() {
    asignaturas = new HashSet<Tema>();
  }
  
  public Grupo(int id, String nombre, int cantidad, Set<Tema> asignaturas) {
    setId(id);
    setNombre(nombre);
    setCantidad(cantidad);
    setAsignaturas(asignaturas);
  }
  
  @Override
  public int hashCode() {
    return getId().intValue();
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj.getClass().isAssignableFrom(Grupo.class)) {      
      return hashCode() == obj.hashCode();
    } else {
      return false;
    }
  }
}
