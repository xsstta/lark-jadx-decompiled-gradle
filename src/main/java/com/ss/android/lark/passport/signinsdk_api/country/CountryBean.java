package com.ss.android.lark.passport.signinsdk_api.country;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Objects;

public class CountryBean implements Serializable {
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

    public CountryBean() {
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
        return Objects.equals(this.key, ((CountryBean) obj).key);
    }

    public CountryBean(CountryBean countryBean) {
        this.key = countryBean.key;
        this.name = countryBean.name;
        this.code = countryBean.code;
        this.fullPinyin = countryBean.fullPinyin;
        this.headPinyin = countryBean.headPinyin;
        this.headIndex = countryBean.headIndex;
        this.romaWord = countryBean.romaWord;
        this.pattern = countryBean.pattern;
    }
}
