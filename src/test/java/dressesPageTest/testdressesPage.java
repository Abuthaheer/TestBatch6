package dressesPageTest;



	

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import HomePage.basepageReuseMethods;
import HomePage.dressesObjects;

	
	public class testdressesPage  {

		dressesObjects ds;
		basepageReuseMethods bp;
		
		public testdressesPage()
		{
			ds=new dressesObjects();
			bp=new basepageReuseMethods();
		}
		
		@BeforeMethod
		
		public void preValidation()
		{
		ds.clickDress();
			
		}
		
		@Test
		public void pagenavigateAndDressesSize()
		{
			
			ds.verifytabdresses().click();
			Assert.assertTrue(bp.elementFound(ds.verifySizeS()),"Pass:Element Present");
			Assert.assertTrue(bp.elementFound(ds.verifySizeM()),"Pass:Element Present");
			Assert.assertTrue(bp.elementFound(ds.verifySizeL()),"Pass:Element Present");
			
							
		}
		
			
		@Test
		public void verifydressesaddedtoCart()
		{
			//ds.clickDress();
			ds.addtoCart();
			ds.addedtoCart();
			ds.Scrolldown();
			String s=ds.addedtoCart().getText();
			System.out.println(s);
			String x="Product successfully added to your shopping cart";
			System.out.println(x);
			Assert.assertEquals(s, x);
			ds.closeCartWindow();
					
		}
		
		@Test
		public void verifydressesCount()
		{
			//ds.clickDress();
			//ds.closeCartWindow();
			int count=ds.getProductcountfromheader();
			int productSize=ds.getProduct().size();
			Assert.assertTrue(count==productSize);
					
		}
	}

