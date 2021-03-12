
/**
 * A classe Calculadora contém métodos para realizar as operações aritméticas básicas com números reais.
 * 
 * <ul>
 * 	<li>Saber Consumo</li>
 * 	<li> Saber Quantidade De Combustivel</li>
 * 	<li> Saber Capacidade Do Deposito</li>
 * 	<li> Atesta O Deposito Mesmo Transbordando</li>
 * 	<li> Atesta o deposito necessario</li>
 * 	<li> Verifica se tem combustivel para a distancia pretendida</li>
 * 	<li> Caso esteja a andar Para!</li>
 * 	<li> Obter Autonomia</li>
 * </ul>
 * 
 * @author Henrique
 *
 */
public class Carro {
	
	static private final double consumo=5.5; // litros por 100 klm
	
	private double quantidadeCombustivel;
	private double capacidadeDeposito;
	
	// Construtor por defeito 
	
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	// Acessores 

	/**
     * Saber Consumo
     *  
     * @return Consumo
     * 
     */
	public static double getConsumo() {
		return consumo;
	}

	
	/**
     * Saber Quantidade De Combustivel
     * 
     * @return Retorna a quantidade de combustivel
     * 
     */
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	
	/**
     * Saber Capacidade Do Deposito
     * 
     * @return Retorna a capacidade do deposito
     * 
     */

	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	
	// Métodos 
	
	/**
     * Atesta O Deposito Mesmo Transbordando
     * 
     * @param quantidadeCombustivel Quantidade de combustivel no veiculo
     * @param quantidade Quantidade de combustivel a ser depositado
     * 
     * @return retorna a quantidade de combustivel do veiculo
     * 
     */
	
	public double meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o depósito
		// Podia retornar os Litros Metidos 
		quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		return quantidade;
	}
	
	
	// atestar o depósito
	
	/**
     * Atesta o deposito necessario
     * 
     * @param capacidadeDeposito Capacidade maxima do deposito
     * @param quantidadeCombustivel Quantidade de combustivel dentro do veiculo
     * 
     * @return retorna a quantidade de combustivel que o veiculo precisa
     * 
     */

	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	
	// distancia em klm
	/**
     * Verifica se tem combustivel para a distancia pretendida
     * 
     * 
     */
	public boolean andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return true;
		}
		else {
			
			// Aqui ou simplesmente não percorre qualquer distancia 
			// ou anda até parar porque fica sem combustível 
			return false;
		}
			
			
	}
	
	/**
     * Caso esteja a andar Para!
     * 
     * 
     */
	public boolean parar() {
		
		// se estiver a andar pára 
		// falta a flag que indica se o carro está em andamento
		return true;
	}
	
	// kmCombustivel( )    
	/**
     * Obter Autonomia
     * 
     * 
     */
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
