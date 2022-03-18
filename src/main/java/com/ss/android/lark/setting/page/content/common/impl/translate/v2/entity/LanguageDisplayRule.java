package com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity;

import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;

public enum LanguageDisplayRule {
    UNKNOWN_RULE(0),
    NO_TRANSLATION(1),
    ONLY_TRANSLATION(2),
    WITH_ORIGINAL(3);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    public String toString() {
        int i = this.value;
        int i2 = WITH_ORIGINAL.value;
        if (i == i2) {
            return UIHelper.getString(R.string.Lark_NewSettings_TranslationDisplayTranslationAndOriginal);
        }
        if (i == i2) {
            return UIHelper.getString(R.string.Lark_NewSettings_TranslationDisplayTranslationOnly);
        }
        Log.m165383e("LanguageDisplayRule", "unknown display  " + this.value);
        return UIHelper.getString(R.string.Lark_NewSettings_TranslationDisplayTranslationOnly);
    }

    public static LanguageDisplayRule fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_RULE;
        }
        if (i == 1) {
            return NO_TRANSLATION;
        }
        if (i == 2) {
            return ONLY_TRANSLATION;
        }
        if (i != 3) {
            return null;
        }
        return WITH_ORIGINAL;
    }

    private LanguageDisplayRule(int i) {
        this.value = i;
    }
}
