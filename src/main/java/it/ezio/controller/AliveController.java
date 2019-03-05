package it.ezio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.ezio.model.GenericResponse;

@RestController
public class AliveController {
	
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/alive", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public GenericResponse alive(GenericResponse response) {
		response.getStatus().setCodice("001");
		response.getStatus().setDescrizione("Ci sono");
		response.getStatus().setEsito("OK");
		return response ;
	}

}
