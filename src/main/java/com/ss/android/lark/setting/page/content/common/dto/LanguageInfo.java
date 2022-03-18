package com.ss.android.lark.setting.page.content.common.dto;

import com.larksuite.suite.R;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import java.io.Serializable;

public class LanguageInfo implements Serializable {
    private C54377c autoTranslateScope;
    private boolean disAutoTranslate;
    private String displayName;
    private int displayRule;
    private String i18nName;
    private boolean isTargetLanguage;
    private String key;
    private String translationDoc;

    public static int getDisplayRuleResId(int i) {
        return i != 2 ? i != 3 ? R.string.Lark_Legacy_UnknownDrawer : R.string.Lark_Chat_TranslationAndOriginalMessage : R.string.Lark_Chat_TranslationOnly;
    }

    public C54377c getAutoTranslateScope() {
        return this.autoTranslateScope;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public int getDisplayRule() {
        return this.displayRule;
    }

    public String getI18nName() {
        return this.i18nName;
    }

    public String getKey() {
        return this.key;
    }

    public String getTranslationDoc() {
        return this.translationDoc;
    }

    public boolean isDisAutoTranslate() {
        return this.disAutoTranslate;
    }

    public boolean isTargetLanguage() {
        return this.isTargetLanguage;
    }

    public int getDisplayRuleResId() {
        return getDisplayRuleResId(this.displayRule);
    }

    public void setAutoTranslateScope(C54377c cVar) {
        this.autoTranslateScope = cVar;
    }

    public void setDisAutoTranslate(boolean z) {
        this.disAutoTranslate = z;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setDisplayRule(int i) {
        this.displayRule = i;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setTargetLanguage(boolean z) {
        this.isTargetLanguage = z;
    }

    public void setTranslationDoc(String str) {
        this.translationDoc = str;
    }

    public LanguageInfo(String str, String str2) {
        this.key = str;
        this.displayName = str2;
    }

    public LanguageInfo(String str, String str2, boolean z, boolean z2, int i) {
        this.key = str;
        this.displayName = str2;
        this.isTargetLanguage = z;
        this.disAutoTranslate = z2;
        this.displayRule = i;
    }

    public LanguageInfo(String str, String str2, boolean z, boolean z2, int i, C54377c cVar, String str3, String str4) {
        this.key = str;
        this.displayName = str2;
        this.isTargetLanguage = z;
        this.disAutoTranslate = z2;
        this.displayRule = i;
        this.autoTranslateScope = cVar;
        this.i18nName = str3;
        this.translationDoc = str4;
    }
}
