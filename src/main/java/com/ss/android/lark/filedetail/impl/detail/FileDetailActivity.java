package com.ss.android.lark.filedetail.impl.detail;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.drivesdk.action.ShowErrorPageAction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.dto.FileDetailLaunchParams;
import com.ss.android.lark.filedetail.impl.FileDetailFragment;
import com.ss.android.lark.filedetail.impl.detail.listener.IPushMessageListener;
import com.ss.android.lark.filedetail.impl.open.diver.DriverSDKFileOpenManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.util.Objects;

public class FileDetailActivity extends BaseFragmentActivity implements FileDetailFragment.AbstractC38226a {

    /* renamed from: a */
    public String f98032a;

    /* renamed from: b */
    private Message f98033b;

    /* renamed from: c */
    private boolean f98034c;

    /* renamed from: d */
    private IPushMessageListener f98035d;

    /* renamed from: a */
    public Context mo139798a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo139799a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo139800a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m150342a(this, context);
    }

    /* renamed from: b */
    public void mo139802b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo139803c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m150340a(this, configuration);
    }

    public AssetManager getAssets() {
        return m150344c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m150341a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m150343b(this);
    }

    /* renamed from: d */
    private void m150345d() {
        if (this.f98034c && this.f98033b != null) {
            this.f98035d = new IPushMessageListener() {
                /* class com.ss.android.lark.filedetail.impl.detail.$$Lambda$nL4TlBDMEFB8VVx2zhVHxDMx_JQ */

                @Override // com.ss.android.lark.filedetail.impl.detail.listener.IPushMessageListener
                public final void onPushMessage(MessageInfo messageInfo) {
                    FileDetailActivity.this.mo139801a(messageInfo);
                }
            };
            FileDetailModule.f97880b.mo139564a().getPushDependency().mo139628a(String.valueOf(hashCode()), this.f98033b.getChatId(), this.f98035d);
        }
    }

    /* renamed from: e */
    private void m150346e() {
        FileDetailLaunchParams fileDetailLaunchParams;
        Bundle extras = getIntent().getExtras();
        if (extras != null && (fileDetailLaunchParams = (FileDetailLaunchParams) extras.getSerializable("extra.launch.params")) != null) {
            this.f98033b = fileDetailLaunchParams.getMessage();
            this.f98034c = fileDetailLaunchParams.isSecret();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        if (this.f98035d != null) {
            FileDetailModule.f97880b.mo139564a().getPushDependency().mo139629b(String.valueOf(hashCode()), this.f98033b.getChatId(), this.f98035d);
        }
    }

    /* renamed from: a */
    public static Resources m150341a(FileDetailActivity fileDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fileDetailActivity);
        }
        return fileDetailActivity.mo139799a();
    }

    /* renamed from: c */
    public static AssetManager m150344c(FileDetailActivity fileDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fileDetailActivity);
        }
        return fileDetailActivity.mo139803c();
    }

    /* renamed from: b */
    public static void m150343b(FileDetailActivity fileDetailActivity) {
        fileDetailActivity.mo139802b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FileDetailActivity fileDetailActivity2 = fileDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    fileDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FileDetailFragment fileDetailFragment = new FileDetailFragment();
        fileDetailFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, fileDetailFragment, (String) null).commitAllowingStateLoss();
        m150346e();
        m150345d();
    }

    /* renamed from: a */
    public void mo139801a(MessageInfo messageInfo) {
        Message message = messageInfo.getMessage();
        Message message2 = this.f98033b;
        if (message2 != null && Objects.equals(message2.getId(), message.getId()) && message.isBurned() && !TextUtils.isEmpty(this.f98032a)) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.filedetail.impl.detail.FileDetailActivity.RunnableC382291 */

                public void run() {
                    DriverSDKFileOpenManager.f98357c.mo140081a().mo140080a(String.valueOf(FileDetailActivity.this.f98032a.hashCode()), new ShowErrorPageAction(UIHelper.getString(R.string.Lark_Legacy_ThisMsgAutoDeletedAlready), true));
                }
            });
        }
    }

    @Override // com.ss.android.lark.filedetail.impl.FileDetailFragment.AbstractC38226a
    /* renamed from: a */
    public void mo139771a(String str) {
        this.f98032a = str;
    }

    /* renamed from: a */
    public static void m150342a(FileDetailActivity fileDetailActivity, Context context) {
        fileDetailActivity.mo139800a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fileDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m150340a(FileDetailActivity fileDetailActivity, Configuration configuration) {
        Context a = fileDetailActivity.mo139798a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
