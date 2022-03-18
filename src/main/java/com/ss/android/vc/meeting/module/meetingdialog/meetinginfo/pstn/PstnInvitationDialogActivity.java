package com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.FullScreen.FullScreenFrame;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/PstnInvitationDialogActivity;", "Lcom/ss/android/vc/common/base/BaseActivity;", "()V", "adminSettings", "Lcom/ss/android/vc/entity/AdminSettings;", "getAdminSettings", "()Lcom/ss/android/vc/entity/AdminSettings;", "setAdminSettings", "(Lcom/ss/android/vc/entity/AdminSettings;)V", "meetingNumber", "", "getMeetingNumber", "()Ljava/lang/String;", "setMeetingNumber", "(Ljava/lang/String;)V", "autoAdapterFullScreen", "", "finish", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class PstnInvitationDialogActivity extends BaseActivity {

    /* renamed from: b */
    public static final Companion f156566b = new Companion(null);

    /* renamed from: c */
    private String f156567c;

    /* renamed from: d */
    private AdminSettings f156568d;

    /* renamed from: a */
    public Context mo215477a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo215478a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo215479a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m243407a(this, context);
    }

    /* renamed from: b */
    public void mo215480b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo215481c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m243405a(this, configuration);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.base.BaseActivity
    /* renamed from: e */
    public boolean mo208278e() {
        return false;
    }

    public AssetManager getAssets() {
        return m243409c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m243406a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m243408b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/PstnInvitationDialogActivity$Companion;", "", "()V", "EXTRA_PARAM_ADMIN_SETTING", "", "EXTRA_PARAM_MEETING_NUMBER", "TAG", "startActivity", "", "meetingNumber", "adminSettings", "Lcom/ss/android/vc/entity/AdminSettings;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.PstnInvitationDialogActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo215485a(String str, AdminSettings adminSettings) {
            Intrinsics.checkParameterIsNotNull(str, "meetingNumber");
            C60700b.m235851b("PstnInvitationDialogActivity@", "[startActivity]", "startActivity");
            Bundle bundle = new Bundle();
            bundle.putString("meeting_number", str);
            bundle.putSerializable("admin_setting", adminSettings);
            C26323w.m95327a(ar.m236694a(), PstnInvitationDialogActivity.class, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.PstnInvitationDialogActivity$c */
    static final class C62311c implements AbstractC61222a.AbstractC61223a {

        /* renamed from: a */
        final /* synthetic */ PstnInvitationDialogActivity f156569a;

        C62311c(PstnInvitationDialogActivity pstnInvitationDialogActivity) {
            this.f156569a = pstnInvitationDialogActivity;
        }

        @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a.AbstractC61223a
        public final void bY_() {
            this.f156569a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.PstnInvitationDialogActivity$b */
    static final class C62310b extends Lambda implements Function0<Unit> {
        final /* synthetic */ PstnInvitationDialogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62310b(PstnInvitationDialogActivity pstnInvitationDialogActivity) {
            super(0);
            this.this$0 = pstnInvitationDialogActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.finish();
        }
    }

    public void finish() {
        super.finish();
        if (!DesktopUtil.m144307b()) {
            overridePendingTransition(R.anim.vc_activity_stay, R.anim.frame_bottom_out);
        }
    }

    /* renamed from: a */
    public static Resources m243406a(PstnInvitationDialogActivity pstnInvitationDialogActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pstnInvitationDialogActivity);
        }
        return pstnInvitationDialogActivity.mo215478a();
    }

    /* renamed from: c */
    public static AssetManager m243409c(PstnInvitationDialogActivity pstnInvitationDialogActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pstnInvitationDialogActivity);
        }
        return pstnInvitationDialogActivity.mo215481c();
    }

    /* renamed from: b */
    public static void m243408b(PstnInvitationDialogActivity pstnInvitationDialogActivity) {
        pstnInvitationDialogActivity.mo215480b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PstnInvitationDialogActivity pstnInvitationDialogActivity2 = pstnInvitationDialogActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    pstnInvitationDialogActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        C60700b.m235851b("PstnInvitationDialogActivity@", "[onCreate]", "onCreate");
        Intent intent = getIntent();
        if (intent != null) {
            this.f156567c = intent.getStringExtra("meeting_number");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                serializable = extras.getSerializable("admin_setting");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof AdminSettings)) {
                serializable = null;
            }
            this.f156568d = (AdminSettings) serializable;
        }
        if (!DesktopUtil.m144307b()) {
            overridePendingTransition(R.anim.frame_bottom_in, R.anim.vc_activity_stay);
            PstnInvitationDialogActivity pstnInvitationDialogActivity = this;
            MeetingPstnInvitationDialog bVar = new MeetingPstnInvitationDialog(pstnInvitationDialogActivity, null, this.f156567c, this.f156568d);
            bVar.mo211628a(pstnInvitationDialogActivity).mo211631a((FullScreenFrame.AnimationType) null);
            bVar.mo215491a(new C62310b(this));
            bVar.mo211606a();
            return;
        }
        PstnInvitationDesktopDialog dVar = new PstnInvitationDesktopDialog(this, this.f156567c, this.f156568d);
        dVar.mo211609a(new C62311c(this));
        dVar.mo211606a();
    }

    /* renamed from: a */
    public static void m243407a(PstnInvitationDialogActivity pstnInvitationDialogActivity, Context context) {
        pstnInvitationDialogActivity.mo215479a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pstnInvitationDialogActivity);
        }
    }

    /* renamed from: a */
    public static Context m243405a(PstnInvitationDialogActivity pstnInvitationDialogActivity, Configuration configuration) {
        Context a = pstnInvitationDialogActivity.mo215477a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
