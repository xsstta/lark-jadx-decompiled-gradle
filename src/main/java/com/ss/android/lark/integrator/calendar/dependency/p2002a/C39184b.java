package com.ss.android.lark.integrator.calendar.dependency.p2002a;

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
import com.ss.android.lark.calendar.api.entity.CalendarNotice;
import com.ss.android.lark.integrator.calendar.CalendarModuleProvider;
import com.ss.android.lark.integrator.calendar.dependency.p2002a.p2003a.C39183a;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.a.b */
public class C39184b extends AbstractC48500b<Notice, C39183a> {

    /* renamed from: a */
    private Notice f100467a;

    /* renamed from: b */
    private final ICoreApi f100468b = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: c */
    private final IIMApi f100469c = ((IIMApi) ApiUtils.getApi(IIMApi.class));

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
        return this.f100467a.messageId;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        return this.f100467a.title;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return this.f100467a.content;
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
        this.f100467a = (Notice) mo169588o();
    }

    /* renamed from: b */
    public C39183a mo143024b() {
        return (C39183a) mo169587a(new C39183a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return (((int) Long.parseLong(this.f100467a.messageId)) % 10005) * 10005;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f100468b.isVibrateOn("scheduleCalReminder");
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
        if (!this.f100468b.isSoundOn("scheduleCalReminder")) {
            return null;
        }
        return Uri.parse("android.resource://" + LarkContext.getApplication().getPackageName() + "/" + R.raw.notification_calendar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        PendingIntent a;
        if ((this.f100467a instanceof CalendarNotice) && (a = CalendarModuleProvider.m154500a().mo108103a((CalendarNotice) this.f100467a)) != null) {
            return a;
        }
        Context applicationContext = LarkContext.getApplication().getApplicationContext();
        AbstractC29555b mainLauncher = this.f100468b.getMainLauncher();
        Bundle bundle = new Bundle();
        bundle.putBoolean(mainLauncher.mo105699a(), true);
        bundle.putBoolean("switch_to_inbox", true);
        return PendingIntent.getActivity(applicationContext, (int) SystemClock.uptimeMillis(), mainLauncher.mo105698a(applicationContext, this.f100469c.getFeedTabPageName(), bundle), 134217728);
    }

    public C39184b(Notice notice) {
        super(notice);
    }
}
