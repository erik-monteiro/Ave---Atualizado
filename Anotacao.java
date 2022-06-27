/**
* Um "bloco de notas" para o usuario inserir suas anotacoes.
*/
public class Anotacao //referencia a uma ave que foi avistada
{
    private String dia;
    private String mes;
    private String ano;
    private String aveIdentificada;
    private String local;
    private String outraAnotacao;
    /**
    * Anotacoes registradas pelo usuario
    * @param dia dia em que a ave foi avistada
    * @param mes mes em que a ave foi avistada
    * @param ano ano em que a ave foi avistada
    * @param aveIdentificada ave identificada pelo usuario
    * @param local local onde a ave foi avistada
    * @param novaAnotacao nova anotacao
    */
    public Anotacao(String dia ,String mes, String ano, String aveIdentificada, String local, String outraAnotacao)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.aveIdentificada = aveIdentificada;
        this.local = local;
        this.outraAnotacao = outraAnotacao;
    }
    /**
    * Obtem o dia em que a ave foi avistada.
    * @return dia em que a ave foi avistada
    */
    public String getDia()
    {
        return dia;
    }
    /**
    * Obtem o mes em que a ave foi avistada.
    * @return mes em que a ave foi avistada
    */
     public String getMes()
    {
        return mes;
    }
    /**
    * Obtem o ano em que a ave foi avistada.
    * @return ano em que a ave foi avistada
    */
     public String getAno()
    {
        return ano;
    }
    /**
    * Obtem qual ave foi identificada pelo usuario.
    * @return ave identificada pelo usuario
    */
    public String getAveIdentificada()
    {
        return aveIdentificada;
    }
    /**
    * Obtem o local onde a ave foi avistada.
    * @return local onde a ave foi avistada
    */
    public String getLocal()
    {
        return local;
    }
    /**
    * Obtem qualquer tipo de atonacao extra por parte do usuario.
    * @return anotacoes extras feitas pelo usuario
    */
    public String getOutraAnotacao()
    {
        return outraAnotacao;
    }
    
}