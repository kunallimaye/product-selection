package com.kunal.demo.rules.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Customer name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label(value = "Date of birth")
   private java.util.Date dob;
   @org.kie.api.definition.type.Label(value = "Adult customer?")
   private boolean adult;

   public Customer()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.util.Date getDob()
   {
      return this.dob;
   }

   public void setDob(java.util.Date dob)
   {
      this.dob = dob;
   }

   public boolean isAdult()
   {
      return this.adult;
   }

   public void setAdult(boolean adult)
   {
      this.adult = adult;
   }

   public Customer(java.lang.String name, java.util.Date dob, boolean adult)
   {
      this.name = name;
      this.dob = dob;
      this.adult = adult;
   }

	public String toString(){
		return	"Name: " + this.name +
			"\n\tdob: " + this.dob +
			"\n\tadult?: " + this.adult;
	}
}