package com.sam_chordas.android.stockhawk.api;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ResponseStock {
  @SerializedName("query")
  private Result mResult;

  public List<StockQuote> getStockQuotes() {
    List<StockQuote> result = new ArrayList<>();
    if (mResult != null && mResult.getQuote() != null) {
      StockQuote stockQuote = mResult.getQuote().getStockQuote();
      if (stockQuote.getBid() != null && stockQuote.getChangeInPercent() != null
              && stockQuote.getChange() != null) {
        result.add(stockQuote);
      }
    }
    return result;
  }

  public class Result {

    @SerializedName("count")
    private int mCount;

    @SerializedName("results")
    private Quote mQuote;

    public Quote getQuote() {
      return mQuote;
    }
  }

  public class Quote {

    @SerializedName("quote")
    private StockQuote mStockQuote;

    public StockQuote getStockQuote() {
      return mStockQuote;
    }
  }
}