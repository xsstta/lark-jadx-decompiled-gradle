package com.bytedance.ee.bear.doc.translate;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecentUsedLanguageModel implements NonProguard {
    @JSONField(name = "languages")
    private List<LanguageModel> languages = new ArrayList();

    public List<LanguageModel> getLanguages() {
        return Collections.unmodifiableList(this.languages);
    }

    public String toString() {
        return "RecentUsedLanguageModel{languages=" + this.languages + '}';
    }

    public void setLanguages(List<LanguageModel> list) {
        this.languages = list;
    }

    public void insert(LanguageModel languageModel) {
        this.languages.remove(languageModel);
        this.languages.add(0, languageModel);
        if (this.languages.size() > 3) {
            List<LanguageModel> list = this.languages;
            list.remove(list.size() - 1);
        }
    }
}
