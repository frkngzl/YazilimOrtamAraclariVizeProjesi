package tr.edu.medipol.yazilimaraclari.furkanguzel;

import org.junit.*;

public class UcretHesaplaTest {
	
	@Test
	public void testUcretHesapla() {
		
		 Object sonuc = MuhasebeProgrami.ucretHesapla(5, 25);
		 Assert.assertEquals(125, sonuc);
		
	}

}
