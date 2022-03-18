package com.ss.android.lark.notification.offline;

import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.export.AbstractNotification;

/* renamed from: com.ss.android.lark.notification.offline.c */
public class C48546c implements AbstractNotification.AbstractC48496c<OfflineNotice> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.notification.export.entity.Notice] */
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48496c
    /* renamed from: a */
    public /* synthetic */ void mo31117a(OfflineNotice offlineNotice) {
        AbstractNotification.AbstractC48496c.CC.$default$a(this, offlineNotice);
    }

    /* renamed from: a */
    public void mo31118b(OfflineNotice offlineNotice) {
        if (offlineNotice != null && offlineNotice.isNoticeByTTPush()) {
            C48398a.m190922a().mo169337a(C48398a.m190922a().mo169335a(), offlineNotice);
        }
    }
}
