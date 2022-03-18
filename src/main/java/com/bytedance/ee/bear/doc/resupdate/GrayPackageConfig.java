package com.bytedance.ee.bear.doc.resupdate;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;

@AppConfig(key = "grayscale_package_config")
class GrayPackageConfig implements NonProguard {
    private String branch;
    private String url;
    private String version;

    public GrayPackageConfig() {
    }

    public String getBranch() {
        return this.branch;
    }

    public String getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "GrayPackageConfig{version='" + this.version + '\'' + '}';
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public GrayPackageConfig(String str, String str2, String str3) {
        this.version = str;
        this.branch = str2;
        this.url = str3;
    }
}
