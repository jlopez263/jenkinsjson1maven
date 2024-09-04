package org.aib.json1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LeerJsonPersona {

	
	public Persona getPersona(String json)
	{
		ObjectMapper mapper=new ObjectMapper();
		JsonNode node=null;
		try {
			node = mapper.readTree(json);
		} catch (JsonProcessingException e) {
				e.printStackTrace();
		}
		return new Persona(node.get("nombre").asText());
	}
	
}
