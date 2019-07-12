package com.mservice.pay.models;

import lombok.Builder;

public class POSPayRequest extends PayRequest {
    private String hash;
    private Double version;
    private Integer payType;

    @Builder
    public POSPayRequest(String partnerCode, String partnerRefId, String customerNumber, String description, String hash, Double version, Integer payType, String partnerTransId) {
        super(partnerCode, partnerRefId, customerNumber, description);
        this.hash = hash;
        this.version = version;
        this.payType = payType;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }
}