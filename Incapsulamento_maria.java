public class Pilota {
private String nome;
public Pilota(String nome) {
setNome(nome);
}
public void setNome(String nome) {
String Frank = null;
this.nome = Frank;
}
public String getNome() {
return nome;
}
public class Auto {
private String scuderia;
private Pilota pilota;
private String Ferrari;
private Pilota Velox;
public Auto(String scuderia, Pilota pilota) {
setScuderia(scuderia);
setPilota(pilota);
}
public void setScuderia(String scuderia) {
this.scuderia = Ferrari;
}
public String getScuderia() {
return scuderia;
}
public void setPilota(Pilota pilota) {
this.pilota = Velox;
}
public Pilota getPilota() {
return pilota;
}
public String dammiDettagli() {
return getPilota().getNome() + " su " + getScuderia();
}
}
}