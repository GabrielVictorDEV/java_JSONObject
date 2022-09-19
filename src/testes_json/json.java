package testes_json;

import org.json.JSONObject;

public class json {

	public static void main(String[] args) {
				/* -------------------------------------------------------
				 * TESTE 1
				 * cria um JSONObject para armazenar dados de um filme
				 * -------------------------------------------------------*/

				//instancia um novo JSONObject
				JSONObject my_obj = new JSONObject();

				//preenche o objeto com os campos: nome, sobrenome e idade
				my_obj.put("nome", "Gabriel");
				my_obj.put("sobrenome", "Victor");
				my_obj.put("idade", 19);
				
				//serializa para uma string e imprime
				String json_string = my_obj.toString();
				System.out.println("objeto original -> " + json_string);
				System.out.println();

				//altera o nome e imprime a nova configuração do objeto
				my_obj.put("nome", "Victor");
				my_obj.put("sobrenome", "Lima");
				json_string = my_obj.toString();
				System.out.println("objeto com o nome modificado -> " + json_string);
				System.out.println();

				//recupera campo por campo com o método get() e imprime cada um
				String nome = my_obj.getString("nome");
				String sobrenome = my_obj.getString("sobrenome");
				Integer idade = my_obj.getInt("idade");
				
				System.out.println("nome: " + nome);
				System.out.println("Sobre Nome: " + sobrenome);
				System.out.println("idade: " + idade);

			}
	}
