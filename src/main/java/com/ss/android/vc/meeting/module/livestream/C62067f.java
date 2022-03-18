package com.ss.android.vc.meeting.module.livestream;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.livestream.C60943c;
import com.ss.android.vc.entity.livestream.LiveExtraInfo;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.topbar.AbstractC63441a;
import com.ss.android.vc.net.request.AbstractC63598b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.vc.meeting.module.livestream.f */
public class C62067f extends AbstractC62011a {

    /* renamed from: a */
    private boolean f155918a = isHost();

    /* renamed from: b */
    private boolean f155919b = false;

    /* renamed from: c */
    private LiveExtraInfo f155920c;

    /* renamed from: d */
    private LiveInfo f155921d;

    /* renamed from: e */
    private LiveInfo f155922e;

    /* renamed from: f */
    private boolean f155923f = false;

    /* renamed from: g */
    private boolean f155924g = false;

    /* renamed from: h */
    private final Handler f155925h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private final ArrayList<AbstractC62062c> f155926i = new ArrayList<>();

    /* renamed from: j */
    private final C62075j f155927j;

    /* renamed from: k */
    private final C62049b f155928k;

    /* renamed from: l */
    private final HostReceiveLivingRequestData f155929l;

    /* renamed from: m */
    private InMeetingData.LiveMeetingData.Privilege f155930m = InMeetingData.LiveMeetingData.Privilege.EMPLOYEE;

    /* renamed from: n */
    private final Runnable f155931n = new Runnable() {
        /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$f$157Q5WaP49nf1DhEXW7fl44ocow */

        public final void run() {
            C62067f.this.m242490i();
        }
    };

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a
    /* renamed from: a */
    public boolean mo214673a() {
        return this.f155919b;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a
    /* renamed from: c */
    public LiveInfo mo214677c() {
        return this.f155921d;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a
    /* renamed from: d */
    public HostReceiveLivingRequestData mo214678d() {
        return this.f155929l;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a
    /* renamed from: e */
    public C62075j mo214680e() {
        return this.f155927j;
    }

    /* renamed from: h */
    public void mo214808h() {
        this.f155926i.clear();
    }

    /* renamed from: com.ss.android.vc.meeting.module.livestream.f$1 */
    static /* synthetic */ class C620681 {

        /* renamed from: a */
        static final /* synthetic */ int[] f155932a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.vc.entity.InMeetingData$LiveMeetingData$Type[] r0 = com.ss.android.vc.entity.InMeetingData.LiveMeetingData.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.livestream.C62067f.C620681.f155932a = r0
                com.ss.android.vc.entity.InMeetingData$LiveMeetingData$Type r1 = com.ss.android.vc.entity.InMeetingData.LiveMeetingData.Type.PARTICIPANT_REQUEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.livestream.C62067f.C620681.f155932a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.InMeetingData$LiveMeetingData$Type r1 = com.ss.android.vc.entity.InMeetingData.LiveMeetingData.Type.LIVE_INFO_CHANGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.livestream.C62067f.C620681.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m242490i() {
        mo214672a(false);
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo214795g();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a
    /* renamed from: b */
    public boolean mo214676b() {
        return this.f155923f;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a, com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: f */
    public void mo214681f() {
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo214681f();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: g */
    public void mo214795g() {
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo214795g();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a
    /* renamed from: b */
    public void mo214675b(boolean z) {
        this.f155923f = z;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a
    /* renamed from: a */
    public void mo214671a(AbstractC62062c cVar) {
        if (cVar != null) {
            this.f155926i.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo214807b(LiveInfo aVar) {
        this.f155922e = this.f155921d;
        this.f155921d = aVar;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a
    /* renamed from: b */
    public void mo214674b(AbstractC62062c cVar) {
        if (this.f155926i.contains(cVar)) {
            this.f155926i.remove(cVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a, com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public void mo214670a(View view) {
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo214670a(view);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: c */
    public void mo214794c(boolean z) {
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo214794c(z);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a, com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: d */
    public void mo214679d(boolean z) {
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo214679d(z);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61300h
    /* renamed from: a */
    public void mo212080a(VideoChat.Type type) {
        C60700b.m235851b("LivestreamControl", "[onMeetingUpgrade]", "<LivestreamTag> type=" + type);
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo212080a(type);
                }
            }
        }
    }

    public C62067f(C61303k kVar) {
        super(kVar);
        this.f155927j = new C62075j(kVar, this);
        C62075j.m242548a((AbstractC63598b<C60943c>) null);
        HostReceiveLivingRequestData hostReceiveLivingRequestData = new HostReceiveLivingRequestData();
        this.f155929l = hostReceiveLivingRequestData;
        this.f155928k = new C62049b(kVar, hostReceiveLivingRequestData);
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public void mo214791a(LiveExtraInfo liveExtraInfo) {
        int i;
        C60700b.m235851b("LivestreamControl", "[onLivestreamExtroInfoUpdate]", "<LivestreamTag> liveExtraInfo = " + liveExtraInfo);
        this.f155920c = liveExtraInfo;
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null && this.f155923f) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo214791a(liveExtraInfo);
                }
            }
        }
        AbstractC63441a ah = getMeeting().ah();
        if (liveExtraInfo != null) {
            i = liveExtraInfo.getOnlineUsersCount();
        } else {
            i = 0;
        }
        ah.mo219473a(i);
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public void mo214790a(InMeetingData.LiveMeetingData liveMeetingData) {
        C60700b.m235851b("LivestreamControl", "[onLivestreamData]", "<LivestreamTag> liveMeetingData=" + liveMeetingData);
        if (liveMeetingData.mo209029a() != null) {
            mo214807b(liveMeetingData.mo209029a());
            mo214675b(liveMeetingData.mo209029a().mo209943b());
        }
        if (liveMeetingData.mo209033b() == InMeetingData.LiveMeetingData.Type.LIVE_INFO_CHANGE) {
            mo214675b(liveMeetingData.mo209034c());
        }
        mo214672a(false);
        this.f155925h.removeCallbacks(this.f155931n);
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo214790a(liveMeetingData);
                }
            }
        }
        if (this.mMeeting.mo212067p() == DisplayMode.WINDOW) {
            int i = C620681.f155932a[liveMeetingData.mo209033b().ordinal()];
            if (i == 1) {
                this.f155928k.mo214774a(liveMeetingData);
            } else if (i == 2) {
                this.f155927j.mo214818a(true, (Activity) null);
            }
        }
        getMeeting().ah().mo219480a(liveMeetingData.mo209034c());
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public void mo214792a(LiveInfo aVar) {
        C60700b.m235844a("LivestreamControl", "[onLivestreamStatusUpdate]", "<LivestreamTag> liveInfo=" + aVar, 16000);
        if (aVar != null) {
            mo214807b(aVar);
            mo214675b(aVar.mo209943b());
            ArrayList<AbstractC62062c> arrayList = this.f155926i;
            if (arrayList != null) {
                Iterator<AbstractC62062c> it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC62062c next = it.next();
                    if (next != null) {
                        next.mo214792a(aVar);
                    }
                }
            }
            boolean isHost = isHost();
            if (this.f155918a != isHost) {
                this.f155918a = isHost;
                mo214794c(isHost);
            }
            getMeeting().ah().mo219480a(aVar.mo209943b());
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62011a
    /* renamed from: a */
    public void mo214672a(boolean z) {
        this.f155919b = z;
        if (z) {
            this.f155925h.removeCallbacks(this.f155931n);
            this.f155925h.postDelayed(this.f155931n, 30000);
            return;
        }
        this.f155925h.removeCallbacks(this.f155931n);
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo214795g();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
        if (DisplayMode.WINDOW == displayMode) {
            this.f155928k.mo214770a();
            this.f155927j.mo214815a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public void mo214793a(AbstractC61222a aVar, Activity activity) {
        if (getMeeting().al().mo213181h()) {
            C60738ac.m236039c(UIHelper.getString(R.string.View_G_BreakoutRoomsNoSupport));
            return;
        }
        ArrayList<AbstractC62062c> arrayList = this.f155926i;
        if (arrayList != null) {
            Iterator<AbstractC62062c> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62062c next = it.next();
                if (next != null) {
                    next.mo214793a(aVar, activity);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            C60700b.m235851b("LivestreamControl", "[onTransform]", "remove timer");
            this.f155925h.removeCallbacks(this.f155931n);
            mo214808h();
            this.f155928k.mo214770a();
            this.f155927j.mo214815a();
        }
    }
}
