package com.ss.android.lark.contact.impl.p1754d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_new.NewContactActivity;
import com.ss.android.lark.contact.impl.p1754d.p1755a.C35788a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import java.util.Random;

/* renamed from: com.ss.android.lark.contact.impl.d.b */
public class C35789b extends AbstractC48500b<Notice, C35788a> {

    /* renamed from: a */
    private Notice f92523a;

    /* renamed from: b */
    private Context f92524b = C35358a.m138143a().mo130143a();

    /* renamed from: c */
    private AbstractC35361b.AbstractC35377p f92525c = C35358a.m138143a().mo130170o();

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
    /* renamed from: f */
    public String mo31129f() {
        return this.f92523a.title;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return this.f92523a.content;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f92525c.mo130237a(1);
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
        this.f92523a = (Notice) mo169588o();
    }

    /* renamed from: b */
    public C35788a mo131695b() {
        return (C35788a) mo169587a(new C35788a());
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
    /* renamed from: c */
    public int mo31126c() {
        return new Random(System.currentTimeMillis()).nextInt(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: d */
    public String mo31127d() {
        return mo31126c() + "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        Intent intent = new Intent(this.f92524b, NewContactActivity.class);
        intent.addFlags(67108864);
        return PendingIntent.getActivity(this.f92524b, 0, intent, 134217728);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!this.f92525c.mo130238b(1)) {
            return null;
        }
        return Uri.parse("android.resource://" + this.f92524b.getPackageName() + "/" + R.raw.notification);
    }

    public C35789b(Notice notice) {
        super(notice);
    }
}
