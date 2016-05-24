package com.devpadawan.superherois.infra;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.devpadawan.superherois.builder.SuperHeroiBuilder;
import com.devpadawan.superherois.modelo.Habilidade;
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
public class Dados {
	
	private Dados() {
		
	}
	
	public static Dados novo() {
		return new Dados();
	}
	
	public Set<SuperHeroi> carregarSuperHerois() {
		final Set<SuperHeroi> dados = new HashSet<SuperHeroi>();
		
		dados.add(batman());
		dados.add(superman());
		dados.add(capitaAmerica());
		dados.add(ironMan());
		dados.add(mulherMaravilha());
		dados.add(viuvaNegra());
		dados.add(flash());
		dados.add(thor());
		dados.add(homemAranha());
		dados.add(drManhattan());

		return dados;
	}

	private SuperHeroi batman() {
		
		return SuperHeroiBuilder
			.novoSuperHeroi()
			.daDC()
			.comNomeReal("Bruce Wayne")
			.comCodinome("Batman")
			.nascidoEm(LocalDate.of(1939, 05, 01))
			.doSexoMasculino()
			.comHabilidadesDe(intelectoGenial())
			.comHabilidadesDe(peritoEmArtesMarcias())
			.construa();
	}

	private SuperHeroi superman() {
		return SuperHeroiBuilder
				.novoSuperHeroi()
				.daDC()
				.comNomeReal("Clark Kent/Ka-el")
				.comCodinome("Superman")
				.nascidoEm(LocalDate.of(1930, 06, 10))
				.doSexoMasculino()
				.comHabilidadesDe(superForca())
				.comHabilidadesDe(Habilidade.nova(4L, "Visão de raio-x"))
				.comHabilidadesDe(superVelocidade())
				.comHabilidadesDe(Habilidade.nova(6L, "Super-audição"))
				.comHabilidadesDe(Habilidade.nova(7L, "Visão de calor"))
				.comHabilidadesDe(voar())
				.construa();
	}

	private SuperHeroi capitaAmerica() {
		return SuperHeroiBuilder
				.novoSuperHeroi()
				.daMarvel()
				.comNomeReal("Steve Rogers")
				.comCodinome("Capitão America")
				.nascidoEm(LocalDate.of(1920, 03, 01))
				.doSexoMasculino()
				.comHabilidadesDe(superForca())
				.comHabilidadesDe(Habilidade.nova(8L, "Perito de taticas militares"))
				.comHabilidadesDe(Habilidade.nova(9L, "Super-resistencia"))
				.comHabilidadesDe(Habilidade.nova(10L, "Agilidade sobrehumana"))
				.construa();
	}
	
	private SuperHeroi ironMan() {
		return SuperHeroiBuilder
				.novoSuperHeroi()
				.daMarvel()
				.comNomeReal("Anthony Stark")
				.comCodinome("Homen de Ferro")
				.nascidoEm(LocalDate.of(1920, 03, 01))
				.doSexoMasculino()
				.comHabilidadesDe(intelectoGenial())
				.comHabilidadesDe(superForca())
				.construa();
	}
	
	private SuperHeroi mulherMaravilha() {
		return SuperHeroiBuilder
				.novoSuperHeroi()
				.daDC()
				.comNomeReal("Diane Themysira")
				.comCodinome("Mulher Maravilha")
				.nascidoEm(LocalDate.of(1940, 10, 25))
				.doSexoFeminino()
				.comHabilidadesDe(superForca())
				.comHabilidadesDe(imortalidade())
				.construa();
	}

	private SuperHeroi viuvaNegra() {
		return SuperHeroiBuilder
				.novoSuperHeroi()
				.daMarvel()
				.comNomeReal("Natasha Romanova")
				.comCodinome("Viuva Negra")
				.nascidoEm(LocalDate.of(1964, 04, 20))
				.doSexoFeminino()
				.comHabilidadesDe(peritoEmArtesMarcias())
				.construa();
	}
	
	private SuperHeroi flash() {
		return SuperHeroiBuilder
				.novoSuperHeroi()
				.daDC()
				.comNomeReal("Barry Allen")
				.comCodinome("The Flash")
				.nascidoEm(LocalDate.of(1940, 11, 01))
				.doSexoMasculino()
				.comHabilidadesDe(superVelocidade())
				.construa();
	}
	
	private SuperHeroi thor() {
		return SuperHeroiBuilder
				.novoSuperHeroi()
				.daMarvel()
				.comNomeReal("Thor Odison")
				.comCodinome("Thor")
				.nascidoEm(LocalDate.of(1962, 8, 1))
				.doSexoMasculino()
				.comHabilidadesDe(superForca())
				.comHabilidadesDe(Habilidade.nova(12L, "Geração de raios"))
				.comHabilidadesDe(imortalidade())
				.comHabilidadesDe(voar())
				.construa();
	}
	
	private SuperHeroi homemAranha() {
		return SuperHeroiBuilder
				.novoSuperHeroi()
				.daMarvel()
				.comNomeReal("Peter Park")
				.comCodinome("Homem Aranha")
				.nascidoEm(LocalDate.of(1962, 8, 1))
				.doSexoMasculino()
				.comHabilidadesDe(superForca())
				.comHabilidadesDe(Habilidade.nova(14L, "Geração de raios"))
				.construa();
	}
	
	private SuperHeroi drManhattan() {
		return SuperHeroiBuilder
				.novoSuperHeroi()
				.daDC()
				.comNomeReal("Jonathan Osterman")
				.comCodinome("Dr. Manhattan")
				.nascidoEm(LocalDate.of(1986, 9, 1))
				.doSexoMasculino()
				.comHabilidadesDe(superForca())
				.comHabilidadesDe(Habilidade.nova(15L, "Controle de Energia e Materia a nivel subatomivo"))
				.comHabilidadesDe(Habilidade.nova(16L, "Viajar entre dimensões"))
				.comHabilidadesDe(Habilidade.nova(17L, "Precognição"))
				.comHabilidadesDe(Habilidade.nova(18L, "Reconstrução molecular"))
				.comHabilidadesDe(imortalidade())
				.comHabilidadesDe(voar())
				.construa();
	}

	private Habilidade superVelocidade() {
		return Habilidade.nova(5L, "Super-velocidade");
	}

	private Habilidade peritoEmArtesMarcias() {
		return Habilidade.nova(2L, "Perito em artes marcias");
	}
	
	private Habilidade superForca() {
		return Habilidade.nova(3L, "Super-força");
	}
	
	private Habilidade intelectoGenial() {
		return Habilidade.nova(1L, "Intelecto Genial");
	}
	
	private Habilidade voar() {
		return Habilidade.nova(13L, "Voar");
	}
	
	private Habilidade imortalidade() {
		return Habilidade.nova(11L, "Imortalidade");
	}

}
