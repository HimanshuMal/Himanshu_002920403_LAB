/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classdesignmodel;

/**
 *
 * @author 18572
 */
public class Student {
    private long nuid ;
    private String  firstName ;
    private String lastName ;
    private String collegeName ;
    Contact personalContact ;
    Contact officeContact ;
    Address permanentAddress ;
    Address currentAddress ;
    
    
    public Student()
    { this.nuid = 0 ;
      this.firstName = " " ;
      this.lastName = " " ;
      this.collegeName = " " ;
      this.personalContact = new Contact() ;
      this.officeContact = new Contact() ;
      this.permanentAddress = new Address() ;
      this.currentAddress = new Address() ;
      
    }
    
    public long getNuid() {
        return nuid;
    }

    public void setNuid(long nuid) {
        this.nuid = nuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
   
}
