package com.shanzs.weixinapp.entity;

import java.io.Serializable;

/**
 * @author 蛋炒饭不加蛋
 */
public class OptionBackFormData implements Serializable {
  private Integer optionBackColorR;
  private Integer optionBackColorG;
  private Integer optionBackColorB;
  private float optionBackColorA;

  public OptionBackFormData() {
  }

  public OptionBackFormData(Integer optionBackColorR, Integer optionBackColorG, Integer optionBackColorB, float optionBackColorA) {
    this.optionBackColorR = optionBackColorR;
    this.optionBackColorG = optionBackColorG;
    this.optionBackColorB = optionBackColorB;
    this.optionBackColorA = optionBackColorA;
  }

  public Integer getOptionBackColorR() {
    return optionBackColorR;
  }

  public void setOptionBackColorR(Integer optionBackColorR) {
    this.optionBackColorR = optionBackColorR;
  }

  public Integer getOptionBackColorG() {
    return optionBackColorG;
  }

  public void setOptionBackColorG(Integer optionBackColorG) {
    this.optionBackColorG = optionBackColorG;
  }

  public Integer getOptionBackColorB() {
    return optionBackColorB;
  }

  public void setOptionBackColorB(Integer optionBackColorB) {
    this.optionBackColorB = optionBackColorB;
  }

  public float getOptionBackColorA() {
    return optionBackColorA;
  }

  public void setOptionBackColorA(float optionBackColorA) {
    this.optionBackColorA = optionBackColorA;
  }
}
