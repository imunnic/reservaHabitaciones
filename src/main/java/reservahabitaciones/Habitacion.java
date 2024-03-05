package reservahabitaciones;

public class Habitacion {
  private Integer id;
  private String nombre;
  private int capacidad;
  
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
  
  public int getCapacidad() {
    return capacidad;
  }
  
  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }
  
  public Habitacion() {
    
  }
  
  public Habitacion(int id, String nombre, int capacidad) {
    setId(id);
    setNombre(nombre);
    setCapacidad(capacidad);
  }
}
