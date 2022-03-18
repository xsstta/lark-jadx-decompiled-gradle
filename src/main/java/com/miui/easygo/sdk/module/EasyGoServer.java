package com.miui.easygo.sdk.module;

public final class EasyGoServer {
    private String dataSchema;
    private String isSystemService;
    private String name;
    private String provideFunction;
    private String serviceName;
    private String serviceVersion;

    public String getDataSchema() {
        return this.dataSchema;
    }

    public String getIsSysService() {
        return this.isSystemService;
    }

    public String getName() {
        return this.name;
    }

    public String getProvideFunction() {
        return this.provideFunction;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public void setDataSchema(String str) {
        this.dataSchema = str;
    }

    public void setIsSysService(String str) {
        this.isSystemService = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProvideFunction(String str) {
        this.provideFunction = str;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public void setServiceVersion(String str) {
        this.serviceVersion = str;
    }
}
