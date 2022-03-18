package com.ss.android.vc.meeting.module.meetingdialog.pstn.country;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Objects;

public class CountryInfo implements Serializable {
    private String code;
    @JSONField(name = "full_pinyin")
    private String fullPinyin;
    @JSONField(name = "head_index")
    private String headIndex;
    @JSONField(name = "head_pinyin")
    private String headPinyin;
    private String key;
    private String name;
    private String pattern;
    @JSONField(name = "roma_word")
    private String romaWord;

    public CountryInfo() {
    }

    public String getCode() {
        return this.code;
    }

    public String getFullPinyin() {
        return this.fullPinyin;
    }

    public String getHeadIndex() {
        return this.headIndex;
    }

    public String getHeadPinyin() {
        return this.headPinyin;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String getRomaWord() {
        return this.romaWord;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setFullPinyin(String str) {
        this.fullPinyin = str;
    }

    public void setHeadIndex(String str) {
        this.headIndex = str;
    }

    public void setHeadPinyin(String str) {
        this.headPinyin = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }

    public void setRomaWord(String str) {
        this.romaWord = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.key, ((CountryInfo) obj).key);
    }

    public CountryInfo(CountryInfo countryInfo) {
        this.key = countryInfo.key;
        this.name = countryInfo.name;
        this.code = countryInfo.code;
        this.fullPinyin = countryInfo.fullPinyin;
        this.headPinyin = countryInfo.headPinyin;
        this.headIndex = countryInfo.headIndex;
        this.romaWord = countryInfo.romaWord;
        this.pattern = countryInfo.pattern;
    }
}
