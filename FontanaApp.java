import java.util.Scanner;
/**
 * A classe FontanaApp e aplicativo para consulta e retencao de dados a respeito de uma serie de aves selecionadas.
 */
public class FontanaApp 
{
    /**
     * Programa de consulta e gestao de dados a respeito de aves ja registradas e anotacoes do usuario.
     *
     * @param args nao utilizado
     * @param entrada teclado
     * @param aves aves
     * @param numeroDeAnotacoes numero de anotacaoes feitas pelo usuario
     * @param sucesso mantem a interface principal do programa funcionando
     * @param mostrarMenu mostra o menu ao usuario
     * @param data data completa em que a ave foi avistada
     * @param dia dia em que a ave foi avistada
     * @param mes mes em que a ave foi avistada
     * @param ano ano em que a ave foi avistada
     * @param aveIdentificada ave avistada pelo usuario
     * @param local local onde a ave foi avistada pelo usuario
     * @param simOuNao pergunta ao usuario se ele que inserir mais alguma anotacao
     * @param outraAnotacao outra anotacao feita pelo usuario
     * @param anotacoes anotacao do usuario completa
     * @param consultarAnotacao consulta anotacoes feitas anteriormente
     * @param consultaAnotacaoData consulta de datas para o usuario
     * @param retorno retorna valores para o programa
     * @param opcaoCaracteristica opcao de caracteristica (para que seja selecionada)
     * @param paginaEscolhida pagina do "guia das aves" selecionada
     * @param linhaEscolhida linha da pagina do "guia das aves" selecionada
     * @param colunaEscolhida coluna da pagina do "guia das aves" selecionada
     * @param nomeLatim nome da ave em latim 
     * @param nomeIngles nome da ave em ingles
     * @param corAve cor da ave
     * @param tamanhoAve tamanho da ave
     * @param habitatAve habitat do qual a ave pertence
     * @param familiaAve familia de qual a ave pertence
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        Ave[] aves = {
                new Ave("pomba-do-orvalho", "patagioenas maculosa", "spot-winged Pigeon", "cinza", "35",
                    "campo com ??rvores", "columbidae", "20", "1", "2"),
                new Ave("coruja-buraqueira", "athene cunicularia", "burrowing Owl", "marrom", "25", "campo seco baixo",
                    "strigidae", "25", "2", "2"),
                new Ave("gra??na", "gnorinopsar chopi", "chopi blackbird", "preto", "23", "campo seco alto", "icteridae",
                    "13", "3", "1"),
                new Ave("can??rio-Rasteiro", "sicalis citrina", "stripe-tailed Yellow-Finch", "amarelo", "12",
                    "campo seco alto", "thraupidae", "40", "1", "2"),
                new Ave("caturrita", "myiopsitta monachus", "monk parakeet", "verde", "27",
                    "campo seco baixo e campo com ??rvores", "psittacidae", "34", "2", "1"),
                new Ave("curiango-do-banhado", "hydropsalis anomala", "Sickle-winged nightjar", "marron", "17",
                    "campo seco alto", "caprimulgidae", "26", "1", "2"),
                new Ave("cardeal", "paroaria coronata", "red-crested cardinal", "branco", "17", "campo com arvores",
                    "thraupidae", "11", "2", "2"),
                new Ave("cardeal-do-Banhado", "amblyramphus holosericeus", "scarlet-headed blackbird", "preto", "22",
                    "banhado com vegeta????o alta", "icteridae", "14", "3", "1"),
                new Ave("amarelinho-do-Junco", "pseudocolopteryx flaviventris", "warbling doradito", "amarelo", "10",
                    "banhado com vegeta????o alta", "tyrannidae", "40", "3", "1"),
                new Ave("noivinha-coroada", "xolmis coronatus", "black-crowned monjita", "branco", "20",
                    "campo com arvores", "tyrannidae", "10", "3", "2") 
            };

        // Anotacao[] anotacoes = { new Anotacao ("dia","mes","ano", "aveIdentificada", "local", "outraAnotacao"),
        // new Anotacao ("dia","mes","ano", "aveIdentificada", "local", "outraAnotacao"),
        // new Anotacao ("dia","mes","ano", "aveIdentificada", "local", "outraAnotacao"),
        // new Anotacao ("dia","mes","ano", "aveIdentificada", "local", "outraAnotacao"),
        // new Anotacao ("dia","mes","ano", "aveIdentificada", "local", "outraAnotacao"),
        // new Anotacao ("dia","mes","ano", "aveIdentificada", "local", "outraAnotacao"),
        // new Anotacao ("dia","mes","ano", "aveIdentificada", "local", "outraAnotacao")};

        int numeroDeAnotacoes = 0;        
        boolean sucesso = true;
        String[][] Vetor = new String[10][6];
        while (sucesso) {

            mostrarMenu();

            int opcao = entrada.nextInt();
            String saida = "OK";

            switch (opcao) {

                case 1:
                    numeroDeAnotacoes++;

                    System.out.println("\f");
                    System.out.println(" --- ANOTA????ES --- ");
                    System.out.println("\n");

                    System.out.println("Primeiramente, digite a data da sua anota????o: dd/mm/aaaa ");
                    String data = entrada.next();

                    String dia = data.substring(0,2);
                    String mes = data.substring(3,5);
                    String ano = data.substring(6,10);

                    System.out.println("\n");
                    System.out.println("Qual ave foi identificada? ");
                    String aveIdentificada = entrada.next();

                    System.out.println("\n");
                    System.out.println("Digite o local: ");
                    String local = entrada.next();   

                    System.out.println("\n");
                    System.out.println("Quer anotar algo mais? (Sim ou N??o)");
                    String simOuNao = entrada.next(); 

                    String outraAnotacao = "";
                    if(simOuNao.equalsIgnoreCase("sim")){
                        System.out.println("\n");
                        System.out.println("Digite:");
                        outraAnotacao = entrada.next(); 
                    }else{
                        outraAnotacao = "";
                    }        

                    Anotacao[] anotacoes = { new Anotacao (dia,mes,ano, aveIdentificada, local, outraAnotacao)};
                    Vetor [numeroDeAnotacoes][0] = anotacoes[0].getDia();
                    Vetor [numeroDeAnotacoes][1] = anotacoes[0].getMes();
                    Vetor [numeroDeAnotacoes][2] = anotacoes[0].getAno();
                    Vetor [numeroDeAnotacoes][3] = anotacoes[0].getAveIdentificada();
                    Vetor [numeroDeAnotacoes][4] = anotacoes[0].getLocal();
                    Vetor [numeroDeAnotacoes][5] = anotacoes[0].getOutraAnotacao();

                    System.out.println("\nSuas anota????es: ");
                    System.out.printf("Data: %2s/%2s/%4s%n", Vetor[numeroDeAnotacoes][0], Vetor[numeroDeAnotacoes][1], Vetor[numeroDeAnotacoes][2]);
                    System.out.println("Ave identificada: " +  Vetor[numeroDeAnotacoes][3]);
                    System.out.println("Local: " +  Vetor[numeroDeAnotacoes][4]);
                    System.out.println( Vetor[numeroDeAnotacoes][5]);

                    System.out.println("\n");
                    System.out.println("Deseja consultar anota????es antigas? (Sim ou N??o)");
                    String consultarAnotacao = entrada.next();
                    if(consultarAnotacao.equalsIgnoreCase("sim")){
                        System.out.println("\f");
                        System.out.println("\t --- CONSULTAR ANOTA????ES ---");
                        System.out.println("Digite o m??s a ano das anota????es que voc?? deseja consultar: (mm/aaaa)");

                        String consultaAnotacaoData = entrada.next();
                        int i = 0;

                        while(i < anotacoes.length){
                            for( i = 0 ; i < Vetor.length;i++){
                                if((consultaAnotacaoData.substring(0,2)).equals(Vetor[i][1]) && (consultaAnotacaoData.substring(3,7)).equals(Vetor[i][2])){
                                    System.out.println("\nSuas anota????es da data pesquisada: ");
                                    System.out.printf("Data: %2s/%2s/%4s%n", Vetor[i][0], Vetor[i][1], Vetor[i][2]);
                                    System.out.println("Ave identificada: " +  Vetor[i][3]);
                                    System.out.println("Local: " +  Vetor[i][4]);
                                    System.out.println( Vetor[i][5]);
                                }
                            }  
                        }
                    }else{
                        break;
                    }

                    //sucesso = false;
                    break;

                case 2:
                    System.out.println("\f");
                    System.out.println("\t --- CAT??LOGO DE AVES --- ");
                    System.out.println("\n");
                    for (int i = 0; i < aves.length; i++) {
                        System.out.printf("%2d - %-20s", i + 1, aves[i].getNomePortugues());
                        System.out.printf(" (P??gina %2s", aves[i].getPagina());
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
                    System.out.println("\n\nDigite a p??gina: ");
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
                                System.out.println("\n\nAve encontrada! Seguem suas caracter??sticas: ");
                                System.out.println("\n\t Nome em Portugu??s: " + aves[i].getNomePortugues());
                                System.out.println("\t Nome em Latim: " + aves[i].getNomeLatim());
                                System.out.println("\t Nome em Ingl??s: " + aves[i].getNomeIngles());
                                System.out.println("\t Cor: " + aves[i].getCor());
                                System.out.println("\t Tamanho: " + aves[i].getTamanho());
                                System.out.println("\t Habitat: " + aves[i].getHabitat());
                                System.out.println("\t Fam??lia: " + aves[i].getFamilia()); 
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
                    System.out.println("\n\nEscolha uma caracter??stica da Ave:");
                    System.out.println("\n 1 - Nome em Latim\n 2 - Nome em Ingl??s\n 3 - Cor\n 4 - Tamanho\n 5 - Habitat\n 6 - Fam??lia\n ");
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

                            continue;

                        case 2:
                            System.out.println("\f");
                            System.out.println("Digite o nome da ave em ingl??s: ");
                            String nomeIngles = entrada.next();

                            for (i = 0; i < aves.length; i++) {
                                if (aves[i].getNomeIngles().contains(nomeIngles.toLowerCase())) {
                                    System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
                                }

                            }
                            continue;

                        case 3:
                            System.out.println("\f");
                            System.out.println("Digite a cor da ave: ");
                            String corAve = entrada.next();

                            for (i = 0; i < aves.length; i++) {
                                if (aves[i].getCor().contains(corAve.toLowerCase())) {
                                    System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
                                }
                            }

                            continue;

                        case 4:
                            System.out.println("\f");
                            System.out.println("Digite o tamanho da ave, em cent??metros: ");
                            String tamanhoAve = entrada.next();

                            for (i = 0; i < aves.length; i++) {
                                if (aves[i].getTamanho().contains(tamanhoAve.toLowerCase())) {
                                    System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
                                }
                            }

                            continue;

                        case 5:
                            System.out.println("\f");
                            System.out.println("Digite o habitat da ave: ");
                            String habitatAve = entrada.next();

                            for (i = 0; i < aves.length; i++) {
                                if (aves[i].getHabitat().contains(habitatAve.toLowerCase())) {
                                    System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
                                }
                            }

                            continue;

                        case 6:
                            System.out.println("\f");
                            System.out.println("Digite a fam??lia da ave desejada: ");
                            String familiaAve = entrada.next();

                            for (i = 0; i < aves.length; i++) {
                                if (aves[i].getFamilia().contains(familiaAve.toLowerCase())) {
                                    System.out.printf("%2d - %s%n", i + 1, aves[i].getNomePortugues());
                                }
                            }

                            continue;

                        default:
                            System.out.println("\nOP????O INCORRETA! Digite somente o que foi pedido!");
                            continue;
                    }

                case 5:
                    System.out.println("Programa encerrado!");
                    sucesso = false;
                    break;

                default:
                    System.out.println("\nOP????O INCORRETA! Digite somente 1 ou 2.");
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
        System.out.println("\t2 - Consultar cat??logo ");
        System.out.println("\t3 - Consultar cat??logo por p??ginas ");
        System.out.println("\t4 - Pesquisar ave ");
        System.out.println("\t5 - Sair do programa ");
    }
}
