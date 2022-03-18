package com.ss.android.lark.language.service.impl;

import android.app.Application;
import android.content.Context;
import com.ss.android.lark.biz.core.api.ILocaleWatcher;
import com.ss.android.lark.language.service.watch.LocaleWatchDog;
import com.ss.android.lark.language.service.watch.LocaleWatchDogLogger;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J,\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/language/service/impl/LocaleWatcher;", "Lcom/ss/android/lark/biz/core/api/ILocaleWatcher;", "()V", "watchEvent", "", "localeScene", "", "context", "Landroid/content/Context;", "watchLocaleChangeBefore", "application", "Landroid/app/Application;", "newLocale", "Ljava/util/Locale;", "watchLocaleEventAfter", "oldLocale", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.language.service.impl.c */
public final class LocaleWatcher implements ILocaleWatcher {
    @Override // com.ss.android.lark.biz.core.api.ILocaleWatcher
    /* renamed from: a */
    public void mo105895a(String str, Context context) {
        Intrinsics.checkParameterIsNotNull(str, "localeScene");
        LocaleWatchDog.f104871a.mo148311a(str, context, null, null);
    }

    @Override // com.ss.android.lark.biz.core.api.ILocaleWatcher
    /* renamed from: a */
    public void mo105893a(String str, Application application, Locale locale) {
        Intrinsics.checkParameterIsNotNull(str, "localeScene");
        Intrinsics.checkParameterIsNotNull(application, "application");
        Application application2 = application;
        LocaleWatchDog.f104871a.mo148311a(str, application2, locale, LocaleWatchDogLogger.f104874a.mo148323a(application2));
    }

    @Override // com.ss.android.lark.biz.core.api.ILocaleWatcher
    /* renamed from: a */
    public void mo105894a(String str, Application application, Locale locale, Locale locale2) {
        Intrinsics.checkParameterIsNotNull(str, "localeScene");
        Intrinsics.checkParameterIsNotNull(application, "application");
        LocaleWatchDog.f104871a.mo148311a(str, application, locale, locale2);
    }
}
