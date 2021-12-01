package br.inatel;

import java.util.ArrayList;

public class Corretora {
  public static int contador;
  private int id;
  private String nome;
  private String UF;
  private ArrayList<Corretor> corretoresVinculados;

  public Corretora(String nomeCorretora, String UFCorretora) {
    contador++;
    this.id = contador;
    this.nome = nomeCorretora;
    this.UF = UFCorretora;
    this.corretoresVinculados = new ArrayList<Corretor>();
  }

  public void vincularCorretor(Corretor novoCorretor) {
    this.corretoresVinculados.add(novoCorretor);
  }

  public ArrayList<Corretor> getCorretoresVinculados() {
    return corretoresVinculados;
  }

  public ArrayList<String> getNomeCorretoresVinculados() {
    ArrayList<String> nomes = new ArrayList<String>();
    for (Corretor corretorVinculado : this.getCorretoresVinculados()) {
      nomes.add(corretorVinculado.nome);
    }

    return nomes;
  }

  public void mostraInfo() {
    System.out.println("ID " + this.getId());
    System.out.println("Nome " + this.getNome());
    System.out.println("UF " + this.getUF());
    System.out.println("Corretores vinculados: " + getNomeCorretoresVinculados());
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getUF() {
    return UF;
  }

  public void setUF(String uF) {
    UF = uF;
  }

}