package com.shanzs.weixinapp.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author 蛋炒饭不加蛋
 */
public class TestPaper implements Serializable {
  private Integer id;
  private String different_test;
  private int pid;
  private int belong_to;

  public TestPaper() {

  }

  public TestPaper(Integer id, String different_test, int pid, int belong_to) {
    this.id = id;
    this.different_test = different_test;
    this.pid = pid;
    this.belong_to = belong_to;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDifferent_test() {
    return different_test;
  }

  public void setDifferent_test(String different_test) {
    this.different_test = different_test;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }

  public int getBelong_to() {
    return belong_to;
  }

  public void setBelong_to(int belong_to) {
    this.belong_to = belong_to;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPaper testPaper = (TestPaper) o;
    return pid == testPaper.pid && belong_to == testPaper.belong_to && Objects.equals(id, testPaper.id) && Objects.equals(different_test, testPaper.different_test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, different_test, pid, belong_to);
  }

  @Override
  public String toString() {
    return "TestPaper{" +
            "id=" + id +
            ", different_test='" + different_test + '\'' +
            ", pid=" + pid +
            ", belong_to=" + belong_to +
            '}';
  }
}
