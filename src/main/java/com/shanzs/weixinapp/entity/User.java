package com.shanzs.weixinapp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


/**
 * @author 蛋炒饭不加蛋
 */
public class User implements Serializable {
  private Integer id;
  private String sessionKey;
  private String openid;
  private String avatarUrl;
  private String nickName;
  private Integer optionBackColorR;
  private Integer optionBackColorG;
  private Integer optionBackColorB;
  private float optionBackColorA;
  private Integer optionCorrectBackColorR;
  private Integer optionCorrectBackColorG;
  private Integer optionCorrectBackColorB;
  private float optionCorrectBackColorA;
  private String deepChecklistTextFontSize;
  private Integer optionStyle;
  private Date createTime;

  public User() {

  }

  public User(Integer id, String sessionKey, String openid, String avatarUrl, String nickName, Integer optionBackColorR, Integer optionBackColorG, Integer optionBackColorB, float optionBackColorA, Integer optionCorrectBackColorR, Integer optionCorrectBackColorG, Integer optionCorrectBackColorB, float optionCorrectBackColorA, String deepChecklistTextFontSize, Integer optionStyle, Date createTime) {
    this.id = id;
    this.sessionKey = sessionKey;
    this.openid = openid;
    this.avatarUrl = avatarUrl;
    this.nickName = nickName;
    this.optionBackColorR = optionBackColorR;
    this.optionBackColorG = optionBackColorG;
    this.optionBackColorB = optionBackColorB;
    this.optionBackColorA = optionBackColorA;
    this.optionCorrectBackColorR = optionCorrectBackColorR;
    this.optionCorrectBackColorG = optionCorrectBackColorG;
    this.optionCorrectBackColorB = optionCorrectBackColorB;
    this.optionCorrectBackColorA = optionCorrectBackColorA;
    this.deepChecklistTextFontSize = deepChecklistTextFontSize;
    this.optionStyle = optionStyle;
    this.createTime = createTime;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSessionKey() {
    return sessionKey;
  }

  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
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

  public String getDeepChecklistTextFontSize() {
    return deepChecklistTextFontSize;
  }

  public void setDeepChecklistTextFontSize(String deepChecklistTextFontSize) {
    this.deepChecklistTextFontSize = deepChecklistTextFontSize;
  }

  public Integer getOptionStyle() {
    return optionStyle;
  }

  public void setOptionStyle(Integer optionStyle) {
    this.optionStyle = optionStyle;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Float.compare(user.optionBackColorA, optionBackColorA) == 0 && Float.compare(user.optionCorrectBackColorA, optionCorrectBackColorA) == 0 && Objects.equals(id, user.id) && Objects.equals(sessionKey, user.sessionKey) && Objects.equals(openid, user.openid) && Objects.equals(avatarUrl, user.avatarUrl) && Objects.equals(nickName, user.nickName) && Objects.equals(optionBackColorR, user.optionBackColorR) && Objects.equals(optionBackColorG, user.optionBackColorG) && Objects.equals(optionBackColorB, user.optionBackColorB) && Objects.equals(optionCorrectBackColorR, user.optionCorrectBackColorR) && Objects.equals(optionCorrectBackColorG, user.optionCorrectBackColorG) && Objects.equals(optionCorrectBackColorB, user.optionCorrectBackColorB) && Objects.equals(deepChecklistTextFontSize, user.deepChecklistTextFontSize) && Objects.equals(optionStyle, user.optionStyle) && Objects.equals(createTime, user.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sessionKey, openid, avatarUrl, nickName, optionBackColorR, optionBackColorG, optionBackColorB, optionBackColorA, optionCorrectBackColorR, optionCorrectBackColorG, optionCorrectBackColorB, optionCorrectBackColorA, deepChecklistTextFontSize, optionStyle, createTime);
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", sessionKey='" + sessionKey + '\'' +
            ", openid='" + openid + '\'' +
            ", avatarUrl='" + avatarUrl + '\'' +
            ", nickName='" + nickName + '\'' +
            ", optionBackColorR=" + optionBackColorR +
            ", optionBackColorG=" + optionBackColorG +
            ", optionBackColorB=" + optionBackColorB +
            ", optionBackColorA=" + optionBackColorA +
            ", optionCorrectBackColorR=" + optionCorrectBackColorR +
            ", optionCorrectBackColorG=" + optionCorrectBackColorG +
            ", optionCorrectBackColorB=" + optionCorrectBackColorB +
            ", optionCorrectBackColorA=" + optionCorrectBackColorA +
            ", deepChecklistTextFontSize='" + deepChecklistTextFontSize + '\'' +
            ", optionStyle=" + optionStyle +
            ", createTime=" + createTime +
            '}';
  }
}

