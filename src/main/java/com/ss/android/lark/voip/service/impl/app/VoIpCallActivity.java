package com.ss.android.lark.voip.service.impl.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.C58037a;
import com.ss.android.lark.voip.service.impl.app.VoIpCallView;
import com.ss.android.lark.voip.service.impl.p2913a.C58005a;
import com.ss.android.lark.voip.service.impl.p2915c.C58145b;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.util.VoIPAudioManager;
import com.ss.android.lark.voip.service.impl.util.VoipUtil;
import com.ss.android.vc.common.p3083e.C60750d;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import java.util.Map;

public class VoIpCallActivity extends BaseFragmentActivity {

    /* renamed from: d */
    private static Map<String, Boolean> f142712d = new HashMap();

    /* renamed from: a */
    boolean f142713a;

    /* renamed from: b */
    public boolean f142714b;

    /* renamed from: c */
    VoIpCallView.AbstractC58030a f142715c = new VoIpCallView.AbstractC58030a() {
        /* class com.ss.android.lark.voip.service.impl.app.VoIpCallActivity.C580171 */

        @Override // com.ss.android.lark.voip.service.impl.app.VoIpCallView.AbstractC58030a
        /* renamed from: a */
        public void mo196713a(Object obj) {
            ButterKnife.bind(obj, VoIpCallActivity.this);
        }

        @Override // com.ss.android.lark.voip.service.impl.app.VoIpCallView.AbstractC58030a
        /* renamed from: a */
        public void mo196714a(boolean z) {
            C58151d.m225578a("ui", "ui", "show invalid version dialog", "[VoIpCallActivity] showInvalidVersionDialog: isSelfValid = " + z);
            C58094l.m225337a(VoIpCallActivity.this, z, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.voip.service.impl.app.VoIpCallActivity.C580171.DialogInterface$OnClickListenerC580181 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C58151d.m225578a("ui", "ui", "click to finish VoIpCallActivity", "[VoIpCallActivity] showInvalidVersionDialog: onClick finish");
                    VoIpCallActivity.this.finish();
                }
            });
        }
    };

    /* renamed from: e */
    private C58047f f142716e;

    /* renamed from: f */
    private C58037a f142717f;

    /* renamed from: g */
    private boolean f142718g;

    /* renamed from: h */
    private Handler f142719h = new Handler();

    /* renamed from: i */
    private C58097n f142720i;

    /* renamed from: j */
    private BroadcastReceiver f142721j = new BroadcastReceiver() {
        /* class com.ss.android.lark.voip.service.impl.app.VoIpCallActivity.C580192 */

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && NetworkUtils.m153070c(context) && !VoIpCallActivity.this.f142714b && NetworkUtils.m153075h(context)) {
                VoIpCallActivity.this.f142714b = true;
                LKUIToast.show(VoIpCallActivity.this, (int) R.string.View_G_UsingCellularData);
            }
        }
    };

    /* renamed from: a */
    public Context mo196704a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo196706a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m225033a(this, context);
    }

    /* renamed from: c */
    public Resources mo196708c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m225029a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo196710d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m225037c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m225036b(this);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public int getWatermarkMode() {
        return 1;
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m225032a(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        this.f142718g = true;
        super.finish();
    }

    /* renamed from: b */
    public void mo196707b() {
        C58037a aVar = this.f142717f;
        if (aVar != null) {
            aVar.mo196783c();
        }
        C58047f fVar = this.f142716e;
        if (fVar != null) {
            fVar.mo196812a();
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        C58151d.m225578a("ui", "ui", "back press", "[VoIpCallActivity] onBackPressed: ");
    }

    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        C58151d.m225578a("ui", "ui", "pause VoIpCallActivity", "[VoIpCallActivity] onPause: ");
    }

    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        C58151d.m225578a("ui", "ui", "resume VoIpCallActivity", "[VoIpCallActivity] onResume: ");
        this.f142720i.mo196922d();
        VoIpDialogHelper.m225111a().mo196766e();
        VoipUtil.m225812g();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        this.f142716e.mo196813a(this.f142717f);
        C58151d.m225578a("ui", "ui", "[onStart] enable proximity detector", "[VoIpCallActivity][onStart] enable proximity detector");
    }

    /* renamed from: e */
    private void m225038e() {
        if (C60785x.m236237a() && !this.f142714b) {
            this.f142714b = true;
            LKUIToast.show(this, (int) R.string.View_G_UsingCellularData);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        m225030a(this, this.f142721j, intentFilter);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C58151d.m225578a("ui", "ui", "destroy VoIpCallActivity", "[VoIpCallActivity] onDestroy: ");
        this.f142719h.removeCallbacksAndMessages(null);
        if (!this.f142718g) {
            if (C28460b.m104296a(this)) {
                VoIPFloatIcon.m225001a().mo196664a(this);
                C58097n nVar = this.f142720i;
                if (nVar != null) {
                    nVar.mo196921c();
                }
            } else {
                C58103o.m225371a().mo196928a(2, this);
            }
        }
        C58097n nVar2 = this.f142720i;
        if (nVar2 != null) {
            nVar2.destroy();
        }
        getWindow().clearFlags(SmActions.ACTION_ONTHECALL_EXIT);
        EventBus.getDefault().unregister(this);
        try {
            unregisterReceiver(this.f142721j);
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public void mo196705a() {
        super.onStop();
        mo196707b();
        C58151d.m225578a("ui", "ui", "[onStop] disable proximity detector", "[VoIpCallActivity][onStop] disable proximity detector");
    }

    /* renamed from: b */
    public static Resources m225036b(VoIpCallActivity voIpCallActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(voIpCallActivity);
        }
        return voIpCallActivity.mo196708c();
    }

    /* renamed from: c */
    public static AssetManager m225037c(VoIpCallActivity voIpCallActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(voIpCallActivity);
        }
        return voIpCallActivity.mo196710d();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!intent.getBooleanExtra("open_and_do_nothing", false)) {
            m225031a(intent);
        }
    }

    public void receiveVoiceCallWrapperEvent(C58005a aVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[VoIpCallActivity] receiveVoiceCallWrapperEvent: event = ");
        if (aVar != null) {
            str = aVar.mo196640a().toString();
        } else {
            str = "";
        }
        sb.append(str);
        C58151d.m225578a("ui", "ui", "receive voice call event", sb.toString());
        if (aVar != null && aVar.mo196640a() != null) {
            m225034a(aVar.mo196640a());
        }
    }

    /* renamed from: a */
    public static void m225032a(VoIpCallActivity voIpCallActivity) {
        voIpCallActivity.mo196705a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VoIpCallActivity voIpCallActivity2 = voIpCallActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    voIpCallActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        super.onCreate(bundle);
        setContentView(R.layout.activity_voip_layout);
        C60750d.m236072a(this);
        getWindow().addFlags(6815872);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.voip_bg_video_call));
        }
        this.f142716e = new C58047f(this);
        this.f142717f = new C58037a(this);
        m225031a(getIntent());
        EventBus.getDefault().register(this);
        VoIPFloatIcon.m225001a().mo196670b(this);
        m225038e();
        this.f142713a = false;
        this.f142719h.postDelayed(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIpCallActivity.RunnableC580203 */

            public void run() {
                if (!C58103o.m225371a().mo196952i()) {
                    C58151d.m225577a("VoIp", "finish activity because no current meeting");
                    VoIpCallActivity.this.finish();
                }
            }
        }, 1500);
    }

    /* renamed from: a */
    private void m225031a(Intent intent) {
        String str;
        if (intent == null) {
            C58151d.m225579b("ui", "ui", "init voip activity fail with null intent", "[VoIpCallActivity] initMVP: intent is null");
            finish();
            LKUIToast.show(this, UIUtils.getString(this, R.string.View_A_FailedToGetUserInfo));
            return;
        }
        Chatter chatter = (Chatter) intent.getSerializableExtra("voip_user_info");
        boolean booleanExtra = intent.getBooleanExtra("voip_initiative_call", false);
        String stringExtra = intent.getStringExtra("voip_chat_id");
        boolean booleanExtra2 = intent.getBooleanExtra("voice_call_feed_back_mode", false);
        if (chatter != null || booleanExtra2) {
            C58103o.m225371a().mo196936a(getApplicationContext());
            VoiceCall voiceCall = (VoiceCall) intent.getSerializableExtra("voip_call_info");
            VoIpCallView voIpCallView = new VoIpCallView(this.f142715c, this, booleanExtra);
            VoIpCallModel voIpCallModel = new VoIpCallModel(chatter, stringExtra, voiceCall, booleanExtra, C58103o.m225371a().mo196949f());
            C58097n nVar = this.f142720i;
            if (nVar != null) {
                nVar.destroy();
            }
            C58097n nVar2 = new C58097n(this, voIpCallModel, voIpCallView);
            this.f142720i = nVar2;
            nVar2.create();
            m225034a(voiceCall);
            this.f142717f.mo196781a(new C58037a.AbstractC58038a(booleanExtra, voIpCallModel) {
                /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallActivity$01c03Z2ljrENOaxP5DEd0se7qrI */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ VoIpCallModel f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.voip.service.impl.app.C58037a.AbstractC58038a
                public final boolean allowAcquire() {
                    return VoIpCallActivity.lambda$01c03Z2ljrENOaxP5DEd0se7qrI(this.f$0, this.f$1);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[VoIpCallActivity] initMVP: ");
        String str2 = "";
        if (chatter == null) {
            str = "chatter is null";
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(" ");
        if (!booleanExtra2) {
            str2 = "not feedback mode";
        }
        sb.append(str2);
        C58151d.m225579b("ui", "ui", "init voip activity fail with null chatter or not feedback mode", sb.toString());
        finish();
        LKUIToast.show(this, UIUtils.getString(this, R.string.View_A_FailedToGetUserInfo));
    }

    /* renamed from: a */
    private void m225034a(VoiceCall voiceCall) {
        C58145b b;
        if (voiceCall != null && voiceCall.isUseByteDanceChannel() && (b = C58103o.m225371a().mo196950g().mo197052b()) != null) {
            if (!f142712d.containsKey(voiceCall.getId()) || !f142712d.get(voiceCall.getId()).booleanValue()) {
                b.mo197040a(this, voiceCall.isEncrpted());
                f142712d.put(voiceCall.getId(), true);
            }
        }
    }

    /* renamed from: a */
    public static void m225033a(VoIpCallActivity voIpCallActivity, Context context) {
        voIpCallActivity.mo196706a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(voIpCallActivity);
        }
    }

    /* renamed from: a */
    public static Context m225029a(VoIpCallActivity voIpCallActivity, Configuration configuration) {
        Context a = voIpCallActivity.mo196704a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m225035a(boolean z, VoIpCallModel voIpCallModel) {
        if (!VoIPAudioManager.m225760a().mo197193h() || (!z && voIpCallModel.mo196725e() != VoiceCall.Status.ON_THE_CALL)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Intent m225030a(VoIpCallActivity voIpCallActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return voIpCallActivity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
