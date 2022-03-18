package com.ss.android.lark.mm.module.record.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.mm.base.IMmSerializable;
import com.ss.android.lark.mm.net.HttpMmResponse;

public class MmRecordingLanguage implements IMmSerializable {
    @JSONField(name = "language_name")
    private String languageName;
    @JSONField(name = "recording_lang")
    private String recordingLang;

    public static class MmRecordingLanguageRes extends HttpMmResponse<MmRecordingLanguage> {
    }

    public String getLanguageName() {
        return this.languageName;
    }

    public String getRecordingLang() {
        return this.recordingLang;
    }

    public String toString() {
        return "MmRecordingLanguage{languageName='" + this.languageName + '\'' + ", recordingLang='" + this.recordingLang + '\'' + '}';
    }

    public void setLanguageName(String str) {
        this.languageName = str;
    }

    public void setRecordingLang(String str) {
        this.recordingLang = str;
    }
}
