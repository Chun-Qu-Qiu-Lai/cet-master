package com.shanzs.weixinapp.entity;

import java.io.Serializable;

/**
 * @author 蛋炒饭不加蛋
 */
public class SetForm implements Serializable {
  private int deepChecklistTextFontSize;
  private int optionStyle;
  private OptionBackFormData optionBackFormData;
  private OptionCorrectFormData optionCorrectFormData;
  public SetForm(){}

  public SetForm(int deepChecklistTextFontSize, int optionStyle, OptionBackFormData optionBackFormData, OptionCorrectFormData optionCorrectFormData) {
    this.deepChecklistTextFontSize = deepChecklistTextFontSize;
    this.optionStyle = optionStyle;
    this.optionBackFormData = optionBackFormData;
    this.optionCorrectFormData = optionCorrectFormData;
  }

  public int getDeepChecklistTextFontSize() {
    return deepChecklistTextFontSize;
  }

  public void setDeepChecklistTextFontSize(int deepChecklistTextFontSize) {
    this.deepChecklistTextFontSize = deepChecklistTextFontSize;
  }

  public int getOptionStyle() {
    return optionStyle;
  }

  public void setOptionStyle(int optionStyle) {
    this.optionStyle = optionStyle;
  }

  public OptionBackFormData getOptionBackFormData() {
    return optionBackFormData;
  }

  public void setOptionBackFormData(OptionBackFormData optionBackFormData) {
    this.optionBackFormData = optionBackFormData;
  }

  public OptionCorrectFormData getOptionCorrectFormData() {
    return optionCorrectFormData;
  }

  public void setOptionCorrectFormData(OptionCorrectFormData optionCorrectFormData) {
    this.optionCorrectFormData = optionCorrectFormData;
  }
}
