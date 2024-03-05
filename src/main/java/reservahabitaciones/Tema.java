package reservahabitaciones;

import java.util.HashSet;
import java.util.Set;

public class Tema {
  private Integer id;

  private String nombre;

  private Set<Habitacion> lugares;
  
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
  
  public void setLugares(Set<Habitacion> lugares) {
    this.lugares = lugares;
  }
  
  public Set<Habitacion> getLugares() {
    return lugares;
  }
  
  public Tema() {
    lugares = new HashSet<Habitacion>();
  }

  public Tema(Integer id, String nombre, Set<Habitacion> lugares) {
    setId(id);
    setNombre(nombre);
    setLugares(lugares);
  }
  
  @Override
  public int hashCode() {
    return getId().intValue();
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj.getClass().isAssignableFrom(Tema.class)) {      
      return hashCode() == obj.hashCode();
    } else {
      return false;
    }
  }
  
  
}
