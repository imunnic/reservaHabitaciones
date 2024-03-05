package reservahabitaciones;

import java.util.HashSet;
import java.util.Set;

public class Responsable {
  private Integer id;
  private String nombre;
  private Set<Resguardo> resguardos;
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
  
  public Set<Tema> getTemas() {
    return this.temas;
  }
  
  public void setTemas(Set<Tema> temas) {
    this.temas = temas;
  }
  
  public Set<Resguardo> getResguardo() {
    return this.resguardos;
  }
  
  public void setResguardo(Set<Resguardo> resguardos) {
    this.resguardos = resguardos;
  }
  
  public Responsable() {
    resguardos = new HashSet<Resguardo>();
    temas = new HashSet<Tema>();
  }
  
  public Responsable(Integer id, String nombre, Set<Resguardo> resguardos, Set<Tema> temas) {
    setId(id);
    setNombre(nombre);
    setResguardo(resguardos);
    setTemas(temas);
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
