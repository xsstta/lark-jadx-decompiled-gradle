package com.ss.android.lark.notification.setting.impl.p2391a;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.notification.p2379c.C48432a;
import com.ss.android.lark.notification.p2379c.C48433b;
import com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.notification.setting.impl.a.c */
public class C48577c extends BaseModel implements AbstractC48571a.AbstractC48572a {
    @Override // com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a.AbstractC48572a
    /* renamed from: a */
    public C48432a mo169652a() {
        return C48433b.m191074a();
    }

    @Override // com.ss.android.lark.notification.setting.impl.p2391a.AbstractC48571a.AbstractC48572a
    /* renamed from: a */
    public boolean mo169653a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return C57823a.m224448a(context).mo196178b(context);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return false;
        }
        return notificationManager.areNotificationsEnabled();
    }
}
