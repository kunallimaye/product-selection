/**
 * 
 */
package com.kunal.demo.rules.model;

/**
 * @author kunallimaye
 *
 */
public class CustomerProfile {
	private Customer customer;
	private int age;
	private AffordabilityConcernType affordabilityConcern;
	private long coverAmount;
	private EmploymentDurationType employmentDuration;

	public CustomerProfile(){
		
	}
	
	/**
	 * @param customer
	 * @param age
	 * @param affordabilityConcern
	 * @param coverAmount
	 * @param employmentDuration
	 */
	public CustomerProfile(Customer customer, int age,
			AffordabilityConcernType affordabilityConcern, long coverAmount,
			EmploymentDurationType employmentDuration) {
		super();
		this.customer = customer;
		this.age = age;
		this.affordabilityConcern = affordabilityConcern;
		this.coverAmount = coverAmount;
		this.employmentDuration = employmentDuration;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AffordabilityConcernType getAffordabilityConcern() {
		return affordabilityConcern;
	}

	public void setAffordabilityConcern(
			AffordabilityConcernType affordabilityConcern) {
		this.affordabilityConcern = affordabilityConcern;
	}

	public long getCoverAmount() {
		return coverAmount;
	}

	public void setCoverAmount(long coverAmount) {
		this.coverAmount = coverAmount;
	}

	public EmploymentDurationType getEmploymentDuration() {
		return employmentDuration;
	}

	public void setEmploymentDuration(EmploymentDurationType employmentDuration) {
		this.employmentDuration = employmentDuration;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerProfile [customer=" + customer + ", age=" + age
				+ ", affordabilityConcern=" + affordabilityConcern
				+ ", coverAmount=" + coverAmount + ", employmentDuration="
				+ employmentDuration + "]";
	}

}
