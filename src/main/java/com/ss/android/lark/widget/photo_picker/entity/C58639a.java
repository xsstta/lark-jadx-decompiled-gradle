package com.ss.android.lark.widget.photo_picker.entity;

import android.text.TextUtils;
import com.bytedance.lark.pb.im.v1.SrcLanguageConfig;
import com.ss.android.lark.utils.aj;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.photo_picker.entity.a */
public class C58639a {

    /* renamed from: a */
    private String f144792a;

    /* renamed from: b */
    private String f144793b;

    /* renamed from: c */
    private String f144794c;

    private C58639a() {
    }

    /* renamed from: a */
    public String mo198832a() {
        return this.f144792a;
    }

    /* renamed from: b */
    public String mo198834b() {
        if (TextUtils.isEmpty(this.f144794c)) {
            return this.f144793b;
        }
        return this.f144794c;
    }

    /* renamed from: a */
    public void mo198833a(Map<String, SrcLanguageConfig> map) {
        SrcLanguageConfig srcLanguageConfig = map.get(this.f144792a);
        if (srcLanguageConfig != null) {
            Locale locale = aj.m224263a().getApplicationContext().getResources().getConfiguration().locale;
            this.f144794c = srcLanguageConfig.i18n_language.get((locale.getLanguage() + "_" + locale.getCountry()).toLowerCase());
        }
    }

    public C58639a(String str, String str2) {
        this.f144792a = str;
        this.f144793b = str2;
    }
}
