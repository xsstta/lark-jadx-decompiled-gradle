package com.ss.android.vc.meeting.module.meetingdialog.sip;

import android.text.TextUtils;
import com.larksuite.framework.mvp.C26033a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.response.C60955ab;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.event.bv;
import com.ss.android.vc.statistics.event2.InviteRoomEvent;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.sip.e */
public class C62441e extends C26033a<ISIPInviteContract.AbstractC62429a, ISIPInviteContract.AbstractC62430b> {

    /* renamed from: d */
    private static String f157044d;

    /* renamed from: e */
    private static ISIPInviteContract.InviteState f157045e;

    /* renamed from: a */
    private C61303k f157046a;

    /* renamed from: b */
    private boolean f157047b;

    /* renamed from: c */
    private boolean f157048c;

    @Override // com.larksuite.framework.mvp.C26033a, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.larksuite.framework.mvp.C26033a, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m244022b(ISIPInviteContract.InviteState.IDLE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.sip.e$2 */
    public static /* synthetic */ class C624432 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157050a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.vc.entity.ParticipantType[] r0 = com.ss.android.vc.entity.ParticipantType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.meetingdialog.sip.C62441e.C624432.f157050a = r0
                com.ss.android.vc.entity.ParticipantType r1 = com.ss.android.vc.entity.ParticipantType.SIP_USER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.sip.C62441e.C624432.f157050a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.ParticipantType r1 = com.ss.android.vc.entity.ParticipantType.RESERVED_USER_5     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.sip.C62441e.C624432.<clinit>():void");
        }
    }

    /* renamed from: e */
    private String m244023e() {
        int i = C624432.f157050a[((ISIPInviteContract.AbstractC62430b) mo92551a()).getParticipantType().ordinal()];
        if (i == 1) {
            return "sip";
        }
        if (i != 2) {
            return "";
        }
        return "h323";
    }

    /* renamed from: d */
    public void mo215852d() {
        if (this.f157047b) {
            bv.m250220a("cancel", this.f157046a);
            m244021a(ISIPInviteContract.InviteState.CANCELED);
            if (!TextUtils.isEmpty(f157044d)) {
                ((ISIPInviteContract.AbstractC62429a) mo92554b()).mo215828a(f157044d, this.f157046a.mo212055d(), ((ISIPInviteContract.AbstractC62430b) mo92551a()).getParticipantType());
                f157044d = null;
            }
            this.f157047b = false;
            this.f157048c = false;
        }
    }

    /* renamed from: c */
    public void mo215851c() {
        if (!this.f157048c) {
            this.f157048c = true;
            bv.m250220a("dial_phone", this.f157046a);
            InviteRoomEvent.f160802a.mo220222a(m244023e(), this.f157046a);
            ((ISIPInviteContract.AbstractC62429a) mo92554b()).mo215829a(((ISIPInviteContract.AbstractC62430b) mo92551a()).getUri(), this.f157046a.mo212055d(), ((ISIPInviteContract.AbstractC62430b) mo92551a()).getParticipantType(), new AbstractC63598b<C60955ab>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.sip.C62441e.C624421 */

                /* renamed from: a */
                public void onSuccess(C60955ab abVar) {
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("SIPInvitePresenter", "[call]", "calling onError: " + eVar);
                }
            });
        }
    }

    /* renamed from: a */
    private void m244021a(ISIPInviteContract.InviteState inviteState) {
        f157045e = inviteState;
        ISIPInviteContract.AbstractC62430b bVar = (ISIPInviteContract.AbstractC62430b) mo92551a();
        if (bVar != null) {
            bVar.setState(inviteState);
        }
    }

    /* renamed from: b */
    private void m244022b(ISIPInviteContract.InviteState inviteState) {
        f157045e = inviteState;
        ISIPInviteContract.AbstractC62430b bVar = (ISIPInviteContract.AbstractC62430b) mo92551a();
        if (bVar != null) {
            bVar.mo215830a(inviteState);
        }
    }

    public C62441e(ISIPInviteContract.AbstractC62430b bVar, C61303k kVar) {
        this.f157046a = kVar;
        mo92553a(bVar, new C62440d());
        bVar.setViewDelegate(new C62444f(this));
    }
}
