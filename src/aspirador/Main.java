  import java.util.Random;
public class Main {
    public static void main(String[] args) {
   



    private boolean[] sala; // Representa a sala (true = sujeira, false = limpo)
    private int posicao;    // Posição atual do aspirador
    private Random random;

    public AspiradorDeSujeira(int tamanhoSala) {
        this.sala = new boolean[tamanhoSala];
        this.posicao = 0; // Começa na posição inicial (0)
        this.random = new Random();
        inicializarSala();
    }

    // Inicializa a sala com sujeira em 30% das posições
    private void inicializarSala() {
        for (int i = 0; i < sala.length; i++) {
            sala[i] = random.nextDouble() < 0.3; // 30% chance de sujeira
        }
    }

    // Verifica se ainda existe sujeira na sala
    private boolean temSujeira() {
        for (boolean sujeira : sala) {
            if (sujeira) {
                return true;
            }
        }
        return false;
    }

    // Limpa a sujeira da posição atual
    private void limparSujeira() {
        if (sala[posicao]) {
            System.out.println("Sujeira encontrada na posição " + posicao + ". Limpando...");
            sala[posicao] = false;
        } else {
            System.out.println("Posição " + posicao + " já está limpa.");
        }
    }

    // Move o aspirador uma posição para a direita
    private void moverParaDireita() {
        if (posicao < sala.length - 1) {
            posicao++;
            System.out.println("Movendo para a direita. Posição atual: " + posicao);
        }
    }

    // Move o aspirador uma posição para a esquerda
    private void moverParaEsquerda() {
        if (posicao > 0) {
            posicao--;
            System.out.println("Movendo para a esquerda. Posição atual: " + posicao);
        }
    }

    // Faz o aspirador percorrer toda a sala e limpar
    public void limparSala() {
        System.out.println("Iniciando limpeza da sala...");

        // Percorre da esquerda para a direita
        for (int i = 0; i < sala.length; i++) {
            limparSujeira();
            moverParaDireita();
        }

        // Retorna para a esquerda até a posição inicial
        for (int i = sala.length - 1; i > 0; i--) {
            moverParaEsquerda();
        }

        System.out.println("Limpeza concluída! Aspirador voltou à posição inicial.");
    }

    // Método principal para executar o projeto
    public static void main(String[] args) {
        AspiradorDeSujeira aspirador = new AspiradorDeSujeira(20);
        aspirador.limparSala();
    }
}

    
}