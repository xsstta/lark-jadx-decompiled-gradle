package com.ss.android.vc.lark.notification.ringing;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.C60997u;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.utils.C63532r;
import com.ss.android.vc.net.service.VideoChatUser;

/* renamed from: com.ss.android.vc.lark.notification.ringing.c */
public class C61167c extends AbstractC48500b<Notice, C60997u> {

    /* renamed from: a */
    private Notice f153219a;

    /* renamed from: b */
    private C61303k f153220b;

    /* renamed from: c */
    private Intent f153221c;

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
        return this.f153219a.key;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AppNameRelease);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return m237853p();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: k */
    public String mo31134k() {
        return m237853p();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return this.f153219a.key.hashCode();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return VideoChatModuleDependency.getNotificationDependency().isVibrateOn(10003);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: n */
    public String mo31137n() {
        if (!C26326z.m95343g()) {
            return null;
        }
        return "at_v2";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        return PendingIntent.getActivity(ar.m236694a(), (int) SystemClock.uptimeMillis(), this.f153221c, 134217728);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        this.f153219a = (Notice) mo169588o();
        this.f153220b = C63532r.m248976c();
        if (C63532r.m248974b() != null) {
            Intent intent = new Intent(C63532r.m248974b());
            this.f153221c = intent;
            intent.putExtra("EXTRA_FROM_RINGING_PUSH", true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!VideoChatModuleDependency.getNotificationDependency().isSoundOn(10003)) {
            return null;
        }
        return Uri.parse("android.resource://" + ar.m236694a().getPackageName() + "/" + R.raw.notification);
    }

    /* renamed from: p */
    private String m237853p() {
        VideoChatUser videoChatUser;
        if (this.f153220b.mo212057f() == VideoChat.Type.CALL) {
            videoChatUser = this.f153220b.mo212088F().getSingleRemoteUser();
        } else {
            videoChatUser = this.f153220b.mo212088F().getMultiCaller();
        }
        if (videoChatUser == null) {
            return C60773o.m236119a((int) R.string.Lark_Legacy_NewMessage);
        }
        if (this.f153220b.mo212057f() == VideoChat.Type.MEET) {
            return UIHelper.mustacheFormat((int) R.string.View_M_InvitedToMeetingNameBraces, "name", videoChatUser.getName());
        }
        if (this.f153220b.mo212056e().isVoiceCall()) {
            return UIHelper.mustacheFormat((int) R.string.View_A_IncomingVoiceCallFromNameBraces, "name", videoChatUser.getName());
        }
        return UIHelper.mustacheFormat((int) R.string.View_V_IncomingVideoCallFromNameBraces, "name", videoChatUser.getName());
    }

    /* renamed from: b */
    public C60997u mo211468b() {
        VideoChatUser videoChatUser;
        C60700b.m235851b("VCRingNotificationDataPacker", "[buildShowUnitData]", "start");
        C61303k kVar = this.f153220b;
        if (kVar == null || this.f153221c == null || this.f153219a == null) {
            C60700b.m235864f("VCRingNotificationDataPacker", "[buildShowUnitData2]", "meeting or intent = null");
            return null;
        } else if (TextUtils.isEmpty(kVar.mo212054c()) || !this.f153220b.mo212054c().equals(this.f153219a.key)) {
            C60700b.m235864f("VCRingNotificationDataPacker", "[buildShowUnitData3]", "meeting.getId() is invalid");
            return null;
        } else {
            C60997u uVar = (C60997u) mo169587a(new C60997u());
            if (this.f153220b.mo212057f() == VideoChat.Type.CALL) {
                videoChatUser = this.f153220b.mo212088F().getSingleRemoteUser();
            } else {
                videoChatUser = this.f153220b.mo212088F().getMultiCaller();
            }
            if (videoChatUser == null) {
                return uVar;
            }
            uVar.f152835a = C60783v.m236225a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), 72, 72);
            C60700b.m235851b("VCRingNotificationDataPacker", "[buildShowUnitData4]", "end");
            return uVar;
        }
    }

    public C61167c(Notice notice) {
        super(notice);
    }
}
