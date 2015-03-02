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
   private boolean isAdult;

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

   public boolean isIsAdult()
   {
      return this.isAdult;
   }

   public void setIsAdult(boolean isAdult)
   {
      this.isAdult = isAdult;
   }

   public Customer(java.lang.String name, java.util.Date dob, boolean isAdult)
   {
      this.name = name;
      this.dob = dob;
      this.isAdult = isAdult;
   }

}