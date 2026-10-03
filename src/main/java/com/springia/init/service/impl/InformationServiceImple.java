package com.springia.init.service.impl;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import com.springia.init.service.InformationService;

@Service
public class InformationServiceImple implements InformationService {
	
	private final ChatClient chatClente;

	public InformationServiceImple(ChatClient chatClente) {
		super();
		this.chatClente = chatClente;
	}

	@Override
	public String infoLlm(String consulta) {
		String prompt = "Explica de froma sencilla la posible dolencia o síntoma, incluyendo siempre recomendación de acudir a especialista, del siguiente sintoma " + consulta;
		return chatClente
				.prompt()
				.user(prompt)
				.call()
				.content();
	}

}
