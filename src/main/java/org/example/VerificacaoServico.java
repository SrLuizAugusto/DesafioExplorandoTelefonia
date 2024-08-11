package org.example;

import java.util.Objects;
import java.util.Scanner;

public class VerificacaoServico {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        System.out.println("Informe o serviço a ser buscado: ");
        String servico = scanner.nextLine().toLowerCase().trim();

        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite o nome do cliente e os serviços separados por virgulas: ");
        String entradaCliente = scanner.nextLine().toLowerCase().trim();
        scanner.close();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // Verifica se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (Objects.equals(partes[i].trim(), servico)) {
                contratado = true;
                break;
            }
        }
        // tratamento da mensagem de saída
        if (contratado) {
            System.out.println("O serviço " + servico + " está contratado por " + nomeCliente);
        } else {
            System.out.println("O serviço " + servico + " não foi contratado por " + nomeCliente);
        }

    }
}
/* Preferencial
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine()); // Lê a linha de entrada
int a = Integer.parseInt(st.nextToken());
System.out.println(a); // Imprime o dado

 */