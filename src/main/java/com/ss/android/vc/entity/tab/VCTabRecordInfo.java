package com.ss.android.vc.entity.tab;

import java.io.Serializable;
import java.util.List;

public class VCTabRecordInfo implements Serializable {
    RecordType recordType;
    private List<String> urlList;

    public enum RecordType {
        UNKNOWN,
        LARK_MINUTES,
        RECORD
    }

    public VCTabRecordInfo() {
    }

    public RecordType getRecordType() {
        return this.recordType;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public String toString() {
        return "VCTabRecordInfo{recordType=" + this.recordType + ", urlList='" + this.urlList + '\'' + '}';
    }

    public void setRecordType(RecordType recordType2) {
        this.recordType = recordType2;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public VCTabRecordInfo(RecordType recordType2, List<String> list) {
        this.recordType = recordType2;
        this.urlList = list;
    }
}
