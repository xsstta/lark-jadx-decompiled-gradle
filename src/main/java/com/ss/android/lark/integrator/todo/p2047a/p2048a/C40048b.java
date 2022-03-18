package com.ss.android.lark.integrator.todo.p2047a.p2048a;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.integrator.todo.TodoModuleProvider;
import com.ss.android.lark.integrator.todo.p2047a.p2048a.p2049a.C40047a;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.todo.dependency.entity.TodoNotice;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.todo.a.a.b */
public class C40048b extends AbstractC48500b<Notice, C40047a> {

    /* renamed from: a */
    private Notice f101786a;

    /* renamed from: b */
    private final ICoreApi f101787b = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: c */
    private final IIMApi f101788c = ((IIMApi) ApiUtils.getApi(IIMApi.class));

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
        return this.f101786a.messageId;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        return this.f101786a.title;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return this.f101786a.content;
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
        this.f101786a = (Notice) mo169588o();
    }

    /* renamed from: b */
    public C40047a mo145360b() {
        return (C40047a) mo169587a(new C40047a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return (((int) Long.parseLong(this.f101786a.messageId)) % 10010) * 10010;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f101787b.isVibrateOn("scheduleCalReminder");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: n */
    public String mo31137n() {
        if (!C26326z.m95343g()) {
            return null;
        }
        return "scheduleCalReminder";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!this.f101787b.isSoundOn("scheduleCalReminder")) {
            return null;
        }
        return Uri.parse("android.resource://" + LarkContext.getApplication().getPackageName() + "/" + R.raw.notification_calendar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        PendingIntent a;
        if ((this.f101786a instanceof TodoNotice) && (a = TodoModuleProvider.m158690a().mo191649a((TodoNotice) this.f101786a)) != null) {
            return a;
        }
        Context applicationContext = LarkContext.getApplication().getApplicationContext();
        AbstractC29555b mainLauncher = this.f101787b.getMainLauncher();
        Bundle bundle = new Bundle();
        bundle.putBoolean(mainLauncher.mo105699a(), true);
        bundle.putBoolean("switch_to_inbox", true);
        return PendingIntent.getActivity(applicationContext, (int) SystemClock.uptimeMillis(), mainLauncher.mo105698a(applicationContext, this.f101788c.getFeedTabPageName(), bundle), 134217728);
    }

    public C40048b(Notice notice) {
        super(notice);
    }
}
