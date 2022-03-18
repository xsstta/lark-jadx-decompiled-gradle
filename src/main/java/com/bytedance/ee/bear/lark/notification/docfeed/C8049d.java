package com.bytedance.ee.bear.lark.notification.docfeed;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.lark.notification.docfeed.entity.C8052a;
import com.bytedance.ee.bear.lark.notification.docfeed.entity.DocFeedNotice;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.lark.p414b.AbstractC8000k;
import com.bytedance.ee.bear.lark.p414b.AbstractC8007p;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.doc.entity.DocMessage;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import java.util.HashMap;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.lark.notification.docfeed.d */
public class C8049d extends AbstractC48500b<DocFeedNotice, C8052a> {

    /* renamed from: a */
    private DocFeed f21568a;

    /* renamed from: b */
    private Map<String, DocMessage> f21569b = new HashMap();

    /* renamed from: c */
    private Notice f21570c;

    /* renamed from: d */
    private C8047c f21571d;

    /* renamed from: e */
    private Context f21572e = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30986a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: h */
    public int mo31131h() {
        return R.drawable.ic_notify;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: l */
    public int mo31135l() {
        return R.mipmap.app_launcher;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: m */
    public int mo31136m() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: d */
    public String mo31127d() {
        return this.f21568a.getId();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: k */
    public String mo31134k() {
        return mo31130g();
    }

    /* renamed from: b */
    public C8052a mo31125b() {
        return (C8052a) mo169587a(new C8052a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return (((int) Long.parseLong(this.f21568a.getId())) % 10004) * 10004;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return ((AbstractC8007p) KoinJavaComponent.m268610a(AbstractC8007p.class)).mo31019a(1);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: n */
    public String mo31137n() {
        if (!C26326z.m95343g()) {
            return null;
        }
        return "normal_v2";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        String str = this.f21570c.title;
        if (TextUtils.isEmpty(str)) {
            return this.f21571d.mo31121b();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        String str = this.f21570c.content;
        if (TextUtils.isEmpty(str)) {
            return this.f21571d.mo31119a();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        this.f21568a = ((DocFeedNotice) mo169588o()).getDocFeed();
        this.f21569b = ((DocFeedNotice) mo169588o()).getDocMessageMap();
        this.f21570c = (Notice) mo169588o();
        this.f21571d = new C8047c(this.f21568a, this.f21569b);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        return PendingIntent.getActivity(this.f21572e, 0, ((AbstractC8000k) KoinJavaComponent.m268610a(AbstractC8000k.class)).mo30999a(this.f21572e, this.f21571d.mo31122c(), this.f21571d.mo31123d(), this.f21570c.messageId, 67108864, true, true), 134217728);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!((AbstractC8007p) KoinJavaComponent.m268610a(AbstractC8007p.class)).mo31020b(1)) {
            return null;
        }
        return Uri.parse("android.resource://" + this.f21572e.getPackageName() + "/" + R.raw.notification);
    }

    public C8049d(DocFeedNotice docFeedNotice) {
        super(docFeedNotice);
    }
}
