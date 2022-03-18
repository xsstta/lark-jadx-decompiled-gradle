package com.ss.android.lark.ding.service.impl.notification.p1806b;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.service.impl.notification.entity.C36774a;
import com.ss.android.lark.ding.service.impl.notification.entity.UrgentNotice;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.ding.service.impl.notification.b.c */
public class C36771c extends AbstractC48500b<UrgentNotice, C36774a> {

    /* renamed from: a */
    private IDingModuleDependency.AbstractC36634k f94480a = C36618a.m144492a().mo135105j();

    /* renamed from: b */
    private IDingModuleDependency.ISettingDependency f94481b = C36618a.m144492a().mo135101f();

    /* renamed from: c */
    private Context f94482c = C36618a.m144492a().mo135096a();

    /* renamed from: d */
    private Message f94483d;

    /* renamed from: e */
    private Notice f94484e;

    /* renamed from: f */
    private Chat f94485f;

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
    /* renamed from: d */
    public String mo31127d() {
        return this.f94484e.messageId;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f94480a.mo135161a(1);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: k */
    public String mo31134k() {
        return mo31130g();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return ((int) (Long.parseLong(this.f94484e.messageId) % 10003)) * 10003;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        return this.f94480a.mo135159a(this.f94483d, true, this.f94485f.isThread());
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
    public C36774a mo135462b() {
        if (this.f94483d == null || this.f94485f == null) {
            return null;
        }
        return (C36774a) mo169587a(new C36774a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: m */
    public int mo31136m() {
        if (this.f94484e.state == 1) {
            return 0;
        }
        if (this.f94484e.state == 2 || this.f94484e.state == 3) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        this.f94483d = ((UrgentNotice) mo169588o()).getMessage();
        this.f94484e = (Notice) mo169588o();
        this.f94485f = ((UrgentNotice) mo169588o()).getChat();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        if (this.f94484e.state == 3) {
            return UIHelper.getString(R.string.Lark_Legacy_DingAckDefaultReply);
        }
        if (this.f94484e.state == 2) {
            return UIHelper.getString(R.string.Lark_Legacy_DingAckDefaultReply);
        }
        if (this.f94481b.mo135118b(true)) {
            return this.f94484e.content;
        }
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!this.f94480a.mo135162b(1)) {
            return null;
        }
        return Uri.parse("android.resource://" + this.f94482c.getPackageName() + "/" + R.raw.notification);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        if (this.f94484e.state == 3) {
            return UIHelper.getString(R.string.Lark_Legacy_DingAckDefaultPrefix) + UIHelper.getString(R.string.Lark_Legacy_MessageRemove1);
        } else if (this.f94484e.state == 2) {
            return UIHelper.getString(R.string.Lark_Legacy_DingAckDefaultPrefix) + UIHelper.getString(R.string.Lark_Legacy_MsgWithdraw1);
        } else if (this.f94481b.mo135118b(true)) {
            return this.f94484e.title;
        } else {
            return UIHelper.getString(R.string.Lark_Legacy_PushAckDefaultTitle);
        }
    }

    public C36771c(UrgentNotice urgentNotice) {
        super(urgentNotice);
    }
}
