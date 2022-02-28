package br.com.dio.dominio;

public class Curso {
  private String descrição;
  private String titulo;
  private int cargaHoraria;

  public Curso(){}

  public String getDescrição() {
    return descrição;
  }

  public void setDescrição(String descrição) {
    this.descrição = descrição;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso{" +
            "descrição='" + descrição + '\'' +
            ", titulo='" + titulo + '\'' +
            ", cargaHoraria=" + cargaHoraria +
            '}';
  }
}
