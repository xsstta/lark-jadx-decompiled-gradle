package com.ss.android.lark.mail.impl.compose;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.suite.R;
import com.ss.android.lark.base.C29517a;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.ComposeMailView;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42351b;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42352c;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.utils.ActivityDependency;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.slideback.SlideHelper;
import com.ss.android.lark.utils.UIHelper;

public class ComposeMailActivity extends BaseMailFragmentActivity implements IWatermarkable {

    /* renamed from: a */
    public boolean f106265a = true;

    /* renamed from: b */
    protected Bundle f106266b;

    /* renamed from: c */
    protected CallbackManager f106267c = new CallbackManager();

    /* renamed from: d */
    public final ActivityDependency f106268d = new ActivityDependency() {
        /* class com.ss.android.lark.mail.impl.compose.ComposeMailActivity.C419051 */

        @Override // com.ss.android.lark.mail.impl.utils.ActivityDependency
        /* renamed from: a */
        public void mo150551a(Fragment fragment) {
            ComposeMailActivity.this.getSupportFragmentManager().beginTransaction().show(fragment).commitAllowingStateLoss();
            ComposeMailActivity.this.getSupportFragmentManager().executePendingTransactions();
        }

        @Override // com.ss.android.lark.mail.impl.utils.ActivityDependency
        /* renamed from: b */
        public void mo150553b(Fragment fragment) {
            ComposeMailActivity.this.getSupportFragmentManager().beginTransaction().hide(fragment).commitAllowingStateLoss();
            ComposeMailActivity.this.getSupportFragmentManager().executePendingTransactions();
        }

        @Override // com.ss.android.lark.mail.impl.utils.ActivityDependency
        /* renamed from: a */
        public void mo150552a(Fragment fragment, int i) {
            ComposeMailActivity.this.getSupportFragmentManager().beginTransaction().add(i, fragment, (String) null).commitAllowingStateLoss();
            ComposeMailActivity.this.getSupportFragmentManager().executePendingTransactions();
        }
    };

    /* renamed from: e */
    C41949c f106269e;

    /* renamed from: f */
    private final String f106270f = "ComposeMailActivity";

    /* renamed from: g */
    private boolean f106271g;

    /* renamed from: h */
    private SlideHelper f106272h;

    /* renamed from: i */
    private final ComposeMailView.AbstractC41920b f106273i = new ComposeMailView.AbstractC41920b() {
        /* class com.ss.android.lark.mail.impl.compose.ComposeMailActivity.C419062 */

        @Override // com.ss.android.lark.mail.impl.compose.ComposeMailView.AbstractC41920b
        /* renamed from: a */
        public void mo150554a(ComposeMailView composeMailView) {
            ButterKnife.bind(composeMailView, ComposeMailActivity.this);
            composeMailView.mo150575a(ComposeMailActivity.this.f106268d);
        }
    };

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public boolean aL_() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public boolean aM_() {
        return false;
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean enableGlobalWatermark() {
        return true;
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public int getWatermarkMode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isNeedLoginStatus() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107411n;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public CallbackManager getCallbackManager() {
        return this.f106267c;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        return this.f106265a;
    }

    static {
        AppCompatDelegate.m728a(true);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        Log.m165389i("ComposeMailActivity", "onBackPressed");
        this.f106269e.mo150854a(true, false, true);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a != null) {
            a.mo102790b(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        this.f106269e.mo150856b();
        super.onStop();
    }

    /* renamed from: f */
    private void mo150717f() {
        C41949c cVar = new C41949c(this, this.f106273i, getIntent());
        this.f106269e = cVar;
        cVar.create();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public Intent getIntent() {
        C29517a.AbstractC29518a a = C29517a.m108723a();
        Intent intent = super.getIntent();
        if (a != null) {
            intent = a.mo102785a(super.getIntent());
        }
        setIntent(intent);
        return intent;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        Log.m165389i("ComposeMailActivity", "onDestroy");
        C43345c.m172076m().mo155003i();
        this.f106269e.destroy();
        this.f106267c.cancelCallbacks();
        super.onDestroy();
    }

    /* renamed from: e */
    private void mo150716e() {
        try {
            getWindow().requestFeature(13);
        } catch (Exception e) {
            Log.m165384e("ComposeMailActivity", "requestFeature error:", e);
        }
        if (getIntent().getBooleanExtra("transition", false)) {
            this.f106265a = false;
            ActivityAnimationManager.doAnimationWithDefault(this, new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD), null);
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        C41949c cVar = this.f106269e;
        if (cVar != null) {
            cVar.mo150863f();
        }
        ((C42351b) C42344d.m169091a(C42351b.class, this)).mo152473j();
        ((C42352c) C42344d.m169091a(C42352c.class, this)).mo152473j();
        super.finish();
        C41988g.m166977h();
        if (isDoAnimationWithDefault()) {
            ActivityAnimationManager.doAnimationWithDefault(this, getExitAnimationConfig(), new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_LEFT_OUT));
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onResume() {
        View currentFocus;
        super.onResume();
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a != null) {
            a.mo102786a((Activity) this);
        }
        if (!(this.f106269e == null || (currentFocus = getCurrentFocus()) == null)) {
            this.f106269e.mo150844a(currentFocus);
        }
        if (this.f106271g) {
            this.f106271g = false;
            this.f106269e.mo150868k();
        }
    }

    /* renamed from: a */
    public void mo150548a(boolean z) {
        this.f106271g = z;
    }

    /* renamed from: a */
    private static boolean mo150713a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.flags & 2;
        applicationInfo.flags = i;
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a != null) {
            context = a.mo102784a(context);
        }
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f106269e.mo150858c();
        setIntent(intent);
        mo150717f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        setSlideEnable(isSlideEnable());
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void unbindService(ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public Bundle parseArguments(Intent intent) {
        if (intent == null) {
            return Bundle.EMPTY;
        }
        if (intent.getExtras() == null) {
            return Bundle.EMPTY;
        }
        return intent.getExtras();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void setSlideEnable(boolean z) {
        if (z && this.f106272h == null) {
            this.f106272h = new SlideHelper(this);
        }
        SlideHelper jVar = this.f106272h;
        if (jVar != null) {
            jVar.mo187295a(z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        if (mo150713a(getApplicationContext())) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectLeakedSqlLiteObjects().detectLeakedRegistrationObjects().detectActivityLeaks().penaltyLog().build());
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        }
        super.onCreate(bundle);
        ((C42351b) C42344d.m169091a(C42351b.class, this)).mo152466b(mo150444a());
        ((C42352c) C42344d.m169091a(C42352c.class, this)).mo152466b(mo150444a());
        if (bundle == null) {
            mo150716e();
        }
        C43345c.m172076m().mo155002h();
        if (isDoAnimationWithDefault() && this.f106265a) {
            ActivityAnimationManager.doAnimationWithDefault(this, getEnterAnimationConfig(), new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_RIGHT_IN));
        }
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        this.f106266b = bundle;
        if (bundle == null) {
            this.f106266b = new Bundle();
        }
        StatusBarUtil.setColorNoTranslucent(this, UIHelper.getColor(R.color.bg_body));
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a != null) {
            a.mo102787a(this, isNeedLoginStatus());
        }
        setContentView(R.layout.mail_compose_activity);
        mo150717f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C41949c cVar = this.f106269e;
        if (cVar != null) {
            cVar.mo150843a(i, i2, intent);
        }
    }
}
