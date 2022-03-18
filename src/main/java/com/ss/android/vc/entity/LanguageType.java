package com.ss.android.vc.entity;

import android.text.TextUtils;
import java.io.Serializable;

public class LanguageType implements Serializable {
    public String despI18nKey;
    public String iconStr;
    public String languageType;

    public static boolean equalType(LanguageType languageType2, LanguageType languageType3) {
        if (languageType2 == null || languageType3 == null || !TextUtils.equals(languageType2.languageType, languageType3.languageType)) {
            return false;
        }
        return true;
    }
}
