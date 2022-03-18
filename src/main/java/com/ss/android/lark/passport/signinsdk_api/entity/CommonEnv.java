package com.ss.android.lark.passport.signinsdk_api.entity;

import java.io.Serializable;
import java.util.Locale;

public class CommonEnv implements Serializable {
    private boolean isOverSea;
    private LanguageEnv languageEnv;

    /* renamed from: com.ss.android.lark.passport.signinsdk_api.entity.CommonEnv$a */
    public interface AbstractC49361a {
    }

    public static class LanguageEnv implements Serializable {
        private AbstractC49361a languageChangeListener;
        private Locale locale;

        public AbstractC49361a getLanguageChangeListener() {
            return this.languageChangeListener;
        }

        public Locale getLocale() {
            return this.locale;
        }

        public LanguageEnv(Locale locale2, AbstractC49361a aVar) {
            this.locale = locale2;
            this.languageChangeListener = aVar;
        }
    }

    public LanguageEnv getLanguageEnv() {
        return this.languageEnv;
    }

    public boolean isOverSea() {
        return this.isOverSea;
    }

    public void setOverSea(boolean z) {
        this.isOverSea = z;
    }

    public CommonEnv(LanguageEnv languageEnv2) {
        this.languageEnv = languageEnv2;
    }
}
