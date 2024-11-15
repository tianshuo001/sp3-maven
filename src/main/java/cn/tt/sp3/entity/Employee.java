package cn.tt.sp3.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("employee")
@AllArgsConstructor
public class Employee implements Serializable {

  @JsonIgnore
  private Integer id;

  private String name;

  private Integer phone;


}
