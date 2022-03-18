package com.bytedance.ee.bear.lark.notification.docfeed;

import com.bytedance.ee.bear.lark.notification.docfeed.entity.DocFeedNotice;
import com.bytedance.ee.bear.lark.p414b.AbstractC8007p;
import com.ss.android.lark.notification.export.AbstractNotification;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.lark.notification.docfeed.b */
public class C8046b implements AbstractNotification.AbstractC48496c<DocFeedNotice> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.notification.export.entity.Notice] */
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48496c
    /* renamed from: b */
    public /* synthetic */ void mo31118b(DocFeedNotice docFeedNotice) {
        AbstractNotification.AbstractC48496c.CC.$default$b(this, docFeedNotice);
    }

    /* renamed from: a */
    public void mo31117a(DocFeedNotice docFeedNotice) {
        String str;
        String str2 = docFeedNotice.messageId;
        if (docFeedNotice.extra != null) {
            str = docFeedNotice.extra.f122004c;
        } else {
            str = "";
        }
        ((AbstractC8007p) KoinJavaComponent.m268610a(AbstractC8007p.class)).mo31018a(str, str2, null, "doc");
    }
}
