package com.ss.android.lark.voip.service.impl.app;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.floatbubble.FloatBubble;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57860r;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57981a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.lark.voip.service.impl.app.C58136v;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint;
import com.ss.android.lark.voip.service.impl.util.VoIPAudioManager;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.irtc.RtcNetworkQualityInfo;
import java.lang.ref.WeakReference;

public class VoIPFloatIcon implements C58103o.AbstractC58117b, C58136v.AbstractC58137a, VoIPAudioManager.AbstractC58193a {

    /* renamed from: a */
    public VoIPFloatIconView f142682a;

    /* renamed from: b */
    protected Handler f142683b;

    /* renamed from: c */
    public boolean f142684c;

    /* renamed from: d */
    private FrameLayout f142685d;

    /* renamed from: e */
    private C58014b f142686e;

    /* renamed from: f */
    private VoiceCall f142687f;

    /* renamed from: g */
    private FloatBubble f142688g;

    /* renamed from: h */
    private boolean f142689h;

    /* renamed from: i */
    private ImageView f142690i;

    /* renamed from: j */
    private boolean f142691j;

    /* renamed from: k */
    private Boolean f142692k;

    /* renamed from: l */
    private ComponentCallbacks2 f142693l;

    /* renamed from: m */
    private AbstractC57981a.AbstractC57982a f142694m;

    /* renamed from: com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon$a */
    public static class C58013a {

        /* renamed from: a */
        public static final VoIPFloatIcon f142703a = new VoIPFloatIcon();
    }

    /* renamed from: a */
    public static VoIPFloatIcon m225001a() {
        return C58013a.f142703a;
    }

    private VoIPFloatIcon() {
        this.f142683b = new Handler(Looper.getMainLooper());
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58136v.AbstractC58137a
    /* renamed from: c */
    public void mo196673c() {
        C58151d.m225578a("ui", "ui", "on telephone call off hook", "[VoIPFloatIcon] onCancelVoipCall");
    }

    /* renamed from: f */
    public boolean mo196676f() {
        if (this.f142691j) {
            return this.f142689h;
        }
        if (this.f142688g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void mo196679i() {
        C58151d.m225577a("VoIPFloatIcon", "wakeUpActivity");
        VoIPFloatIconView voIPFloatIconView = this.f142682a;
        if (voIPFloatIconView != null) {
            voIPFloatIconView.callOnClick();
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon$b */
    public class C58014b extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        private Context f142705b;

        /* renamed from: c */
        private WeakReference<Activity> f142706c;

        /* renamed from: b */
        public void mo196690b() {
            C58151d.m225578a("ui", "ui", "destroy float icon", "[VoIPFloatIcon] destroy");
            ((Application) this.f142705b).unregisterActivityLifecycleCallbacks(this);
            this.f142705b.unregisterReceiver(this);
        }

        /* renamed from: a */
        public Context mo196689a() {
            Activity activity;
            WeakReference<Activity> weakReference = this.f142706c;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            if (activity != null) {
                return activity;
            }
            Log.m165383e("VoipContext", "activity context is null");
            return this.f142705b;
        }

        public void onActivityDestroyed(Activity activity) {
            C58151d.m225578a("ui", "ui", "float page destroyed", "[VoIPFloatIcon] onActivityDestroyed");
        }

        public void onActivityPaused(Activity activity) {
            C58151d.m225578a("ui", "ui", "float page paused", "[VoIPFloatIcon] onActivityPaused");
        }

        public void onActivityResumed(Activity activity) {
            C58151d.m225578a("ui", "ui", "float page resumed", "[VoIPFloatIcon] onActivityResumed");
        }

        public void onActivityStopped(Activity activity) {
            C58151d.m225578a("ui", "ui", "float page stopped", "[VoIPFloatIcon] onActivityStopped");
        }

        public void onActivityStarted(Activity activity) {
            C58151d.m225578a("ui", "ui", "float page started", "[VoIPFloatIcon] onActivityStarted");
            WeakReference<Activity> weakReference = this.f142706c;
            if (weakReference == null || weakReference.get() != activity) {
                this.f142706c = new WeakReference<>(activity);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C58151d.m225578a("ui", "ui", "float page save instance state", "[VoIPFloatIcon] onActivitySaveInstanceState");
        }

        public C58014b(Context context) {
            VoIPFloatIcon.this = r2;
            this.f142705b = context;
            ((Application) context).registerActivityLifecycleCallbacks(this);
            m225023a(context, this, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C58151d.m225578a("ui", "ui", "float page created", "[VoIPFloatIcon] onActivityCreated");
            WeakReference<Activity> weakReference = this.f142706c;
            if (weakReference == null || weakReference.get() != activity) {
                this.f142706c = new WeakReference<>(activity);
            }
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && "homekey".equals(intent.getStringExtra("reason"))) {
                C58151d.m225578a("ui", "ui", "hide float icon for home key pressed", "[VoIPFloatIcon] onReceive: reason = homekey");
                if (!VoIPFloatIcon.this.mo196672b()) {
                    C58103o.m225371a().mo196928a(2, context);
                }
            }
        }

        /* renamed from: a */
        public static Intent m225023a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }
    }

    /* renamed from: b */
    public boolean mo196672b() {
        if (this.f142691j) {
            return this.f142689h;
        }
        FloatBubble floatBubble = this.f142688g;
        if (floatBubble != null) {
            return floatBubble.isShown();
        }
        return false;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58136v.AbstractC58137a
    /* renamed from: d */
    public void mo196674d() {
        C58151d.m225578a("ui", "ui", "on telephone call off hook", "[VoIPFloatIcon] onChangeVoipMuteState");
        C58103o.m225371a().mo196949f().mo196809b(true);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58136v.AbstractC58137a
    /* renamed from: e */
    public void mo196675e() {
        C58151d.m225578a("ui", "ui", "on telephone call idle", "[VoIPFloatIcon] onTelephoneIdle");
        C58103o.m225371a().mo196949f().mo196809b(false);
    }

    /* renamed from: h */
    public void mo196678h() {
        C58151d.m225578a("ui", "ui", "dismiss float icon", "[VoIPFloatIcon] forceDismiss");
        EventBus.getDefault().unregister(this);
        m225005j();
        this.f142685d = null;
        this.f142682a = null;
        C58014b bVar = this.f142686e;
        if (bVar != null) {
            bVar.mo196690b();
            this.f142686e = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon$5 */
    public static /* synthetic */ class C580125 {

        /* renamed from: a */
        static final /* synthetic */ int[] f142702a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.voip.service.impl.service.VoiceCall$Status[] r0 = com.ss.android.lark.voip.service.impl.service.VoiceCall.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.C580125.f142702a = r0
                com.ss.android.lark.voip.service.impl.service.VoiceCall$Status r1 = com.ss.android.lark.voip.service.impl.service.VoiceCall.Status.CALLING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.C580125.f142702a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.voip.service.impl.service.VoiceCall$Status r1 = com.ss.android.lark.voip.service.impl.service.VoiceCall.Status.RINGING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.C580125.f142702a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.voip.service.impl.service.VoiceCall$Status r1 = com.ss.android.lark.voip.service.impl.service.VoiceCall.Status.ACCEPTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.C580125.f142702a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.voip.service.impl.service.VoiceCall$Status r1 = com.ss.android.lark.voip.service.impl.service.VoiceCall.Status.OCCUPIED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.C580125.f142702a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.voip.service.impl.service.VoiceCall$Status r1 = com.ss.android.lark.voip.service.impl.service.VoiceCall.Status.REFUSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.C580125.f142702a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.voip.service.impl.service.VoiceCall$Status r1 = com.ss.android.lark.voip.service.impl.service.VoiceCall.Status.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.C580125.f142702a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.lark.voip.service.impl.service.VoiceCall$Status r1 = com.ss.android.lark.voip.service.impl.service.VoiceCall.Status.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.C580125.<clinit>():void");
        }
    }

    /* renamed from: j */
    private void m225005j() {
        C58151d.m225578a("ui", "ui", "dismiss float icon", "[VoIPFloatIcon] safeDestroy multiTaskFloating = " + this.f142691j);
        try {
            if (this.f142691j) {
                this.f142689h = false;
                if (this.f142685d != null) {
                    C57977a.m224905c().getMultiTaskDependency().mo145473a((AbstractC57987d.AbstractC57993e.AbstractC57994a) null);
                    C57977a.m224905c().getMultiTaskDependency().mo145475b(this.f142685d);
                }
            } else {
                FloatBubble floatBubble = this.f142688g;
                if (floatBubble != null) {
                    floatBubble.mo101314a();
                }
                this.f142688g = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f142693l != null) {
            C57977a.m224905c().getContext().unregisterComponentCallbacks(this.f142693l);
        }
        if (this.f142694m != null) {
            C57977a.m224905c().getAppConfigurationDependency().mo145500b(this.f142694m);
        }
    }

    /* renamed from: g */
    public void mo196677g() {
        C58151d.m225578a("ui", "ui", "dismiss float icon", "[VoIPFloatIcon] dismiss");
        EventBus.getDefault().unregister(this);
        VoIPAudioManager.m225760a().mo197187b(this);
        C58103o.m225371a().mo196951h();
        C58136v.m225487f().mo197018b(this);
        C58136v.m225487f().mo197017b();
        C58136v.m225487f().mo197022g();
        m225005j();
        this.f142685d = null;
        this.f142682a = null;
        C58014b bVar = this.f142686e;
        if (bVar != null) {
            bVar.mo196690b();
            this.f142686e = null;
        }
    }

    /* renamed from: b */
    public void mo196670b(Context context) {
        if (this.f142686e == null) {
            this.f142686e = new C58014b(context.getApplicationContext());
        }
    }

    /* renamed from: a */
    private void m225002a(int i) {
        VoIPFloatIconView voIPFloatIconView;
        if (i != 0 && (voIPFloatIconView = this.f142682a) != null) {
            voIPFloatIconView.mo196701b(UIUtils.getString(this.f142685d.getContext(), i));
        }
    }

    public void onVoiceCallStatusChanged(C58130r rVar) {
        C58151d.m225578a("ui", "ui", "voice call status changed with TimeChangedEvent", "[VoIPFloatIcon] onVoiceCallStatusChanged: event = " + rVar);
        if (rVar == null) {
            C58151d.m225578a("ui", "ui", "voice call status change fail", "[VoIPFloatIcon] onVoiceCallStatusChanged: event is null");
            return;
        }
        VoIPFloatIconView voIPFloatIconView = this.f142682a;
        if (voIPFloatIconView != null) {
            voIPFloatIconView.mo196701b(rVar.f143000c);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m225003b(boolean z) {
        if (this.f142682a != null) {
            Boolean bool = this.f142692k;
            if (bool == null || bool.booleanValue() != z) {
                this.f142692k = Boolean.valueOf(z);
                C58151d.m225578a("ui", "ui", "adjust ui", "[VoIPFloatIcon] adjustUI: mFloatIconView = " + this.f142682a + ", showBack = " + z);
                if (z) {
                    this.f142682a.setBackgroundResource(R.drawable.bg_voip_float);
                    this.f142682a.setPadding(0, UIHelper.dp2px(4.0f), 0, 0);
                    return;
                }
                this.f142682a.setBackgroundDrawable(null);
                this.f142682a.setPadding(0, 0, 0, 0);
            }
        }
    }

    /* renamed from: c */
    private void m225004c(final Context context) {
        boolean z = this.f142691j;
        if ((!z || (!this.f142689h && this.f142682a == null)) && (z || this.f142688g == null)) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.view_voip_float_icon, (ViewGroup) null);
            this.f142685d = frameLayout;
            VoIPFloatIconView voIPFloatIconView = (VoIPFloatIconView) frameLayout.findViewById(R.id.voip_float_card);
            this.f142682a = voIPFloatIconView;
            voIPFloatIconView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.ViewTreeObserver$OnGlobalLayoutListenerC580103 */

                public void onGlobalLayout() {
                    if (VoIPFloatIcon.this.f142682a != null) {
                        VoIPFloatIcon.this.f142682a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
            this.f142682a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.View$OnClickListenerC580114 */

                public void onClick(View view) {
                    C58151d.m225578a("ui", "ui", "click float icon view", "[VoIPFloatIcon] initFloatIconIfNeed: onClick mFloatIconView");
                    C58103o.m225371a().mo196928a(1, context);
                    VoIPFloatIcon.this.mo196677g();
                }
            });
            if (!this.f142691j) {
                this.f142688g = FloatBubble.m104274a((Application) ar.m236694a(), (View) this.f142685d, true);
                return;
            }
            return;
        }
        C58151d.m225579b("ui", "ui", "not init existed float icon", "[VoIPFloatIcon] initFloatIconIfNeed: not init existed float icon");
    }

    /* renamed from: a */
    public void mo196664a(Context context) {
        this.f142691j = C57977a.m224905c().getMultiTaskDependency().mo145474a();
        C58151d.m225578a("ui", "ui", "init multiTaskFloating", "[VoIPFloatIcon] init multiTaskFloating: " + this.f142691j);
        m225004c(context);
        mo196670b(context);
        this.f142684c = UDUiModeUtils.m93319a(ar.m236697b().getApplicationContext());
        this.f142693l = new ComponentCallbacks2() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.ComponentCallbacks2C580061 */

            public void onLowMemory() {
            }

            public void onTrimMemory(int i) {
            }

            public void onConfigurationChanged(Configuration configuration) {
                if (UDUiModeUtils.m93320a(configuration) != VoIPFloatIcon.this.f142684c) {
                    VoIPFloatIcon.this.f142683b.postDelayed(new Runnable() {
                        /* class com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.ComponentCallbacks2C580061.RunnableC580071 */

                        public void run() {
                            VoIPFloatIcon.this.mo196669a(false);
                        }
                    }, 100);
                }
            }
        };
        C57977a.m224905c().getContext().registerComponentCallbacks(this.f142693l);
        this.f142694m = new AbstractC57981a.AbstractC57982a() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.C580082 */

            @Override // com.ss.android.lark.voip.p2911a.AbstractC57981a.AbstractC57982a
            /* renamed from: a */
            public void mo196617a(int i) {
                boolean z;
                VoIPFloatIcon voIPFloatIcon = VoIPFloatIcon.this;
                if ((i & 48) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                voIPFloatIcon.f142684c = z;
                VoIPFloatIcon.this.f142683b.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon.C580082.RunnableC580091 */

                    public void run() {
                        VoIPFloatIcon.this.mo196669a(true);
                    }
                }, 100);
            }
        };
        C57977a.m224905c().getAppConfigurationDependency().mo145499a(this.f142694m);
    }

    public void onVoiceCallStatusChanged(C58039b bVar) {
        C58151d.m225578a("ui", "ui", "voice call status changed with StatusChangedEvent", "[VoIPFloatIcon] onVoiceCallStatusChanged: event = " + bVar);
        if (bVar != null) {
            this.f142687f = bVar.mo196784a();
        }
        if (bVar == null || bVar.mo196784a() == null) {
            C58151d.m225578a("ui", "ui", "voice call status changed fail", "[VoIPFloatIcon] onVoiceCallStatusChanged: event is null");
            return;
        }
        VoiceCall.Status status = bVar.mo196784a().getStatus();
        int i = 0;
        switch (C580125.f142702a[status.ordinal()]) {
            case 1:
            case 2:
                if (C58133t.m225480a(bVar.mo196784a())) {
                    if (status != VoiceCall.Status.CALLING) {
                        i = R.string.View_G_RingingFloat;
                        break;
                    } else {
                        i = R.string.View_G_CallingFloat;
                        break;
                    }
                } else {
                    i = R.string.View_G_IsCallingFloat;
                    break;
                }
            case 3:
                i = R.string.View_G_ConnectingFloat;
                break;
            case 4:
                i = R.string.View_G_RecipientUnavailable;
                break;
            case 5:
                i = R.string.View_AM_Declined;
                break;
            case 6:
                i = R.string.View_AM_NoResponse;
                break;
            case 7:
                i = R.string.View_A_Ended;
                break;
        }
        m225002a(i);
    }

    /* renamed from: a */
    public void mo196666a(Chatter chatter) {
        String str;
        String str2;
        String str3;
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("update icon info chatter id = ");
        String str4 = "";
        if (chatter != null) {
            str = chatter.getId();
        } else {
            str = str4;
        }
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[VoIPFloatIcon] updateIconInfo: chatterId = ");
        if (chatter != null) {
            str2 = chatter.getId();
        } else {
            str2 = str4;
        }
        sb3.append(str2);
        C58151d.m225578a("ui", "ui", sb2, sb3.toString());
        if (chatter == null || this.f142682a == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[VoIPFloatIcon] updateIconInfo: ");
            if (chatter == null) {
                str3 = "chatter is null";
            } else {
                str3 = str4;
            }
            sb4.append(str3);
            sb4.append(", ");
            if (this.f142682a == null) {
                str4 = "floatIconView is null";
            }
            sb4.append(str4);
            C58151d.m225578a("ui", "ui", "update icon info fail", sb4.toString());
            return;
        }
        AbstractC57987d c = C57977a.m224905c();
        Context context = c.getContext();
        int dpFromDimenXml = DeviceUtils.getDpFromDimenXml(context, R.dimen.avatar_width_feed);
        String str5 = chatter.getId() + ".jpg";
        String id = chatter.getId();
        String name = chatter.getName();
        if (chatter.getType() == Chatter.ChatterType.USER) {
            z = true;
        } else {
            z = false;
        }
        C57860r.m224571a(context, id, name, z, chatter.getAvatarKey(), dpFromDimenXml);
        c.getImageDependency().mo145510a(context, str5, chatter.getAvatarKey(), chatter.getId(), this.f142682a.getAvatar(), dpFromDimenXml, dpFromDimenXml);
        this.f142682a.mo196700a(c.getChatDependency().mo145505a((OpenChatter) chatter));
    }

    /* renamed from: a */
    public void mo196669a(boolean z) {
        String str;
        Object[] objArr = new Object[1];
        if (z) {
            str = "App";
        } else {
            str = "System";
        }
        objArr[0] = str;
        C58151d.m225577a("VCBaseFloatWindow", String.format("change ui mode in %s", objArr));
        VoIPFloatIconView voIPFloatIconView = this.f142682a;
        if (voIPFloatIconView != null) {
            voIPFloatIconView.setBackground(this.f142686e.mo196689a().getDrawable(R.drawable.bg_voip_float));
            this.f142682a.mo196699a(this.f142686e.mo196689a());
        }
    }

    /* renamed from: a */
    public void mo196665a(Context context, int i) {
        C58151d.m225578a("ui", "ui", "show float icon", "[VoIPFloatIcon] show: statusResId = " + i + ", multiTaskFloating = " + this.f142691j);
        EventBus.getDefault().register(this);
        C58136v.m225487f().mo197013a();
        VoIPAudioManager.m225760a().mo197184a(this);
        C58136v.m225487f().mo197015a(this);
        C58103o.m225371a().mo196931a(this);
        m225004c(context);
        if (this.f142691j) {
            if (this.f142685d != null) {
                this.f142692k = null;
                C57977a.m224905c().getMultiTaskDependency().mo145473a(new AbstractC57987d.AbstractC57993e.AbstractC57994a() {
                    /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIPFloatIcon$1UYWMz4LGIshXs7irtkeqMJtNOA */

                    @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57993e.AbstractC57994a
                    public final void onChanged(boolean z) {
                        VoIPFloatIcon.lambda$1UYWMz4LGIshXs7irtkeqMJtNOA(VoIPFloatIcon.this, z);
                    }
                });
                C57977a.m224905c().getMultiTaskDependency().mo145472a(this.f142685d);
            }
            this.f142689h = true;
        } else {
            this.f142688g.mo101313a(true);
            this.f142688g.mo101317c(1);
            this.f142688g.mo101315b(8388661);
            this.f142688g.mo101316b();
        }
        m225002a(i);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58103o.AbstractC58117b
    /* renamed from: a */
    public void mo196668a(String str, RtcNetworkQualityInfo rtcNetworkQualityInfo) {
        FrameLayout frameLayout = this.f142685d;
        if (frameLayout != null) {
            if (this.f142690i == null) {
                this.f142690i = (ImageView) frameLayout.findViewById(R.id.voip_float_ic_low_network);
            }
            if (Math.abs(rtcNetworkQualityInfo.f152893d) == 1 || rtcNetworkQualityInfo.f152893d == 0) {
                this.f142690i.setVisibility(0);
            } else if (rtcNetworkQualityInfo.f152893d > 1) {
                this.f142690i.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AbstractC58193a
    /* renamed from: a */
    public void mo196667a(VoIPAudioManager.AudioType audioType, boolean z, boolean z2) {
        VoiceCall voiceCall;
        String str;
        if (z2 && (voiceCall = this.f142687f) != null) {
            if (voiceCall.getStatus() == VoiceCall.Status.ON_THE_CALL) {
                str = "voip_call_page_onthecall";
            } else if (this.f142687f.getStatus() == VoiceCall.Status.CALLING) {
                str = "voip_call_page_calling";
            } else {
                str = "";
            }
            VoipHitPoint.m225606a(str, audioType, z, this.f142687f.getId(), C58133t.m225480a(this.f142687f));
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AbstractC58193a
    /* renamed from: b */
    public void mo196671b(VoIPAudioManager.AudioType audioType, boolean z, boolean z2) {
        VoiceCall voiceCall;
        String str;
        boolean g = VoIPAudioManager.m225760a().mo197192g();
        VoIPAudioManager.AudioType f = VoIPAudioManager.m225760a().mo197191f();
        if (z2 && (voiceCall = this.f142687f) != null) {
            if (voiceCall.getStatus() == VoiceCall.Status.ON_THE_CALL) {
                str = "voip_call_page_onthecall";
            } else if (this.f142687f.getStatus() == VoiceCall.Status.CALLING) {
                str = "voip_call_page_calling";
            } else {
                str = "";
            }
            VoipHitPoint.m225605a(str, audioType, z, f, g, this.f142687f.getId(), C58133t.m225480a(this.f142687f));
        }
    }
}
