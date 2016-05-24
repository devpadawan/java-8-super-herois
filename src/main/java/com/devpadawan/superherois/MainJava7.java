package com.devpadawan.superherois;

import java.util.Set;

import com.devpadawan.superherois.infra.Dados;
import com.devpadawan.superherois.modelo.SuperHeroi;

public class MainJava7 {
	
	public static void main(final String[] args) {
		
		final Set<SuperHeroi> superHerois = Dados.novo().carregarSuperHerois();
		
		//Imprimir todos os codinomes dos superherois
		for (final SuperHeroi superHeroi : superHerois) {
			System.out.print(superHeroi.getCodinome());
		}
		
		//Ordenar todos pelo codinome
		
		//Todos os nomes reais dos superherois
		
		//Todos os superherois com mais de 3 habilidades
		
		//Media de habilidades dos superherois
		
		//Todos os superherois com superforca (Codigo: 3)
		
		//Todos os superherois da DC
		
		//Todos os superherois da DC do sexo masculino com mais de 3 habilidade
		
		//Quem é o mais velho?
		
	}

}
