package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import com.larksuite.framework.utils.C26246a;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27536c;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import java.util.Locale;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.d */
public class C29148d implements AbstractC27536c {
    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27536c
    /* renamed from: b */
    public String mo98171b() {
        return C26246a.m94977a(AppCenterModule.m107044a().getContext());
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27536c
    /* renamed from: c */
    public boolean mo98172c() {
        return AppCenterModule.m107044a().isGooglePlay();
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27536c
    /* renamed from: d */
    public boolean mo98173d() {
        return AppCenterModule.m107044a().isStagingEnv();
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27536c
    /* renamed from: a */
    public Locale mo98170a() {
        Locale languageSetting = AppCenterModule.m107044a().getLanguageSetting();
        return new Locale(languageSetting.getLanguage(), languageSetting.getCountry());
    }
}
