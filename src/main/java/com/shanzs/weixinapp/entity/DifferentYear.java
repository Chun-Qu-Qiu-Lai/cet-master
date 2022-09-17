package com.shanzs.weixinapp.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author 蛋炒饭不加蛋
 */
public class DifferentYear implements Serializable {
  private Integer id;
  private String different_year;

  public DifferentYear() {

  }

  public DifferentYear(Integer id, String different_year) {
    this.id = id;
    this.different_year = different_year;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDifferent_year() {
    return different_year;
  }

  public void setDifferent_year(String different_year) {
    this.different_year = different_year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DifferentYear that = (DifferentYear) o;
    return Objects.equals(id, that.id) && Objects.equals(different_year, that.different_year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, different_year);
  }

  @Override
  public String toString() {
    return "DifferentYear{" +
            "id=" + id +
            ", different_year='" + different_year + '\'' +
            '}';
  }
}

