package com.ss.android.lark.voip.service.impl.app;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.ScreenStateManager;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.http.netstate.AbstractC38769a;
import com.ss.android.lark.http.netstate.C38770b;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57858o;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.AbstractC58002c;
import com.ss.android.lark.voip.service.AbstractC58003d;
import com.ss.android.lark.voip.service.impl.C58004a;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.C58076j;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.lark.voip.service.impl.app.C58120p;
import com.ss.android.lark.voip.service.impl.p2914b.C58142b;
import com.ss.android.lark.voip.service.impl.p2915c.C58147d;
import com.ss.android.lark.voip.service.impl.p2915c.C58149g;
import com.ss.android.lark.voip.service.impl.service.C58170b;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.statistics.CalleeToCallTimeClockEvent;
import com.ss.android.lark.voip.service.impl.statistics.JoinToStreamEvent;
import com.ss.android.lark.voip.service.impl.statistics.KeypairFailEvent;
import com.ss.android.lark.voip.service.impl.statistics.OnCallToStreamEvent;
import com.ss.android.lark.voip.service.impl.statistics.VoipFinishType;
import com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint;
import com.ss.android.lark.voip.service.impl.util.VoIPAudioManager;
import com.ss.android.lark.voip.service.impl.util.VoipUtil;
import com.ss.android.vc.irtc.AbstractC61058j;
import com.ss.android.vc.irtc.C61022a;
import com.ss.android.vc.irtc.RtcNetworkQualityInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.voip.service.impl.app.o */
public class C58103o {

    /* renamed from: a */
    public C58076j f142918a;

    /* renamed from: b */
    public C58120p f142919b;

    /* renamed from: c */
    public Context f142920c;

    /* renamed from: d */
    public C57744a f142921d;

    /* renamed from: e */
    public long f142922e;

    /* renamed from: f */
    public long f142923f;

    /* renamed from: g */
    public BroadcastReceiver f142924g;

    /* renamed from: h */
    public BroadcastReceiver f142925h;

    /* renamed from: i */
    public ScreenStateManager.AbstractC26243a f142926i;

    /* renamed from: j */
    public C58147d f142927j;

    /* renamed from: k */
    public C61022a f142928k;

    /* renamed from: l */
    public C58120p.AbstractC58126a f142929l;

    /* renamed from: m */
    public AbstractC58117b f142930m;

    /* renamed from: n */
    public List<AbstractC58002c> f142931n;

    /* renamed from: o */
    private C58127q f142932o;

    /* renamed from: p */
    private AbstractC57987d.AbstractC57988a f142933p;

    /* renamed from: q */
    private volatile boolean f142934q;

    /* renamed from: r */
    private C58118c f142935r;

    /* renamed from: s */
    private AbstractC58003d f142936s;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.voip.service.impl.app.o$a */
    public static final class C58116a {

        /* renamed from: a */
        public static final C58103o f142959a = new C58103o();
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.o$b */
    public interface AbstractC58117b {
        /* renamed from: a */
        void mo196668a(String str, RtcNetworkQualityInfo rtcNetworkQualityInfo);
    }

    /* renamed from: h */
    public void mo196951h() {
        this.f142930m = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.voip.service.impl.app.o$c */
    public class C58118c extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks, C58170b.AbstractC58172b {

        /* renamed from: a */
        public Context f142960a;

        /* renamed from: c */
        private boolean f142962c;

        /* renamed from: d */
        private Handler f142963d;

        /* renamed from: e */
        private final Runnable f142964e = new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.app.C58103o.C58118c.RunnableC581191 */

            public void run() {
                if (VoipUtil.m225809d() && VoipUtil.m225810e() != null) {
                    C58118c.this.f142960a.startActivity(VoipUtil.m225810e());
                    VoipUtil.m225812g();
                }
            }
        };

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onReceive(Context context, Intent intent) {
        }

        /* renamed from: b */
        public boolean mo196978b() {
            return this.f142962c;
        }

        /* renamed from: a */
        public void mo196976a() {
            C58151d.m225578a("ui", "ui", "destroy VoIpEngineControllerLifeCycle", "[VoIPFloatIcon] destroy VoIpEngineControllerLifeCycle");
            ((Application) this.f142960a).unregisterActivityLifecycleCallbacks(this);
            C58170b.m225706a().mo197129b(this);
        }

        @Override // com.ss.android.lark.voip.service.impl.service.C58170b.AbstractC58172b
        /* renamed from: a */
        public void mo196977a(boolean z) {
            this.f142962c = z;
        }

        public void onActivityStarted(Activity activity) {
            this.f142963d.removeCallbacks(this.f142964e);
            if (VoipUtil.m225810e() != null) {
                this.f142963d.postDelayed(this.f142964e, 100);
            }
        }

        public C58118c(Context context) {
            this.f142960a = context;
            this.f142962c = C57977a.m224905c().isAppRealForeground();
            this.f142963d = new Handler(Looper.getMainLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            C58170b.m225706a().mo197127a(this);
        }
    }

    /* renamed from: a */
    public static C58103o m225371a() {
        return C58116a.f142959a;
    }

    /* renamed from: f */
    public AbstractC58046e mo196949f() {
        return this.f142919b;
    }

    /* renamed from: g */
    public C58147d mo196950g() {
        return this.f142927j;
    }

    /* renamed from: a */
    public synchronized boolean mo196936a(Context context) {
        if (this.f142934q) {
            C58151d.m225578a("ui", "ui", "init rtc engine has been done", "[VoIpEngineController] initRtcEngine: init rtc engine has been done");
            return true;
        }
        this.f142920c = context.getApplicationContext();
        C58151d.m225578a("ui", "ui", "init rtc engine", "[VoIpEngineController] initRtcEngine");
        if (!this.f142927j.mo197051a(context)) {
            C58151d.m225579b("ui", "ui", "init rtc engine failure", "[VoIpEngineController] initRtcEngine: failure, RtcEngineCompatible not init success");
            return false;
        }
        mo196939b(context);
        mo196943c();
        m225372e(context);
        C38770b.m153078a().mo142127a(new AbstractC38769a() {
            /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581118 */

            @Override // com.ss.android.lark.http.netstate.AbstractC38769a
            public void onNetworkStateChange(NetworkUtils.NetworkType networkType) {
                if (networkType == NetworkUtils.NetworkType.NONE) {
                    C58151d.m225578a("rust", "ui", "unavailable network", "[VoIpEngineController] onNetworkStateChange: unavailable");
                }
            }
        });
        this.f142935r = new C58118c(context.getApplicationContext());
        if (this.f142919b == null) {
            C58120p pVar = new C58120p();
            this.f142919b = pVar;
            pVar.mo196989a(this.f142929l);
            this.f142932o = new C58127q(this.f142919b);
        }
        this.f142934q = true;
        return true;
    }

    /* renamed from: a */
    public boolean mo196937a(Context context, VoiceCall voiceCall) {
        if (!C58133t.m225481b(voiceCall)) {
            C58151d.m225579b("ui", "ui", "goto voip call interface fail", "[VoIpEngineController] gotoVoipCallInterface: current voice call is invalid");
            return false;
        }
        String fromUserId = voiceCall.getFromUserId();
        if (TextUtils.equals(voiceCall.getFromUserId(), C57977a.m224905c().getUserId())) {
            fromUserId = voiceCall.getToUserId();
        }
        Chatter a = this.f142933p.mo145503a(fromUserId);
        boolean equals = TextUtils.equals(voiceCall.getFromUserId(), C57977a.m224905c().getUserId());
        Intent intent = new Intent(context, VoIpCallActivity.class);
        intent.putExtra("voip_user_info", a);
        intent.putExtra("voip_initiative_call", equals);
        intent.putExtra("voip_call_info", voiceCall);
        intent.addFlags(268435456);
        boolean b = VoipUtil.m225806b();
        boolean b2 = this.f142935r.mo196978b();
        boolean a2 = C51327f.m199081a(context, "android.permission.SYSTEM_ALERT_WINDOW");
        if (VoipUtil.m225809d()) {
            if (!b) {
                VoipUtil.m225803a();
                VoipUtil.m225804a(intent, equals, voiceCall.getId(), a);
            } else if (!b2 && !a2) {
                VoipUtil.m225804a(intent, equals, voiceCall.getId(), a);
            }
        }
        C58151d.m225578a("ui", "ui", "goto voip call interface", "[VoIpEngineController] gotoVoipCallInterface VoipUtil.isScreenOn() = " + b + " isAppForeground = " + b2 + " alertWindowPermission = " + a2);
        if (!b2) {
            try {
                PendingIntent.getActivity(context, (int) SystemClock.uptimeMillis(), intent, 134217728).send();
                C58151d.m225578a("ui", "ui", "goto voip call interface", "[VoIpEngineController] gotoVoipCallInterface pendingIntent send");
            } catch (Exception unused) {
                C58151d.m225578a("ui", "ui", "goto voip call interface", "[VoIpEngineController] gotoVoipCallInterface exception intent send");
                context.startActivity(intent);
            }
            return true;
        }
        C58151d.m225578a("ui", "ui", "goto voip call interface", "[VoIpEngineController] gotoVoipCallInterface intent send");
        context.startActivity(intent);
        return true;
    }

    /* renamed from: i */
    public boolean mo196952i() {
        C58076j jVar = this.f142918a;
        boolean z = false;
        if (jVar == null) {
            return false;
        }
        AbstractC58040c a = jVar.mo196846a();
        if (a == null || (a instanceof C58076j.C58080d) || (a instanceof C58076j.C58079c) || (a instanceof C58076j.C58086j)) {
            z = true;
        }
        return !z;
    }

    /* renamed from: b */
    public void mo196938b() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("[VoIpEngineController] unInit: model = ");
        if (this.f142919b != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C58151d.m225578a("ui", "ui", "un init", sb.toString());
        C58120p pVar = this.f142919b;
        if (pVar != null) {
            pVar.mo196996d();
        }
        C58118c cVar = this.f142935r;
        if (cVar != null) {
            cVar.mo196976a();
            this.f142935r = null;
        }
        this.f142934q = false;
    }

    /* renamed from: d */
    public void mo196946d() {
        C58151d.m225578a("ui", "ui", "removeConferenceSP", "[VoIpEngineController] removeConferenceSP");
        C57744a.m224104a().remove("is_valid_call");
        C57744a.m224104a().remove("conference_id");
        C57744a.m224104a().remove("is_caller");
        C57744a.m224104a().remove("isBytertc");
    }

    private C58103o() {
        this.f142933p = C57977a.m224905c().getChatDependency();
        this.f142921d = C57744a.m224104a();
        this.f142934q = false;
        this.f142924g = new BroadcastReceiver() {
            /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581041 */

            public void onReceive(Context context, Intent intent) {
                if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction()) && intent.hasExtra("state")) {
                    if (intent.getIntExtra("state", 0) == 0) {
                        VoIPAudioManager.m225760a().mo197197l();
                    } else if (intent.getIntExtra("state", 0) == 1) {
                        VoIPAudioManager.m225760a().mo197196k();
                    }
                }
            }
        };
        this.f142925h = new BroadcastReceiver() {
            /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581074 */

            public void onReceive(Context context, Intent intent) {
                if (intent != null && intent.getAction() != null) {
                    String action = intent.getAction();
                    if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                        if (intExtra == 2) {
                            VoIPAudioManager.m225760a().mo197183a((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
                        } else if (intExtra == 0) {
                            VoIPAudioManager.m225760a().mo197199n();
                        }
                    } else if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                        VoIPAudioManager.m225760a().mo197183a((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
                    } else if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        VoIPAudioManager.m225760a().mo197199n();
                    } else if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 10) {
                        VoIPAudioManager.m225760a().mo197199n();
                    }
                }
            }
        };
        this.f142926i = new ScreenStateManager.AbstractC26243a() {
            /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581085 */

            @Override // com.larksuite.framework.utils.ScreenStateManager.AbstractC26243a
            /* renamed from: a */
            public void mo93353a() {
                C58151d.m225578a("ui", "ui", "Screen On", "[VoIpEngineController] onScreenOn: screen on");
            }

            @Override // com.larksuite.framework.utils.ScreenStateManager.AbstractC26243a
            /* renamed from: b */
            public void mo93354b() {
                VoiceCall a;
                C58151d.m225578a("ui", "ui", "Screen Off", "[VoIpEngineController] onScreenOff: screen off");
                if (C58103o.this.f142919b != null && (a = C58103o.this.f142919b.mo196802a()) != null && !C58133t.m225480a(a) && a.getStatus() == VoiceCall.Status.RINGING) {
                    C58151d.m225578a("ui", "ui", "Screen Off ", "[VoIpEngineController] onScreenOff: stop Ringing screen off");
                    C58090k.m225318a(C58103o.this.f142920c).mo196905e();
                    C58090k.m225318a(C58103o.this.f142920c).mo196907g();
                }
            }
        };
        this.f142927j = new C58147d();
        this.f142928k = new C61022a() {
            /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581096 */

            /* renamed from: a */
            long f142948a;

            @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
            /* renamed from: c */
            public void mo196965c() {
                super.mo196965c();
                C58151d.m225578a("rtc_engine", "ui", "onConnectionLostUser", "[VoIpEngineController] onConnectionLostUser");
            }

            @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
            /* renamed from: a */
            public void mo196959a() {
                super.mo196959a();
                C58151d.m225578a("rtc_engine", "ui", "onConnectionLost", "[VoIpEngineController] onConnectionLost");
                C58103o.this.mo196927a(1);
            }

            @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
            /* renamed from: b */
            public void mo196964b() {
                super.mo196964b();
                C58151d.m225578a("rtc_engine", "ui", "onConnectionInterrupted", "[VoIpEngineController] onConnectionInterrupted");
            }

            @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
            /* renamed from: a */
            public void mo196961a(String str) {
                C58151d.m225578a("rtc_engine", "state_machine", "get first remote audio frame uid = " + str, "[VoIpEngineController] onFirstRemoteAudioFrame: uid = " + str);
                if (!C57744a.m224104a().getBoolean("is_in_meeting", false)) {
                    VoiceCall a = C58103o.this.f142919b.mo196802a();
                    if (a.isUseByteDanceChannel()) {
                        boolean a2 = C58133t.m225480a(a);
                        C57744a.m224104a().putBoolean("is_in_meeting", true);
                        VoipHitPoint.m225602a(C58103o.this.f142927j.mo197048a().mo197044c());
                        VoipHitPoint.m225623b(a.getId(), a2);
                        JoinToStreamEvent.m225585a(a.getId(), a2);
                        OnCallToStreamEvent.m225589a(a.getId(), a2);
                    } else {
                        C58151d.m225578a("rtc_engine", "state_machine", "not using byte rtc engine", "[VoIpEngineController] onFirstRemoteAudioFrame: using ByteRtcEngine");
                    }
                }
                C58103o.this.f142918a.mo196865d(12);
                if (C58136v.m225487f().mo197019c()) {
                    C58103o.this.f142929l.mo196971b(true);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m225404b(String str, RtcNetworkQualityInfo rtcNetworkQualityInfo) {
                if (C58103o.this.f142930m != null) {
                    C58103o.this.f142930m.mo196668a(str, rtcNetworkQualityInfo);
                }
            }

            @Override // com.ss.android.vc.irtc.C61022a
            /* renamed from: a */
            public void mo196960a(long j, long j2) {
                Log.m165379d("VoIpEngineController", "[onRtcStats] rxBytes = " + j + ", txBytes = " + j2);
                C58103o.this.f142922e = j;
                C58103o.this.f142923f = j2;
            }

            @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
            /* renamed from: a */
            public void mo196962a(String str, RtcNetworkQualityInfo rtcNetworkQualityInfo) {
                C58151d.m225578a("rtc_engine", "ui", "network quality info = " + rtcNetworkQualityInfo.f152893d, "[VoIpEngineController] onNetworkQuality: uid = " + str + ", quality = " + rtcNetworkQualityInfo.f152893d);
                int i = rtcNetworkQualityInfo.f152893d;
                long currentTimeMillis = System.currentTimeMillis();
                VoiceCall a = C58103o.this.f142919b.mo196802a();
                if (currentTimeMillis - this.f142948a >= 1000 && C58075i.m225283a(i) && a != null) {
                    this.f142948a = currentTimeMillis;
                    UICallbackExecutor.execute(new Runnable(str, rtcNetworkQualityInfo) {
                        /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$o$6$oE7salAlaVfoBDF8fZkjEIFnh6E */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ RtcNetworkQualityInfo f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C58103o.C581096.this.m225404b((C58103o.C581096) this.f$1, (String) this.f$2);
                        }
                    });
                }
            }

            @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
            /* renamed from: a */
            public void mo196963a(String str, String str2) {
                C58151d.m225578a("rtc_engine", "state_machine", "join channel success channel = " + str, "[VoIpEngineController] onJoinChannelSuccess: channel = " + str + ", uid = " + str2);
                VoiceCall a = C58103o.this.f142919b.mo196802a();
                C58004a.m224999b(a.getId(), C58103o.this.f142927j.mo197048a().mo197044c(), System.currentTimeMillis());
                VoipHitPoint.m225622b(C58103o.this.f142927j.mo197048a().mo197044c(), a.getId(), C58133t.m225480a(a));
                JoinToStreamEvent.m225584a();
            }
        };
        this.f142929l = new C58120p.AbstractC58126a() {
            /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581107 */

            @Override // com.ss.android.lark.voip.service.impl.app.C58120p.AbstractC58126a
            /* renamed from: c */
            public void mo196972c(boolean z) {
            }

            @Override // com.ss.android.lark.voip.service.impl.app.C58120p.AbstractC58126a
            /* renamed from: a */
            public void mo196966a() {
                C58103o.this.f142918a.mo196865d(14);
            }

            @Override // com.ss.android.lark.voip.service.impl.app.C58120p.AbstractC58126a
            /* renamed from: a */
            public void mo196968a(VoiceCall voiceCall) {
                C58103o.this.mo196945c(voiceCall);
            }

            @Override // com.ss.android.lark.voip.service.impl.app.C58120p.AbstractC58126a
            /* renamed from: a */
            public void mo196970a(boolean z) {
                VoiceCall a = C58103o.this.f142919b.mo196802a();
                if (a != null) {
                    C58103o.this.f142927j.mo197049a(a).mo197037a(z);
                }
            }

            @Override // com.ss.android.lark.voip.service.impl.app.C58120p.AbstractC58126a
            /* renamed from: b */
            public void mo196971b(boolean z) {
                VoiceCall a = C58103o.this.f142919b.mo196802a();
                if (a != null) {
                    C58103o.this.f142927j.mo197049a(a).mo197045c(z);
                }
            }

            @Override // com.ss.android.lark.voip.service.impl.app.C58120p.AbstractC58126a
            /* renamed from: a */
            public void mo196969a(VoiceCall voiceCall, int i) {
                C58151d.m225578a("rtc_engine", "ui", "onQualityChanged quality = " + i, "[VoIpEngineController] onQualityChanged: quality = " + i);
            }

            @Override // com.ss.android.lark.voip.service.impl.app.C58120p.AbstractC58126a
            /* renamed from: a */
            public void mo196967a(ErrorResult errorResult, VoiceCall voiceCall) {
                C58151d.m225579b("ui", "ui", "process call error " + errorResult.getDebugMsg(), "[VoIpEngineController] onCallError: errCode = " + errorResult.getErrorCode());
                if (!TextUtils.equals(voiceCall.getId(), C58103o.this.f142919b.mo196802a().getId())) {
                    C58151d.m225579b("ui", "ui", "process call error interrupt for same id", "[VoIpEngineController] onCallError: voiceCall id equals currentCall id");
                    return;
                }
                if (errorResult.getErrorCode() == 900406) {
                    voiceCall.setStatus(VoiceCall.Status.CLIENT_LOW_VERSION);
                } else {
                    voiceCall.setStatus(VoiceCall.Status.TERMINATED);
                }
                C58103o.this.f142919b.mo196990a(voiceCall);
                C58103o.this.mo196945c(voiceCall);
            }
        };
        this.f142931n = new CopyOnWriteArrayList();
    }

    /* renamed from: c */
    public void mo196943c() {
        if (C57744a.m224104a().getBoolean("is_valid_call")) {
            C58151d.m225578a("ui", "ui", "reportExceptionalVoIP: has ExceptionalVoIP", "[VoIpEngineController] reportExceptionalVoIP: has ExceptionalVoIP, voiceCall id = " + C57744a.m224104a().getString("conference_id") + ", isCaller = " + C57744a.m224104a().getBoolean("is_caller"));
            VoipHitPoint.m225639i(C57744a.m224104a().getString("conference_id"), C57744a.m224104a().getBoolean("is_caller"));
            mo196946d();
            C57744a.m224104a().remove("is_in_meeting");
            return;
        }
        C58151d.m225578a("ui", "ui", "reportExceptionalVoIP has no ExceptionalVoIP", "[VoIpEngineController] reportExceptionalVoIP: has no ExceptionalVoIP");
    }

    /* renamed from: e */
    public void mo196948e() {
        C58151d.m225578a("ui", "rtc_engine", "leave channel", "[VoIpEngineController] leaveChannel: thread = " + Thread.currentThread().getName());
        this.f142927j.mo197048a().mo197035a();
        AbstractC58003d dVar = this.f142936s;
        if (dVar != null) {
            dVar.onRtcStats(this.f142922e, this.f142923f);
        }
        Log.m165389i("VoIpEngineController", "[leaveChannel] [onRtcStats] rxBytes = " + this.f142922e + ", txBytes = " + this.f142923f);
        this.f142923f = 0;
        this.f142922e = 0;
    }

    /* renamed from: a */
    public void mo196929a(AbstractC58002c cVar) {
        this.f142931n.add(cVar);
    }

    /* renamed from: a */
    public void mo196930a(AbstractC58003d dVar) {
        this.f142936s = dVar;
    }

    /* renamed from: e */
    private void m225372e(final Context context) {
        if (this.f142918a == null) {
            this.f142918a = new C58076j(C58090k.m225318a(context.getApplicationContext()), new C58076j.AbstractC58085i() {
                /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581129 */

                @Override // com.ss.android.lark.voip.service.impl.app.C58076j.AbstractC58085i
                /* renamed from: e */
                public void mo196899e() {
                    C58151d.m225578a("state_machine", "ui", "onTimingWaitTimeout", "[VoIpEngineController] initStateMachine: onTimingWaitTimeout");
                    UICallbackExecutor.execute(new Runnable(context) {
                        /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$o$9$1FwpFp0hpCgy3II9Iui60BDbEk */
                        public final /* synthetic */ Context f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            VoipForegroundService.m225128a(this.f$0);
                        }
                    });
                    C58103o.this.mo196934a("onTimingWaitTimeout");
                }

                @Override // com.ss.android.lark.voip.service.impl.app.C58076j.AbstractC58085i
                /* renamed from: d */
                public void mo196898d() {
                    C58151d.m225578a("state_machine", "ui", "accepted call", "[VoIpEngineController] initStateMachine: onAcceptedCall");
                    VoiceCall a = C58103o.this.f142919b.mo196802a();
                    boolean a2 = C58133t.m225480a(a);
                    if (VoIPAudioManager.m225760a().mo197192g() && !a2 && !DesktopUtil.m144307b()) {
                        VoIPAudioManager.m225760a().mo197185a(true);
                    }
                    C58103o.this.mo196932a(a);
                    EventBus.getDefault().trigger(new C58039b(a));
                }

                @Override // com.ss.android.lark.voip.service.impl.app.C58076j.AbstractC58085i
                /* renamed from: b */
                public void mo196895b() {
                    final VoiceCall a = C58103o.this.f142919b.mo196802a();
                    final boolean a2 = C58133t.m225480a(a);
                    C58151d.m225578a("state_machine", "ui", "end call", "[VoIpEngineController] initStateMachine: onEndCall");
                    KeypairFailEvent.m225586a();
                    C58103o oVar = C58103o.this;
                    oVar.mo196941b(oVar.f142928k);
                    try {
                        context.unregisterReceiver(C58103o.this.f142924g);
                        context.unregisterReceiver(C58103o.this.f142925h);
                    } catch (IllegalArgumentException unused) {
                        C58151d.m225578a("state_machine", "ui", "catch unregisterReceiver Exception", "[VoIpEngineController] initStateMachine: catch unregisterReceiver Exception");
                    }
                    C57744a.m224104a().remove("is_in_meeting");
                    ScreenStateManager.m94968a().mo93351b(context, C58103o.this.f142926i);
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581129.RunnableC581131 */

                        public void run() {
                            VoiceCall voiceCall;
                            VoiceCall voiceCall2;
                            VoiceCall voiceCall3;
                            C58151d.m225578a("ui", "ui", "show end toast", "[VoIpEngineController] initStateMachine: onEndCall showEndToast");
                            VoipForegroundService.m225128a(context);
                            VoIpDialogHelper.m225111a().mo196766e();
                            if (VoIPFloatIcon.m225001a().mo196672b()) {
                                VoIPFloatIcon.m225001a().mo196677g();
                                C58103o.this.mo196947d(context);
                            } else {
                                VoIPFloatIcon.m225001a().mo196678h();
                            }
                            if (!a2 && (voiceCall3 = a) != null && voiceCall3.getStatus() == VoiceCall.Status.CANCELLED) {
                                LKUIToast.show(context, (int) R.string.View_G_CallCanceled, 1000L);
                            } else if (a2 && (voiceCall2 = a) != null && voiceCall2.getStatus() == VoiceCall.Status.REFUSED) {
                                LKUIToast.show(context, (int) R.string.View_G_CallDeclined, 1000L);
                            } else if (!a2 || (voiceCall = a) == null || voiceCall.getStatus() != VoiceCall.Status.OCCUPIED) {
                                VoiceCall voiceCall4 = a;
                                if (voiceCall4 == null || voiceCall4.getStatus() != VoiceCall.Status.TERMINATED || !"1".equals(a.getTerminateReason())) {
                                    LKUIToast.show(context, (int) R.string.View_G_CallEnded, 1000L);
                                } else {
                                    LKUIToast.show(context, (int) R.string.View_A_UnstableConnectionDisconnected, 1000L);
                                }
                            } else {
                                LKUIToast.show(context, (int) R.string.View_AM_Unavailable, 1000L);
                            }
                        }
                    });
                    JSONObject jSONObject = (JSONObject) C58103o.this.f142921d.getJSONObject("voip_call_oncallLoading", JSONObject.class);
                    if (jSONObject != null) {
                        jSONObject.remove(a.getId());
                    }
                    JSONObject jSONObject2 = (JSONObject) C58103o.this.f142921d.getJSONObject("voip_call_receiveduration", JSONObject.class);
                    if (jSONObject2 != null) {
                        jSONObject2.remove(a.getId());
                    }
                    C58103o.this.f142919b.mo196995c(false);
                    C58103o.this.f142919b.mo196807a(false);
                    C58103o.this.f142919b.mo196997d(false);
                    VoIPAudioManager.m225760a().mo197190e();
                    for (AbstractC58002c cVar : C58103o.this.f142931n) {
                        cVar.mo196521b();
                    }
                    C58103o.this.mo196948e();
                }

                @Override // com.ss.android.lark.voip.service.impl.app.C58076j.AbstractC58085i
                /* renamed from: c */
                public void mo196897c() {
                    C58151d.m225578a("state_machine", "ui", "unavailable", "[VoIpEngineController] initStateMachine: onUnavailable");
                    VoiceCall a = C58103o.this.f142919b.mo196802a();
                    if (a != null) {
                        VoipHitPoint.m225616a(a.getId(), C58133t.m225480a(a), "timeout", false, a.isUseByteDanceChannel(), null);
                        VoipHitPoint.m225615a(a.getId(), C58133t.m225480a(a), "missedCall", false, (JSONObject) null);
                        C58151d.m225578a("ui", "rust", "update unavailable status id = " + a.getId(), "[VoIpEngineController] onUnavailable: voiceCall = " + a.toString());
                        C58103o.this.f142919b.mo196803a(a, VoiceCall.Status.UNAVAILABLE, (IGetDataCallback<String>) new IGetDataCallback<String>() {
                            /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581129.C581142 */

                            /* renamed from: a */
                            public void onSuccess(String str) {
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                            }
                        }, true);
                        try {
                            VoiceCall voiceCall = new VoiceCall(a);
                            voiceCall.setStatus(VoiceCall.Status.UNAVAILABLE);
                            EventBus.getDefault().trigger(new C58039b(voiceCall));
                            if (!C58133t.m225480a(voiceCall)) {
                                C57977a.m224905c().getNotificationDependency().mo145489a(voiceCall.getId(), voiceCall.getFromUserId());
                            }
                        } catch (Exception unused) {
                        }
                        UICallbackExecutor.execute(new Runnable() {
                            /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581129.RunnableC581153 */

                            public void run() {
                                C58151d.m225578a("ui", "ui", "dismiss float toast when unavailable", "[VoIpEngineController] initStateMachine: onUnavailable dismiss float toast");
                                VoipForegroundService.m225128a(context);
                                VoIPFloatIcon.m225001a().mo196678h();
                                VoIpDialogHelper.m225111a().mo196766e();
                            }
                        });
                    }
                }

                @Override // com.ss.android.lark.voip.service.impl.app.C58076j.AbstractC58085i
                /* renamed from: a */
                public void mo196892a() {
                    C58151d.m225578a("state_machine", "ui", "begin call", "[VoIpEngineController] initStateMachine: onBeginCall");
                    C58103o oVar = C58103o.this;
                    oVar.mo196933a(oVar.f142928k);
                    ScreenStateManager.m94968a().mo93349a(context, C58103o.this.f142926i);
                    C58103o.this.f142919b.mo196995c(false);
                    C58103o.this.f142919b.mo196807a(false);
                    C58103o.this.f142919b.mo196997d(VoIPAudioManager.m225760a().mo197195j());
                    VoIPAudioManager.m225760a().mo197189d();
                    for (AbstractC58002c cVar : C58103o.this.f142931n) {
                        cVar.mo196520a();
                    }
                    m225419a(context, C58103o.this.f142924g, new IntentFilter("android.intent.action.HEADSET_PLUG"));
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
                    intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                    intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_OFF");
                    intentFilter.addAction("android.bluetooth.BluetoothAdapter.STATE_ON");
                    m225419a(context, C58103o.this.f142925h, intentFilter);
                    VoiceCall a = C58103o.this.f142919b.mo196802a();
                    VoipForegroundService.m225129a(context, a);
                    if (a != null && !C58133t.m225480a(a)) {
                        VoIPAudioManager.m225760a().mo197185a(false);
                        C58103o.this.mo196937a(context, a);
                        C58151d.m225578a("ui", "rust", "update ringing status id = " + a.getId(), "[VoIpEngineController] onBeginCall: voiceCall = " + a.toString());
                        C58103o.this.f142919b.mo196803a(a, VoiceCall.Status.RINGING, (IGetDataCallback<String>) null, false);
                    }
                    EventBus.getDefault().trigger(new C58039b(a));
                }

                @Override // com.ss.android.lark.voip.service.impl.app.C58076j.AbstractC58085i
                /* renamed from: b */
                public void mo196896b(VoiceCall voiceCall) {
                    C58151d.m225578a("state_machine", "ui", "call terminated", "[VoIpEngineController] onTheCallStateTerminated: voiceCall = " + voiceCall.toString());
                    UICallbackExecutor.execute(new Runnable(context) {
                        /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$o$9$8GTjUljNUXLeYFxXLyJZqQk4X4 */
                        public final /* synthetic */ Context f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            VoipForegroundService.m225128a(this.f$0);
                        }
                    });
                    if (voiceCall != null) {
                        int a = VoipFinishType.m225595a(voiceCall.getId());
                        VoipFinishType.m225599a(voiceCall.getId(), C58133t.m225480a(voiceCall), a);
                        if (a == 1) {
                            VoipFinishType.m225598a(voiceCall.getId(), C58133t.m225480a(voiceCall));
                        }
                    }
                    VoipFinishType.m225596a();
                }

                @Override // com.ss.android.lark.voip.service.impl.app.C58076j.AbstractC58085i
                /* renamed from: a */
                public void mo196893a(long j) {
                    VoiceCall a = C58103o.this.f142919b.mo196802a();
                    if (a == null) {
                        C58151d.m225578a("state_machine", "ui", "update call time fail", "[VoIpEngineController] initStateMachine: updateCallTime fail with null currentCall");
                        return;
                    }
                    boolean a2 = C58133t.m225480a(a);
                    AbstractC57987d.AbstractC57996g settingDependency = C57977a.m224905c().getSettingDependency();
                    JSONObject jSONObject = (JSONObject) C58103o.this.f142921d.getJSONObject("voip_call_oncallLoading", JSONObject.class);
                    if (settingDependency != null && a2 && (jSONObject == null || !jSONObject.optBoolean(a.getId()))) {
                        long a3 = settingDependency.mo145507a();
                        if (a.getActionStartTime() != 0) {
                            long actionStartTime = a3 - a.getActionStartTime();
                            if (actionStartTime > 0) {
                                CalleeToCallTimeClockEvent.m225583b(a.getId(), actionStartTime);
                                if (jSONObject == null) {
                                    jSONObject = new JSONObject();
                                }
                                try {
                                    jSONObject.put(a.getId(), true);
                                } catch (JSONException unused) {
                                }
                                C58103o.this.f142921d.putJSONObject("voip_call_oncallLoading", jSONObject);
                            }
                        }
                    }
                    EventBus.getDefault().trigger(new C58130r(j, a.getId()));
                    VoIpDialogHelper.m225111a().mo196761a(j);
                }

                @Override // com.ss.android.lark.voip.service.impl.app.C58076j.AbstractC58085i
                /* renamed from: a */
                public void mo196894a(VoiceCall voiceCall) {
                    C58151d.m225578a("state_machine", "ui", "update call state update status = " + voiceCall.getStatus(), "[VoIpEngineController] initStateMachine: onCallStateUpdate voiceCall = " + voiceCall.toString());
                    EventBus.getDefault().trigger(new C58039b(voiceCall));
                    boolean a = C58133t.m225480a(voiceCall);
                    if (a && voiceCall.getStatus() == VoiceCall.Status.ON_THE_CALL) {
                        OnCallToStreamEvent.m225588a();
                    }
                    AbstractC57987d.AbstractC57996g settingDependency = C57977a.m224905c().getSettingDependency();
                    JSONObject jSONObject = (JSONObject) C58103o.this.f142921d.getJSONObject("voip_call_receiveduration", JSONObject.class);
                    if (voiceCall != null && voiceCall.getStatus() == VoiceCall.Status.RINGING && settingDependency != null) {
                        if ((jSONObject == null || !jSONObject.optBoolean(voiceCall.getId())) && !a) {
                            long a2 = settingDependency.mo145507a() - voiceCall.getActionStartTime();
                            if (a2 > 0) {
                                VoipHitPoint.m225604a(voiceCall.getId(), a2, voiceCall.isOffline());
                                if (jSONObject == null) {
                                    jSONObject = new JSONObject();
                                }
                                try {
                                    jSONObject.put(voiceCall.getId(), true);
                                } catch (JSONException unused) {
                                }
                                C58103o.this.f142921d.putJSONObject("voip_call_receiveduration", jSONObject);
                            }
                        }
                    }
                }

                @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
                /* renamed from: a */
                public static Intent m225419a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
                    try {
                        return context.registerReceiver(broadcastReceiver, intentFilter);
                    } catch (Exception e) {
                        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                            return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                        }
                        throw e;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo196931a(AbstractC58117b bVar) {
        this.f142930m = bVar;
    }

    /* renamed from: c */
    public void mo196944c(Context context) {
        if (VoIPFloatIcon.m225001a().mo196676f()) {
            C58151d.m225578a("ui", "ui", "float icon exist", "[VoIpEngineController] gotoVoIpEngineControllerIfNeed: isFloatIconExist is true");
            C57977a.m224905c().getMainDependency().mo145485a(context);
            return;
        }
        C58151d.m225578a("ui", "ui", "goto voip call interface", "[VoIpEngineController] gotoVoIpEngineControllerIfNeed: isFloatIconExist is false, gotoVoipCallInterface");
        mo196937a(context, this.f142919b.mo196802a());
    }

    /* renamed from: a */
    public void mo196933a(AbstractC61058j jVar) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("[VoIpEngineController] addRtcListener: listener = ");
        if (jVar != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C58151d.m225578a("ui", "rtc_engine", "add rtc listener", sb.toString());
        this.f142927j.mo197050a(jVar);
    }

    /* renamed from: b */
    public void mo196940b(VoiceCall voiceCall) {
        C58151d.m225578a("ui", "ui", "setConferenceSP", "[VoIpEngineController] setConferenceSP: voiceCall = " + voiceCall.toString());
        if (voiceCall != null) {
            C57744a.m224104a().putBoolean("is_valid_call", true);
            C57744a.m224104a().putString("conference_id", voiceCall.getId());
            C57744a.m224104a().putBoolean("is_caller", C58133t.m225480a(voiceCall));
            C57744a.m224104a().putBoolean("isBytertc", true);
        }
    }

    /* renamed from: d */
    public void mo196947d(Context context) {
        C58151d.m225578a("ui", "ui", "goto feedback if need", "[VoIpEngineController] gotoVoipFeedbackIfNeed");
        VoiceCall a = this.f142919b.mo196802a();
        if (a.getStatus() != VoiceCall.Status.TERMINATED) {
            C58151d.m225578a("ui", "ui", "goto feedback if need fail", "[VoIpEngineController] gotoVoipFeedbackIfNeed: current voice call is not terminated");
        } else {
            C57858o.m224559a(VoIpCallActivity.class).mo196057a("voip_call_info", a).mo196060a("voice_call_feed_back_mode", true).mo196051a(R.anim.fade_in, R.anim.fade_out).mo196064a(context);
        }
    }

    /* renamed from: a */
    public void mo196934a(final String str) {
        final VoiceCall a = this.f142919b.mo196802a();
        if (a != null) {
            VoipHitPoint.m225616a(a.getId(), C58133t.m225480a(a), str, false, a.isUseByteDanceChannel(), null);
            VoipFinishType.m225599a(a.getId(), C58133t.m225480a(a), 1);
            C58151d.m225578a("ui", "rust", str + " status id = " + a.getId(), "[VoIpEngineController] " + str + ": voiceCall = " + a.toString());
            this.f142919b.mo196803a(a, VoiceCall.Status.TERMINATED, (IGetDataCallback<String>) new IGetDataCallback<String>() {
                /* class com.ss.android.lark.voip.service.impl.app.C58103o.C581052 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    VoiceCall voiceCall = new VoiceCall(a);
                    voiceCall.setStatus(VoiceCall.Status.TERMINATED);
                    EventBus.getDefault().trigger(new C58039b(voiceCall));
                }
            }, true);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.voip.service.impl.app.C58103o.RunnableC581063 */

                public void run() {
                    C58151d.m225578a("ui", "ui", "dismiss float toast when " + str, "[VoIpEngineController] initStateMachine: " + str + " dismiss float toast");
                    VoIPFloatIcon.m225001a().mo196678h();
                    VoIpDialogHelper.m225111a().mo196766e();
                }
            });
        }
    }

    /* renamed from: b */
    public void mo196939b(Context context) {
        C58142b bVar = new C58142b(context);
        if (bVar.mo197028b().booleanValue()) {
            boolean z = C57744a.m224104a().getBoolean("is_caller", false);
            String string = C57744a.m224104a().getString("conference_id", "");
            boolean z2 = C57744a.m224104a().getBoolean("is_valid_call", false);
            boolean z3 = C57744a.m224104a().getBoolean("isBytertc", false);
            C58151d.m225578a("ui", "ui", "report crash case about voip", "[VoIpEngineController] reportCrashCase: has crashed, conferenceId = " + string + ", isCaller = " + z + ", isValidCall = " + z2 + ", isByteRTC = " + z3);
            VoipHitPoint.m225616a(string, z, "crash", z2, z3, null);
            VoipHitPoint.m225639i(string, z);
            bVar.mo197029c();
            mo196946d();
            C57744a.m224104a().remove("is_in_meeting");
            return;
        }
        C58151d.m225578a("ui", "ui", "report crash case has no crash", "[VoIpEngineController] reportCrashCase: has no crash");
    }

    /* renamed from: a */
    public void mo196927a(int i) {
        C58151d.m225578a("ui", "state_machine", "fire terminated with reason " + i, "[VoIpEngineController] fireTerminatedEvent: reason = " + i);
        final VoiceCall a = this.f142919b.mo196802a();
        if (a == null || !C58133t.m225481b(a)) {
            C58151d.m225578a("ui", "state_machine", "fire terminated with reason fail", "[VoIpEngineController] fireTerminatedEvent: current call is invalid");
            return;
        }
        VoiceCall voiceCall = new VoiceCall(a);
        boolean a2 = C58133t.m225480a(voiceCall);
        voiceCall.setStatus(VoiceCall.Status.TERMINATED);
        voiceCall.setTerminateReason("" + i);
        this.f142919b.mo196990a(voiceCall);
        this.f142932o.mo197003a(voiceCall);
        this.f142919b.mo196803a(a, VoiceCall.Status.TERMINATED, (IGetDataCallback<String>) new IGetDataCallback<String>() {
            /* class com.ss.android.lark.voip.service.impl.app.C58103o.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                VoiceCall voiceCall = new VoiceCall(a);
                voiceCall.setStatus(VoiceCall.Status.TERMINATED);
                EventBus.getDefault().trigger(new C58039b(voiceCall));
            }
        }, true);
        C58151d.m225578a("ui", "state_machine", "fire terminated with more detail", "[VoIpEngineController] fireTerminatedEvent: id = " + voiceCall.getId() + ", reason = " + i + ", status = " + voiceCall.getStatus());
        this.f142918a.mo196857b(voiceCall.getStatus().getNumber(), new C58076j.C58081e(voiceCall));
        if (i == 1) {
            VoipHitPoint.m225616a(voiceCall.getId(), a2, "SDK", true, false, null);
        }
        if (i < 0) {
            VoipHitPoint.m225610a(voiceCall.getId(), a2, i);
            VoipHitPoint.m225616a(voiceCall.getId(), a2, "SDK", false, false, null);
        }
        mo196946d();
        C57744a.m224104a().remove("is_in_meeting");
        if (!NetworkUtils.m153070c(C57977a.m224905c().getContext())) {
            VoipFinishType.m225597a(voiceCall.getId(), 3);
        } else {
            VoipFinishType.m225597a(voiceCall.getId(), 2);
        }
    }

    /* renamed from: b */
    public void mo196941b(AbstractC61058j jVar) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("[VoIpEngineController] removeRtcListener: listener = ");
        if (jVar != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C58151d.m225578a("ui", "rtc_engine", "remove rtc listener", sb.toString());
        this.f142927j.mo197053b(jVar);
    }

    /* renamed from: c */
    public void mo196945c(VoiceCall voiceCall) {
        C58151d.m225578a("ui", "state_machine", "send call update id = " + voiceCall.getId() + ", status = " + voiceCall.getStatus(), "[VoIpEngineController] handleVoiceCallUpdate: voiceCall = " + voiceCall.toString());
        if (C58095m.m225339a(voiceCall.getId()) == VoiceCall.Status.CANCELLED) {
            C58151d.m225578a("ui", "ui", "current call has been canceled", "[VoIpEngineController] handleVoiceCallUpdate: current call has been canceled");
        } else if (C58095m.m225339a(voiceCall.getId()) == VoiceCall.Status.UNAVAILABLE) {
            C58151d.m225578a("ui", "ui", "current call is UNAVAILABLE", "[VoIpEngineController] handleVoiceCallUpdate: current call is UNAVAILABLE");
        } else if (C58095m.m225339a(voiceCall.getId()) == VoiceCall.Status.TERMINATED) {
            C58151d.m225578a("ui", "ui", "current call is terminated", "[VoIpEngineController] handleVoiceCallUpdate: current call is terminated");
        } else {
            VoiceCall a = this.f142919b.mo196802a();
            if (a == null || !C58133t.m225481b(a) || TextUtils.equals(a.getId(), voiceCall.getId())) {
                if (C58133t.m225481b(voiceCall)) {
                    mo196940b(voiceCall);
                } else {
                    mo196946d();
                }
                this.f142932o.mo197003a(voiceCall);
                this.f142919b.mo196990a(voiceCall);
                this.f142918a.mo196857b(voiceCall.getStatus().getNumber(), new C58076j.C58081e(voiceCall));
                return;
            }
            if (C58133t.m225481b(voiceCall)) {
                C58151d.m225578a("ui", "rust", "update other call status id = " + voiceCall.getId(), "[VoIpEngineController] handleVoiceCallUpdate: another voiceCall = " + voiceCall.toString());
            }
            C58151d.m225578a("ui", "ui", "current call is valid", "[VoIpEngineController] handleVoiceCallUpdate: current call is valid " + a.toString());
        }
    }

    /* renamed from: a */
    public void mo196932a(final VoiceCall voiceCall) {
        VoipHitPoint.m225618a(voiceCall.getId(), C58133t.m225480a(voiceCall), false);
        C58151d.m225578a("ui", "rtc_engine", "join channel id = " + voiceCall.getId() + ", fromUserId = " + voiceCall.getFromUserId() + ", toUserId = " + voiceCall.getToUserId(), "[VoIpEngineController] joinChannel: channel id = " + voiceCall.getId() + ", fromUserId = " + voiceCall.getFromUserId() + ", toUserId = " + voiceCall.getToUserId());
        try {
            byte[] bArr = new byte[C58149g.m225570a().mo210481A()];
            byte[] bArr2 = new byte[C58149g.m225570a().mo210481A()];
            if (!this.f142919b.mo196992a(voiceCall, bArr, bArr2)) {
                C58151d.m225579b("ui", "rtc_engine", "join channel getEncryptKey fail", "[VoIpEngineController] joinChannel: getEncryptKey fail");
                return;
            }
            this.f142927j.mo197049a(voiceCall).mo197036a(voiceCall, bArr, bArr2);
            C58004a.m224997a(voiceCall.getId(), this.f142927j.mo197048a().mo197044c(), System.currentTimeMillis());
            VoipHitPoint.m225608a(this.f142927j.mo197048a().mo197044c(), voiceCall.getId(), C58133t.m225480a(voiceCall));
            C58151d.m225578a("ui", "rust", "update onTheCall status id = " + voiceCall.getId(), "[VoIpEngineController] onJoinChannelSuccess: update onTheCall voiceCall = " + voiceCall.toString());
            VoipHitPoint.m225631e(voiceCall.getId(), C58133t.m225480a(voiceCall));
            this.f142919b.mo196803a(voiceCall, VoiceCall.Status.ON_THE_CALL, (IGetDataCallback<String>) new IGetDataCallback<String>() {
                /* class com.ss.android.lark.voip.service.impl.app.C58103o.AnonymousClass10 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    VoipHitPoint.m225612a(voiceCall.getId(), C58133t.m225480a(voiceCall), errorResult);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    VoipHitPoint.m225633f(voiceCall.getId(), C58133t.m225480a(voiceCall));
                    VoipHitPoint.m225618a(voiceCall.getId(), C58133t.m225480a(voiceCall), true);
                }
            }, false);
        } catch (Throwable unused) {
            C58151d.m225579b("ui", "rtc_engine", "join channel create password fail", "[VoIpEngineController] joinChannel: create password fail");
        }
    }

    /* renamed from: b */
    public void mo196942b(String str) {
        VoiceCall a = this.f142919b.mo196802a();
        if (a != null) {
            C58151d.m225578a("ui", "rust", str + " status id = " + a.getId(), "[VoIpEngineController] forceTerminateClientVoiceCall: " + str + ": voiceCall = " + a.toString());
            if (a.getStatus() == VoiceCall.Status.ON_THE_CALL) {
                a.setStatus(VoiceCall.Status.TERMINATED);
                mo196945c(a);
                return;
            }
            if (C58133t.m225480a(a)) {
                a.setStatus(VoiceCall.Status.CANCELLED);
            } else {
                a.setStatus(VoiceCall.Status.REFUSED);
            }
            mo196945c(a);
        }
    }

    /* renamed from: a */
    public void mo196935a(boolean z) {
        mo196936a(C57977a.m224905c().getContext());
        C58120p pVar = this.f142919b;
        if (pVar != null) {
            pVar.mo196998e(z);
        }
    }

    /* renamed from: a */
    public void mo196928a(int i, Context context) {
        if (i == 1) {
            C58151d.m225578a("ui", "ui", "goto voip call interface", "[VoIpEngineController] changeShowInterface: gotoVoipCallInterface");
            mo196937a(context, this.f142919b.mo196802a());
            this.f142918a.mo196865d(15);
        } else if (C58133t.m225481b(this.f142919b.mo196802a())) {
            C58151d.m225578a("ui", "ui", "current voice call is valid", "[VoIpEngineController] changeShowInterface: getCurrentVoiceCall is valid");
            VoIpDialogHelper.m225111a().mo196762a(context);
        }
    }
}
