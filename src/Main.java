import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos deseja cadastrar? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++){
            System.out.println("Qual o tipo do produto que será cadastrado? (1- Eletrodomesticos , 2 - Alimentos)");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.println("Nome do produto?");
            String nome = sc.nextLine();

            System.out.println("Qual o valor do seu produto? (sem desconto)");
            double preco = sc.nextDouble();

            Produto produto;
            if(tipo == 1){
                produto = new Eletrodomesticos(nome, preco);
            }else{
                produto = new Alimentos(nome, preco);
            }
            estoque.adicionarProduto(produto);
        }

        System.out.println("Digite o desconto que será aplicado para todos os seus produtos: ");
        double porcentagemDesconto = sc.nextDouble();

        estoque.exibirPrecosDesc(porcentagemDesconto);
    }
}
