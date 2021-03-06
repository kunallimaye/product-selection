/**
 * 
 */
package com.kunal.demo.rules;


import java.util.Calendar;
import java.util.Date;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import com.kunal.demo.rules.model.Customer;
import com.kunal.demo.rules.model.CustomerProfile;

/**
 * @author kunallimaye
 *
 */
public class CustomerProfileTest {
	private static StatelessKieSession kSession;
	
	@BeforeClass
	public static void setup(){
		KieServices kieServices = KieServices.Factory.get();
        KieContainer kContainer = kieServices.getKieClasspathContainer();
        kSession = kContainer.newStatelessKieSession();
	}
	
	private Date setDate(int dayOfMonth, int month, int year){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();
	}
	
	@Test
	public void testAdultCustomer(){
		Customer customer = new Customer();
		customer.setDob(this.setDate(1, 1, 1980));
		customer.setName("KS Limaye");
		
		CustomerProfile profile = new CustomerProfile(customer);
		//profile.setCustomer(customer);
		//profile.setAge(35);
		kSession.execute(profile);
		
		System.out.println(profile);
		Assert.assertTrue(profile.isRequiresHealthInsurance());
	}
}
