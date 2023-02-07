import javax.annotation.processing.SupportedOptions;

public class Lutadores {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    public Lutadores(String no, String na, int id, float al, float pe, int vi, int de, int em){
        nome = no;
        nacionalidade = na;
        idade = id;
        altura = al;
        setPeso(pe);
        vitorias = vi;
        derrotas = de;
        empates = em;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
      if (peso < 52.2){
        categoria = "Inválida";
      }
      else if (peso <= 70.3){
        categoria = "Leve";
      }
      else if (peso <= 83.9){
        categoria = "Médio";
      }
      else if (peso <= 120.2){
        categoria = "Pesado";
      }
      else{        
        categoria = "Inválido";
    }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }
    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println (getIdade()  + " anos");
        System.out.println( getAltura() + " m de altura");
        System.out.println("Pesando " + getPeso() + "kg");
        System.out.println("Ganhou " + getVitorias());
        System.out.println("Perdeu: " +getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("é um peso " +getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+1); 
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    public void empatarLutas(){
        setEmpates(getEmpates()+1);
    }
}
