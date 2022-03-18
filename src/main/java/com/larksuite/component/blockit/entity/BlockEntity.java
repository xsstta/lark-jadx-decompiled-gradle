package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.Map;

public class BlockEntity implements Serializable {
    private String appID;
    private String blockID;
    private String blockTypeID;
    private Map<String, String> i18nPreview;
    private Map<String, String> i18nSummary;
    private String preview;
    private String sourceData;
    private String sourceLink;
    private String sourceMeta;
    private String summary;

    private BlockEntity() {
    }

    public String getAppID() {
        return this.appID;
    }

    public String getBlockID() {
        return this.blockID;
    }

    public String getBlockTypeID() {
        return this.blockTypeID;
    }

    public Map<String, String> getI18nPreview() {
        return this.i18nPreview;
    }

    public Map<String, String> getI18nSummary() {
        return this.i18nSummary;
    }

    public String getPreview() {
        return this.preview;
    }

    public String getSourceData() {
        return this.sourceData;
    }

    public String getSourceLink() {
        return this.sourceLink;
    }

    public String getSourceMeta() {
        return this.sourceMeta;
    }

    public String getSummary() {
        return this.summary;
    }

    public String toString() {
        return "BlockEntity{blockID='" + this.blockID + '\'' + ", blockTypeID='" + this.blockTypeID + '\'' + ", sourceLink='" + this.sourceLink + '\'' + ", sourceData='" + this.sourceData + '\'' + ", sourceMeta='" + this.sourceMeta + '\'' + ", preview='" + this.preview + '\'' + ", summary='" + this.summary + '\'' + ", i18nPreview=" + this.i18nPreview + ", i18nSummary=" + this.i18nSummary + ", appID=" + this.appID + '}';
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setBlockID(String str) {
        this.blockID = str;
    }

    public void setBlockTypeID(String str) {
        this.blockTypeID = str;
    }

    public void setI18nPreview(Map<String, String> map) {
        this.i18nPreview = map;
    }

    public void setI18nSummary(Map<String, String> map) {
        this.i18nSummary = map;
    }

    public void setPreview(String str) {
        this.preview = str;
    }

    public void setSourceData(String str) {
        this.sourceData = str;
    }

    public void setSourceLink(String str) {
        this.sourceLink = str;
    }

    public void setSourceMeta(String str) {
        this.sourceMeta = str;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public BlockEntity(String str) {
        this.blockID = str;
    }
}
