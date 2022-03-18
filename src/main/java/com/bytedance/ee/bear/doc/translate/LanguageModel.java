package com.bytedance.ee.bear.doc.translate;

import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LanguageModel implements NonProguard {
    private String displayText;
    private String tag;

    public LanguageModel() {
    }

    public String getDisplayText() {
        return this.displayText;
    }

    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return Objects.hash(this.displayText, this.tag);
    }

    public String toString() {
        return "LanguageItem{displayText='" + this.displayText + '\'' + ", tag='" + this.tag + '\'' + '}';
    }

    public void setDisplayText(String str) {
        this.displayText = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LanguageModel languageModel = (LanguageModel) obj;
        if (!Objects.equals(this.displayText, languageModel.displayText) || !Objects.equals(this.tag, languageModel.tag)) {
            return false;
        }
        return true;
    }

    public LanguageModel(String str, String str2) {
        this.displayText = str;
        this.tag = str2;
    }

    public static LanguageModel buildLanguageModel(String str, String str2) {
        return new LanguageModel(str2, str);
    }

    public static List<LanguageModel> buildLanguageModelList(String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            arrayList.add(new LanguageModel(strArr2[i], strArr[i]));
        }
        return arrayList;
    }
}
