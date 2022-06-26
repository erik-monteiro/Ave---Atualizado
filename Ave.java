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
	  * Obtem o nome do passaro em portugues.
	  */
    public String getNomePortugues()
    {
        return nomePortugues;
    }
	  /**
	  * Obtem o nome do passaro em latim.
	  */
    public String getNomeLatim()
    {
        return nomeLatim;
    }
    /**
	  * Obtem o nome do passaro em ingles.
	  */
    public String getNomeIngles()
    {
        return nomeIngles;
    }
    /**
	  * Obtem a cor do passaro.
	  */
    public String getCor()
    {
        return cor;
    }
    /**
	  * Obtem o tamanho do passaro.
	  */
    public String getTamanho()
    {
        return tamanho;
    }
    /**
	  * Obtem o habitat onde o passaro pode ser encontrado.
	  */
    public String getHabitat()
    {
        return habitat;
    }
    /**
	  * Obtem a familia da qual o do passaro pertence.
	  */
    public String getFamilia()
    {
        return familia;
    }
    /**
	  * Obtem a pagina da qual o passaro se encontra no guia de aves.
	  */
    public String getPagina()
    {
        return pagina;
    }
    
    public String getLinha()
    {
        return linha;
    }
    
    public String getColuna()
    {
        return coluna;
    }
	
}
