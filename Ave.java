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

    public String getNomePortugues()
    {
        return nomePortugues;
    }

    public String getNomeLatim()
    {
        return nomeLatim;
    }

    public String getNomeIngles()
    {
        return nomeIngles;
    }

    public String getCor()
    {
        return cor;
    }

    public String getTamanho()
    {
        return tamanho;
    }

    public String getHabitat()
    {
        return habitat;
    }

    public String getFamilia()
    {
        return familia;
    }

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
