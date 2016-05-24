package com.devpadawan.superherois;

import java.util.Set;

import com.devpadawan.superherois.infra.Dados;
import com.devpadawan.superherois.modelo.SuperHeroi;

public class MainJava8 {
	
	public static void main(final String[] args) {
		
		final Set<SuperHeroi> superHerois = Dados.novo().carregarSuperHerois();
		
		superHerois.forEach(superHeroi -> System.out.println(superHeroi.getCodinome()));
		
	}

}
