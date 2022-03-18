package com.ss.android.lark.notification.reaction;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.reaction.entity.C48564a;
import com.ss.android.lark.notification.reaction.entity.ReactionNotice;

/* renamed from: com.ss.android.lark.notification.reaction.a */
public class C48558a extends AbstractNotification<ReactionNotice, C48564a> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: a */
    public int mo31112a() {
        return 4;
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: b */
    public AbstractNotification.AbstractC48495b<ReactionNotice> mo31113b() {
        return new C48561d();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: c */
    public AbstractNotification.AbstractNotificationDisplayer<C48564a> mo31114c() {
        return new C48562e();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: d */
    public AbstractNotification.AbstractC48496c<ReactionNotice> mo31115d() {
        return new C48565f();
    }

    @Override // com.ss.android.lark.notification.export.AbstractNotification
    /* renamed from: e */
    public AbstractNotification.AbstractC48494a mo135459e() {
        return new C48559b();
    }
}
