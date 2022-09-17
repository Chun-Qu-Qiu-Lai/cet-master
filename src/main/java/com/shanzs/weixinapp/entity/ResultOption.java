package com.shanzs.weixinapp.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author 蛋炒饭不加蛋
 */
public class ResultOption implements Serializable {

  private String text;
  private int value;
  private int answer;

  public ResultOption() {
  }

  public ResultOption(String text, int value, int answer) {
    this.text = text;
    this.value = value;
    this.answer = answer;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getAnswer() {
    return answer;
  }

  public void setAnswer(int answer) {
    this.answer = answer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultOption that = (ResultOption) o;
    return value == that.value && answer == that.answer && Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, value, answer);
  }

  @Override
  public String toString() {
    return "ResultOption{" +
            "text='" + text + '\'' +
            ", value=" + value +
            ", answer=" + answer +
            '}';
  }
}
