package com.ss.android.lark.mail.p2158b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.C41724a;
import com.ss.android.lark.mail.p2157a.AbstractC41740a;
import com.ss.android.lark.mail.p2158b.p2159a.C41762a;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.mail.b.b */
public class C41763b extends AbstractC48500b<Notice, C41762a> {

    /* renamed from: a */
    private static final String f106036a = (new String(Character.toChars(128238)) + " ");

    /* renamed from: b */
    private static AbstractC41740a.AbstractC41755n f106037b = C41724a.m165678a().getMainDependency();

    /* renamed from: c */
    private Notice f106038c;

    /* renamed from: d */
    private Context f106039d = C41724a.m165678a().getAppContext();

    /* renamed from: p */
    private int m165868p() {
        return 1;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: h */
    public int mo31131h() {
        return R.drawable.ic_notify;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return false;
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
        return this.f106038c.messageId;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return this.f106038c.title;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: k */
    public String mo31134k() {
        return mo31130g();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        this.f106038c = (Notice) mo169588o();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return (this.f106038c.messageId.hashCode() % 10006) * 10006;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: n */
    public String mo31137n() {
        if (!C26326z.m95343g()) {
            return null;
        }
        return "newMail";
    }

    /* renamed from: b */
    public C41762a mo150208b() {
        C41762a aVar = (C41762a) mo169587a(new C41762a());
        aVar.f106034a = m165868p();
        aVar.f106035b = this.f106038c.createTime;
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        Notice notice = this.f106038c;
        if (notice == null || notice.extra == null) {
            return f106036a + UIHelper.getAppName();
        }
        String str = this.f106038c.extra.f122006e;
        if (TextUtils.isEmpty(str)) {
            str = UIHelper.getAppName();
        }
        return f106036a + str;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        Intent b = f106037b.mo144490b();
        C53241h.m205898b("getPendingIntent", "getPendingIntent");
        if (this.f106038c.extra != null && !TextUtils.isEmpty(this.f106038c.extra.f122009h)) {
            C53241h.m205898b("getPendingIntent", "getPendingIntent threadId:" + this.f106038c.extra.f122009h + " messageId:" + this.f106038c.messageId + "label id :" + this.f106038c.extra.f122017p + " account id:" + this.f106038c.extra.f122023v);
            Bundle bundle = new Bundle();
            bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150222c(), this.f106038c.messageId);
            bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150223d(), this.f106038c.extra.f122009h);
            bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150225f(), C41724a.m165678a().getExternalUseConstant().mo150226g());
            bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150224e(), this.f106038c.extra.f122017p);
            bundle.putInt(C41724a.m165678a().getExternalUseConstant().mo150227h(), this.f106038c.state);
            bundle.putString(C41724a.m165678a().getExternalUseConstant().mo150228i(), this.f106038c.extra.f122023v);
            b.putExtras(bundle);
        }
        return PendingIntent.getActivity(this.f106039d, 0, b, 134217728);
    }

    public C41763b(Notice notice) {
        super(notice);
    }
}
