package reservahabitaciones;

import java.util.HashSet;
import java.util.Set;

public class Responsable {
  private Integer id;
  private String nombre;
  private Set<Resguardo> reservas;
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
  
  public Set<Tema> getAsignaturas() {
    return asignaturas;
  }
  
  public void setAsignaturas(Set<Tema> asignaturas) {
    this.asignaturas = asignaturas;
  }
  
  public Set<Resguardo> getReservas() {
    return reservas;
  }
  
  public void setReservas(Set<Resguardo> reservas) {
    this.reservas = reservas;
  }
  
  public Responsable() {
    reservas = new HashSet<Resguardo>();
    asignaturas = new HashSet<Tema>();
  }
  
  public Responsable(Integer id, String nombre, Set<Resguardo> reservas, Set<Tema> asignaturas) {
    super();
    this.id = id;
    this.nombre = nombre;
    this.reservas = reservas;
    this.asignaturas = asignaturas;
  }
  
  @Override
  public int hashCode() {
    return getId().intValue();
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj.getClass().isAssignableFrom(Responsable.class)) {      
      return hashCode() == obj.hashCode();
    } else {
      return false;
    }
  }

}
