package com.ss.android.vc.meeting.module.multi;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.common.widget.LoadingLottieView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.an;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.meeting.utils.UserCallStatusMonitor;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.service.impl.VideoChatService;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0005\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/MeetingNetDisconnectActivity;", "Lcom/ss/android/vc/common/base/BaseActivity;", "Lcom/ss/android/lark/base/watermark/IWatermarkable;", "()V", "onCallStatusListener", "com/ss/android/vc/meeting/module/multi/MeetingNetDisconnectActivity$onCallStatusListener$1", "Lcom/ss/android/vc/meeting/module/multi/MeetingNetDisconnectActivity$onCallStatusListener$1;", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "enableGlobalWatermark", "", "getWatermarkMode", "", "initData", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "onViewClick", "view", "Landroid/view/View;", "showInfoView", "showLoadingView", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingNetDisconnectActivity extends BaseActivity implements IWatermarkable {

    /* renamed from: c */
    public static final String f157150c = f157150c;

    /* renamed from: d */
    public static String f157151d = "";

    /* renamed from: e */
    public static boolean f157152e;

    /* renamed from: f */
    public static final Companion f157153f = new Companion(null);

    /* renamed from: b */
    public VideoChat f157154b;

    /* renamed from: g */
    private final C62478b f157155g = new C62478b(this);

    /* renamed from: h */
    private HashMap f157156h;

    @JvmStatic
    /* renamed from: b */
    public static final String m244180b() {
        return f157153f.mo215986a();
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m244183c() {
        return f157153f.mo215987b();
    }

    /* renamed from: a */
    public Context mo215976a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo215977a(int i) {
        if (this.f157156h == null) {
            this.f157156h = new HashMap();
        }
        View view = (View) this.f157156h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f157156h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo215979a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m244179a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m244177a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo215981d() {
        return super.getResources();
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public boolean enableGlobalWatermark() {
        return true;
    }

    /* renamed from: g */
    public void mo215982g() {
        super.onStop();
    }

    public AssetManager getAssets() {
        return m244182c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m244178a(this);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable
    public int getWatermarkMode() {
        return 1;
    }

    /* renamed from: h */
    public AssetManager mo215984h() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m244181b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/MeetingNetDisconnectActivity$Companion;", "", "()V", "TAG", "", "VIDEO_CHAT_INFO", "isShown", "", "shownMeetingid", "getShownMeetingId", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.MeetingNetDisconnectActivity$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo215986a() {
            return MeetingNetDisconnectActivity.f157151d;
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo215987b() {
            return MeetingNetDisconnectActivity.f157152e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        C60700b.m235851b(f157150c, "[onBackPressed]", "onBackPressed");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.MeetingNetDisconnectActivity$c */
    static final class RunnableC62479c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingNetDisconnectActivity f157158a;

        RunnableC62479c(MeetingNetDisconnectActivity meetingNetDisconnectActivity) {
            this.f157158a = meetingNetDisconnectActivity;
        }

        public final void run() {
            LineHeightTextView lineHeightTextView = (LineHeightTextView) this.f157158a.mo215977a(R.id.meeting_netdisconnect_btn_cancel_loading);
            Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView, "meeting_netdisconnect_btn_cancel_loading");
            C60752f.m236079a((View) lineHeightTextView);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        f157151d = "";
        f157152e = false;
        UserCallStatusMonitor.m248763b(this.f157155g);
        super.onDestroy();
    }

    /* renamed from: i */
    private final void m244184i() {
        Serializable serializable;
        String str;
        Bundle extras;
        try {
            Intent intent = getIntent();
            if (intent == null || (extras = intent.getExtras()) == null) {
                serializable = null;
            } else {
                serializable = extras.getSerializable("VideoChatInfo");
            }
            VideoChat videoChat = (VideoChat) serializable;
            this.f157154b = videoChat;
            if (videoChat == null || (str = videoChat.getId()) == null) {
                str = "";
            }
            f157151d = str;
        } catch (Exception e) {
            C60700b.m235864f(f157150c, "[initData]", e.toString());
        }
    }

    /* renamed from: j */
    private final void m244185j() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo215977a(R.id.meeting_netdisconnect_info_container);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "meeting_netdisconnect_info_container");
        C60752f.m236079a((View) constraintLayout);
        ViewPropertyAnimator animate = ((LoadingLottieView) mo215977a(R.id.meeting_netdisconnect_loading_icon)).animate();
        if (animate != null) {
            animate.cancel();
        }
        LinearLayout linearLayout = (LinearLayout) mo215977a(R.id.meeting_netdisconnect_loading_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "meeting_netdisconnect_loading_container");
        C60752f.m236083c(linearLayout);
        LineHeightTextView lineHeightTextView = (LineHeightTextView) mo215977a(R.id.meeting_netdisconnect_btn_cancel_loading);
        Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView, "meeting_netdisconnect_btn_cancel_loading");
        C60752f.m236083c(lineHeightTextView);
    }

    /* renamed from: a */
    public final void mo215978a() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo215977a(R.id.meeting_netdisconnect_info_container);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "meeting_netdisconnect_info_container");
        C60752f.m236083c(constraintLayout);
        LinearLayout linearLayout = (LinearLayout) mo215977a(R.id.meeting_netdisconnect_loading_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "meeting_netdisconnect_loading_container");
        C60752f.m236079a((View) linearLayout);
        LineHeightTextView lineHeightTextView = (LineHeightTextView) mo215977a(R.id.meeting_netdisconnect_btn_cancel_loading);
        Intrinsics.checkExpressionValueIsNotNull(lineHeightTextView, "meeting_netdisconnect_btn_cancel_loading");
        C60752f.m236083c(lineHeightTextView);
        ((LineHeightTextView) mo215977a(R.id.meeting_netdisconnect_btn_cancel_loading)).postDelayed(new RunnableC62479c(this), 10000);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/multi/MeetingNetDisconnectActivity$onCallStatusListener$1", "Lcom/ss/android/vc/meeting/utils/UserCallStatusMonitor$UserOnCallStatusListener;", "onEnterOnCall", "", "callType", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.MeetingNetDisconnectActivity$b */
    public static final class C62478b implements UserCallStatusMonitor.AbstractC63478a {

        /* renamed from: a */
        final /* synthetic */ MeetingNetDisconnectActivity f157157a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62478b(MeetingNetDisconnectActivity meetingNetDisconnectActivity) {
            this.f157157a = meetingNetDisconnectActivity;
        }

        @Override // com.ss.android.vc.meeting.utils.UserCallStatusMonitor.AbstractC63478a
        public void onEnterOnCall(int i) {
            C60700b.m235851b(MeetingNetDisconnectActivity.f157150c, "[onEnterOnCall]", "dismiss because user enter oncall");
            this.f157157a.finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m244184i();
    }

    /* renamed from: a */
    public static Resources m244178a(MeetingNetDisconnectActivity meetingNetDisconnectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingNetDisconnectActivity);
        }
        return meetingNetDisconnectActivity.mo215981d();
    }

    /* renamed from: c */
    public static AssetManager m244182c(MeetingNetDisconnectActivity meetingNetDisconnectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingNetDisconnectActivity);
        }
        return meetingNetDisconnectActivity.mo215984h();
    }

    /* renamed from: b */
    public static void m244181b(MeetingNetDisconnectActivity meetingNetDisconnectActivity) {
        meetingNetDisconnectActivity.mo215982g();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MeetingNetDisconnectActivity meetingNetDisconnectActivity2 = meetingNetDisconnectActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    meetingNetDisconnectActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        C60700b.m235851b(f157150c, "[onCreate]", "onCreate");
        super.onCreate(bundle);
        UserCallStatusMonitor.m248762a(this.f157155g);
        setContentView(R.layout.activity_meeting_network_disconnect);
        m244184i();
        m244185j();
        f157152e = true;
    }

    public final void onViewClick(View view) {
        String str;
        Intrinsics.checkParameterIsNotNull(view, "view");
        int id = view.getId();
        if (id == R.id.meeting_netdisconnect_btn_close) {
            C60700b.m235851b(f157150c, "[onViewClick]", "meeting_netdisconnect_btn_close clicked");
            finish();
        } else if (id == R.id.meeting_netdisconnect_btn_rejoin) {
            an voIpDependency = VideoChatModuleDependency.getVoIpDependency();
            Intrinsics.checkExpressionValueIsNotNull(voIpDependency, "VideoChatModuleDependency.getVoIpDependency()");
            if (voIpDependency.isFloatIconShown() || VideoChatService.m249602d().isOngoing(true)) {
                C60738ac.m236023a((int) R.string.View_G_CurrentlyInCall);
                finish();
            } else if (!C60785x.m236238b()) {
                C60738ac.m236023a((int) R.string.View_G_NoConnection);
                finish();
            } else {
                C60700b.m235851b(f157150c, "[onViewClick2]", "meeting_netdisconnect_btn_rejoin clicked");
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
                MeetingNetDisconnectActivity meetingNetDisconnectActivity = this;
                VideoChat videoChat = this.f157154b;
                if (videoChat != null) {
                    str = videoChat.getId();
                } else {
                    str = null;
                }
                MeetingCheckUtils.meetingCheck(meetingNetDisconnectActivity, str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.MEETINGID, false, "meeting_net_disconnect_page_rejoin", uuid, 1, true).subscribe(new MeetingNetDisconnectActivity$onViewClick$1(this));
            }
        } else if (id == R.id.meeting_netdisconnect_btn_cancel_loading) {
            C60700b.m235851b(f157150c, "[onViewClick3]", "meeting_netdisconnect_btn_cancel_loading clicked");
            finish();
        }
    }

    /* renamed from: a */
    public static void m244179a(MeetingNetDisconnectActivity meetingNetDisconnectActivity, Context context) {
        meetingNetDisconnectActivity.mo215979a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meetingNetDisconnectActivity);
        }
    }

    /* renamed from: a */
    public static Context m244177a(MeetingNetDisconnectActivity meetingNetDisconnectActivity, Configuration configuration) {
        Context a = meetingNetDisconnectActivity.mo215976a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
