package com.devpadawan.superherois.builder;

import java.time.LocalDate;
import java.util.HashSet;

import com.devpadawan.superherois.modelo.Editora;
import com.devpadawan.superherois.modelo.Genero;
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
public final class SuperHeroiBuilder {
	
	private SuperHeroi superHeroi;
	
	private SuperHeroiBuilder() {
		superHeroi = new SuperHeroi();
	}
	
	public static SuperHeroiBuilder novoSuperHeroi() {
		return new SuperHeroiBuilder();
	}
	
	public SuperHeroiBuilder daDC() {
		this.superHeroi.setEditora(Editora.DC);
		return this;
	}
	
	public SuperHeroiBuilder daMarvel() {
		this.superHeroi.setEditora(Editora.DC);
		return this;
	}
	
	public SuperHeroiBuilder nascidoEm(final LocalDate dataDeNascimento) {
		this.superHeroi.setDataDeNascimento(dataDeNascimento);
		return this;
	}
	
	public SuperHeroiBuilder comNomeReal(final String nome) {
		this.superHeroi.setNomeReal(nome);
		return this;
	}
	
	public SuperHeroiBuilder comCodinome(final String codinome) {
		this.superHeroi.setCodinome(codinome);
		return this;
	}
	
	public SuperHeroiBuilder doSexoMasculino() {
		this.superHeroi.setGenero(Genero.M);
		return this;
	}
	
	public SuperHeroiBuilder doSexoFeminino() {
		this.superHeroi.setGenero(Genero.F);
		return this;
	}
	
	public SuperHeroiBuilder comHabilidadesDefault() {
		this.superHeroi.setHabilidades(new HashSet<>());
		return this;
	}
	
	public SuperHeroiBuilder comHabilidadesDe(final Habilidade habilidade) {
		this.superHeroi.adicionarHabilidade(habilidade);
		return this;
	}
	
	public SuperHeroi construa() {
		return this.superHeroi;
	}

}
