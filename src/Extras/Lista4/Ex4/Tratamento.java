package Extras.Lista4.Ex4;

public class Tratamento {
    private String descricao;
    private String dataInicio;
    private String dataFim;
   
  

    public Tratamento(String descricao, String dataInicio) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
    }



    public String getDescricao() {
        return descricao;
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public String getDataInicio() {
        return dataInicio;
    }



    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }



    public String getDataFim() {
        return dataFim;
    }



    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }



    public Tratamento finalizarTratamento(String dataFimTratamento) {
        this.dataFim = dataFimTratamento;
        System.out.println("Tratamento concluido com sucesso");
        System.out.println("Data de inicio: " + this.dataInicio);
        System.out.println("Data de fim: " + this.dataFim);
        return this;
    }
    

}
