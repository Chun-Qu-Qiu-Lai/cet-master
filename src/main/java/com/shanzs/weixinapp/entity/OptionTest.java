package com.shanzs.weixinapp.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author 蛋炒饭不加蛋
 */
public class OptionTest implements Serializable {
  private Integer id;
  private String question;
  private String option_a;
  private String option_b;
  private String option_c;
  private String option_d;
  private int answer;
  private String description;

  public OptionTest() {

  }

  public OptionTest(Integer id, String question, String option_a, String option_b, String option_c, String option_d, int answer, String description) {
    this.id = id;
    this.question = question;
    this.option_a = option_a;
    this.option_b = option_b;
    this.option_c = option_c;
    this.option_d = option_d;
    this.answer = answer;
    this.description = description;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getOption_a() {
    return option_a;
  }

  public void setOption_a(String option_a) {
    this.option_a = option_a;
  }

  public String getOption_b() {
    return option_b;
  }

  public void setOption_b(String option_b) {
    this.option_b = option_b;
  }

  public String getOption_c() {
    return option_c;
  }

  public void setOption_c(String option_c) {
    this.option_c = option_c;
  }

  public String getOption_d() {
    return option_d;
  }

  public void setOption_d(String option_d) {
    this.option_d = option_d;
  }

  public int getAnswer() {
    return answer;
  }

  public void setAnswer(int answer) {
    this.answer = answer;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionTest that = (OptionTest) o;
    return answer == that.answer && Objects.equals(id, that.id) && Objects.equals(question, that.question) && Objects.equals(option_a, that.option_a) && Objects.equals(option_b, that.option_b) && Objects.equals(option_c, that.option_c) && Objects.equals(option_d, that.option_d) && Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, question, option_a, option_b, option_c, option_d, answer, description);
  }

  @Override
  public String toString() {
    return "OptionTest{" +
            "id=" + id +
            ", question='" + question + '\'' +
            ", option_a='" + option_a + '\'' +
            ", option_b='" + option_b + '\'' +
            ", option_c='" + option_c + '\'' +
            ", option_d='" + option_d + '\'' +
            ", answer=" + answer +
            ", description='" + description + '\'' +
            '}';
  }
}
