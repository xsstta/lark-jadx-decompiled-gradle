package com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.e */
public class C54379e {

    /* renamed from: a */
    private final String f134524a;

    /* renamed from: b */
    private LanguageDisplayRule f134525b;

    /* renamed from: c */
    private final LanguageDisplayRule f134526c;

    /* renamed from: a */
    public String mo185989a() {
        return this.f134524a;
    }

    /* renamed from: b */
    public LanguageDisplayRule mo185991b() {
        return this.f134525b;
    }

    /* renamed from: c */
    public LanguageDisplayRule mo185992c() {
        return this.f134526c;
    }

    /* renamed from: d */
    public C54379e clone() {
        return new C54379e(this.f134524a, this.f134525b, this.f134526c);
    }

    /* renamed from: a */
    public void mo185990a(LanguageDisplayRule languageDisplayRule) {
        this.f134525b = languageDisplayRule;
    }

    public C54379e(String str, LanguageDisplayRule languageDisplayRule, LanguageDisplayRule languageDisplayRule2) {
        this.f134524a = str;
        this.f134525b = languageDisplayRule;
        this.f134526c = languageDisplayRule2;
    }
}
