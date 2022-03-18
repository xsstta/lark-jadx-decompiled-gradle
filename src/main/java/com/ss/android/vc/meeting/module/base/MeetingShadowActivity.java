package com.ss.android.vc.meeting.module.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0004H\u0014J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u0004H\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0014J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/meeting/module/base/MeetingShadowActivity;", "Lcom/ss/android/vc/common/base/BaseActivity;", "()V", "finish", "", "finishAndRemoveTask", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "onPause", "onResume", "onStart", "onStop", "processIntent", "launchIntent", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingShadowActivity extends BaseActivity {

    /* renamed from: b */
    public static WeakReference<ByteRTCMeetingActivity> f154001b;

    /* renamed from: c */
    public static final Companion f154002c = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m239604a(Context context, boolean z, ByteRTCMeetingActivity byteRTCMeetingActivity) {
        f154002c.mo212808a(context, z, byteRTCMeetingActivity);
    }

    /* renamed from: a */
    public Context mo212799a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo212801a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m239607a(this, context);
    }

    /* renamed from: b */
    public Resources mo212802b() {
        return super.getResources();
    }

    /* renamed from: c */
    public AssetManager mo212803c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m239603a(this, configuration);
    }

    public AssetManager getAssets() {
        return m239609c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m239608b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m239606a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/meeting/module/base/MeetingShadowActivity$Companion;", "", "()V", "EXTRA_FINISH_MEETING_ACTIVITY", "", "EXTRA_LAUNCH_INTENT", "INTENT_LAUNCH_MAIN_TASK", "TAG", "meetingActivityRef", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/vc/meeting/module/multi/ByteRTCMeetingActivity;", "getMeetingActivityRef", "()Ljava/lang/ref/WeakReference;", "setMeetingActivityRef", "(Ljava/lang/ref/WeakReference;)V", "goToMainTask", "", "context", "Landroid/content/Context;", "finishMeetingActivity", "", "meetingActivity", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.base.MeetingShadowActivity$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo212809a(WeakReference<ByteRTCMeetingActivity> weakReference) {
            MeetingShadowActivity.f154001b = weakReference;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo212808a(Context context, boolean z, ByteRTCMeetingActivity byteRTCMeetingActivity) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C60700b.m235851b("MeetingShadowActivity", "[goToMainTask]", "[launch]");
            Intent intent = new Intent(context, MeetingShadowActivity.class);
            intent.putExtra("extra_launch_intent", "intent_launch_main_task");
            intent.putExtra("extra_finish_meeting_activity", z);
            intent.setFlags(268435456);
            if (byteRTCMeetingActivity != null) {
                MeetingShadowActivity.f154002c.mo212809a(new WeakReference<>(byteRTCMeetingActivity));
            }
            context.startActivity(intent);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/base/MeetingShadowActivity$processIntent$2$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.base.MeetingShadowActivity$c */
    public static final class RunnableC61416c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingShadowActivity f154005a;

        RunnableC61416c(MeetingShadowActivity meetingShadowActivity) {
            this.f154005a = meetingShadowActivity;
        }

        public final void run() {
            this.f154005a.finishAndRemoveTask();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        C60700b.m235851b("MeetingShadowActivity", "[onPause]", "");
        super.onPause();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.common.base.BaseActivity
    public void onStart() {
        C60700b.m235851b("MeetingShadowActivity", "[onStart]", "");
        super.onStart();
    }

    public void finish() {
        C60700b.m235851b("MeetingShadowActivity", "[finish]", "");
        super.finish();
        overridePendingTransition(R.anim.none, R.anim.none);
    }

    public void finishAndRemoveTask() {
        C60700b.m235851b("MeetingShadowActivity", "[finishAndRemoveTask]", "");
        super.finishAndRemoveTask();
        overridePendingTransition(R.anim.none, R.anim.none);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        C60700b.m235851b("MeetingShadowActivity", "[onResume]", "");
        super.onResume();
        m239605a(getIntent());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/ss/android/vc/meeting/module/base/MeetingShadowActivity$onDestroy$2$1$1", "com/ss/android/vc/meeting/module/base/MeetingShadowActivity$$special$$inlined$notNull$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.base.MeetingShadowActivity$b */
    static final class RunnableC61415b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ByteRTCMeetingActivity f154003a;

        /* renamed from: b */
        final /* synthetic */ MeetingShadowActivity f154004b;

        RunnableC61415b(ByteRTCMeetingActivity byteRTCMeetingActivity, MeetingShadowActivity meetingShadowActivity) {
            this.f154003a = byteRTCMeetingActivity;
            this.f154004b = meetingShadowActivity;
        }

        public final void run() {
            ByteRTCMeetingActivity byteRTCMeetingActivity = this.f154003a;
            if (byteRTCMeetingActivity != null && !byteRTCMeetingActivity.isFinishing() && this.f154003a.mo215863x()) {
                C60700b.m235851b("MeetingShadowActivity", "[onDestroy3]", "will go to launcher");
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                this.f154004b.startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        WeakReference<ByteRTCMeetingActivity> weakReference;
        WeakReference<ByteRTCMeetingActivity> weakReference2;
        ActivityManager.RecentTaskInfo taskInfo;
        Intent intent;
        ComponentName component;
        String className;
        int i;
        super.onDestroy();
        Activity c = VCAppLifeCycle.m236256c();
        StringBuilder sb = new StringBuilder();
        sb.append("top activity: ");
        ByteRTCMeetingActivity byteRTCMeetingActivity = null;
        sb.append(c != null ? (LineHeightTextView) c.findViewById(R.id.simple_name) : null);
        C60700b.m235851b("MeetingShadowActivity", "[onDestroy]", sb.toString());
        if (Build.VERSION.SDK_INT >= 23) {
            Object systemService = getSystemService("activity");
            if (systemService != null) {
                List<ActivityManager.AppTask> appTasks = ((ActivityManager) systemService).getAppTasks();
                boolean z = false;
                if (appTasks != null && appTasks.size() > 0) {
                    boolean z2 = false;
                    for (ActivityManager.AppTask appTask : appTasks) {
                        if (!(appTask == null || (taskInfo = appTask.getTaskInfo()) == null || (intent = taskInfo.baseIntent) == null || (component = intent.getComponent()) == null || (className = component.getClassName()) == null || !StringsKt.contains$default((CharSequence) className, (CharSequence) "com.ss.android.lark.main.app.MainActivity", false, 2, (Object) null))) {
                            ActivityManager.RecentTaskInfo taskInfo2 = appTask.getTaskInfo();
                            if (taskInfo2 != null) {
                                i = taskInfo2.numActivities;
                            } else {
                                i = 0;
                            }
                            if (i > 0) {
                                z2 = true;
                            }
                        }
                    }
                    z = z2;
                }
                if (!(z || (weakReference2 = f154001b) == null)) {
                    if (weakReference2 != null) {
                        byteRTCMeetingActivity = weakReference2.get();
                    }
                    if (!(byteRTCMeetingActivity == null || byteRTCMeetingActivity == null || byteRTCMeetingActivity.isFinishing())) {
                        C60700b.m235851b("MeetingShadowActivity", "[onDestroy2]", "will go to launcher");
                        Intent intent2 = new Intent("android.intent.action.MAIN");
                        intent2.addCategory("android.intent.category.HOME");
                        startActivity(intent2);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
        } else if (((c instanceof ByteRTCMeetingActivity) || (c instanceof MeetingShadowActivity)) && (weakReference = f154001b) != null) {
            if (weakReference != null) {
                byteRTCMeetingActivity = weakReference.get();
            }
            if (byteRTCMeetingActivity != null) {
                C60735ab.m236002a(new RunnableC61415b(byteRTCMeetingActivity, this), 100);
            }
        }
    }

    /* renamed from: a */
    public void mo212800a() {
        C60700b.m235851b("MeetingShadowActivity", "[onStop]", "");
        super.onStop();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        C60700b.m235851b("MeetingShadowActivity", "[onNewIntent]", "");
        super.onNewIntent(intent);
        m239605a(intent);
    }

    /* renamed from: b */
    public static Resources m239608b(MeetingShadowActivity meetingShadowActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingShadowActivity);
        }
        return meetingShadowActivity.mo212802b();
    }

    /* renamed from: c */
    public static AssetManager m239609c(MeetingShadowActivity meetingShadowActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingShadowActivity);
        }
        return meetingShadowActivity.mo212803c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        C60700b.m235851b("MeetingShadowActivity", "[onCreate]", "");
        super.onCreate(bundle);
        overridePendingTransition(R.anim.none, R.anim.none);
        setContentView(R.layout.vc_activity_shadow);
    }

    /* renamed from: a */
    public static void m239606a(MeetingShadowActivity meetingShadowActivity) {
        meetingShadowActivity.mo212800a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MeetingShadowActivity meetingShadowActivity2 = meetingShadowActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    meetingShadowActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final void m239605a(Intent intent) {
        ByteRTCMeetingActivity byteRTCMeetingActivity;
        if (intent != null && intent == null) {
            C60700b.m235851b("MeetingShadowActivity", "[processIntent]", "intent is null");
        } else if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_launch_intent");
            boolean booleanExtra = intent.getBooleanExtra("extra_finish_meeting_activity", false);
            C60700b.m235851b("MeetingShadowActivity", "[processIntent 2]", "launchIntent = " + stringExtra + ", finishMeetingActivity = " + booleanExtra);
            if (stringExtra != null && stringExtra.hashCode() == -1349671422 && stringExtra.equals("intent_launch_main_task")) {
                if (booleanExtra) {
                    WeakReference<ByteRTCMeetingActivity> weakReference = f154001b;
                    if (!(weakReference == null || (byteRTCMeetingActivity = weakReference.get()) == null)) {
                        Intrinsics.checkExpressionValueIsNotNull(byteRTCMeetingActivity, "it");
                        if (!byteRTCMeetingActivity.isFinishing()) {
                            C60700b.m235851b("MeetingShadowActivity", "[processIntent 3]", "fill finish meetingActivity");
                            byteRTCMeetingActivity.finishAndRemoveTask();
                        }
                    }
                    f154001b = null;
                }
                if (RomUtils.m94940b()) {
                    C60735ab.m236002a(new RunnableC61416c(this), 300);
                } else {
                    finishAndRemoveTask();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m239607a(MeetingShadowActivity meetingShadowActivity, Context context) {
        meetingShadowActivity.mo212801a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingShadowActivity);
        }
    }

    /* renamed from: a */
    public static Context m239603a(MeetingShadowActivity meetingShadowActivity, Configuration configuration) {
        Context a = meetingShadowActivity.mo212799a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
