package org.xpup.hafmis.orgstrct.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

public class BankAssignRoleAF extends ActionForm{
  
  private List officelist;
  private List rolelist;
  
  private String roles="";
  private String offices="";
  
  private String rolename="";
  private String officename="";
  
  private String officeid;
  private String bankid;
  
  private List roleBanklist;
  private List sparelist;
   
  public String getBankid() {
    return bankid;
  }

  public void setBankid(String bankid) {
    this.bankid = bankid;
  }

  public String getOfficeid() {
    return officeid;
  }

  public void setOfficeid(String officeid) {
    this.officeid = officeid;
  }

  public String getOfficename() {
    return officename;
  }

  public void setOfficename(String officename) {
    this.officename = officename;
  }

  public String getOffices() {
    return offices;
  }

  public void setOffices(String offices) {
    this.offices = offices;
  }

  public List getOfficelist() {
    return officelist;
  }

  public void setOfficelist(List officelist) {
    this.officelist = officelist;
  }

  public List getRolelist() {
    return rolelist;
  }

  public void setRolelist(List rolelist) {
    this.rolelist = rolelist;
  }

  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }

  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  public List getSparelist() {
    return sparelist;
  }

  public void setSparelist(List sparelist) {
    this.sparelist = sparelist;
  }

  public List getRoleBanklist() {
    return roleBanklist;
  }

  public void setRoleBanklist(List roleBanklist) {
    this.roleBanklist = roleBanklist;
  }


}
