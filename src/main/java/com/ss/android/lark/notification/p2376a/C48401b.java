package com.ss.android.lark.notification.p2376a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.larksuite.framework.utils.C26253ae;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.dependency.AbstractC36454ac;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36504r;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.p2376a.p2377a.C48400a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.notification.a.b */
public class C48401b extends AbstractC48500b<Notice, C48400a> {

    /* renamed from: a */
    public AbstractC36504r f121872a = C29990c.m110930b().mo134512K();

    /* renamed from: b */
    public AbstractC36454ac f121873b = C29990c.m110930b().mo134592t();

    /* renamed from: c */
    private Notice f121874c;

    /* renamed from: d */
    private String f121875d;

    /* renamed from: e */
    private AbstractC36474h.AbstractC36486l f121876e = C29990c.m110930b().ad();

    /* renamed from: f */
    private Context f121877f = C29990c.m110930b().mo134528a();

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
        return this.f121875d;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        return this.f121874c.title;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return this.f121874c.content;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f121876e.mo134632a(1);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: k */
    public String mo31134k() {
        return UIHelper.getString(R.string.Lark_Legacy_NewMessage);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        Notice notice = (Notice) mo169588o();
        this.f121874c = notice;
        this.f121875d = notice.extra.f122004c;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return (C26253ae.m94997a() % 21001) * 21001;
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

    /* renamed from: p */
    private Intent m190941p() {
        return this.f121873b.mo134410a(this.f121877f, m190939a(new ChatBundle.AbstractC29591b() {
            /* class com.ss.android.lark.notification.p2376a.C48401b.C484021 */

            @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
            public void inject(Bundle bundle) {
                bundle.putBoolean(C48401b.this.f121872a.mo134695c(), true);
                C48401b.this.f121873b.mo134415b(bundle);
            }
        }), 335544320);
    }

    /* renamed from: b */
    public C48400a mo169330b() {
        if (this.f121875d != null) {
            return (C48400a) mo169587a(new C48400a());
        }
        Log.m165383e("ChatApplyNotification", "messageId or getChatId is null");
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        Intent p = m190941p();
        return PendingIntent.getActivity(this.f121877f, (int) SystemClock.uptimeMillis(), p, 134217728);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        return Uri.parse("android.resource://" + this.f121877f.getPackageName() + "/" + R.raw.notification);
    }

    public C48401b(Notice notice) {
        super(notice);
    }

    /* renamed from: a */
    private Bundle m190939a(ChatBundle.AbstractC29591b bVar) {
        return ChatBundle.m109259a().mo105927a(this.f121875d).mo105932b(false).mo105933c("notification").mo105929a().mo105916a(new ChatBundle.AbstractC29591b() {
            /* class com.ss.android.lark.notification.p2376a.$$Lambda$b$2qVjov9kurHbNvyxBdX0cCpCFC0 */

            @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
            public final void inject(Bundle bundle) {
                C48401b.lambda$2qVjov9kurHbNvyxBdX0cCpCFC0(ChatBundle.AbstractC29591b.this, bundle);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m190940a(ChatBundle.AbstractC29591b bVar, Bundle bundle) {
        if (bVar != null) {
            bVar.inject(bundle);
        }
    }
}
