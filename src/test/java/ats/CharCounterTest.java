package ats;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class CharCounterTest {

	@Test
	public void countAllShouldReturnEmptyWithEmpty() {
		CharCounter cc = new CharCounter();
		HashMap<Character, Integer> result = cc.countAll("");
		Assert.assertEquals(0,result.size());
	}
	
	@Test
	public void countAllShouldReturnEmptyWithNull() {
		CharCounter cc = new CharCounter();
		HashMap<Character, Integer> result = cc.countAll(null);
		Assert.assertEquals(0,result.size());
	}
	
	@Test
	public void countAllShouldReturn2a() {
		CharCounter cc = new CharCounter();
		HashMap<Character, Integer> result = cc.countAll("KaKa");
		Assert.assertEquals(new Integer(2),result.get('a'));
	}
	
	@Test
	public void countAllShouldReturn2K() {
		CharCounter cc = new CharCounter();
		HashMap<Character, Integer> result = cc.countAll("KaKa");
		Assert.assertEquals(new Integer(2),result.get('K'));
	}
	
	@Test
	public void countAllShouldReturn2KLowerCase() {
		CharCounter cc = new CharCounter();
		HashMap<Character, Integer> result = cc.countAll("Kaka");
		Assert.assertEquals(new Integer(2),result.get('k'));
	}

}
