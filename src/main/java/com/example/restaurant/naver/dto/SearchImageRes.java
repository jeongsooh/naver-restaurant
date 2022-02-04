package com.example.restaurant.naver.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchImageRes {
  private String lastBuildDate;
  private int total;
  private int start;
  private int display;
  private List<SearchLocalItem> items;

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public static class SearchLocalItem {
    private String title;
    private String link;
    private String thumbnail;
    private String sizeheight;
    private String sizwwidth;
  }
}