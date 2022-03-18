package com.ss.android.lark.appstrategy.p1374a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.webapp.v2.AbstractC13836d;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appstrategy.dto.SimpleLocation;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: com.ss.android.lark.appstrategy.a.a */
public interface AbstractC29232a {

    /* renamed from: com.ss.android.lark.appstrategy.a.a$a */
    public interface AbstractC29233a {
        /* renamed from: a */
        String mo103665a();

        /* renamed from: b */
        String mo103666b();
    }

    Activity getCheckedBrowserActivity();

    Context getContext();

    String getDeviceId();

    String getDomain(DomainSettings.Alias alias);

    Locale getLocale();

    void getLocation(IGetDataCallback<SimpleLocation> iGetDataCallback);

    AbstractC29233a getLoginDependency();

    long getNtpTime();

    WeakReference<AbstractC13836d> getWebAppFragment(String str);

    boolean isAppRealForeground();

    void openApplyVisibleActivity(Context context, String str, String str2);

    void openUrl(Context context, String str);

    void startChatActivityByChatterId(Context context, String str);
}
