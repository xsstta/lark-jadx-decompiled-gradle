package com.ss.android.lark.money.redpacket.detail;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.transition.TransitionSet;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.p2366b.C48023a;
import com.ss.android.lark.money.redpacket.detail.RedPacketDetailView;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetail;
import com.ss.android.lark.money.redpacket.dto.RedPacketInfo;
import com.ss.android.lark.money.redpacket.history.RedPacketHistoryActivity;
import com.ss.android.lark.money.redpacket.p2368a.C48035b;
import com.ss.android.lark.money.redpacket.p2369b.C48040d;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.navigation.Navigation;

public class RedPacketDetailActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public String f121067a = "activity";

    /* renamed from: b */
    private C48116c f121068b;

    /* renamed from: c */
    private RedPacketInfo f121069c;

    /* renamed from: d */
    private RedPacketDetail f121070d;

    /* renamed from: e */
    private String f121071e;

    /* renamed from: f */
    private RedPacketDetailView.AbstractC48105b f121072f = new RedPacketDetailView.AbstractC48105b() {
        /* class com.ss.android.lark.money.redpacket.detail.RedPacketDetailActivity.C480961 */

        @Override // com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.AbstractC48105b
        /* renamed from: a */
        public void mo168408a() {
            RedPacketDetailActivity.this.finish();
        }

        @Override // com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.AbstractC48105b
        /* renamed from: b */
        public void mo168412b() {
            C48023a.m189561a().mo168194a(RedPacketDetailActivity.this);
        }

        @Override // com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.AbstractC48105b
        /* renamed from: c */
        public void mo168413c() {
            RedPacketDetailActivity.this.startActivity(new Intent(RedPacketDetailActivity.this, RedPacketHistoryActivity.class));
            RedPacketDetailActivity.this.overridePendingTransition(R.anim.slide_right_in, R.anim.slide_right_out);
        }

        @Override // com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.AbstractC48105b
        /* renamed from: a */
        public void mo168409a(RedPacketDetailView redPacketDetailView) {
            ButterKnife.bind(redPacketDetailView, RedPacketDetailActivity.this);
        }

        @Override // com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.AbstractC48105b
        /* renamed from: a */
        public void mo168410a(String str) {
            RedPacketDetailActivity.this.f121067a = str;
        }

        @Override // com.ss.android.lark.money.redpacket.detail.RedPacketDetailView.AbstractC48105b
        /* renamed from: a */
        public void mo168411a(String str, RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail) {
            RedPacketDetailActivity redPacketDetailActivity = RedPacketDetailActivity.this;
            if (str == null) {
                str = "";
            }
            Navigation.from(RedPacketDetailActivity.this).openActivity(RedPacketDetailActivity.m189864a(redPacketDetailActivity, str, redPacketInfo, redPacketDetail));
        }
    };

    /* renamed from: a */
    public Context mo168401a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo168402a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo168403a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m189866a(this, context);
    }

    /* renamed from: b */
    public void mo168404b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo168405c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m189862a(this, configuration);
    }

    public AssetManager getAssets() {
        return m189868c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m189865a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m189867b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C48116c cVar = this.f121068b;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: e */
    private void m189870e() {
        C48116c cVar = new C48116c(this, this.f121072f, this.f121069c, this.f121070d, this.f121067a, this.f121071e);
        this.f121068b = cVar;
        cVar.create();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
        if (this.f121067a.equals("dialog")) {
            overridePendingTransition(0, R.anim.activity_alpha_exit);
        }
    }

    /* renamed from: d */
    private boolean m189869d() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("key_info_data")) {
            return false;
        }
        this.f121069c = (RedPacketInfo) extras.getSerializable("key_info_data");
        if (extras.containsKey("key_window_type")) {
            this.f121067a = extras.getString("key_window_type");
        }
        if (extras.containsKey("key_detail_data")) {
            this.f121070d = (RedPacketDetail) extras.getSerializable("key_detail_data");
        }
        if (!extras.containsKey("key_message_id")) {
            return true;
        }
        this.f121071e = extras.getString("key_message_id");
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C48040d.m189602a().mo168231a(getApplication());
    }

    /* renamed from: c */
    public static AssetManager m189868c(RedPacketDetailActivity redPacketDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(redPacketDetailActivity);
        }
        return redPacketDetailActivity.mo168405c();
    }

    /* renamed from: b */
    public static void m189867b(RedPacketDetailActivity redPacketDetailActivity) {
        redPacketDetailActivity.mo168404b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RedPacketDetailActivity redPacketDetailActivity2 = redPacketDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    redPacketDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
        setContentView(R.layout.activity_red_packet_detail);
        if (!m189869d()) {
            Log.m165383e("RED_PACKET", "wrong params, close activity.");
            finish();
            return;
        }
        if (this.f121067a.equals("dialog")) {
            getWindow().setEnterTransition(new TransitionSet().addTransition(new C48035b(0.5f, 1.0f).excludeTarget(R.id.dialog_bg_view, true)));
        } else {
            ActivityAnimationManager.doAnimationWithDefault(this, getEnterAnimationConfig(), new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN));
        }
        m189870e();
    }

    /* renamed from: a */
    public static Resources m189865a(RedPacketDetailActivity redPacketDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(redPacketDetailActivity);
        }
        return redPacketDetailActivity.mo168402a();
    }

    /* renamed from: a */
    public static void m189866a(RedPacketDetailActivity redPacketDetailActivity, Context context) {
        redPacketDetailActivity.mo168403a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(redPacketDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m189862a(RedPacketDetailActivity redPacketDetailActivity, Configuration configuration) {
        Context a = redPacketDetailActivity.mo168401a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static Intent m189863a(Context context, String str, RedPacketInfo redPacketInfo) {
        Intent intent = new Intent(context, RedPacketDetailActivity.class);
        intent.putExtra("key_info_data", redPacketInfo);
        intent.putExtra("key_message_id", str);
        intent.putExtra("key_window_type", "dialog");
        return intent;
    }

    /* renamed from: a */
    public static Intent m189864a(Context context, String str, RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail) {
        Intent intent = new Intent(context, RedPacketDetailActivity.class);
        intent.putExtra("key_info_data", redPacketInfo);
        intent.putExtra("key_message_id", str);
        intent.putExtra("key_window_type", "activity");
        if (redPacketDetail != null) {
            intent.putExtra("key_detail_data", redPacketDetail);
        }
        return intent;
    }
}
