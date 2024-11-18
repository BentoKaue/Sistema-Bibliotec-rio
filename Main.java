import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listaLivros = new ArrayList<String>() {{
            add("Attack on Titans");
            add("Demon Slayer");
            add("Darling in the FranXX");
            add("Kakegurui");
            add("Evangelion");
        }};

        Livro attackonTitans = new Livro("Attack on Titans", 2013, "Attack on Titan se passa em um mundo onde a humanidade vive dentro de enormes muros para se proteger dos Titãs, criaturas que devoram seres humanos. A história segue Eren Yeager, Mikasa Ackerman e Armin Arlert, que se juntam ao Exército de Reconhecimento após o ataque de um Colossal Titan que destrói o muro de sua cidade. Eren descobre que pode se transformar em Titã, e, enquanto luta contra os Titãs, os três amigos desvendam mistérios sobre a origem dos Titãs, os governantes que controlam a humanidade e a história secreta por trás dos muros. Ao longo da trama, questões sobre liberdade, guerra e moralidade são exploradas, culminando em um confronto final onde Eren toma uma decisão radical para garantir a sobrevivência da humanidade, revelando o verdadeiro propósito dos Titãs e a origem do mundo.");

        Livro demonSlayer = new Livro("Demon Slayer", 2019, "Demon Slayer (Kimetsu no Yaiba) segue a história de Tanjiro Kamado, um jovem que vive em uma aldeia nas montanhas e trabalha para sustentar sua família. Após uma viagem para vender carvão, ele retorna e encontra sua família massacrada por demônios, exceto sua irmã Nezuko, que foi transformada em um demônio. Determinado a salvar sua irmã e vingá-la, Tanjiro se junta aos Caçadores de Demônios e treina para se tornar um mestre na arte da espada e lutar contra os demônios. Ao longo de sua jornada, ele encontra outros caçadores e enfrenta poderosos demônios, incluindo o líder dos demônios, Muzan Kibutsuji, enquanto busca uma cura para Nezuko. A história explora temas de perseverança, sacrifício e o poder dos laços familiares, com batalhas emocionantes e cenas de ação intensas.");

        Livro darlingInTheFranxx = new Livro("Darling in The FranXX", 2007, "Darling in the Franxx se passa em um futuro distópico onde a humanidade está à beira da extinção, vivendo em cidades fortificadas e lutando contra criaturas chamadas Klaxosaurs. A história segue um grupo de crianças geneticamente modificadas, chamadas de Parasitas, que pilotam mechas conhecidos como Franxx para defender a humanidade. O protagonista, Hiro, é um jovem que perde a capacidade de pilotar após falhar em uma missão, mas encontra uma nova parceira, Zero Two, uma misteriosa e rebelde piloto com habilidades excepcionais. Juntos, eles formam uma parceria que desafia as normas da sociedade, enquanto enfrentam batalhas, segredos sobre suas origens e o verdadeiro propósito de sua luta. Ao longo da série, questões de identidade, amor, e a natureza da humanidade são exploradas, culminando em um confronto final para salvar a Terra e determinar o futuro da espécie humana.");

        Livro kakegurui = new Livro("Kakegurui",2014,"Kakegurui se passa na Academia Hyakkaou, uma escola de elite onde os estudantes são classificados com base em suas habilidades em jogos de azar. A protagonista, Yumeko Jabami, é uma estudante transferida que se destaca por sua atitude imprevisível e sua paixão por apostas arriscadas. Ao contrário dos outros alunos, que jogam de maneira calculista para subir na hierarquia da escola, Yumeko se entrega completamente ao prazer do jogo, desafiando as regras e expondo a corrupção do sistema. Enquanto ela enfrenta outros jogadores habilidosos, Yumeko expõe as complexas relações de poder e controle dentro da escola, revelando os segredos dos líderes da academia e desafiando as estruturas de poder estabelecidas. A história explora temas de risco, loucura e a natureza do prazer no jogo, misturando tensão psicológica e estratégia em cada partida.");

        Livro evangelion = new Livro("Neon Genesis Evangelion ", 1995, "Neon Genesis Evangelion se passa em um mundo pós-apocalíptico onde a humanidade enfrenta a ameaça dos Angels, seres misteriosos que tentam destruir a Terra. A história segue Shinji Ikari, um adolescente chamado para pilotar um enorme mecha, o Evangelion, para lutar contra os Angels, após ser convocado pelo seu pai, Gendo Ikari, líder da organização secreta NERV. Ao longo da série, Shinji e outros pilotos, como Rei Ayanami e Asuka Langley, enfrentam desafios emocionais e psicológicos enquanto lidam com os traumas pessoais e a complexidade dos Evangelions, que estão intimamente ligados à origem dos Angels e à destruição do mundo. A série explora temas profundos como a identidade, o sofrimento humano, a solidão e as relações interpessoais, culminando em um final introspectivo e filosófico que questiona a natureza da realidade, da existência e do livre arbítrio.");


        System.out.println("------------------------------------");
        System.out.println("Bem-vindo a biblioteca!\n" + "------------------------------------");
        System.out.println("Realize seu login...\n" + "------------------------------------");
        System.out.print("Usuário: ");
        String usuarioLogin = scanner.nextLine().toLowerCase();
        System.out.print("Email: ");
        String emaiLogin = scanner.nextLine().toLowerCase();
        System.out.print("Telefone: ");
        String telefoneLogin = scanner.nextLine().toLowerCase();
        System.out.print("Senha: ");
        String senhaLogin = scanner.nextLine();

        Usuario usuario = new Adm(usuarioLogin, telefoneLogin, emaiLogin, false, false, false, true, 0);

        if(usuarioLogin.equals("kaue") && senhaLogin.equals("kaue")){
            Adm adm = (Adm) usuario;
            System.out.println("Você está logado como ADM!");
            System.out.println("------------------------------------");
        } else {
            System.out.println("Login efetuado com sucesso!");
            System.out.println("------------------------------------");
        }

        System.out.println("Opções válidas: \n" + "1 - Pesquisa \n" + "2 - Realizar Empréstimo \n" + "3 - Realizar Reserva\n" + "4 - Realizar Renovação\n" + "5 - Realizar Devolução \n" + "------------------------------------");

        System.out.print("O que deseja realizar?: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Livros Disponíveis: \n" +listaLivros);
                break;
            case 2:
                usuario.fazerEmprestimo();
                break;
            case 3:
                usuario.fazerReserva();
                break;
            case 4:
                usuario.fazerRenovacao();
                break;
            case 5:
                usuario.fazerDevolucao();
                break;
            default:
                System.out.println("Operador Inválido!");
        }




//        Usuario usuarioSte = new Usuario("ste", "86 998234543", "stecardo@gmail.com", false, false, false, true);
//        Usuario adm = new Adm("kaue", "86 998786543", "zeposte@gmail.com", false, false, false, false);
//        Livro sutilArte = new Livro("A Sutil Arte de Ligar o Foda-se", "volume 1", 2017, "Intrínseca LTDA", 223, "A sutil arte de ligar o foda-se, de Mark Manson, começa quebrando todos os paradigmas que um livro de autoajuda promete logo pelo título. O autor deixa claro no decorrer da obra que não vai propor soluções mágicas para os problemas e que, muito menos, vai incentivar o leitor a ser extraordinário." + "\n" + "Resumindo, o livro foge totalmente dos padrões da autoajuda. Mark Manson faz o estilo amigo sincero. Utilizando-se de uma linguagem extremamente informal, sem se preocupar com palavrões e dando exemplos extremamente reais, o autor o ajuda a pensar sobre questões que considera importantes na vida.\n" + "Na contramão da autoajuda tradicional, Mark Manson afirma a todo momento que a dor é importante e que é necessário senti-la, e em seu livro ele ensina a usar essa dor para amadurecer." + "\n" + "Ele ensina a sofrer para crescer e diz que não tem nada de errado em não ser como a maioria das pessoas, e que isso é uma coisa que todos devem aprender. Para o autor, o sofrimento é um motivador para a busca por mudanças intrínsecas do ser humano. ");

    }
}
