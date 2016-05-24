package com.devpadawan.superherois;

import java.util.Set;

import com.devpadawan.superherois.infra.Dados;
import com.devpadawan.superherois.modelo.SuperHeroi;

/*
 * Copyright (c) 2015 Josimar Silva
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * @author Josimar Silva a.k.a devpadawan - josimaralves dot com at gmail dot com
 * @since May 24, 2016
 */
public class MainJava7 {
	
	public static void main(final String[] args) {
		
		final Set<SuperHeroi> superHerois = Dados.novo().carregarSuperHerois();
		
		//Imprimir todos os codinomes dos superherois
		for (final SuperHeroi superHeroi : superHerois) {
			System.out.println(superHeroi.getCodinome());
		}
		
		//Ordenar todos pelo codinome
		
		//Todos os nomes reais dos superherois
		
		//Todos os superherois com mais de 3 habilidades
		
		//Media de habilidades dos superherois
		
		//Todos os superherois com superforca (Codigo: 3)
		
		//Todos os superherois da DC
		
		//Todos os superherois da DC do sexo masculino com mais de 3 habilidade
		
		//Quem é o mais velho?
		
		//Superherois agrupados por sexo
		
		//SuperHerois agrupados por ano de nascimento
		
	}

}
