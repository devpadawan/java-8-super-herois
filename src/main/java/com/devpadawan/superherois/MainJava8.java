package com.devpadawan.superherois;

import static java.util.Comparator.comparingInt;

import java.util.Set;
import java.util.stream.Collectors;

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
 * @author Josimar Silva a.k.a devpadawan - josimaralves dot com at gmail dot
 *         com
 * @since May 24, 2016
 */
public class MainJava8 extends Main {

	public static void main(final String[] args) {

		final Set<SuperHeroi> superHerois = Dados.novo().carregarSuperHerois();

		imprime("Todos os codinomes dos superherois");
		superHerois.forEach(superHeroi -> System.out.println(superHeroi.getCodinome()));

	}

}
