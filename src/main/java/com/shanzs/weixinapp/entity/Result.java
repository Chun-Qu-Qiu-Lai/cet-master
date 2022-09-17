package com.shanzs.weixinapp.entity;

import java.io.Serializable;
import java.util.Objects;



/**
 * @author 蛋炒饭不加蛋
 */
public class Result implements Serializable {
  private Integer code;
  private String msg;
  private Object data;
  public Result() {
  }
  public Result(Integer code, String msg, Object data) {
    this.code = code;
    this.msg = msg;
    this.data = data;
  }
  public Result(Integer code, String msg) {
    this.code = code;
    this.msg = msg;
  }
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
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
    Result result = (Result) o;
    return Objects.equals(code, result.code) && Objects.equals(msg, result.msg) && Objects.equals(data, result.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, msg, data);
  }

  @Override
  public String toString() {
    return "Result{" +
            "code=" + code +
            ", msg='" + msg + '\'' +
            ", data=" + data +
            '}';
  }

  public static Result success(int code, String msg) {
    Result result = new Result();
    result.setCode(code);
    result.setMsg(msg);
    return result;
  }

  public static Result success(int code, String msg, Object data) {
    Result result = new Result();
    result.setCode(code);
    result.setMsg(msg);
    result.setData(data);
    return result;
  }

}
