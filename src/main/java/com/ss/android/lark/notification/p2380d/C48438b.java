package com.ss.android.lark.notification.p2380d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26253ae;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36454ac;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36504r;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.p2380d.p2381a.C48437a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.notification.d.b */
public class C48438b extends AbstractC48500b<Notice, C48437a> {

    /* renamed from: a */
    private Notice f121900a;

    /* renamed from: b */
    private String f121901b;

    /* renamed from: c */
    private Context f121902c = C29990c.m110930b().mo134528a();

    /* renamed from: d */
    private AbstractC36474h.AbstractC36486l f121903d = C29990c.m110930b().ad();

    /* renamed from: e */
    private AbstractC36454ac f121904e = C29990c.m110930b().mo134592t();

    /* renamed from: f */
    private AbstractC36504r f121905f = C29990c.m110930b().mo134512K();

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
        return this.f121901b;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return this.f121900a.content;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f121903d.mo134632a(1);
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
        this.f121900a = notice;
        this.f121901b = notice.messageId;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return (C26253ae.m94997a() % 20001) * 20001;
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

    /* renamed from: b */
    public C48437a mo169445b() {
        if (this.f121901b != null) {
            return (C48437a) mo169587a(new C48437a());
        }
        Log.m165383e("FailedNotification", "messageId or getChatId is null");
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        String str = this.f121900a.title;
        if (TextUtils.isEmpty(str)) {
            return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AppNameRelease);
        }
        return str;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(this.f121904e.mo134417c(), true);
        bundle.putBoolean(this.f121905f.mo134695c(), true);
        Intent a = this.f121904e.mo134411a(this.f121902c, this.f121905f.mo134692b(), bundle);
        return PendingIntent.getActivity(this.f121902c, (int) SystemClock.uptimeMillis(), a, 134217728);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        return Uri.parse("android.resource://" + this.f121902c.getPackageName() + "/" + R.raw.notification);
    }

    public C48438b(Notice notice) {
        super(notice);
    }
}
