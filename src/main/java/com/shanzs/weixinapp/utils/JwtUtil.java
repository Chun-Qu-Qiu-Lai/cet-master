package com.shanzs.weixinapp.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;

/**
 * 返回token
 *
 * @author 蛋炒饭不加蛋
 */
public class JwtUtil {
  //密钥
  private static final String JWT_TOKEN_KEY = "CHANG_QIAN_MING_YUE_GUANG";
  //超时时间 24小时
  private static final long SET_EXPIRE_TIME = System.currentTimeMillis() + 24 * 60 * 60 * 60 * 1000L;

  //返回token
  public  String createToken(String userId) {
    HashMap<String, Object> mapClaim = new HashMap<>();
    mapClaim.put("userId", userId);
    JwtBuilder jwtBuilder = Jwts.builder()
            .setSubject("user")
            .setIssuer("山楂树")
            .setIssuedAt(new Date())
            .signWith(SignatureAlgorithm.HS256, JWT_TOKEN_KEY)
            .setExpiration(new Date(SET_EXPIRE_TIME))
            .addClaims(mapClaim);
    String token = jwtBuilder.compact();
    return token;

  }

  //解析token，返回用户id
  public String parseToken(String token) {
    Claims claims = Jwts.parser()
            .setSigningKey(JWT_TOKEN_KEY)
            .parseClaimsJws(token)
            .getBody();

    return (String) claims.get("userId");
  }
}
