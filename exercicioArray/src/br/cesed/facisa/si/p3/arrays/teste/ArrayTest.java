package br.cesed.facisa.si.p3.arrays.teste;

import org.junit.Assert;
import org.junit.Test;

import br.cesed.facisa.si.p3.arrays.entidades.ArrayListFacisa;

public class ArrayTest {

	@Test
	public void testSize() {
		ArrayListFacisa lista1 = new ArrayListFacisa(3);

		Assert.assertEquals(lista1.size(), 0);

		lista1.add("pedro");

		Assert.assertEquals(1, lista1.size());

		lista1.add("j�o");

		Assert.assertEquals(2, lista1.size());
	}

	@Test
	public void testAdd() {
		ArrayListFacisa lista1 = new ArrayListFacisa(3);

		lista1.add("jeca");

		Assert.assertEquals(1, lista1.size());

		lista1.add("balalaica");

		lista1.add("vodka");

		lista1.add("putin");

		Assert.assertEquals(4, lista1.size());

	}

	@Test
	public void testRemove() {
		ArrayListFacisa lista1 = new ArrayListFacisa(3);

		lista1.add("nome");
		lista1.add("nome 2");
		
		Assert.assertEquals(2, lista1.size());
		
		lista1.removeByObject("nome");
		
		Assert.assertEquals(1, lista1.size());

	}

	@Test
	public void testFindPosition() {
		ArrayListFacisa lista = new ArrayListFacisa(3);

		lista.add("fernando");

		Assert.assertEquals(0, lista.findPosition("fernando"));

		lista.add("antonio");

		Assert.assertEquals(1, lista.findPosition("antonio"));

	}


}
