package gov.va.med.lom.vistabroker.patient.data;

import java.io.Serializable;

public class OrderSheet implements Serializable {
  
  private String code;
  private String id;
  private String name;
  
  public OrderSheet() {
    this.code = null;
    this.id = null;
    this.name = null;
  }
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
}
