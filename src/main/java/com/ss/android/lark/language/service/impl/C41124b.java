package com.ss.android.lark.language.service.impl;

import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import java.util.Locale;

/* renamed from: com.ss.android.lark.language.service.impl.b */
public class C41124b implements AbstractC29551a {

    /* renamed from: a */
    private Locale f104902a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.language.service.impl.b$a */
    public static final class C41126a {

        /* renamed from: a */
        public static final C41124b f104903a = new C41124b();
    }

    private C41124b() {
    }

    /* renamed from: s */
    public static C41124b m163182s() {
        return C41126a.f104903a;
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: a */
    public Locale mo105659a() {
        if (this.f104902a == null) {
            this.f104902a = C41121a.m163149m().mo148297b();
        }
        return this.f104902a;
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: e */
    public boolean mo105664e() {
        return "en".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: f */
    public boolean mo105665f() {
        return "ja".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: g */
    public boolean mo105666g() {
        return "es".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: h */
    public boolean mo105667h() {
        return "it".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: i */
    public boolean mo105668i() {
        return "de".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: j */
    public boolean mo105669j() {
        return "fr".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: k */
    public boolean mo105670k() {
        return "pt".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: l */
    public boolean mo105671l() {
        return "id".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: m */
    public boolean mo105672m() {
        return "in".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: n */
    public boolean mo105673n() {
        return "vi".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: o */
    public boolean mo105674o() {
        return "th".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: p */
    public boolean mo105675p() {
        return "ko".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: q */
    public boolean mo105676q() {
        return "ru".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: r */
    public boolean mo105677r() {
        return "hi".equals(mo105659a().getLanguage().toLowerCase());
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: b */
    public boolean mo105661b() {
        Locale a = mo105659a();
        if (!"zh".equals(a.getLanguage().toLowerCase()) || !"CN".equals(a.getCountry().toUpperCase())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: c */
    public boolean mo105662c() {
        Locale a = mo105659a();
        if (!"zh".equals(a.getLanguage().toLowerCase()) || !"HK".equals(a.getCountry().toUpperCase())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: d */
    public boolean mo105663d() {
        Locale a = mo105659a();
        if (!"zh".equals(a.getLanguage().toLowerCase()) || !"TW".equals(a.getCountry().toUpperCase())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a
    /* renamed from: a */
    public void mo105660a(Locale locale) {
        this.f104902a = locale;
    }
}
