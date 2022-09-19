package testes_json;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonQuatro {

	public static void main(String[] args) {
		/* -------------------------------------------------------
		 * TESTE 4
		 * manipulação de array
		 * -------------------------------------------------------*/

		//string json: contém array com três elementos
		String json_str = "{\"elenco\":[\"Json Leigh\",\"Mary Stylesheet\", \"David Markupovny\"]}";

		//instancia um novo JSONObject passando a string como entrada
		JSONObject my_obj = new JSONObject(json_str);

		//recupera o array "elenco"
		JSONArray elenco = my_obj.getJSONArray("elenco");

		//imprime cada ator/atriz do elenco com o uso dos métodos length() e get()
		System.out.println("Elenco Original");
		for (int i = 0; i < elenco.length(); i++) {
			System.out.println("(" + i + ") " + elenco.get(i));
		}
		System.out.println();

		//-- insere um novo ator no array
		elenco.put("Michael Java Fox");
		elenco.put("Gabriel Victor");

		System.out.println("Elenco com o novo ator");
		for (int i = 0; i < elenco.length(); i++) {
			System.out.println("(" + i + ") " + elenco.get(i));
		}
		System.out.println();

		//-- troca o nome da primeira atriz
		elenco.put(0, "Jennifer Json Leigh");
		elenco.put(4, "Gabriel Lima");

		System.out.println("Elenco com o nome da primeira atriz modificado");
		for (int i = 0; i < elenco.length(); i++) {
			System.out.println("(" + i + ") " + elenco.get(i));
		}
		System.out.println();

		//-- remove o terceiro ator
		elenco.remove(2);
		elenco.remove(3);

		System.out.println("Elenco com o ator David Makupovny removido");
		for (int i = 0; i < elenco.length(); i++) {
			System.out.println("(" + i + ") " + elenco.get(i));
		}
	}

}
