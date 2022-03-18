package com.ss.android.lark.openapi.jsapi.entity.response.geolocation;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class LocationInfoBean implements BaseJSModel {
    double accuracy;
    String address;
    String city;
    String district;
    int errorCode;
    String errorMessage;
    boolean isFromMock;
    boolean isGpsEnabled;
    boolean isMobileEnabled;
    boolean isWifiEnabled;
    double latitude;
    double longitude;
    String netType;
    String operatorType;
    String province;
    String road;
    long time;

    public double getAccuracy() {
        return this.accuracy;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getNetType() {
        return this.netType;
    }

    public String getOperatorType() {
        return this.operatorType;
    }

    public String getProvince() {
        return this.province;
    }

    public String getRoad() {
        return this.road;
    }

    public long getTime() {
        return this.time;
    }

    public boolean isFromMock() {
        return this.isFromMock;
    }

    public boolean isGpsEnabled() {
        return this.isGpsEnabled;
    }

    public boolean isMobileEnabled() {
        return this.isMobileEnabled;
    }

    public boolean isWifiEnabled() {
        return this.isWifiEnabled;
    }

    public void setAccuracy(double d) {
        this.accuracy = d;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setFromMock(boolean z) {
        this.isFromMock = z;
    }

    public void setGpsEnabled(boolean z) {
        this.isGpsEnabled = z;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setMobileEnabled(boolean z) {
        this.isMobileEnabled = z;
    }

    public void setNetType(String str) {
        this.netType = str;
    }

    public void setOperatorType(String str) {
        this.operatorType = str;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setRoad(String str) {
        this.road = str;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setWifiEnabled(boolean z) {
        this.isWifiEnabled = z;
    }
}
