package com.ss.android.lark.mail.impl.message.pageroute.p2208a;

import android.content.Context;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42925b;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.p2203c.C42845b;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.message.view.BigContentForwardToChatMessageView;

/* renamed from: com.ss.android.lark.mail.impl.message.pageroute.a.a */
public class C42943a extends AbstractC42925b {
    @Override // com.ss.android.lark.mail.impl.message.framework.AbstractC42925b
    /* renamed from: a */
    public C42844a mo154011a() {
        return new C42845b();
    }

    @Override // com.ss.android.lark.mail.impl.message.framework.AbstractC42925b
    /* renamed from: a */
    public AbsMessageTemplateView mo154012a(Context context) {
        return new BigContentForwardToChatMessageView(context);
    }
}
