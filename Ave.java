public class Ave 
{	
	private String nomePortugues;
	private String nomeLatim;
	private String nomeIngles;
	private String cor;
	private String tamanho;
	private String habitat;
	private String familia;
	private String pagina;
	private String linha;
	private String coluna;

    /**
    * Contem todas as informacoes sobre as aves selecionadas e inseridas no programa
    * @param nomePortugues nome da ave em portugues
    * @param nomeLatim nome da ave em latim
    * @param nomeIngles nome da ave em ingles
    * @param cor cor da ave
    * @param tamanho tamanho da ave
    * @param habitat habitat natural da ave
    * @param familia familia da qual a ave pertence
    * @param pagina pagina onde a ave se encontra no "guia das aves"
    * @param linha linha da pagina onde a ave se encontra no "guia das aves"
    * @param coluna coluna da pagina onde a ave se encontra no "guia das aves"
    */
    public Ave(String nomePortugues, String nomeLatim, String nomeIngles, 
    			String cor, String tamanho, String habitat, String familia, 
				String pagina, String linha,String coluna)
    {
        this.nomePortugues = nomePortugues;
        this.nomeLatim = nomeLatim;
        this.nomeIngles = nomeIngles;
        this.cor = cor;
        this.tamanho = tamanho;
        this.habitat = habitat;
        this.familia = familia;
        this.pagina = pagina;
        this.linha = linha;
        this.coluna = coluna;
    }
    /**
    * Obtem o nome da ave em portugues.
    * @return nome da ave em portugues
    */
    public String getNomePortugues()
    {
        return nomePortugues;
    }
    /**
    * Obtem o nome da ave em latim.
    * @return nome da ave em latim
    */
    public String getNomeLatim()
    {
        return nomeLatim;
    }
    /**
    * Obtem o nome da ave em ingles.
    * @return nome da ave em ingles
    */
    public String getNomeIngles()
    {
        return nomeIngles;
    }
    /**
    * Obtem a cor da ave.
    * @return cor da ave
    */
    public String getCor()
    {
        return cor;
    }
    /**
    * Obtem o tamanho da ave.
    * @return tamanho da ave
    */
    public String getTamanho()
    {
        return tamanho;
    }
    /**
    * Obtem o habitat natural da ave.
    * @return habitat natural da ave
    */
    public String getHabitat()
    {
        return habitat;
    }
    /**
    * Obtem a familia da qual a ave pertence.
    * @return familia da qual a ave pertence
    */
    public String getFamilia()
    {
        return familia;
    }
    /**
    * Obtem a pagina do "guia de aves" onde a ave se encontra.
    * @return pagina do "guia das aves" onde a ave se encontra
    */
    public String getPagina()
    {
        return pagina;
    }
    /**
    * Obtem a linha da pagina do "guia de aves" onde a ave se encontra.
    * @return linha da pagina do "guia das aves" onde a ave se encontra
    */
    public String getLinha()
    {
        return linha;
    }
    /**
    * Obtem a coluna pagina do "guia de aves" onde a ave se encontra.
    * @return coluna da pagina do "guia das aves" onde a ave se encontra
    */
    public String getColuna()
    {
        return coluna;
    }
	
}
