package com.ss.android.vc.meeting.module.livestream.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.event.aq;
import java.util.Arrays;

public class AuthFailActivity extends LiveAuthBaseActivity {

    /* renamed from: b */
    public static String f155817b = "action.AuthFailActivity.finish";

    /* renamed from: g */
    private String f155818g;

    /* renamed from: h */
    private VideoChat f155819h;

    /* renamed from: a */
    public Context mo214701a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo214703a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m242333a(this, context);
    }

    /* renamed from: b */
    public Resources mo214705b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo214706c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m242330a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo214708d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m242335c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m242331a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m242334b(this);
    }

    /* renamed from: h */
    private void m242337h() {
        findViewById(R.id.iv_close).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.AuthFailActivity.View$OnClickListenerC620172 */

            public void onClick(View view) {
                AuthFailActivity.this.finish();
                AuthFailActivity.this.mo214728a(Arrays.asList("action.FaceAuthActivity.finish", "action.RealAuthenticationActivity.finish"));
                AuthFailActivity.this.mo214704a("finish");
            }
        });
        findViewById(R.id.llNextStep).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.AuthFailActivity.C620183 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                AuthFailActivity.this.finish();
                AuthFailActivity.this.mo214728a(Arrays.asList("action.FaceAuthActivity.finish"));
                AuthFailActivity.this.mo214704a("retry");
            }
        });
    }

    /* renamed from: g */
    private void m242336g() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f155818g = intent.getStringExtra("auth.key.meeting.id");
            C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(this.f155818g);
            if (kVar != null) {
                this.f155819h = kVar.mo212056e();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.livestream.activity.LiveAuthBaseActivity
    /* renamed from: a */
    public void mo214702a() {
        this.f155840f = new BroadcastReceiver() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.AuthFailActivity.C620161 */

            public void onReceive(Context context, Intent intent) {
                if (AuthFailActivity.f155817b.equals(intent.getAction())) {
                    AuthFailActivity.this.finish();
                }
            }
        };
        this.f155839e.mo4991a(this.f155840f, new IntentFilter(f155817b));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.meeting.module.livestream.activity.LiveAuthBaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.live_auth_activity_auth_fail);
        m242336g();
        m242337h();
    }

    /* renamed from: a */
    public static Resources m242331a(AuthFailActivity authFailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authFailActivity);
        }
        return authFailActivity.mo214705b();
    }

    /* renamed from: c */
    public static AssetManager m242335c(AuthFailActivity authFailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authFailActivity);
        }
        return authFailActivity.mo214708d();
    }

    /* renamed from: b */
    public static void m242334b(AuthFailActivity authFailActivity) {
        authFailActivity.mo214706c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AuthFailActivity authFailActivity2 = authFailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    authFailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo214704a(String str) {
        aq.m250043a("vc_meeting_popup", "face_recognition_fail", str, this.f155819h);
    }

    /* renamed from: a */
    public static void m242333a(AuthFailActivity authFailActivity, Context context) {
        authFailActivity.mo214703a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(authFailActivity);
        }
    }

    /* renamed from: a */
    public static Context m242330a(AuthFailActivity authFailActivity, Configuration configuration) {
        Context a = authFailActivity.mo214701a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m242332a(Context context, String str) {
        if (context != null) {
            Intent intent = new Intent(context, AuthFailActivity.class);
            intent.putExtra("auth.key.meeting.id", str);
            context.startActivity(intent);
        }
    }
}
