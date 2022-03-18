package com.bytedance.ee.bear.doc.translate;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;

public class ChooseLanguageData implements NonProguard {
    public String[] display_languages;
    public String[] languages;
    public String title;

    public String toString() {
        return "ChooseLanguageData{title='" + this.title + '\'' + ", languages=" + Arrays.toString(this.languages) + ", displayLanguages=" + Arrays.toString(this.display_languages) + '}';
    }

    static boolean validate(ChooseLanguageData chooseLanguageData) {
        String[] strArr;
        String[] strArr2;
        if (chooseLanguageData == null || (strArr = chooseLanguageData.languages) == null || (strArr2 = chooseLanguageData.display_languages) == null || strArr.length <= 0 || strArr.length != strArr2.length) {
            return false;
        }
        return true;
    }
}
