package com.ss.android.lark.moments.impl.setting;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.mainview.MomentsAppNameHolder;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/setting/MomentsSettingActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "vm", "Lcom/ss/android/lark/moments/impl/setting/MomentsSettingViewModel;", "getVm", "()Lcom/ss/android/lark/moments/impl/setting/MomentsSettingViewModel;", "vm$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsSettingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private final Lazy f120879a = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentsSettingViewModel.class), new MomentsSettingActivity$$special$$inlined$viewModels$2(this), new MomentsSettingActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: b */
    private HashMap f120880b;

    /* renamed from: a */
    public Context mo168168a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo168169a(int i) {
        if (this.f120880b == null) {
            this.f120880b = new HashMap();
        }
        View view = (View) this.f120880b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f120880b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MomentsSettingViewModel mo168170a() {
        return (MomentsSettingViewModel) this.f120879a.getValue();
    }

    /* renamed from: a */
    public void mo168171a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m189542a(this, context);
    }

    /* renamed from: b */
    public Resources mo168172b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo168173c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m189540a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo168175d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m189544c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m189541a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m189543b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isMute", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.setting.MomentsSettingActivity$b */
    static final class C48016b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsSettingActivity f120882a;

        C48016b(MomentsSettingActivity momentsSettingActivity) {
            this.f120882a = momentsSettingActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            ((UDSwitch) this.f120882a.mo168169a(R.id.btSwitch)).setCheckedIgnoreEvent(!bool.booleanValue());
        }
    }

    /* renamed from: a */
    public static Resources m189541a(MomentsSettingActivity momentsSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsSettingActivity);
        }
        return momentsSettingActivity.mo168172b();
    }

    /* renamed from: c */
    public static AssetManager m189544c(MomentsSettingActivity momentsSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsSettingActivity);
        }
        return momentsSettingActivity.mo168175d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isOpened", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.setting.MomentsSettingActivity$c */
    static final class C48017c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsSettingActivity f120883a;

        C48017c(MomentsSettingActivity momentsSettingActivity) {
            this.f120883a = momentsSettingActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            MomentsSettingActivity momentsSettingActivity = this.f120883a;
            LKUIToast.show(momentsSettingActivity, UIUtils.getString(momentsSettingActivity, R.string.Lark_Settings_MomentsSetFailed));
            Intrinsics.checkExpressionValueIsNotNull(bool, "isOpened");
            ((UDSwitch) this.f120883a.mo168169a(R.id.btSwitch)).setCheckedIgnoreEvent(bool.booleanValue());
        }
    }

    /* renamed from: b */
    public static void m189543b(MomentsSettingActivity momentsSettingActivity) {
        momentsSettingActivity.mo168173c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsSettingActivity momentsSettingActivity2 = momentsSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        setContentView(R.layout.moments_activity_setting);
        ((CommonTitleBar) mo168169a(R.id.titlebar)).setTitle(MomentsAppNameHolder.m188686a());
        ((UDSwitch) mo168169a(R.id.btSwitch)).setOnCheckedChangeListener(new C48015a(this));
        MomentsSettingActivity momentsSettingActivity = this;
        mo168170a().getRedDotIsMute().mo5923a(momentsSettingActivity, new C48016b(this));
        mo168170a().getChangeFailedToReturn().mo5923a(momentsSettingActivity, new C48017c(this));
        mo168170a().getUserSetting();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.setting.MomentsSettingActivity$a */
    static final class C48015a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ MomentsSettingActivity f120881a;

        C48015a(MomentsSettingActivity momentsSettingActivity) {
            this.f120881a = momentsSettingActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MomentsHitPointNew.f119721a.mo166865b(z);
            this.f120881a.mo168170a().patchRedDotNotification(z);
        }
    }

    /* renamed from: a */
    public static void m189542a(MomentsSettingActivity momentsSettingActivity, Context context) {
        momentsSettingActivity.mo168171a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m189540a(MomentsSettingActivity momentsSettingActivity, Configuration configuration) {
        Context a = momentsSettingActivity.mo168168a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
