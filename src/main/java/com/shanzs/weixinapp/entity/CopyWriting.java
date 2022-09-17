package com.shanzs.weixinapp.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author 蛋炒饭不加蛋
 */
public class CopyWriting implements Serializable {
  private Integer id;
  private String content;
  private String source;

  private String create_time;

  private CopyWriting() {

  }

  public CopyWriting(Integer id, String content, String source, String create_time) {
    this.id = id;
    this.content = content;
    this.source = source;
    this.create_time = create_time;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
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
    CopyWriting that = (CopyWriting) o;
    return Objects.equals(id, that.id) && Objects.equals(content, that.content) && Objects.equals(source, that.source) && Objects.equals(create_time, that.create_time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, content, source, create_time);
  }

  @Override
  public String toString() {
    return "CopyWriting{" +
            "id=" + id +
            ", content='" + content + '\'' +
            ", source='" + source + '\'' +
            ", create_time='" + create_time + '\'' +
            '}';
  }
}
