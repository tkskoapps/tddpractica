package ats;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	@Test
	public void emptyShouldTrue() {
		Stack<Integer> pilita = new Stack<Integer>();
		Assert.assertEquals(pilita.empty(),true);
	}
	
	@Test
	public void emptyShouldFalse() {
		Stack<Integer> pilita = new Stack<Integer>();
		pilita.push(new Integer(20));
		Assert.assertEquals(pilita.empty(),false);
	}
	
	@Test
	public void popShouldReturn20() {
		Stack<Integer> pilita = new Stack<Integer>();
		Integer adentro = new Integer(20);
		pilita.push(adentro);
		Integer elUltimo = pilita.pop();
		Assert.assertEquals(adentro,elUltimo);
	}

}
