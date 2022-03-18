package com.ss.android.lark.language;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.BaseContextWrapperDelegate;
import com.ss.android.lark.biz.core.api.ILocaleWatcher;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.language.p2095a.AbstractC41116a;
import com.ss.android.lark.language.service.AbstractC41118a;
import com.ss.android.lark.language.service.impl.C41121a;
import com.ss.android.lark.language.service.impl.C41124b;
import com.ss.android.lark.language.service.impl.LocaleWatcher;
import com.ss.android.lark.language.service.statistics.CoolBootGetLanguageHitPoint;

/* renamed from: com.ss.android.lark.language.a */
public class C41115a {

    /* renamed from: a */
    private static volatile AbstractC41116a f104869a;

    /* renamed from: a */
    public static AbstractC41116a m163064a() {
        return f104869a;
    }

    /* renamed from: b */
    public AbstractC29551a mo148281b() {
        return C41124b.m163182s();
    }

    /* renamed from: c */
    public AbstractC41118a mo148282c() {
        return C41121a.m163149m();
    }

    /* renamed from: d */
    public ILocaleWatcher mo148283d() {
        return new LocaleWatcher();
    }

    /* renamed from: e */
    public void mo148284e() {
        CoolBootGetLanguageHitPoint.m163103a(C41121a.m163149m().mo148297b(), C41121a.m163149m().mo148286a());
    }

    public C41115a(AbstractC41116a aVar) {
        f104869a = aVar;
    }

    /* renamed from: a */
    public AppCompatDelegate mo148280a(AppCompatDelegate appCompatDelegate) {
        return new BaseContextWrapperDelegate(appCompatDelegate);
    }
}
