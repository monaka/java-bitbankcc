package cc.bitbank.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by tanaka on 2017/04/12.
 */
public class Assets extends Data {

    public static class Asset {
        public String asset;
        @JsonProperty("amount_precision")
        public int amountPrecision;
        @JsonProperty("onhand_amount")
        public BigDecimal onhandAmount;
        @JsonProperty("locked_amount")
        public BigDecimal lockedAmount;
        @JsonProperty("free_amount")
        public BigDecimal freeAmount;
        @JsonProperty("withdrawal_fee")
        public Object withdrawalFee;
    }

    public Asset[] assets;

    public Assets(){}
    public Assets(Asset[] a) { this.assets = a; }
}