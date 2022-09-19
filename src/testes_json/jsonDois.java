package testes_json;

import org.json.JSONObject;

public class jsonDois {

	public static void main(String[] args) {
		/* -------------------------------------------------------
		 * TESTE 2
		 * cria um JSONObject a partir de uma string
		 * -------------------------------------------------------*/

		//string json
		String json_str = "{\"titulo\":\"Os Arquivos JSON em estudo\",\"ano\":2003,\"genero\":\"T.i em jogo\", \"nota\":\"5 estrelas\"}";

		String json = "{\"nome\":\"gabriel\", \"sobre_nome\":\"Victor\"}";
		
		//instancia um novo JSONObject passando a string como entrada
		JSONObject my_obj = new JSONObject(json_str);
		
		JSONObject json_02 = new JSONObject(json);


		//recupera campo por campo com o método get() e imprime cada um
		String titulo = my_obj.getString("titulo");
		Integer ano = my_obj.getInt("ano");
		String genero = my_obj.getString("genero");
		String nota = my_obj.getString("nota");
		
		String nome = json_02.getString("nome");
		String sobreNome = json_02.getString("sobre_nome");

		

		System.out.println("titulo: " + titulo);
		System.out.println("ano: " + ano);
		System.out.println("genero: " + genero);
		System.out.println("nota: " + nota);
		
		System.out.println("nome: " + nome);
		System.out.println("Sobre nome:  " + sobreNome);



	}

}
