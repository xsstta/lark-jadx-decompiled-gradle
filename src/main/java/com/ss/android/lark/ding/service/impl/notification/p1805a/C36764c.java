package com.ss.android.lark.ding.service.impl.notification.p1805a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.service.impl.notification.entity.C36774a;
import com.ss.android.lark.ding.service.impl.notification.entity.UrgentNotice;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.ding.service.impl.notification.a.c */
public class C36764c extends AbstractC48500b<UrgentNotice, C36774a> {

    /* renamed from: a */
    private static String f94465a;

    /* renamed from: b */
    private Chat f94466b;

    /* renamed from: c */
    private Message f94467c;

    /* renamed from: d */
    private Notice f94468d;

    /* renamed from: e */
    private Chatter f94469e;

    /* renamed from: f */
    private IDingModuleDependency.ISettingDependency f94470f = C36618a.m144492a().mo135101f();

    /* renamed from: g */
    private IDingModuleDependency.AbstractC36632i f94471g = C36618a.m144492a().mo135106k();

    /* renamed from: h */
    private IDingModuleDependency.AbstractC36628e f94472h = C36618a.m144492a().mo135108m();

    /* renamed from: i */
    private IDingModuleDependency.AbstractC36625c f94473i = C36618a.m144492a().mo135104i();

    /* renamed from: j */
    private IDingModuleDependency.AbstractC36634k f94474j = C36618a.m144492a().mo135105j();

    /* renamed from: k */
    private Context f94475k = C36618a.m144492a().mo135096a();

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
        return this.f94468d.messageId;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f94474j.mo135161a(3);
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
        return ((int) (Long.parseLong(this.f94468d.messageId) % 10002)) * UpdateDialogStatusCode.SHOW;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: n */
    public String mo31137n() {
        if (!C26326z.m95343g()) {
            return null;
        }
        return "ding_v2";
    }

    /* renamed from: b */
    public C36774a mo135454b() {
        if (this.f94467c == null || this.f94466b == null) {
            return null;
        }
        return (C36774a) mo169587a(new C36774a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: m */
    public int mo31136m() {
        if (this.f94468d.state == 1) {
            return 0;
        }
        if (this.f94468d.state == 2 || this.f94468d.state == 3) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        this.f94467c = ((UrgentNotice) mo169588o()).getMessage();
        this.f94468d = (Notice) mo169588o();
        this.f94469e = ((UrgentNotice) mo169588o()).getReCaller();
        if (this.f94467c != null) {
            this.f94466b = ((UrgentNotice) mo169588o()).getChat();
        }
        f94465a = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AppNameRelease);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(this.f94471g.mo135157a(), true);
        bundle.putBoolean(this.f94472h.mo135149a(), true);
        Intent a = this.f94471g.mo135156a(this.f94475k, this.f94472h.mo135150b(), bundle);
        return PendingIntent.getActivity(this.f94475k, (int) SystemClock.uptimeMillis(), a, 134217728);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        if (this.f94468d.state == 3 || this.f94468d.state == 2) {
            return f94465a;
        }
        if (this.f94470f.mo135118b(true)) {
            return this.f94468d.title;
        }
        return f94465a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!this.f94474j.mo135162b(3)) {
            return null;
        }
        return Uri.parse("android.resource://" + this.f94475k.getPackageName() + "/" + R.raw.notification_ding);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        if (!TextUtils.isEmpty(this.f94468d.content)) {
            return this.f94468d.content;
        }
        boolean z = true;
        boolean b = this.f94470f.mo135118b(true);
        if (this.f94468d.state == 3 || this.f94468d.state == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(UIHelper.getString(R.string.Lark_Legacy_DingLabel));
            IDingModuleDependency.AbstractC36625c cVar = this.f94473i;
            Chatter chatter = this.f94469e;
            if (this.f94467c.getRecallerIdentity() != Message.RecallerIdentity.GROUP_ADMIN) {
                z = false;
            }
            sb.append(cVar.mo135132a(chatter, z));
            return sb.toString();
        } else if (b) {
            return this.f94468d.content;
        } else {
            if (this.f94466b.getType() == Chat.Type.GROUP) {
                return this.f94475k.getText(R.string.Lark_Legacy_DingGroup).toString();
            }
            return this.f94475k.getText(R.string.Lark_Legacy_ding).toString();
        }
    }

    public C36764c(UrgentNotice urgentNotice) {
        super(urgentNotice);
    }
}
