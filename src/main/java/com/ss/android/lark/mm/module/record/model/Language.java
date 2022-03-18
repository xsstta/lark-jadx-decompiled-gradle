package com.ss.android.lark.mm.module.record.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.mm.base.IMmSerializable;

public class Language implements IMmSerializable {
    @JSONField(name = "language")
    private String language;
    @JSONField(name = "language_name")
    private String languageName;

    public Language() {
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLanguageName() {
        return this.languageName;
    }

    public String toString() {
        return "Language{languageName='" + this.languageName + '\'' + ", language='" + this.language + '\'' + '}';
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLanguageName(String str) {
        this.languageName = str;
    }

    public Language(String str, String str2) {
        this.languageName = str;
        this.language = str2;
    }
}
