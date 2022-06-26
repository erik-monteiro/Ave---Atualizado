/**
* Bloco de anotacoes do usuario
*/
public class Anotacao //referencia a uma ave que foi avistada
{
	private String data;
	private String aveIdentificada;
	private String local;
  /**
  * Mostra as anotacoes feitas pelo usuario.
  * @param data data da qual a ave foi avistada
  * @param aveIdentificada ave identificada pelo usuario
  * @param local onde a ave foi avistada
  */
	public Anotacao(String data, String aveIdentificada, String local)
	{
		this.data = data;
		this.aveIdentificada = aveIdentificada;
		this.local = local;
	}
  /**
    * Obtem a data da qual a ave foi avistada.
    * @return data em que a ave foi avistada
    */
	public String getData()
	{
		return data;
	}
  /**
    * Obtem o nome da ave identificada.
    * @return nome da ave identificada
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

	
}