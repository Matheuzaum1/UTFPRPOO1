package Extras.Lista6.Ex4;

public class Data {
    protected int dia;

    public Data() {
        this(1,01,2019);
    }



    public Data(int dia) {
        this(dia,01,2019);
    }
    protected int mes;
    protected int ano;
    
    public Data(int mes, int ano) {
       this(1, mes, ano);
    }

    

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

}
