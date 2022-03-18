package com.ss.android.lark.voip.service.impl.notification.missed;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.notification.missed.entity.C58167a;
import com.ss.android.lark.voip.service.impl.notification.missed.entity.VoipNotice;

/* renamed from: com.ss.android.lark.voip.service.impl.notification.missed.b */
public class C58162b extends AbstractC48500b<VoipNotice, C58167a> {

    /* renamed from: a */
    public AbstractC57987d.AbstractC57992d f143070a = C57977a.m224905c().getMainDependency();

    /* renamed from: b */
    public AbstractC57987d.AbstractC57990b f143071b = C57977a.m224905c().getFeedDependency();

    /* renamed from: c */
    private Chatter f143072c;

    /* renamed from: d */
    private Notice f143073d;

    /* renamed from: e */
    private String f143074e;

    /* renamed from: f */
    private String f143075f;

    /* renamed from: g */
    private Context f143076g = C57977a.m224905c().getContext();

    /* renamed from: h */
    private AbstractC57987d.AbstractC57996g f143077h = C57977a.m224905c().getSettingDependency();

    /* renamed from: i */
    private AbstractC57987d.AbstractC57988a f143078i = C57977a.m224905c().getChatDependency();

    /* renamed from: j */
    private AbstractC57987d.AbstractC57995f f143079j = C57977a.m224905c().getNotificationDependency();

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
        return this.f143074e;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return this.f143074e.hashCode();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AppNameRelease);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f143079j.mo145490a(1);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: k */
    public String mo31134k() {
        return UIHelper.getString(R.string.Lark_Legacy_NewVoIP);
    }

    /* renamed from: b */
    public C58167a mo197071b() {
        return (C58167a) mo169587a(new C58167a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        return m225675a(this.f143076g, this.f143075f);
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
    /* renamed from: a */
    public void mo31124a() {
        this.f143072c = ((VoipNotice) mo169588o()).getCaller();
        Notice notice = (Notice) mo169588o();
        this.f143073d = notice;
        this.f143074e = notice.key;
        Chat chat = ((VoipNotice) mo169588o()).getChat();
        if (chat != null) {
            this.f143075f = chat.getId();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        if (!this.f143077h.mo145508a(true)) {
            return UIHelper.getString(R.string.Lark_Legacy_NewVoIP);
        }
        return UIHelper.getString(R.string.Lark_Legacy_VoIPContent) + this.f143078i.mo145504a(this.f143072c);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!this.f143079j.mo145492b(1)) {
            return null;
        }
        return Uri.parse("android.resource://" + this.f143076g.getPackageName() + "/" + R.raw.notification);
    }

    public C58162b(VoipNotice voipNotice) {
        super(voipNotice);
    }

    /* renamed from: a */
    private PendingIntent m225675a(Context context, String str) {
        Intent intent;
        if (!this.f143077h.mo145508a(true)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(this.f143070a.mo145484a(), true);
            bundle.putBoolean(this.f143071b.mo145486a(), true);
            intent = this.f143070a.mo145482a(context, this.f143071b.mo145487b(), bundle);
        } else {
            Bundle a = this.f143078i.mo145501a(str, "notification", new AbstractC57987d.AbstractC57988a.AbstractC57989a() {
                /* class com.ss.android.lark.voip.service.impl.notification.missed.C58162b.C581631 */

                @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57988a.AbstractC57989a
                /* renamed from: a */
                public void mo196618a(Bundle bundle) {
                    bundle.putBoolean(C58162b.this.f143071b.mo145486a(), true);
                    C58162b.this.f143070a.mo145483a(bundle);
                }
            });
            if (a != null) {
                intent = this.f143070a.mo145482a(context, this.f143071b.mo145487b(), a);
            } else {
                intent = null;
            }
        }
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        if (intent != null) {
            return PendingIntent.getActivity(context, uptimeMillis, intent, 134217728);
        }
        return null;
    }
}
