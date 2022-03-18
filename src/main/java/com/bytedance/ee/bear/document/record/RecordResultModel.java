package com.bytedance.ee.bear.document.record;

import com.bytedance.ee.util.io.NonProguard;

public class RecordResultModel implements NonProguard {
    private int code;
    private RecordModel data;

    public static int getFAIL() {
        return 1;
    }

    public static int getSUCCESS() {
        return 0;
    }

    public int getCode() {
        return this.code;
    }

    public RecordModel getData() {
        return this.data;
    }

    public String toString() {
        return "RecordResultModel{code=" + this.code + ", data=" + this.data + '}';
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(RecordModel recordModel) {
        this.data = recordModel;
    }

    public RecordResultModel(int i, RecordModel recordModel) {
        this.code = i;
        this.data = recordModel;
    }

    public RecordResultModel(boolean z, RecordModel recordModel) {
        this.code = !z ? 1 : 0;
        this.data = recordModel;
    }
}
