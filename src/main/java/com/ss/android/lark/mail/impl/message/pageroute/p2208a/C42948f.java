package com.ss.android.lark.mail.impl.message.pageroute.p2208a;

import android.content.Context;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42925b;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.message.view.NotifyMessageListView;

/* renamed from: com.ss.android.lark.mail.impl.message.pageroute.a.f */
public class C42948f extends AbstractC42925b {
    @Override // com.ss.android.lark.mail.impl.message.framework.AbstractC42925b
    /* renamed from: a */
    public C42844a mo154011a() {
        return new C42844a();
    }

    @Override // com.ss.android.lark.mail.impl.message.framework.AbstractC42925b
    /* renamed from: a */
    public AbsMessageTemplateView mo154012a(Context context) {
        return new NotifyMessageListView(context);
    }
}
