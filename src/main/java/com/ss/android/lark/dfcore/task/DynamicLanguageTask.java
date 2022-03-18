package com.ss.android.lark.dfcore.task;

import java.util.Locale;

public class DynamicLanguageTask extends DynamicFeatureTask {
    public DynamicLanguageTask(Locale locale) {
        super("df_language_" + locale.getLanguage());
        mo135048a(locale);
    }
}
