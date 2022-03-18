package com.ss.android.lark.biz.core.api;

import android.app.Application;
import android.content.Context;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J,\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/biz/core/api/ILocaleWatcher;", "", "watchEvent", "", "localeScene", "", "context", "Landroid/content/Context;", "watchLocaleChangeBefore", "application", "Landroid/app/Application;", "newLocale", "Ljava/util/Locale;", "watchLocaleEventAfter", "oldLocale", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.core.api.v */
public interface ILocaleWatcher {
    /* renamed from: a */
    void mo105893a(String str, Application application, Locale locale);

    /* renamed from: a */
    void mo105894a(String str, Application application, Locale locale, Locale locale2);

    /* renamed from: a */
    void mo105895a(String str, Context context);
}
