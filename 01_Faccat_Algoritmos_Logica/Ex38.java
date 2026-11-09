import java.util.Scanner;
public class Ex38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Código de usuário: ");
        int codigo = in.nextInt();
        if (codigo != 1234) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.print("Senha: ");
            int senha = in.nextInt();
            System.out.println(senha != 9999 ? "senha incorreta" : "Acesso permitido");
        }
    }
}
