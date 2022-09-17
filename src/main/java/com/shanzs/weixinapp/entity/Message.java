package com.shanzs.weixinapp.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author 蛋炒饭不加蛋
 */
public class Message implements Serializable {
  private Integer id;
  private String message;
  private String create_time;

  public Message() {

  }

  public Message(Integer id, String message, String create_time) {
    this.id = id;
    this.message = message;
    this.create_time = create_time;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getCreate_time() {
    return create_time;
  }

  public void setCreate_time(String create_time) {
    this.create_time = create_time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message1 = (Message) o;
    return Objects.equals(id, message1.id) && Objects.equals(message, message1.message) && Objects.equals(create_time, message1.create_time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, create_time);
  }

  @Override
  public String toString() {
    return "Message{" +
            "id=" + id +
            ", message='" + message + '\'' +
            ", create_time='" + create_time + '\'' +
            '}';
  }
}
