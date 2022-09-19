package testes_json;

import org.json.JSONArray;
import org.json.JSONObject;

public class jasonTres {

	public static void main(String[] args) {
		/* ----------------------------------------------
		 * TESTE 3
		 * Trabalhando com um array de strings
		 * ---------------------------------------------*/

		//instancia um novo JSONObject
		JSONObject my_obj = new JSONObject();
		
		JSONObject obj03 = new JSONObject();

		//preenche o objeto
		my_obj.put("titulo", "JSON x XML: a Batalha Final");
		my_obj.put("ano", 2012);
		
		obj03.put("nome", "Gabriel");
		obj03.put("sobre_nome", "Victor");

		//cria um JSONArray e preenche com valores string
		JSONArray my_genres = new JSONArray();
		
		JSONArray obj03Array = new JSONArray();


		my_genres.put("aventura");
		my_genres.put("ação");
		my_genres.put("ficção");
		
		obj03Array.put("masculino");
		obj03Array.put("feminino");
		obj03Array.put("sem genero");

		//insere o array no JSONObject com o rótulo "generos"
		my_obj.put("generos", my_genres);
		
		obj03.put("generos", obj03Array);

		//serializa para uma string e imprime
		String json_string = my_obj.toString();
		System.out.println(json_string);
		
		String string03 = obj03.toString();
		System.out.println(string03);
	}
}
