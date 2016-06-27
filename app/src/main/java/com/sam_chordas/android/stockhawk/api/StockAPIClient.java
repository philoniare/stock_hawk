package com.sam_chordas.android.stockhawk.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StockAPIClient {
  String API_BASE_URL = "https://query.yahooapis.com";

  @GET("/v1/public/yql?" +
          "format=json&diagnostics=true&" +
          "env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=")
  Call<ResponseStock> getStock(@Query("q") String query);

  @GET("/v1/public/yql?" +
              "format=json&diagnostics=true&" +
              "env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=")
  Call<ResponseStocks> getStocks(@Query("q") String query);

  @GET("/v1/public/yql?" +
          "format=json&diagnostics=true&" +
          "env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=")
  Call<ResponseHistoricalData> getStockHistoricalData(@Query("q") String query);
}
