package seginfo.gerenciadorSenhas;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
	private MessageDigest gerador;
	
	public Hash(String algoritmo) {
		try {
			gerador = MessageDigest.getInstance(algoritmo);
		} catch (NoSuchAlgorithmException e) {
			System.err.printf("O algoritmo %s não é suportado, encerrando!",
				algoritmo);
			System.exit(1);
		}
	}

	public String codificar(String s) {
        byte[] bytes = gerador.digest(s.getBytes());
		String hex = "";
		for (byte b: bytes) {
			hex += String.format("%02x", b);
		}
		return hex;
	}
}
