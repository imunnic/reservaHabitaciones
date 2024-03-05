package reservahabitaciones;

import java.time.LocalDate;

public class Resguardo {
  private Long id;
  private Tema tema;
  private Responsable responsable;
  private Habitacion habitacion;
  private Equipo equipo;
  private int horaInicio;
  private LocalDate fecha;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public Tema getTema() {
    return tema;
  }
  
  public void setTema(Tema tema) {
    this.tema = tema;
  }
  
  public Responsable getResponsable() {
    return responsable;
  }
  
  public void setResponsable(Responsable responsable) {
    this.responsable = responsable;
  }
  
  public Habitacion getHabitacion() {
    return habitacion;
  }
  
  public void setHabitacion(Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
  public Equipo getEquipo() {
    return equipo;
  }
  
  public void setEquipo(Equipo equipo) {
    this.equipo = equipo;
  }
  
  public int getHoraInicio() {
    return horaInicio;
  }
  
  public void setHoraInicio(int horaInicio) {
    this.horaInicio = horaInicio;
  }
  
  public LocalDate getFecha() {
    return fecha;
  }
  
  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public Resguardo() {}

  public Resguardo(Long id, Tema tema, Responsable responsable, Habitacion habitacion, Equipo equipo,
      int horaInicio, LocalDate fecha) {
    this.id = id;
    setTema(tema);
    setResponsable(responsable);
    setHabitacion(habitacion);
    setEquipo(equipo);
    setHoraInicio(horaInicio);
    setFecha(fecha);
  }
  
}
