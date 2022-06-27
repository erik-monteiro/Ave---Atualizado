public class Anotacao //referencia a uma ave que foi avistada
{
    private String dia;
    private String mes;
    private String ano;
    private String aveIdentificada;
    private String local;
    private String outraAnotacao;

    public Anotacao(String dia ,String mes, String ano, String aveIdentificada, String local, String outraAnotacao)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.aveIdentificada = aveIdentificada;
        this.local = local;
        this.outraAnotacao = outraAnotacao;
    }

    public String getDia()
    {
        return dia;
    }
    
     public String getMes()
    {
        return mes;
    }
    
     public String getAno()
    {
        return ano;
    }

    public String getAveIdentificada()
    {
        return aveIdentificada;
    }

    public String getLocal()
    {
        return local;
    }

    public String getOutraAnotacao()
    {
        return outraAnotacao;
    }
    
}