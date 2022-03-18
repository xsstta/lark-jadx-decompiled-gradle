package com.ss.android.vc.meeting.module.meetingdialog.pstn;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.C26033a;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.response.C60955ab;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.C62420e;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.bo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.e */
public class C62420e extends C26033a<IPstnInviteContract.AbstractC62388a, IPstnInviteContract.AbstractC62389b> implements C61381c.AbstractC61382a {

    /* renamed from: d */
    private static String f157004d;

    /* renamed from: f */
    private static IPstnInviteContract.InviteState f157005f;

    /* renamed from: a */
    public boolean f157006a;

    /* renamed from: b */
    private C61303k f157007b;

    /* renamed from: c */
    private boolean f157008c;

    /* renamed from: e */
    private String f157009e;

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212486a(List list) {
        C61381c.AbstractC61382a.CC.$default$a(this, list);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212487a(boolean z) {
        C61381c.AbstractC61382a.CC.$default$a(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public /* synthetic */ void h_(boolean z) {
        C61381c.AbstractC61382a.CC.$default$h_(this, z);
    }

    @Override // com.larksuite.framework.mvp.C26033a, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m243959g() {
        mo215814a(IPstnInviteContract.InviteState.SUCCEED);
    }

    /* renamed from: f */
    private void m243958f() {
        VcBizSender.m249303n(this.f157007b.mo212055d()).mo219889a(new AbstractC63598b<C60987v>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.C62420e.C624233 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* renamed from: a */
            public void onSuccess(C60987v vVar) {
                IPstnInviteContract.AbstractC62389b bVar = (IPstnInviteContract.AbstractC62389b) C62420e.this.mo92551a();
                if (bVar != null) {
                    bVar.mo215704a(vVar);
                }
            }
        });
    }

    @Override // com.larksuite.framework.mvp.C26033a, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m243957b(IPstnInviteContract.InviteState.IDLE);
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$e$BikmmaZllewoSC57T8FVJO2pyk */

            public final void run() {
                C62420e.this.m243960h();
            }
        });
        m243958f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.e$6 */
    public static /* synthetic */ class C624266 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157018a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.entity.Participant$OfflineReason[] r0 = com.ss.android.vc.entity.Participant.OfflineReason.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.meetingdialog.pstn.C62420e.C624266.f157018a = r0
                com.ss.android.vc.entity.Participant$OfflineReason r1 = com.ss.android.vc.entity.Participant.OfflineReason.REFUSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.pstn.C62420e.C624266.f157018a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.Participant$OfflineReason r1 = com.ss.android.vc.entity.Participant.OfflineReason.FORBIDDEN_TARGET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.pstn.C62420e.C624266.f157018a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.Participant$OfflineReason r1 = com.ss.android.vc.entity.Participant.OfflineReason.JOIN_LOBBY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.pstn.C62420e.C624266.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r0 = r0.getData();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m243960h() {
        /*
            r3 = this;
            com.ss.android.vc.meeting.module.meetingdialog.pstn.country.e r0 = com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62413e.m243942a()
            android.content.Context r1 = com.ss.android.vc.dependency.ar.m236694a()
            com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountryListManifest r0 = r0.mo215805b(r1)
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.util.LinkedHashMap r0 = r0.getData()
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            com.ss.android.vc.meeting.framework.meeting.k r1 = r3.f157007b
            com.ss.android.vc.meeting.model.d r1 = r1.mo212091I()
            com.ss.android.vc.meeting.model.a r1 = r1.mo212496c()
            com.ss.android.vc.meeting.module.meetingdialog.pstn.e$2 r2 = new com.ss.android.vc.meeting.module.meetingdialog.pstn.e$2
            r2.<init>(r0)
            r1.mo212426a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.pstn.C62420e.m243960h():void");
    }

    /* renamed from: c */
    public void mo215815c() {
        IPstnInviteContract.AbstractC62389b bVar;
        if (!this.f157008c && (bVar = (IPstnInviteContract.AbstractC62389b) mo92551a()) != null) {
            this.f157008c = true;
            this.f157009e = bVar.getPhone();
            bo.m250201a(true ^ TextUtils.isEmpty(bVar.getName()), this.f157007b);
            ((IPstnInviteContract.AbstractC62388a) mo92554b()).mo215702a(bVar.getName(), this.f157009e, this.f157007b.mo212055d(), new AbstractC63598b<C60955ab>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.C62420e.C624211 */

                /* renamed from: a */
                public void onSuccess(C60955ab abVar) {
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("PhoneInvitePresenter", "[call]", "calling onError: " + eVar);
                }
            });
        }
    }

    /* renamed from: d */
    public void mo215816d() {
        if (this.f157006a) {
            bo.m250198a(this.f157007b);
            mo215814a(IPstnInviteContract.InviteState.CANCELED);
            if (!TextUtils.isEmpty(f157004d)) {
                ((IPstnInviteContract.AbstractC62388a) mo92554b()).mo215701a(f157004d, this.f157007b.mo212055d());
                f157004d = null;
            }
            this.f157006a = false;
            this.f157008c = false;
        }
    }

    /* renamed from: e */
    public void mo215817e() {
        if (this.f157006a && !TextUtils.isEmpty(f157004d)) {
            Participant participant = null;
            for (Participant participant2 : this.f157007b.mo212091I().mo212494b().mo212601f()) {
                if (TextUtils.equals(participant2.getId(), f157004d)) {
                    participant = participant2;
                }
            }
            if (participant == null) {
                m243956a(f157004d, new IGetDataCallback<Participant.OfflineReason>() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.C62420e.C624244 */

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m243972a() {
                        C62420e.this.mo215814a(IPstnInviteContract.InviteState.BUSY);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m243973a(IPstnInviteContract.InviteState inviteState) {
                        C62420e.this.mo215814a(inviteState);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C60735ab.m236001a(new Runnable() {
                            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$e$4$2IsTAZ1jwaSNEFYsEzKssL8c8NM */

                            public final void run() {
                                C62420e.C624244.this.m243972a();
                            }
                        });
                        C62420e.this.f157006a = false;
                    }

                    /* renamed from: a */
                    public void onSuccess(Participant.OfflineReason offlineReason) {
                        C60735ab.m236001a(new Runnable(C62420e.this.mo215813a(offlineReason)) {
                            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$e$4$oRMdPhugpglPgIXXywm2xKXtqMU */
                            public final /* synthetic */ IPstnInviteContract.InviteState f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C62420e.C624244.this.m243973a((C62420e.C624244) this.f$1);
                            }
                        });
                        C62420e.this.f157006a = false;
                    }
                });
            } else if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
                C60735ab.m236001a(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$e$Fm6Oq2uv1xuZzmHH757yNMMkYAQ */

                    public final void run() {
                        C62420e.this.m243959g();
                    }
                });
                this.f157006a = false;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        mo215817e();
    }

    /* renamed from: b */
    private void m243957b(IPstnInviteContract.InviteState inviteState) {
        f157005f = inviteState;
        IPstnInviteContract.AbstractC62389b bVar = (IPstnInviteContract.AbstractC62389b) mo92551a();
        if (bVar != null) {
            bVar.mo215705a(inviteState);
        }
    }

    /* renamed from: a */
    public void mo215814a(IPstnInviteContract.InviteState inviteState) {
        f157005f = inviteState;
        IPstnInviteContract.AbstractC62389b bVar = (IPstnInviteContract.AbstractC62389b) mo92551a();
        if (bVar != null) {
            bVar.setState(inviteState);
        }
    }

    /* renamed from: a */
    public IPstnInviteContract.InviteState mo215813a(Participant.OfflineReason offlineReason) {
        IPstnInviteContract.InviteState inviteState;
        int i = C624266.f157018a[offlineReason.ordinal()];
        if (i == 1) {
            inviteState = IPstnInviteContract.InviteState.REFUSE;
        } else if (i == 2) {
            inviteState = IPstnInviteContract.InviteState.FORBIDDEN;
        } else if (i != 3) {
            inviteState = IPstnInviteContract.InviteState.BUSY;
        } else {
            inviteState = IPstnInviteContract.InviteState.SUCCEED;
        }
        C60700b.m235851b("PhoneInvitePresenter", "[offlineReason2InviteState]", "[reason]" + offlineReason + "  [state]" + inviteState);
        return inviteState;
    }

    public C62420e(IPstnInviteContract.AbstractC62389b bVar, C61303k kVar) {
        this.f157007b = kVar;
        mo92553a(bVar, new C62419d());
        bVar.setViewDelegate(new C62427f(this));
    }

    /* renamed from: a */
    private void m243956a(final String str, final IGetDataCallback<Participant.OfflineReason> iGetDataCallback) {
        IPstnInviteContract.AbstractC62388a aVar = (IPstnInviteContract.AbstractC62388a) mo92554b();
        if (aVar == null) {
            iGetDataCallback.onError(new ErrorResult("getOfflineReason failed"));
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        aVar.mo215703a(arrayList, new AbstractC63598b<List<Participant>>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.C62420e.C624255 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                iGetDataCallback.onError(eVar.f160599b);
            }

            /* renamed from: a */
            public void onSuccess(List<Participant> list) {
                Participant participant;
                Participant.OfflineReason offlineReason = null;
                if (!CollectionUtils.isEmpty(list)) {
                    participant = null;
                    for (Participant participant2 : list) {
                        if (TextUtils.equals(str, participant2.getId())) {
                            participant = participant2;
                        }
                    }
                } else {
                    participant = null;
                }
                if (participant != null) {
                    offlineReason = participant.getOfflineReason();
                }
                if (offlineReason != null) {
                    iGetDataCallback.onSuccess(offlineReason);
                } else {
                    iGetDataCallback.onError(new ErrorResult("getParticipant failed"));
                }
            }
        });
    }
}
