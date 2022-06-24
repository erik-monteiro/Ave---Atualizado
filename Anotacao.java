public class Anotacao //referencia a uma ave que foi avistada
{
	private String data;
	private String aveIdentificada;
	private String local;

	public Anotacao(String data, String aveIdentificada, String local)
	{
		this.data = data;
		this.aveIdentificada = aveIdentificada;
		this.local = local;
	}

	public String getData()
	{
		return data;
	}

	public String getAveIdentificada()
	{
		return aveIdentificada;
	}

	public String getLocal()
	{
		return local;
	}

	
}