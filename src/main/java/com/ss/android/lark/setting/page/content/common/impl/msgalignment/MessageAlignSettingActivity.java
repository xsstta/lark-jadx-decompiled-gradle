package com.ss.android.lark.setting.page.content.common.impl.msgalignment;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.statistics.SettingHitPointNew;
import com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.AlignMode;
import com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.MessageAlignModeService;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/msgalignment/MessageAlignSettingActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "fetchAlignMode", "", "initCheckBox", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "scheduleSetAlignMode", "alignMode", "Lcom/ss/android/lark/setting/service/usersetting/msgalignmentstyle/AlignMode;", "sendAlignChangeHitPoint", "updateCheckBox", "mode", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MessageAlignSettingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f134225a = new Companion(null);

    /* renamed from: b */
    private HashMap f134226b;

    /* renamed from: a */
    public Context mo185551a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo185552a() {
        return super.getResources();
    }

    /* renamed from: a */
    public View mo185553a(int i) {
        if (this.f134226b == null) {
            this.f134226b = new HashMap();
        }
        View view = (View) this.f134226b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f134226b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo185554a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m210527a(this, context);
    }

    /* renamed from: b */
    public void mo185556b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo185557c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m210525a(this, configuration);
    }

    public AssetManager getAssets() {
        return m210530c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m210526a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m210528b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/msgalignment/MessageAlignSettingActivity$Companion;", "", "()V", "REQ_CODE", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.msgalignment.MessageAlignSettingActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    private final void m210533e() {
        m210531c(MessageAlignModeService.f135136a.mo186841c());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        m210532d();
        m210531c(MessageAlignModeService.f135136a.mo186841c());
        m210533e();
    }

    /* renamed from: d */
    private final void m210532d() {
        ((LinearLayout) mo185553a(R.id.msg_align_left_region)).setOnClickListener(new View$OnClickListenerC54220b(this));
        ((LinearLayout) mo185553a(R.id.msg_align_right_region)).setOnClickListener(new View$OnClickListenerC54221c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.msgalignment.MessageAlignSettingActivity$b */
    public static final class View$OnClickListenerC54220b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageAlignSettingActivity f134227a;

        View$OnClickListenerC54220b(MessageAlignSettingActivity messageAlignSettingActivity) {
            this.f134227a = messageAlignSettingActivity;
        }

        public final void onClick(View view) {
            this.f134227a.mo185555a(AlignMode.AlignLeft);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.msgalignment.MessageAlignSettingActivity$c */
    public static final class View$OnClickListenerC54221c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageAlignSettingActivity f134228a;

        View$OnClickListenerC54221c(MessageAlignSettingActivity messageAlignSettingActivity) {
            this.f134228a = messageAlignSettingActivity;
        }

        public final void onClick(View view) {
            this.f134228a.mo185555a(AlignMode.AlignLeftAndRight);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        setContentView(R.layout.activity_msg_alignment);
    }

    /* renamed from: a */
    public static Resources m210526a(MessageAlignSettingActivity messageAlignSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(messageAlignSettingActivity);
        }
        return messageAlignSettingActivity.mo185552a();
    }

    /* renamed from: c */
    public static AssetManager m210530c(MessageAlignSettingActivity messageAlignSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(messageAlignSettingActivity);
        }
        return messageAlignSettingActivity.mo185557c();
    }

    /* renamed from: b */
    public static void m210528b(MessageAlignSettingActivity messageAlignSettingActivity) {
        messageAlignSettingActivity.mo185556b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MessageAlignSettingActivity messageAlignSettingActivity2 = messageAlignSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    messageAlignSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private final void m210529b(AlignMode alignMode) {
        int i = C54222a.f134229a[alignMode.ordinal()];
        if (i == 1) {
            SettingHitPointNew.m211613a(SettingHitPointNew.MessageAlignTypeClickParam.MSG_LEFT_ALIGN_ON);
            SettingHitPointNew.m211613a(SettingHitPointNew.MessageAlignTypeClickParam.MSG_LEFT_RIGHT_ALIGN_OFF);
        } else if (i == 2) {
            SettingHitPointNew.m211613a(SettingHitPointNew.MessageAlignTypeClickParam.MSG_LEFT_ALIGN_OFF);
            SettingHitPointNew.m211613a(SettingHitPointNew.MessageAlignTypeClickParam.MSG_LEFT_RIGHT_ALIGN_ON);
        }
    }

    /* renamed from: c */
    private final void m210531c(AlignMode alignMode) {
        if (alignMode != null && C54222a.f134230b[alignMode.ordinal()] == 1) {
            UDCheckBox uDCheckBox = (UDCheckBox) mo185553a(R.id.cb_msg_bubble_align_left_right);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "cb_msg_bubble_align_left_right");
            uDCheckBox.setChecked(true);
            UDCheckBox uDCheckBox2 = (UDCheckBox) mo185553a(R.id.cb_msg_bubble_align_left);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "cb_msg_bubble_align_left");
            uDCheckBox2.setChecked(false);
            return;
        }
        UDCheckBox uDCheckBox3 = (UDCheckBox) mo185553a(R.id.cb_msg_bubble_align_left_right);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "cb_msg_bubble_align_left_right");
        uDCheckBox3.setChecked(false);
        UDCheckBox uDCheckBox4 = (UDCheckBox) mo185553a(R.id.cb_msg_bubble_align_left);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox4, "cb_msg_bubble_align_left");
        uDCheckBox4.setChecked(true);
    }

    /* renamed from: a */
    public final void mo185555a(AlignMode alignMode) {
        if (MessageAlignModeService.f135136a.mo186841c() != alignMode) {
            MessageAlignModeService.f135136a.mo186839a(alignMode);
            UDToast.show(this, (int) R.string.Lark_Legacy_SaveSuccess, (int) R.drawable.lkui_icon_succcess);
            m210531c(alignMode);
            m210529b(alignMode);
            setResult(-1);
        }
    }

    /* renamed from: a */
    public static void m210527a(MessageAlignSettingActivity messageAlignSettingActivity, Context context) {
        messageAlignSettingActivity.mo185554a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(messageAlignSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m210525a(MessageAlignSettingActivity messageAlignSettingActivity, Configuration configuration) {
        Context a = messageAlignSettingActivity.mo185551a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
