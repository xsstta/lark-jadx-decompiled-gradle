package com.ss.android.lark.mail.impl.uiframework.view.webview;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.settings.appconfig.MailMessageListConfig;

/* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.h */
public class C43745h {
    /* renamed from: a */
    public static long m173414a(int i) {
        Log.m165389i("RenderTimeoutManager", "renderChatLen:" + i);
        MailMessageListConfig mailMessageListConfig = (MailMessageListConfig) SettingManager.getInstance().get(MailMessageListConfig.class);
        if (mailMessageListConfig != null && !CollectionUtils.isEmpty(mailMessageListConfig.f110281a)) {
            for (MailMessageListConfig.C43394a aVar : mailMessageListConfig.f110281a) {
                if (i <= aVar.f110282a) {
                    Log.m165389i("RenderTimeoutManager", "config:" + aVar + " renderChatLen:" + i);
                    long j = (long) aVar.f110283b;
                    if (j == 0) {
                        return 8000;
                    }
                    return j;
                }
            }
        }
        return 15000;
    }
}
