package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Connection;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-06-24T22:09:50.540Z")
public class InlineResponse2003   {
  
  private Boolean success = null;
  private List<Connection> data = new ArrayList<Connection>();

  /**
   **/
  public InlineResponse2003 success(Boolean success) {
    this.success = success;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   **/
  public InlineResponse2003 data(List<Connection> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public List<Connection> getData() {
    return data;
  }
  public void setData(List<Connection> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(success, inlineResponse2003.success) &&
        Objects.equals(data, inlineResponse2003.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
