import static org.junit.Assert.*;
import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test1() throws InvalidFormatException{
		
		assertEquals("1", "I", RomanNumerals.convertToInteger(1));
		assertEquals("2", "II", RomanNumerals.convertToInteger(2));
		assertEquals("4", "IV", RomanNumerals.convertToInteger(4));
	}

	@Test
	public void test2() throws InvalidFormatException {
		assertEquals("5", "V", RomanNumerals.convertToInteger(5));
		assertEquals("7", "VII", RomanNumerals.convertToInteger(7));
		assertEquals("8", "VIII", RomanNumerals.convertToInteger(8));
		assertEquals("9", "IX", RomanNumerals.convertToInteger(9));
	}
	
	@Test
	public void testgreaterthan10() throws InvalidFormatException{
		assertEquals("12", "XII", RomanNumerals.convertToInteger(12));
		assertEquals("15", "XV", RomanNumerals.convertToInteger(15));
		assertEquals("18", "XVIII", RomanNumerals.convertToInteger(18));
		assertEquals("19", "XIX", RomanNumerals.convertToInteger(19));
	}
	
	@Test
	public void testlessthan50() throws InvalidFormatException{
		assertEquals("25", "XXV", RomanNumerals.convertToInteger(25));
		assertEquals("30", "XXX", RomanNumerals.convertToInteger(30));
		assertEquals("39", "XXXIX", RomanNumerals.convertToInteger(39));
		assertEquals("40", "XL", RomanNumerals.convertToInteger(40));
		assertEquals("48", "XLVIII", RomanNumerals.convertToInteger(48));
		assertEquals("49", "XLIX", RomanNumerals.convertToInteger(49));
	}
	
	@Test
	public void testlessthan100() throws InvalidFormatException{
		assertEquals("50", "L", RomanNumerals.convertToInteger(50));
		assertEquals("59", "LIX", RomanNumerals.convertToInteger(59));
		assertEquals("74", "LXXIV", RomanNumerals.convertToInteger(74));
		assertEquals("80", "LXXX", RomanNumerals.convertToInteger(80));
		assertEquals("88", "LXXXVIII", RomanNumerals.convertToInteger(88));
		assertEquals("99", "XCIX", RomanNumerals.convertToInteger(99));
		assertEquals("100", "C", RomanNumerals.convertToInteger(100));
	}
	
	@Test
	public void testlessthan1000() throws InvalidFormatException{
		assertEquals("200", "CC", RomanNumerals.convertToInteger(200));
		assertEquals("300", "CCC", RomanNumerals.convertToInteger(300));
		assertEquals("400", "CD", RomanNumerals.convertToInteger(400));
		assertEquals("500", "D", RomanNumerals.convertToInteger(500));
		assertEquals("600", "DC", RomanNumerals.convertToInteger(600));
		assertEquals("700", "DCC", RomanNumerals.convertToInteger(700));
		assertEquals("800", "DCCC", RomanNumerals.convertToInteger(800));
		assertEquals("900", "CM", RomanNumerals.convertToInteger(900));
	}
	@Test
	public void testgreaterthan1000() throws InvalidFormatException{
		assertEquals("1000", "M", RomanNumerals.convertToInteger(1000));
		assertEquals("1984", "MCMLXXXIV", RomanNumerals.convertToInteger(1984));
		assertEquals("2014", "MMXIV", RomanNumerals.convertToInteger(2014));
		
	}
	@Test (expected = InvalidFormatException.class)
	public void testingerrorcases() throws InvalidFormatException{
		RomanNumerals converter=new RomanNumerals();
		converter.valuechecking("IIII");
		converter.valuechecking("CCCC");
		converter.valuechecking("XXXX");
		converter.valuechecking("MMMMM");
		converter.valuechecking("C");
		converter.valuechecking("VV");
		converter.valuechecking("LL");
		converter.valuechecking("DD");
		converter.valuechecking("XXC");
		
	}
}
