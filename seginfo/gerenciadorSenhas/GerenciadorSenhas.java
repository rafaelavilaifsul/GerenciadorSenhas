package seginfo.gerenciadorSenhas;

public class GerenciadorSenhas {
	public static String codificar(String senha) {
		Hash h = new Hash("SHA-1");
		return h.codificar(senha);
	}
	
	public static boolean autenticar(String senha, String hash) {
		Hash h = new Hash("SHA-1");
		String tentativa = h.codificar(senha);
		return hash.equals(tentativa);
	}
}
