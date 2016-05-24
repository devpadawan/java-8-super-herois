package com.devpadawan.superherois.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

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
 * @author Josimar Silva a.k.a devpadawan - josimaralves dot com at gmail dot
 *         com
 * @since May 23, 2016
 */
public class SuperHeroi {

	private String nomeReal;

	private String codinome;

	private LocalDate dataDeNascimento;

	private Genero genero;

	private Editora editora;

	private Set<Habilidade> habilidades = new HashSet<>();
	
	public SuperHeroi() {
		
	}

	/** Getters and Setters **/

	public int getQuantidadeDeHabilidades() {
		return habilidades.size();
	}
	
	public String getDataDeNascimentoFormatada() {
		
		return DateTimeFormatter.ofPattern("dd/MM/YYYY").format(getDataDeNascimento());
	}

	public String getNomeReal() {
		return nomeReal;
	}

	public void setNomeReal(final String nomeReal) {
		this.nomeReal = nomeReal;
	}

	public String getCodinome() {
		return codinome;
	}

	public void setCodinome(final String codinome) {
		this.codinome = codinome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(final LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(final Genero genero) {
		this.genero = genero;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Set<Habilidade> getHabilidades() {
		return habilidades;
	}
	
	public void adicionarHabilidade(final Habilidade habilidade) {
		this.habilidades.add(habilidade);
	}

	public void setHabilidades(final Set<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	@Override
	public String toString() {
		return "SuperHeroi [nomeReal=" + nomeReal + ", codinome=" + codinome + ", dataDeNascimento=" + dataDeNascimento + ", genero=" + genero + ", editora=" + editora + "]";
	}

}
