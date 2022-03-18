package com.ss.android.lark.money.redpacket.send;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.redpacket.cover.RedPacketCoverActivity;
import com.ss.android.lark.money.redpacket.history.RedPacketHistoryActivity;
import com.ss.android.lark.money.redpacket.p2369b.C48040d;
import com.ss.android.lark.money.redpacket.send.SendRedPacketView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SendRedPacketActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C48184f f121207a;

    /* renamed from: b */
    private boolean f121208b;

    /* renamed from: c */
    private String f121209c;

    /* renamed from: d */
    private int f121210d;

    /* renamed from: e */
    private String f121211e;

    /* renamed from: f */
    private String f121212f;

    /* renamed from: a */
    public Context mo168579a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo168580a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo168581a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m190111a(this, context);
    }

    /* renamed from: b */
    public void mo168582b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo168583c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m190108a(this, configuration);
    }

    public AssetManager getAssets() {
        return m190114c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m190110a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m190113b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        this.f121207a.destroy();
        super.onDestroy();
    }

    /* renamed from: d */
    private void m190115d() {
        if (!m190112a(getIntent().getExtras())) {
            finish();
            return;
        }
        C48184f fVar = new C48184f(this, new SendRedPacketView.AbstractC48172b() {
            /* class com.ss.android.lark.money.redpacket.send.SendRedPacketActivity.C481641 */

            @Override // com.ss.android.lark.money.redpacket.send.SendRedPacketView.AbstractC48172b
            /* renamed from: a */
            public void mo168586a() {
                KeyboardUtils.hideKeyboard(SendRedPacketActivity.this);
                SendRedPacketActivity.this.finish();
            }

            @Override // com.ss.android.lark.money.redpacket.send.SendRedPacketView.AbstractC48172b
            /* renamed from: b */
            public void mo168589b() {
                SendRedPacketActivity.this.startActivity(new Intent(SendRedPacketActivity.this, RedPacketHistoryActivity.class));
            }

            @Override // com.ss.android.lark.money.redpacket.send.SendRedPacketView.AbstractC48172b
            /* renamed from: a */
            public void mo168588a(SendRedPacketView sendRedPacketView) {
                ButterKnife.bind(sendRedPacketView, SendRedPacketActivity.this);
            }

            @Override // com.ss.android.lark.money.redpacket.send.SendRedPacketView.AbstractC48172b
            /* renamed from: a */
            public void mo168587a(RedPacketCover redPacketCover) {
                long j;
                Intent intent = new Intent(SendRedPacketActivity.this, RedPacketCoverActivity.class);
                if (redPacketCover != null) {
                    j = redPacketCover.getId();
                } else {
                    j = -1;
                }
                intent.putExtra("extra.cover.id", j);
                SendRedPacketActivity.this.startActivityForResult(intent, 28256);
            }
        }, this.f121208b, this.f121209c, this.f121210d, this.f121211e, this.f121212f);
        this.f121207a = fVar;
        fVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_send_redpacket);
        m190115d();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C48040d.m189602a().mo168231a(getApplication());
    }

    /* renamed from: a */
    public static Resources m190110a(SendRedPacketActivity sendRedPacketActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sendRedPacketActivity);
        }
        return sendRedPacketActivity.mo168580a();
    }

    /* renamed from: c */
    public static AssetManager m190114c(SendRedPacketActivity sendRedPacketActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sendRedPacketActivity);
        }
        return sendRedPacketActivity.mo168583c();
    }

    /* renamed from: b */
    public static void m190113b(SendRedPacketActivity sendRedPacketActivity) {
        sendRedPacketActivity.mo168582b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SendRedPacketActivity sendRedPacketActivity2 = sendRedPacketActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    sendRedPacketActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m190112a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        this.f121209c = bundle.getString("extra.chat.id");
        this.f121208b = bundle.getBoolean("extra.chat.is.group");
        this.f121210d = bundle.getInt("extra.group.member.num");
        this.f121211e = bundle.getString("extra.user.id");
        this.f121212f = bundle.getString("extra.user.name");
        if (TextUtils.isEmpty(this.f121209c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m190111a(SendRedPacketActivity sendRedPacketActivity, Context context) {
        sendRedPacketActivity.mo168581a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sendRedPacketActivity);
        }
    }

    /* renamed from: a */
    public static Context m190108a(SendRedPacketActivity sendRedPacketActivity, Configuration configuration) {
        Context a = sendRedPacketActivity.mo168579a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            if (i == 28256) {
                long longExtra = intent.getLongExtra("extra.cover.id", -1);
                String stringExtra = intent.getStringExtra("extra.cover.name");
                String stringExtra2 = intent.getStringExtra("extra.cover.image.key");
                String stringExtra3 = intent.getStringExtra("extra.cover.fs.unit");
                PassThroughImage passThroughImage = null;
                if (!(stringExtra2 == null || stringExtra3 == null)) {
                    passThroughImage = new PassThroughImage(stringExtra2, stringExtra3);
                }
                this.f121207a.mo168634a(new RedPacketCover(longExtra, stringExtra, RedPacketCover.CoverType.UNKNOWN, passThroughImage, null, null, null));
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: a */
    public static Intent m190109a(Context context, String str, boolean z, int i, String str2, String str3) {
        Intent intent = new Intent(context, SendRedPacketActivity.class);
        intent.putExtra("extra.chat.id", str);
        intent.putExtra("extra.chat.is.group", z);
        intent.putExtra("extra.group.member.num", i);
        intent.putExtra("extra.user.id", str2);
        intent.putExtra("extra.user.name", str3);
        return intent;
    }
}
