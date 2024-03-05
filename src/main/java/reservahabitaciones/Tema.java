package reservahabitaciones;

import java.util.HashSet;
import java.util.Set;

public class Tema {
  private Integer id;

  private String nombre;

  private Set<Habitacion> habitaciones;
  
  private Set<Equipo> equipos;
  
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
  
  public void setHabitaciones(Set<Habitacion> habitaciones) {
    this.habitaciones = habitaciones;
  }
  
  public Set<Habitacion> getHabitaciones() {
    return habitaciones;
  }
  
  public void setEquipos(Set<Equipo> equipos) {
    this.equipos = equipos;
  }
  
  public Set<Equipo> getEquipos() {
    return equipos;
  }
  
  public Tema() {
    habitaciones = new HashSet<Habitacion>();
    equipos = new HashSet<Equipo>();
  }

  public Tema(Integer id, String nombre, Set<Habitacion> habitaciones, Set<Equipo> equipos) {
    setId(id);
    setNombre(nombre);
    setHabitaciones(habitaciones);
    setEquipos(equipos);
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
