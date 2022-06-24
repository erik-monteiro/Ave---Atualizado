import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Ave[] aves = {
				new Ave("pomba-do-Orvalho", "patagioenas maculosa", "spot-winged Pigeon", "cinza", "35",
						"campo 						com árvores", "columbidae", "20", "1", "2"),
				new Ave("coruja-buraqueira", "Athene cunicularia", "Burrowing Owl", "marrom", "25", "Campo seco baixo",
						"Strigidae", "25", "2", "2"),
				new Ave("Graúna", "Gnorinopsar chopi", "Chopi Blackbird", "preto", "23", "Campo seco alto", "Icteridae",
						"13", "3", "1"),
				new Ave("Canário-Rasteiro", "Sicalis citrina", "Stripe-tailed Yellow-Finch", "amarelo", "12",
						"Compo seco alto", "Thraupidae", "40", "1", "2"),
				new Ave("Caturrita", "Myiopsitta monachus", "Monk Parakeet", "verde", "27",
						"Campo seco baixo e Campo com árvores", "Psittacidae", "34", "2", "1"),
				new Ave("curiango-do-banhado", "hydropsalis anomala", "Sickle-winged nightjar", "marron", "17",
						"campo seco alto", "caprimulgidae", "26", "1", "2"),
				new Ave("Cardeal", "Paroaria coronata", "Red-crested Cardinal", "branco", "17", "Campo com arvores",
						"Thraupidae", "11", "2", "2"),
				new Ave("Cardeal-do-Banhado", "Amblyramphus holosericeus", "Scarlet-headed Blackbird", "Preto", "22",
						"banhado com vegetação alta", "Icteridae", "14", "3", "1"),
				new Ave("Amarelinho-do-Junco", "Pseudocolopteryx flaviventris", "Warbling Doradito", "Amarelo", "10",
						"habitat", "Tyrannidae", "40", "3", "1"),
				new Ave("Noivinha-coroada", "Xolmis coronatus", "Black-crowned Monjita", "branco", "20",
						"Campo com arvores", "Tyrannidae", "10", "3", "2") 
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
					System.out.println("Qual ave foi identificada? ");
					String aveIdentificada = entrada.next();
					System.out.println("Digite o local: ");
					String local = entrada.next();

					Anotacao[] anotacoes = { new Anotacao (data, aveIdentificada, local) };

					System.out.println(anotacoes[0]);
					System.out.println(anotacoes[1]);
					System.out.println(anotacoes[2]);
					
					
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
					
                    while (i!=10) {
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
					System.out.println("\n\nEscolha uma característica da Ave");
					System.out.println(
							"\n 1 - Nome em Latim\n 2 - Nome em Inglês\n 3 - Cor\n 4 - Tamanho\n 5 - Habitat\n 6 - Família\n 7 - Pagina, Linha e Coluna\n ");
					int opcaoCaracteristica = entrada.nextInt();

					switch (opcaoCaracteristica) {

						case 1:
							System.out.println("\f");
							System.out.println("Digite o nome da ave em latim: ");
							String nomeLatim = entrada.next();
							i = 0;
							while (i != 10) {
								for (i = 0; i < aves.length; i++) {
									if (aves[i].getNomeLatim().contains(nomeLatim.toLowerCase())) {
										System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
									}
								}
							}
							break;

						case 2:
							System.out.println("\f");
							System.out.println("Digite o nome da ave em inglês: ");
							String nomeIngles = entrada.next();
							i = 0;
							while (i != 10) {
								for (i = 0; i < aves.length; i++) {
									if (aves[i].getNomeIngles().contains(nomeIngles.toLowerCase())) {
										System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
									}
								}
							}
							break;

						case 3:
							System.out.println("\f");
							System.out.println("Digite a cor da ave: ");
							String corAve = entrada.next();
							i = 10;
							while (i != 10) {
								for (i = 0; i < aves.length; i++) {
									if (aves[i].getCor().contains(corAve.toLowerCase())) {
										System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
									}
								}
							}
							break;

						case 4:
							System.out.println("\f");
							System.out.println("Digite o tamanho da ave, em centímetros: ");
							String tamanhoAve = entrada.next();
							i = 10;
							while (i != 10) {
								for (i = 0; i < aves.length; i++) {
									if (aves[i].getTamanho().contains(tamanhoAve.toLowerCase())) {
										System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
									}
								}
							}
							break;

						case 5:
							System.out.println("\f");
							System.out.println("Digite o habitat da ave: ");
							String habitatAve = entrada.next();
							i = 10;
							while (i != 10) {
								for (i = 0; i < aves.length; i++) {
									if (aves[i].getHabitat().contains(habitatAve.toLowerCase())) {
										System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
									}
								}
							}
							break;

						case 6:
							System.out.println("\f");
							System.out.println("Digite a família da ave desejada: ");
							String familiaAve = entrada.next();
							i = 10;
							while (i != 10) {
								for (i = 0; i < aves.length; i++) {
									if (aves[i].getFamilia().contains(familiaAve.toLowerCase())) {
										System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
									}
								}
							}
							break;

						default:
							System.out.println("\nOPÇÃO INCORRETA! Digite somente o que foi pedido!");
							continue;
					}

				case 5:
					// System.out.println("\f");
					System.out.println("Programa encerrado!");
					sucesso = false;
					break;

				default:
					System.out.println("\nOPÇÃO INCORRETA! Digite somente 1 ou 2.");
					continue;
			}
		}
	}

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
