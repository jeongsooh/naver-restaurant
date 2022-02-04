package com.example.restaurant.naver.dto;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class SearchLocalReq {

  private String query = "";
  private int dispaly = 1;
  private int start = 1;
  private String sort = "random";

  public MultiValueMap<String, String> toMultiValueMap() {
    var map = new LinkedMultiValueMap<String, String>();

    map.add("query", query);
    map.add("display", String.valueOf(dispaly));
    map.add("start", String.valueOf(start));
    map.add("sort", sort);

    return map;
  }

  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  } 
}
