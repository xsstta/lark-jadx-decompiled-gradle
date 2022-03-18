package com.ss.android.vc.meeting.module.p3151p;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.response.as;
import com.ss.android.vc.irtc.AbstractC61023b;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.base.AbstractC61427g;
import com.ss.android.vc.meeting.module.base.C61436n;
import com.ss.android.vc.meeting.module.foregroundservice.ForegroundService;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vc.meeting.module.p3151p.C62614c;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63766o;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.vc.meeting.module.p.c */
public class C62614c extends AbstractC62612a implements MeetingAudioManager.AbstractC61403a, C61999a.AbstractC62002b {

    /* renamed from: a */
    public final List<AbstractC62612a.AbstractC62613a> f157620a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final AtomicBoolean f157621b = new AtomicBoolean(false);

    /* renamed from: c */
    public final AtomicBoolean f157622c = new AtomicBoolean(false);

    /* renamed from: d */
    public String f157623d;

    /* renamed from: e */
    final Runnable f157624e = new Runnable() {
        /* class com.ss.android.vc.meeting.module.p3151p.$$Lambda$c$wYUpMZCo6Z9z9LVG_TjVlie_A7A */

        public final void run() {
            C62614c.this.m244952x();
        }
    };

    /* renamed from: f */
    private final AtomicBoolean f157625f = new AtomicBoolean(true);

    /* renamed from: g */
    private final AtomicBoolean f157626g = new AtomicBoolean(C60795b.m236296a(ar.m236694a(), "android.permission.RECORD_AUDIO"));

    /* renamed from: h */
    private WeakReference<Activity> f157627h;

    /* renamed from: i */
    private Intent f157628i;

    /* renamed from: j */
    private C61999a f157629j;

    /* renamed from: k */
    private Boolean f157630k;

    /* renamed from: l */
    private int f157631l = 20;

    /* renamed from: m */
    private final List<IShareScreenStatusListener> f157632m = new CopyOnWriteArrayList();

    /* renamed from: n */
    private final AbstractC61427g f157633n = new AbstractC61427g() {
        /* class com.ss.android.vc.meeting.module.p3151p.$$Lambda$c$Zsflq3Sbh9wQNvthJfhZfk3BKSI */

        @Override // com.ss.android.vc.meeting.module.base.AbstractC61427g
        public final void onActivityResult(int i, int i2, Intent intent) {
            C62614c.this.m244943b(i, i2, intent);
        }
    };

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: e */
    public boolean mo216415e() {
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioMuted() {
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: f */
    public int mo216416f() {
        return this.f157631l;
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: i */
    public String mo216419i() {
        return this.f157623d;
    }

    /* renamed from: p */
    public Intent mo216436p() {
        return this.f157628i;
    }

    @Override // com.ss.android.vc.meeting.module.p3130k.C61999a.AbstractC62002b, com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: a */
    public void mo216406a(boolean z) {
        if (this.f157621b.get()) {
            C60700b.m235851b("ShareScreenControl", "[onOrientation]", "isScreenAutoRotate = " + C60776r.m236149g() + ", isLandscape = " + z + ", orientation = " + UIHelper.getResources().getConfiguration().orientation);
            int i = UIHelper.getResources().getConfiguration().orientation;
            if (i == 2) {
                mo216411b(true);
            } else if (i == 1) {
                mo216411b(false);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: a */
    public boolean mo216408a() {
        return this.f157621b.get();
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: a */
    public void mo216407a(boolean z, boolean z2) {
        if (z && z2 && !this.f157622c.get()) {
            mo216414d();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: a */
    public void mo216405a(Function1<Boolean, Boolean> function1) {
        C60700b.m235851b("ShareScreenControl", "[startAudioCapture]", "startAudioCapture");
        Activity activity = this.f157627h.get();
        if (activity == null) {
            function1.invoke(false);
        } else {
            C57805b.m224326a(activity, new C57805b.AbstractC57809a(function1) {
                /* class com.ss.android.vc.meeting.module.p3151p.$$Lambda$c$jtkQBm6Ik5HW8fSxlb7tVUdrZ7I */
                public final /* synthetic */ Function1 f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public final void permissionGranted(boolean z) {
                    C62614c.this.m244942a((C62614c) this.f$1, (Function1) z);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo216433a(boolean z, Intent intent) {
        if (intent == null) {
            intent = mo216436p();
        }
        if (intent != null) {
            mo216432a(z, this.f157631l);
        }
    }

    /* renamed from: a */
    public void mo216432a(boolean z, int i) {
        C60700b.m235851b("ShareScreenControl", "[setCapturerFormat]", "isLandscape: " + z + "fps: " + i);
        C60776r.C60777a a = C60776r.m236140a(this.mMeeting);
        if (z) {
            if (mo216408a()) {
                mo216429a(a.f151975a, a.f151976b, i);
            } else {
                m244940a(mo216436p(), a.f151975a, a.f151976b);
            }
        } else if (mo216408a()) {
            mo216429a(a.f151976b, a.f151975a, i);
        } else {
            m244940a(mo216436p(), a.f151976b, a.f151975a);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: a */
    public void mo216404a(IShareScreenStatusListener bVar) {
        if (!this.f157632m.contains(bVar)) {
            this.f157632m.add(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: k */
    public boolean mo216421k() {
        return this.f157625f.get();
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: b */
    public void mo216409b() {
        C61999a aVar = this.f157629j;
        if (aVar != null) {
            aVar.mo214619b(this);
            this.f157629j = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.p.c$a */
    public static class C62617a implements Serializable {
        public List<String> blackModelList;
        public int maxApiLevel;
        public int minApiLevel;
        public List<String> models;

        private C62617a() {
            this.models = Collections.emptyList();
            this.blackModelList = Collections.emptyList();
            this.minApiLevel = -1;
            this.maxApiLevel = -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m244939A() {
        for (AbstractC62612a.AbstractC62613a aVar : this.f157620a) {
            if (aVar != null) {
                aVar.mo216424a();
            }
        }
    }

    /* renamed from: q */
    public static boolean m244945q() {
        boolean b = C63634c.m249496b("byteview.meeting.android.share_audio");
        C60700b.m235851b("ShareScreenControl", "[isShareDeviceAudioEnable]", "enable = " + b);
        return b;
    }

    /* renamed from: r */
    private void m244946r() {
        Boolean bool = this.f157630k;
        if (bool != null && bool.booleanValue()) {
            MeetingAudioManager.m239471k().mo212693b(this);
        }
    }

    /* renamed from: u */
    private final void m244949u() {
        C60700b.m235851b("ShareScreenControl", "[stopScreenCapturer]", "stopScreenCapturer");
        try {
            C61237h.m238223a().mo210564v();
        } catch (Exception e) {
            e.printStackTrace();
        }
        C61237h.m238223a().mo210507a((AbstractC61023b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m244952x() {
        if (this.f157622c.get() && this.f157625f.get()) {
            m244951w();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m244954z() {
        for (AbstractC62612a.AbstractC62613a aVar : this.f157620a) {
            if (aVar != null) {
                aVar.mo216426b();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: j */
    public void mo216420j() {
        C60700b.m235851b("ShareScreenControl", "[stopAudioCapture]", "stopAudioCapture");
        this.f157625f.set(false);
        m244950v();
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: m */
    public void mo216423m() {
        for (AbstractC62612a.AbstractC62613a aVar : this.f157620a) {
            if (aVar != null) {
                aVar.mo216427c();
            }
        }
    }

    /* renamed from: t */
    private String m244948t() {
        if (!this.mMeeting.al().mo213182i() || this.mMeeting.al().mo213184k() == null) {
            return "";
        }
        return this.mMeeting.al().mo213184k().getBreakoutRoomId();
    }

    /* renamed from: v */
    private void m244950v() {
        C60700b.m235851b("ShareScreenControl", "[stopAudioCaptureNow]", "stopAudioCaptureNow");
        if (this.mMeeting.ak().mo217756b()) {
            this.mMeeting.ak().mo217760f();
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                UICallbackExecutor.removeCallbacks(this.f157624e);
                C61237h.m238223a().mo210483C();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: w */
    private void m244951w() {
        C60700b.m235851b("ShareScreenControl", "[restartAudioCaptureNow]", "restartAudioCaptureNo");
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                C61237h.m238223a().mo210483C();
                C61237h.m238223a().mo210497a((Intent) null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m244953y() {
        C60700b.m235851b("ShareScreenControl", "[startScreenCapturer2]", "isSharing" + this.f157621b);
        if (mo216408a()) {
            mo216414d();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: d */
    public void mo216414d() {
        C60700b.m235851b("ShareScreenControl", "[stopShareScreen]", "stopShareScreen");
        this.f157622c.set(false);
        VcBizSender.m249234b(getMeeting().mo212055d(), m244948t(), false).mo219893b(new AbstractC63598b<as>() {
            /* class com.ss.android.vc.meeting.module.p3151p.C62614c.C626162 */

            /* renamed from: a */
            public void onSuccess(as asVar) {
                C60700b.m235851b("ShareScreenControl", "[stopShareScreen2]", "success");
                C62614c.this.mo216418h();
                C62614c.this.f157623d = null;
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("ShareScreenControl", "[stopShareScreen3]", "[onError] errorMsg: " + eVar.mo219902b());
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: g */
    public void mo216417g() {
        C60700b.m235851b("ShareScreenControl", "[onNewScreenShare]", "isSharing=" + mo216408a());
        if (mo216408a()) {
            mo216414d();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: l */
    public boolean mo216422l() {
        Activity activity = this.f157627h.get();
        if (activity == null) {
            return false;
        }
        boolean a = C60795b.m236296a(activity, "android.permission.RECORD_AUDIO");
        if (!this.f157626g.get() || !a) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public void mo216434n() {
        if (this.f157630k == null) {
            this.f157630k = Boolean.valueOf(m244947s());
            C60700b.m235851b("ShareScreenControl", "[registerAudioListenerIfNeed]", "compat enable: " + this.f157630k);
        }
        if (this.f157630k.booleanValue()) {
            MeetingAudioManager.m239471k().mo212685a(this);
        }
    }

    /* renamed from: o */
    public void mo216435o() {
        if (getMeeting().mo212056e() == null || getMeeting().mo212056e().getVideoChatSettings() == null || getMeeting().mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE || !getMeeting().mo212056e().getVideoChatSettings().isBoxSharing()) {
            this.f157631l = 20;
        } else {
            this.f157631l = 24;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m244947s() {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.p3151p.C62614c.m244947s():boolean");
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: c */
    public void mo216412c() {
        C60700b.m235851b("ShareScreenControl", "[startShareScreen]", "isSharing:" + mo216408a());
        WeakReference<Activity> weakReference = this.f157627h;
        if (weakReference == null || weakReference.get() == null) {
            C60700b.m235851b("ShareScreenControl", "[startShareScreen2]", "failed with activity is null");
        } else if (mo216408a()) {
            C60700b.m235851b("ShareScreenControl", "[startShareScreen3]", "failed because is sharing now");
            if (!getMeeting().mo212101S()) {
                mo216414d();
            }
        } else if (mo216436p() == null) {
            try {
                this.f157627h.get().startActivityForResult(((MediaProjectionManager) ar.m236694a().getSystemService("media_projection")).createScreenCaptureIntent(), 100);
            } catch (ActivityNotFoundException e) {
                C60700b.m235864f("ShareScreenControl", "[startShareScreen4]", "ActivityNotFoundException exception:" + e.getMessage());
            }
            C61436n.m239798a(this.f157627h.get()).bw_().addActivityResultCallback(this.f157633n);
        } else {
            this.f157633n.onActivityResult(100, -1, mo216436p());
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: h */
    public void mo216418h() {
        C60700b.m235851b("ShareScreenControl", "[onShareScreenStopped]", "onShareScreenStopped");
        if (this.f157621b.get()) {
            this.f157621b.set(false);
            m244949u();
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.vc.meeting.module.p3151p.$$Lambda$c$nrIirwMKPxL38y8hKqUOQygrvs */

                public final void run() {
                    C62614c.this.m244954z();
                }
            });
            m244946r();
        }
        if (this.f157625f.get()) {
            this.f157625f.set(false);
            m244950v();
        }
        WeakReference<Activity> weakReference = this.f157627h;
        if (!(weakReference == null || weakReference.get() == null)) {
            C61436n.m239798a(this.f157627h.get()).bw_().removeActivityResultCallback(this.f157633n);
        }
        for (IShareScreenStatusListener bVar : this.f157632m) {
            if (bVar != null) {
                bVar.mo216428a(false);
            }
        }
        if (this.mMeeting.ak().mo217756b()) {
            this.mMeeting.ah().mo219482b();
        }
    }

    /* renamed from: a */
    public void mo216431a(Intent intent) {
        this.f157628i = intent;
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: a */
    public void mo216400a(Activity activity) {
        this.f157627h = new WeakReference<>(activity);
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: b */
    public void mo216410b(IShareScreenStatusListener bVar) {
        this.f157632m.remove(bVar);
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: c */
    public void mo216413c(boolean z) {
        this.f157626g.set(z);
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: a */
    public void mo216401a(C61999a aVar) {
        if (aVar != null) {
            this.f157629j = aVar;
            aVar.mo214614a(this);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        UICallbackExecutor.execute(new Runnable(videoChatInMeetingInfo) {
            /* class com.ss.android.vc.meeting.module.p3151p.$$Lambda$c$Zmj_F2SblaXLp4DuR8bALMMAQxQ */
            public final /* synthetic */ VideoChatInMeetingInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C62614c.this.m244941a((C62614c) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244941a(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        for (AbstractC62612a.AbstractC62613a aVar : this.f157620a) {
            if (aVar != null) {
                aVar.mo216425a(videoChatInMeetingInfo);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: b */
    public final void mo216411b(boolean z) {
        mo216433a(z, (Intent) null);
    }

    /* renamed from: b */
    private void m244944b(Intent intent) {
        C60700b.m235851b("ShareScreenControl", "[startAudioCaptureNow]", "startAudioCaptureNow");
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                UICallbackExecutor.removeCallbacks(this.f157624e);
                C61237h.m238223a().mo210497a(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C62614c(C61303k kVar) {
        super(kVar);
        mo216435o();
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: a */
    public void mo216399a(int i) {
        if (this.mMeeting.mo212056e() == null || this.mMeeting.mo212056e().getVideoChatSettings() == null || this.mMeeting.mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE || !this.mMeeting.mo212056e().getVideoChatSettings().isBoxSharing()) {
            C60700b.m235851b("ShareScreenControl", "[changeCaptureFpsForShareBox]", "not share box , fps = " + i + "");
            return;
        }
        this.f157631l = i;
        if (!mo216408a()) {
            C60700b.m235851b("ShareScreenControl", "[changeCaptureFps]", "share screen not start, only remember new fps = " + i + "");
            return;
        }
        C60700b.m235851b("ShareScreenControl", "[changeCaptureFps]", "fps = " + i + "");
        int i2 = UIHelper.getResources().getConfiguration().orientation;
        if (i2 == 2) {
            mo216432a(true, this.f157631l);
        } else if (i2 == 1) {
            mo216432a(false, this.f157631l);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: a */
    public void mo216402a(AbstractC62612a.AbstractC62613a aVar) {
        this.f157620a.remove(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244942a(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        if (z) {
            Intent p = mo216436p();
            if (p == null) {
                C60700b.m235864f("ShareScreenControl", "[startAudioCapture2]", "intent is null");
                return;
            }
            this.f157625f.set(true);
            m244944b(p);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a
    /* renamed from: a */
    public void mo216403a(AbstractC62612a.AbstractC62613a aVar, Activity activity) {
        this.f157620a.add(aVar);
        this.f157627h = new WeakReference<>(activity);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            mH().removeCallbacksAndMessages(null);
            mo216414d();
        }
    }

    /* renamed from: a */
    private void m244940a(Intent intent, int i, int i2) {
        C60700b.m235851b("ShareScreenControl", "[startScreenCapturer]", "startScreenCapturer");
        try {
            if (!(this.mMeeting.mo212056e() == null || this.mMeeting.mo212056e().getVideoChatSettings() == null || this.mMeeting.mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE)) {
                C63766o.m250329b(this.mMeeting.mo212056e(), this.f157623d, this.mMeeting.mo212093K());
            }
            C61237h.m238223a().mo210498a(intent, i, i2, 20, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C61237h.m238223a().mo210507a(new AbstractC61023b() {
            /* class com.ss.android.vc.meeting.module.p3151p.$$Lambda$c$Uep5C6ItblDO9fFYaMOlj3e3U4 */

            @Override // com.ss.android.vc.irtc.AbstractC61023b
            public final void onStop() {
                C62614c.this.m244953y();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m244943b(final int i, final int i2, final Intent intent) {
        if (i != 100) {
            return;
        }
        if (i2 == -1) {
            C60700b.m235851b("ShareScreenControl", "[onActivityResult]", "screen share request confirm");
            mo216431a(intent);
            this.f157622c.set(true);
            VcBizSender.m249234b(getMeeting().mo212055d(), m244948t(), true).mo219893b(new AbstractC63598b<as>() {
                /* class com.ss.android.vc.meeting.module.p3151p.C62614c.C626151 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m244988a() {
                    for (AbstractC62612a.AbstractC62613a aVar : C62614c.this.f157620a) {
                        if (aVar != null) {
                            aVar.mo216424a();
                        }
                    }
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("ShareScreenControl", "[execShareScreenRequest]", "[onError] errorCode: " + eVar.mo219899a() + " errorMsg: " + eVar.mo219902b());
                    C62614c.this.f157622c.set(false);
                }

                /* renamed from: a */
                public void onSuccess(as asVar) {
                    C60700b.m235851b("ShareScreenControl", "[execShareScreenRequest]", "success");
                    if (asVar != null) {
                        C62614c.this.f157623d = asVar.f152658a;
                    }
                    if (!(C62614c.this.mMeeting.mo212056e() == null || C62614c.this.mMeeting.mo212056e().getVideoChatSettings() == null || C62614c.this.mMeeting.mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE)) {
                        C63766o.m250326a(C62614c.this.mMeeting.mo212056e(), C62614c.this.f157623d, C62614c.this.mMeeting.mo212093K());
                    }
                    C62614c.this.f157621b.set(true);
                    C62614c.this.mo216430a(i, i2, intent);
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.vc.meeting.module.p3151p.$$Lambda$c$1$trAZ_bTlwgaNRVQvXgtJNJ6V3s */

                        public final void run() {
                            C62614c.C626151.this.m244988a();
                        }
                    });
                    if (!(C62614c.this.mMeeting.mo212056e() == null || C62614c.this.mMeeting.mo212056e().getVideoChatSettings() == null || C62614c.this.mMeeting.mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.DEFAULT)) {
                        C60738ac.m236039c(UIHelper.getString(R.string.View_G_ParticipantsCanViewYourScreen_Toast));
                    }
                    if (C62614c.this.mMeeting.ak().mo217756b()) {
                        C62614c.this.mMeeting.ak().mo217760f();
                    }
                    C62614c.this.mo216434n();
                }
            });
            return;
        }
        C60700b.m235851b("ShareScreenControl", "[onActivityResult2]", "screen share request cancel");
        if (this.mMeeting.ak().mo217756b()) {
            this.mMeeting.ak().mo217760f();
        }
        VideoChat e = this.mMeeting.mo212056e();
        if (e != null && e.getVideoChatSettings() != null && e.getVideoChatSettings().getSubType() == VideoChatSettings.SubType.SCREEN_SHARE) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.vc.meeting.module.p3151p.$$Lambda$c$nQQdvvp0nTjNPT30pCU3utUspxg */

                public final void run() {
                    C62614c.this.m244939A();
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        long j;
        MeetingAudioManager.AudioType y = MeetingAudioManager.m239471k().mo212720y();
        boolean z3 = MeetingAudioManager.m239471k().mo212721z();
        C60700b.m235851b("ShareScreenControl", "[onAudioStateChanged]", "type=" + y + ", lastType=" + audioType + ", lastOutSpeaker=" + z + ", outSpeaker=" + z3);
        if (!(audioType == y && z == z3) && this.f157622c.get() && this.f157625f.get()) {
            UICallbackExecutor.removeCallbacks(this.f157624e);
            Runnable runnable = this.f157624e;
            if (audioType != y) {
                j = 500;
            } else {
                j = 300;
            }
            UICallbackExecutor.executeDelayed(runnable, j);
        }
    }

    /* renamed from: a */
    public final void mo216429a(int i, int i2, int i3) {
        C60700b.m235851b("ShareScreenControl", "[changeCapturerFormat]", "changeCapturerFormat");
        try {
            C61237h.m238223a().mo210490a(i, i2, i3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo216430a(int i, int i2, Intent intent) {
        if (Build.VERSION.SDK_INT > 28) {
            ForegroundService.m241665a(intent, C60776r.m236143a(this.f157627h.get()), mo216422l());
            return;
        }
        C60776r.C60777a a = C60776r.m236140a(this.mMeeting);
        if (C60776r.m236143a(this.f157627h.get())) {
            m244940a(intent, a.f151975a, a.f151976b);
        } else {
            m244940a(intent, a.f151976b, a.f151975a);
        }
    }
}
