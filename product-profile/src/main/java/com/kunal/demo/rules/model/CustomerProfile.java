/**
 * 
 */
package com.kunal.demo.rules.model;

/**
 * @author kunallimaye
 *
 */
public class CustomerProfile {
	@org.kie.api.definition.type.Label("Customer instance")
	private Customer customer;

	@org.kie.api.definition.type.Label("Age")
	private int age;

	@org.kie.api.definition.type.Label("Affordability of the customer")
	private AffordabilityConcernType affordabilityConcern;

	@org.kie.api.definition.type.Label("Insurance cover amount")
	private long coverAmount;

	@org.kie.api.definition.type.Label("Employment duration of the customer")
	private EmploymentDurationType employmentDuration;

	@org.kie.api.definition.type.Label(value = "Does the customer require health insurance?")
	private boolean requiresHealthInsurance;

	public CustomerProfile() {

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
	
	/**
	 * 
	 * @param customer
	 */
	public CustomerProfile(Customer customer){
		this.customer = customer;
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

	public boolean isRequiresHealthInsurance() {
		return this.requiresHealthInsurance;
	}

	public void setRequiresHealthInsurance(boolean requiresHealthInsurance) {
		this.requiresHealthInsurance = requiresHealthInsurance;
	}

	public CustomerProfile(com.kunal.demo.rules.model.Customer customer,
			int age, long coverAmount, boolean requiresHealthInsurance) {
		this.customer = customer;
		this.age = age;
		this.coverAmount = coverAmount;
		this.requiresHealthInsurance = requiresHealthInsurance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerProfile [customer=" + customer + ", age=" + age
				+ ", affordabilityConcern=" + affordabilityConcern
				+ ", coverAmount=" + coverAmount + ", employmentDuration="
				+ employmentDuration + ", requiresHealthInsurance="
				+ requiresHealthInsurance + "]";
	}

}