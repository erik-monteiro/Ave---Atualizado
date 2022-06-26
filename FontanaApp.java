import java.util.Scanner;

public class FontanaApp {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Ave[] aves = {
			new Ave("pomba-do-orvalho", "patagioenas maculosa", "spot-winged Pigeon", "cinza", "35",
					"campo com árvores", "columbidae", "20", "1", "2"),
			new Ave("coruja-buraqueira", "athene cunicularia", "burrowing Owl", "marrom", "25", "campo seco baixo",
					"strigidae", "25", "2", "2"),
			new Ave("graúna", "gnorinopsar chopi", "chopi blackbird", "preto", "23", "campo seco alto", "icteridae",
					"13", "3", "1"),
			new Ave("canário-Rasteiro", "sicalis citrina", "stripe-tailed Yellow-Finch", "amarelo", "12",
					"campo seco alto", "thraupidae", "40", "1", "2"),
			new Ave("caturrita", "myiopsitta monachus", "monk parakeet", "verde", "27",
					"campo seco baixo e campo com árvores", "psittacidae", "34", "2", "1"),
			new Ave("curiango-do-banhado", "hydropsalis anomala", "Sickle-winged nightjar", "marron", "17",
					"campo seco alto", "caprimulgidae", "26", "1", "2"),
			new Ave("cardeal", "paroaria coronata", "red-crested cardinal", "branco", "17", "campo com arvores",
					"thraupidae", "11", "2", "2"),
			new Ave("cardeal-do-Banhado", "amblyramphus holosericeus", "scarlet-headed blackbird", "preto", "22",
					"banhado com vegetação alta", "icteridae", "14", "3", "1"),
			new Ave("amarelinho-do-Junco", "pseudocolopteryx flaviventris", "warbling doradito", "amarelo", "10",
					"banhado com vegetação alta", "tyrannidae", "40", "3", "1"),
			new Ave("noivinha-coroada", "xolmis coronatus", "black-crowned monjita", "branco", "20",
					"campo com arvores", "tyrannidae", "10", "3", "2") 
		};

		boolean sucesso = true;
		while (sucesso) {
			
			mostrarMenu();

			int opcao = entrada.nextInt();
			String saida = "OK";
			switch (opcao) {

				case 1:
					System.out.println("\f");
					System.out.println(" --- ANOTAÇÕES --- ");
			        System.out.println("\n");
				
			        System.out.println("Primeiramente, digite a data da sua anotação: dd/mm/aaaa ");
					String data = entrada.next(); 
					//data = data.replace("/", ""); 
          
					System.out.println("Qual ave foi identificada? ");
					String aveIdentificada = entrada.next();
          
					System.out.println("Digite o local: ");
					String local = entrada.next();    

					Anotacao[] anotacoes = { new Anotacao (data, aveIdentificada, local) };
          
					for (int i = 0; i < anotacoes.length; i++) {
						System.out.println("\nSuas anotações: ");
						System.out.println("Data: " + anotacoes[i].getData());
						System.out.println("Ave identificada: " + anotacoes[i].getAveIdentificada());
						System.out.println("Local: " + anotacoes[i].getLocal());
					}
					
			
			      	sucesso = false;
					break;

				case 2:
					System.out.println("\f");
					System.out.println("\t --- CATÁLOGO DE AVES --- ");
					System.out.println("\n");
					for (int i = 0; i < aves.length; i++) {
						System.out.printf("%2d - %-18s", i + 1, aves[i].getNomePortugues());
						System.out.printf(" (Página %2s", aves[i].getPagina());
						System.out.printf(" - Linha %s", aves[i].getLinha());
						System.out.printf(" - Coluna %s)%n", aves[i].getColuna());

					}
					System.out.println("\n\n\t --- Digite OK para retornar ao menu --- ");
					String retorno = entrada.next();

					if (retorno.equalsIgnoreCase(saida)) {
						System.out.println("\f");
						continue;
					} else {
						System.out.println("Programa encerrado! Digite somente o que foi pedido.");
						sucesso = false;
						break;
					}

				case 3:
                    System.out.println("\n\nDigite a página: ");
                    String paginaEscolhida = entrada.next();
                    System.out.println("Digite a linha: ");
                    String linhaEscolhida = entrada.next();
                    System.out.println("Digite a coluna: ");
                    String colunaEscolhida = entrada.next();
					
                    int i = 0;
                    int controle = 0;
					
                    while (i != 10) {
                        for (i = 0; i < aves.length; i++) {				
                            if (aves[i].getPagina().equals(paginaEscolhida) &&
	                            aves[i].getLinha().equals(linhaEscolhida) &&
	                            aves[i].getColuna().equals(colunaEscolhida)) {
                                System.out.println("\n\nAve encontrada! Seguem suas características: ");
                                System.out.println("\n\t Nome em Português: " + aves[i].getNomePortugues());
                                System.out.println("\t Nome em Latim: " + aves[i].getNomeLatim());
                                System.out.println("\t Nome em Inglês: " + aves[i].getNomeIngles());
                                System.out.println("\t Cor: " + aves[i].getCor());
                                System.out.println("\t Tamanho: " + aves[i].getTamanho());
                                System.out.println("\t Habitat: " + aves[i].getHabitat());
                                System.out.println("\t Família: " + aves[i].getFamilia()); 
                                System.out.println("\n");
                            } else {
                            	controle++;
                            }
                        }
                        if (controle == 10) {
                            System.out.println("Nenhuma ave encontrada!");
                        	System.out.println("\n");
                        }
                    }
                    break;

				case 4:
					System.out.println("\n\nEscolha uma característica da Ave:");
					System.out.println("\n 1 - Nome em Latim\n 2 - Nome em Inglês\n 3 - Cor\n 4 - Tamanho\n 5 - Habitat\n 6 - Família\n ");
					int opcaoCaracteristica = entrada.nextInt();

					switch (opcaoCaracteristica) {

						case 1:
							System.out.println("\f");
							System.out.println("Digite o nome da ave em latim: ");
							String nomeLatim = entrada.next();
					
							for (i = 0; i < aves.length; i++) {
								if (aves[i].getNomeLatim().contains(nomeLatim.toLowerCase())) {
									System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
								}
							}
							
							break;

						case 2:
							System.out.println("\f");
							System.out.println("Digite o nome da ave em inglês: ");
							String nomeIngles = entrada.next();
					
							for (i = 0; i < aves.length; i++) {
								if (aves[i].getNomeIngles().contains(nomeIngles.toLowerCase())) {
									System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
								}
								
							}
							break;

						case 3:
							System.out.println("\f");
							System.out.println("Digite a cor da ave: ");
							String corAve = entrada.next();
						
							for (i = 0; i < aves.length; i++) {
								if (aves[i].getCor().contains(corAve.toLowerCase())) {
									System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
								}
							}
							
							break;

						case 4:
							System.out.println("\f");
							System.out.println("Digite o tamanho da ave, em centímetros: ");
							String tamanhoAve = entrada.next();
							
							for (i = 0; i < aves.length; i++) {
								if (aves[i].getTamanho().contains(tamanhoAve.toLowerCase())) {
									System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
								}
							}
							
							break;

						case 5:
							System.out.println("\f");
							System.out.println("Digite o habitat da ave: ");
							String habitatAve = entrada.next();
							
							for (i = 0; i < aves.length; i++) {
								if (aves[i].getHabitat().contains(habitatAve.toLowerCase())) {
									System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
								}
							}
							
							break;

						case 6:
							System.out.println("\f");
							System.out.println("Digite a família da ave desejada: ");
							String familiaAve = entrada.next();
							
							for (i = 0; i < aves.length; i++) {
								if (aves[i].getFamilia().contains(familiaAve.toLowerCase())) {
									System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
								}
							}
							
							break;

						default:
							System.out.println("\nOPÇÃO INCORRETA! Digite somente o que foi pedido!");
							break;
					}

				case 5:
					System.out.println("Programa encerrado!");
					sucesso = false;
					break;

				default:
					System.out.println("\nOPÇÃO INCORRETA! Digite somente 1 ou 2.");
					continue;
			}
		}
	}
  /**
  * Mostra o menu inicial do programa.
  */
	public static void mostrarMenu() {
		System.out.println("\n\t        MENU");
		System.out.println("\t        ====");
		System.out.println("\t1 - Anotar ");
		System.out.println("\t2 - Consultar catálogo ");
		System.out.println("\t3 - Consultar catálogo por páginas ");
		System.out.println("\t4 - Pesquisar ave ");
		System.out.println("\t5 - Sair do programa ");
	}

}
