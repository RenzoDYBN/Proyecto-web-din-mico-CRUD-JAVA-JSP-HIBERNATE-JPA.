package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//PUEDE INYECTARSE EN OTROS COMPONENTES DE NUESTRA APLICAICON

//@Service //aporta algo descriptivo representa logica de negocio fachada
//base de datos obtener datos archivos ,enviar datos, mediante api rest
//utilizando spring cloud 
//Como el autowired solo puede apuntar un componente no hay problema pero
//si hay mas entonces se debe usar qualifer
@Component("miServicioSimple")
public class MiServicio implements LosServicios {
	
	@Override
	public String operacion() {
		return "hola";
	}
	
	
}
