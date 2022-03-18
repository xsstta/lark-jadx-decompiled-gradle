package com.ss.android.lark.notification.offline;

import com.ss.android.lark.notification.dto.C48443b;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.export.AbstractNotification;

/* renamed from: com.ss.android.lark.notification.offline.d */
public class C48547d extends AbstractNotification<OfflineNotice, C48443b> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 20001;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C48443b> mo31114c() {
        return new C48549f();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<OfflineNotice> mo31115d() {
        return new C48546c();
    }
}
