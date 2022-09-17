package com.shanzs.weixinapp.utils;

import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 蛋炒饭不加蛋
 */
public class CodeUtil {
  private static final  String BASE_URL="https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";
  private static final  String WX_OPEN_APP_ID = "wx266b9fae9b50ff99";
  private static final  String WX_OPEN_APP_SECRET = "9d061f13660a739f300b13e1c80063a9";
  public Map getRes(String code) {
    String getUrlCode = String.format(BASE_URL, WX_OPEN_APP_ID, WX_OPEN_APP_SECRET, code);
    CloseableHttpClient httpclient = HttpClients.createDefault();
    String resultString = "";
    CloseableHttpResponse response = null;
    try {
      URIBuilder builder = new URIBuilder(getUrlCode);
      URI uri = builder.build();
      HttpGet httpGet = new HttpGet(uri);
      response = httpclient.execute(httpGet);
      if (response.getStatusLine().getStatusCode() == 200) {
        resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (response != null) {
          response.close();
        }
        httpclient.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    Gson gson = new Gson();
    Map map = gson.fromJson(resultString, HashMap.class);
    return map;
  }
}
