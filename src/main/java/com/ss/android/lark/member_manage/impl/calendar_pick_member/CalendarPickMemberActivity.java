package com.ss.android.lark.member_manage.impl.calendar_pick_member;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberFragment;", "getMFragment", "()Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberFragment;", "mFragment$delegate", "Lkotlin/Lazy;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarPickMemberActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f114176a = new Companion(null);

    /* renamed from: b */
    private final Lazy f114177b = LazyKt.lazy(C45087b.INSTANCE);

    /* renamed from: d */
    private final CalendarPickMemberFragment m178896d() {
        return (CalendarPickMemberFragment) this.f114177b.getValue();
    }

    /* renamed from: a */
    public Context mo159543a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo159544a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo159545a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m178893a(this, context);
    }

    /* renamed from: b */
    public void mo159546b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo159547c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m178891a(this, configuration);
    }

    public AssetManager getAssets() {
        return m178895c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m178892a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m178894b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberActivity$Companion;", "", "()V", "SELECTED_REQUEST_CODE", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.CalendarPickMemberActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberFragment;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.CalendarPickMemberActivity$b */
    static final class C45087b extends Lambda implements Function0<CalendarPickMemberFragment> {
        public static final C45087b INSTANCE = new C45087b();

        C45087b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarPickMemberFragment invoke() {
            return new CalendarPickMemberFragment();
        }
    }

    /* renamed from: a */
    public static Resources m178892a(CalendarPickMemberActivity calendarPickMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarPickMemberActivity);
        }
        return calendarPickMemberActivity.mo159544a();
    }

    /* renamed from: c */
    public static AssetManager m178895c(CalendarPickMemberActivity calendarPickMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarPickMemberActivity);
        }
        return calendarPickMemberActivity.mo159547c();
    }

    /* renamed from: b */
    public static void m178894b(CalendarPickMemberActivity calendarPickMemberActivity) {
        calendarPickMemberActivity.mo159546b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarPickMemberActivity calendarPickMemberActivity2 = calendarPickMemberActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarPickMemberActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Intrinsics.checkExpressionValueIsNotNull(extras, "intent.extras ?: return");
            m178896d().setArguments(extras);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
            beginTransaction.add(16908290, m178896d(), (String) null);
            beginTransaction.commitNowAllowingStateLoss();
        }
    }

    /* renamed from: a */
    public static void m178893a(CalendarPickMemberActivity calendarPickMemberActivity, Context context) {
        calendarPickMemberActivity.mo159545a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarPickMemberActivity);
        }
    }

    /* renamed from: a */
    public static Context m178891a(CalendarPickMemberActivity calendarPickMemberActivity, Configuration configuration) {
        Context a = calendarPickMemberActivity.mo159543a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m178896d().onActivityResult(i, i2, intent);
    }
}
