package reservahabitaciones;

import java.time.LocalDate;

public class Resguardo {
  private Long id;
  private Tema asignatura;
  private Responsable profesor;
  private Habitacion lugar;
  private Grupo grupo;
  private int horaInicio;
  private LocalDate fecha;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public Tema getAsignatura() {
    return asignatura;
  }
  
  public void setAsignatura(Tema asignatura) {
    this.asignatura = asignatura;
  }
  
  public Responsable getProfesor() {
    return profesor;
  }
  
  public void setProfesor(Responsable profesor) {
    this.profesor = profesor;
  }
  
  public Habitacion getLugar() {
    return lugar;
  }
  
  public void setLugar(Habitacion lugar) {
    this.lugar = lugar;
  }
  
  public Grupo getGrupo() {
    return grupo;
  }
  
  public void setGrupo(Grupo grupo) {
    this.grupo = grupo;
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

  public Resguardo(Long id, Tema asignatura, Responsable profesor, Habitacion lugar, Grupo grupo,
      int horaInicio, LocalDate fecha) {
    this.id = id;
    setAsignatura(asignatura);
    setProfesor(profesor);
    setLugar(lugar);
    setGrupo(grupo);
    setHoraInicio(horaInicio);
    setFecha(fecha);
  }
  
}
