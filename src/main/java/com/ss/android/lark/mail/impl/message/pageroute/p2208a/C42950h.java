package com.ss.android.lark.mail.impl.message.pageroute.p2208a;

import android.content.Context;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42925b;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.p2203c.C42848d;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.message.view.SearchResultMessageListView;

/* renamed from: com.ss.android.lark.mail.impl.message.pageroute.a.h */
public class C42950h extends AbstractC42925b {
    @Override // com.ss.android.lark.mail.impl.message.framework.AbstractC42925b
    /* renamed from: a */
    public C42844a mo154011a() {
        return new C42848d();
    }

    @Override // com.ss.android.lark.mail.impl.message.framework.AbstractC42925b
    /* renamed from: a */
    public AbsMessageTemplateView mo154012a(Context context) {
        return new SearchResultMessageListView(context);
    }
}
