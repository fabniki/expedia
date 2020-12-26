package homeDepotboot;

import org.testng.annotations.Test;

import PIIT_.bootcamp.Form;
import PIIT_.bootcamp.createaccpage;
import PIIT_.bootcamp.home;

public class NewTestbootrun extends Newbootusuability{
  
  @Test
  public void fhome() throws InterruptedException {
	  home ho=new home(driver);
	  ho.myaccounttab();
	  ho.registertab();
  Thread.sleep(5000);
	  createaccpage cr=new createaccpage(driver);
	  cr.personalacc();
	  cr.selectcontinue();
	  Thread.sleep(5000);
  
	  Form fo=new Form(driver);	  
	  fo.emailtab("Fatemeh@gmail.com");
	  fo.passwordtab("Ryan2383");
	  fo.zipcode("20191");
	  fo.phonenum("7033090365");
	  fo.keepme();
	  fo.verifyme();
	  Thread.sleep(5000);
  }

}

