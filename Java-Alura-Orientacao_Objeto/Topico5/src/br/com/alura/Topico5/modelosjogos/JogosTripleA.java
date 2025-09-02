package br.com.alura.Topico5.modelosjogos;

public class JogosTripleA extends Jogos implements Informar{

    private String empresa;
    private String diretor;

    @Override
    public void exibaInformacoesBasicas() {
        informacoesBasicas();
        System.out.println("Empresa Desenvolvedora: " + empresa);
        System.out.println("Diretor(a): " + diretor);
    }


    //Getters e Setters:

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
