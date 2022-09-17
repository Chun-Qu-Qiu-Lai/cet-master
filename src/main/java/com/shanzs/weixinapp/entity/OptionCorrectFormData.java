package com.shanzs.weixinapp.entity;

import java.io.Serializable;

/**
 * @author 蛋炒饭不加蛋
 */
public class OptionCorrectFormData implements Serializable {
  private Integer optionCorrectBackColorR;
  private Integer optionCorrectBackColorG;
  private Integer optionCorrectBackColorB;
  private float optionCorrectBackColorA;

  public OptionCorrectFormData() {
  }

  public OptionCorrectFormData(Integer optionCorrectBackColorR, Integer optionCorrectBackColorG, Integer optionCorrectBackColorB, float optionCorrectBackColorA) {
    this.optionCorrectBackColorR = optionCorrectBackColorR;
    this.optionCorrectBackColorG = optionCorrectBackColorG;
    this.optionCorrectBackColorB = optionCorrectBackColorB;
    this.optionCorrectBackColorA = optionCorrectBackColorA;
  }

  public Integer getOptionCorrectBackColorR() {
    return optionCorrectBackColorR;
  }

  public void setOptionCorrectBackColorR(Integer optionCorrectBackColorR) {
    this.optionCorrectBackColorR = optionCorrectBackColorR;
  }

  public Integer getOptionCorrectBackColorG() {
    return optionCorrectBackColorG;
  }

  public void setOptionCorrectBackColorG(Integer optionCorrectBackColorG) {
    this.optionCorrectBackColorG = optionCorrectBackColorG;
  }

  public Integer getOptionCorrectBackColorB() {
    return optionCorrectBackColorB;
  }

  public void setOptionCorrectBackColorB(Integer optionCorrectBackColorB) {
    this.optionCorrectBackColorB = optionCorrectBackColorB;
  }

  public float getOptionCorrectBackColorA() {
    return optionCorrectBackColorA;
  }

  public void setOptionCorrectBackColorA(float optionCorrectBackColorA) {
    this.optionCorrectBackColorA = optionCorrectBackColorA;
  }
}
