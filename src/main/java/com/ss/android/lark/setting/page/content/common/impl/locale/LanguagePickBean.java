package com.ss.android.lark.setting.page.content.common.impl.locale;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

public class LanguagePickBean {

    /* renamed from: a */
    private String f134144a;

    /* renamed from: b */
    private int f134145b;

    /* renamed from: c */
    private Locale f134146c;

    /* renamed from: d */
    private boolean f134147d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LANGUAGE_SELECT_STATUS {
    }

    /* renamed from: a */
    public Locale mo185463a() {
        return this.f134146c;
    }

    /* renamed from: b */
    public String mo185468b() {
        return this.f134144a;
    }

    /* renamed from: c */
    public int mo185469c() {
        return this.f134145b;
    }

    /* renamed from: d */
    public boolean mo185470d() {
        return this.f134147d;
    }

    /* renamed from: a */
    public void mo185464a(int i) {
        this.f134145b = i;
    }

    /* renamed from: a */
    public void mo185465a(String str) {
        this.f134144a = str;
    }

    /* renamed from: a */
    public void mo185466a(Locale locale) {
        this.f134146c = locale;
    }

    /* renamed from: a */
    public void mo185467a(boolean z) {
        this.f134147d = z;
    }
}
