package com.ss.android.lark.chat.entity.translate;

import android.text.TextUtils;
import com.bytedance.lark.pb.im.v1.SrcLanguageConfig;
import com.ss.android.lark.utils.aj;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

public class LanguageInfo implements Serializable {
    private String curLanguageDisplayName;
    private String displayName;
    private String key;

    private LanguageInfo() {
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getKey() {
        return this.key;
    }

    public String getCurLanguageDisplayName() {
        if (TextUtils.isEmpty(this.curLanguageDisplayName)) {
            return this.displayName;
        }
        return this.curLanguageDisplayName;
    }

    public void setCurLanguageDisplayName(Map<String, SrcLanguageConfig> map) {
        SrcLanguageConfig srcLanguageConfig = map.get(this.key);
        if (srcLanguageConfig != null) {
            Locale locale = aj.m224263a().getApplicationContext().getResources().getConfiguration().locale;
            this.curLanguageDisplayName = srcLanguageConfig.i18n_language.get((locale.getLanguage() + "_" + locale.getCountry()).toLowerCase());
        }
    }

    public LanguageInfo(String str, String str2) {
        this.key = str;
        this.displayName = str2;
    }
}
