package com.ss.android.lark.notification.offline;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.C48443b;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.offline.parser.C48554d;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.notification.p2382e.C48468k;
import com.ss.android.lark.utils.UIHelper;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.notification.offline.e */
public class C48548e extends AbstractC48500b<OfflineNotice, C48443b> {

    /* renamed from: a */
    private OfflineNotice f122145a;

    /* renamed from: b */
    private C48554d f122146b;

    /* renamed from: c */
    private Context f122147c = C48398a.m190922a().mo169335a();

    /* renamed from: d */
    private AbstractC48407a.AbstractC48422k f122148d;

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
    /* renamed from: n */
    public String mo31137n() {
        return "normal_v2";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return this.f122146b.mo169637a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return this.f122145a.content;
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
        this.f122145a = (OfflineNotice) mo169588o();
    }

    /* renamed from: b */
    public C48443b mo169632b() {
        return (C48443b) mo169587a(new C48443b());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: d */
    public String mo31127d() {
        return String.valueOf(this.f122145a.getRuleId());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return C48468k.m191156a().mo105561b(mo31137n());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        String str = this.f122145a.title;
        if (TextUtils.isEmpty(str)) {
            return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AppNameRelease);
        }
        return str;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        return Uri.parse("android.resource://com.ss.android.lark/" + R.raw.notification);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        Intent b = this.f122146b.mo169638b();
        if (b == null) {
            return null;
        }
        if (!C48544a.m191373a(this.f122145a.getUserId())) {
            return PendingIntent.getActivity(this.f122147c, uptimeMillis, b, 134217728);
        }
        return C48544a.m191371a(this.f122147c, uptimeMillis, C48544a.m191372a(this.f122147c, this.f122145a.getUserId(), b), this.f122145a.getUserId());
    }

    public C48548e(OfflineNotice offlineNotice) {
        super(offlineNotice);
        this.f122146b = new C48554d(offlineNotice);
        this.f122148d = C48398a.m190922a().mo169345h();
    }
}
