package com.tt.miniapphost.appbase;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import java.util.Locale;

public interface IAppbrandSupport {
    String getTmaJssdkVersion(Context context, IAppContext iAppContext);

    String getTmaJssdkVersion(IAppContext iAppContext);

    boolean isSDKSupport();

    boolean isSDKSupport(Context context);

    void openAppbrand(C67466a aVar);

    boolean openShortcut(Intent intent);

    void preloadEmptyProcess();

    void switchLang(Locale locale);
}
