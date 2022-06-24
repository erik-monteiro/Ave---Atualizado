import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        Ave[] aves = { new Ave("pomba-do-Orvalho", "patagioenas maculosa", "spot-winged Pigeon", "cinza", "35", "campo 						com árvores", "columbidae", "20", "1", "2"),
                new Ave("coruja-buraqueira", "Athene cunicularia", "Burrowing Owl", "marrom", "25", "Campo seco baixo", "Strigidae","25", "2", "2"),
                new Ave("Graúna", "Gnorinopsar chopi", "Chopi Blackbird", "preto", "23", "Campo seco alto", "Icteridae","13", "3", "1"),  
                new Ave("Canário-Rasteiro", "Sicalis citrina", "Stripe-tailed Yellow-Finch", "amarelo", "12", "Compo seco alto", "Thraupidae","40", "1", "2"), 
                new Ave("Caturrita", "Myiopsitta monachus", "Monk Parakeet", "verde", "27", "Campo seco baixo e Campo com árvores", "Psittacidae","34", "2", "1"),
                new Ave("curiango-do-banhado", "hydropsalis anomala", "Sickle-winged nightjar", "marron", "17", "campo seco alto", "caprimulgidae","26", "1", "2"), 
                new Ave("Cardeal", "Paroaria coronata", "Red-crested Cardinal", "Branco", "17", "Campo com arvores", "Thraupidae","11", "2", "2"), 
                new Ave("Cardeal-do-Banhado", "Amblyramphus holosericeus", "Scarlet-headed Blackbird", "Preto", "22", "banhado com vegetação alta", "Icteridae","14", "3", "1"), 
                new Ave("Amarelinho-do-Junco", "Pseudocolopteryx flaviventris", "Warbling Doradito", "Amarelo", "10", "habitat", "Tyrannidae","40", "3", "1"),
                new Ave("Noivinha-coroada", "Xolmis coronatus", "Black-crowned Monjita", "Branco", "20", "Campo com arvores", "Tyrannidae","10", "3", "2")}; 

        boolean sucesso = true;
        while (sucesso) {
            System.out.println(" --- INÍCIO DO PROGRAMA --- ");
            System.out.println(" 1 - Anotar ");
            System.out.println(" 2 - Consultar Catálogo ");
            System.out.println(" 3 - Pesquisar Ave ");
            System.out.println(" 4 - Sair do programa ");

            int opcao = entrada.nextInt();
            String saida = "OK";
            switch(opcao) {

                case 1:				
                    System.out.println("\f");
                    System.out.println(" --- ANOTAÇÕES --- ");
                    break;

                case 2:				
                    System.out.println("\f");
                    System.out.println("\t --- CATÁLOGO DE AVES --- ");
                    System.out.println("\n");
                    for(int i = 0; i < aves.length; i++) {
                        System.out.printf("%2d - %-18s", i+1, aves[i].getNomePortugues());
                        System.out.printf(" (Página %2s", aves[i].getPagina());
                        System.out.printf(" - Linha %s", aves[i].getLinha());
                        System.out.printf(" - Coluna %s)%n",  aves[i].getColuna());
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
					System.out.println("Digite uma característica da Ave");
					System.out.println("1 - Nome em Latim\n 2 - Nome em Inglês\n 3 - Cor\n 4 - Tamanho\n 5 - Habitat\n 6 - Família\n 7 - Pagina\n 8 - Linha\n 9 - Coluna");
					int opcaoCaracteristica = entrada.nextInt();

                    switch(opcaoCaracteristica) {

                        case 1:
                            System.out.println("\f");
                            System.out.println("Digite o nome da ave em latim: ");
                            String nomeLatim = entrada.next();
                            for(int i = 0; i < aves.length; i++){
                                if (aves[i].getNomeLatim().contains(nomeLatim.toLowerCase())) {
                                    System.out.printf("%2d - %s%n", i+1,aves[i].getNomePortugues());			
                                }	
                            }
                            break;
                            
                        case 2:
                            System.out.println("\f");
                            System.out.println("Digite o nome da ave em inglês: ");
                            String nomeIngles = entrada.next();
                            for(int i = 0; i < aves.length; i++){
                                if (aves[i].getNomeIngles().contains(nomeIngles.toLowerCase())) {
                                    System.out.printf("%2d - %s%n", i+1,aves[i].getNomePortugues());			
                                }	
                            }
                            break;

                    }

       			case 4:
					//System.out.println("\f");
					System.out.println("Programa encerrado!");
					sucesso = false;
					break;

          		default:
			          System.out.println("\nOPÇÃO INCORRETA! Digite somente 1 ou 2.");
			          continue;
            }
        }	
    }
}
