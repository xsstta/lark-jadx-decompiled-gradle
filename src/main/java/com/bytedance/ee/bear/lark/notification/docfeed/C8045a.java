package com.bytedance.ee.bear.lark.notification.docfeed;

import com.bytedance.ee.bear.lark.notification.docfeed.entity.C8052a;
import com.bytedance.ee.bear.lark.notification.docfeed.entity.DocFeedNotice;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.notification.export.AbstractNotification;

/* renamed from: com.bytedance.ee.bear.lark.notification.docfeed.a */
public class C8045a extends AbstractNotification<DocFeedNotice, C8052a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<DocFeedNotice> mo31113b() {
        return new C8050e();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C8052a> mo31114c() {
        return new C8053f();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<DocFeedNotice> mo31115d() {
        return new C8046b();
    }
}
