package com.ss.android.lark.eetroublebase.metrics;

import com.ss.android.lark.eetroublebase.model.BaseModel;

public class MetricsInfo extends BaseModel {
    int api;
    String brand;
    int cpuCoreNumber;
    int energy;
    String error;
    long freeMemory;
    String model;
    String networkType;
    long totalMemory;
    int versionCode;
    String versionName;

    public int getApi() {
        return this.api;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getCpuCoreNumber() {
        return this.cpuCoreNumber;
    }

    public int getEnergy() {
        return this.energy;
    }

    public String getError() {
        return this.error;
    }

    public long getFreeMemory() {
        return this.freeMemory;
    }

    public String getModel() {
        return this.model;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public long getTotalMemory() {
        return this.totalMemory;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setApi(int i) {
        this.api = i;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setCpuCoreNumber(int i) {
        this.cpuCoreNumber = i;
    }

    public void setEnergy(int i) {
        this.energy = i;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setFreeMemory(long j) {
        this.freeMemory = j;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setNetworkType(String str) {
        this.networkType = str;
    }

    public void setTotalMemory(long j) {
        this.totalMemory = j;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }
}
