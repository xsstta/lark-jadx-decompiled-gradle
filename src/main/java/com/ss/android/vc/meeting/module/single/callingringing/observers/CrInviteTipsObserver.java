package com.ss.android.vc.meeting.module.single.callingringing.observers;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver;
import com.ss.android.vc.meeting.module.single.callingringing.observers.livedata.CallingRingingLiveDatas;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63759i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/callingringing/observers/CrInviteTipsObserver;", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/base/CallingRingingBaseObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "liveDatas", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;)V", "inviteTipsView", "Landroid/widget/TextView;", "mainHandler", "Landroid/os/Handler;", "initAcceptConnectingObserver", "", "initCallingNoResponseObserver", "initInviteText", "initRingingReceivedObserver", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onObserverCreated", "showToast", "text", "", "duration", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CrInviteTipsObserver extends CallingRingingBaseObserver {

    /* renamed from: c */
    public TextView f158950c;

    /* renamed from: d */
    private Handler f158951d = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.CrInviteTipsObserver$d */
    public static final class RunnableC63066d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f158955a;

        RunnableC63066d(View view) {
            this.f158955a = view;
        }

        public final void run() {
            View view = this.f158955a;
            if (view != null && view != null) {
                C60752f.m236083c(view);
            }
        }
    }

    /* renamed from: c */
    private final void m247026c() {
        MeetingSpecificData J;
        LiveData<Boolean> s;
        C61303k kVar = this.f151993b;
        if (kVar != null && (J = kVar.mo212092J()) != null && (s = J.mo212568s()) != null) {
            s.mo5923a(this.f151992a, new C63065c(this));
        }
    }

    /* renamed from: d */
    private final void m247027d() {
        MeetingSpecificData J;
        LiveData<Boolean> t;
        C61303k kVar = this.f151993b;
        if (kVar != null && (J = kVar.mo212092J()) != null && (t = J.mo212570t()) != null) {
            t.mo5923a(this.f151992a, new C63064b(this));
        }
    }

    /* renamed from: e */
    private final void m247028e() {
        MeetingSpecificData J;
        LiveData<Boolean> u;
        C61303k kVar = this.f151993b;
        if (kVar != null && (J = kVar.mo212092J()) != null && (u = J.mo212571u()) != null) {
            u.mo5923a(this.f151992a, new C63063a(this));
        }
    }

    @Override // com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver
    public void ca_() {
        TextView textView;
        Fragment fragment = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment, "fragment");
        View view = fragment.getView();
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.cr_invite_msg);
        } else {
            textView = null;
        }
        this.f158950c = textView;
        if (textView != null) {
            textView.setVisibility(0);
        }
        m247025b();
        if (mo217937g() == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
            m247026c();
            m247027d();
        }
        if (mo217937g() == ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal()) {
            m247028e();
        }
    }

    /* renamed from: b */
    private final void m247025b() {
        Boolean bool;
        TextView textView;
        MeetingSpecificData J;
        LiveData<Boolean> s;
        int g = mo217937g();
        if (g == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
            C61303k kVar = this.f151993b;
            if (kVar == null || (J = kVar.mo212092J()) == null || (s = J.mo212568s()) == null) {
                bool = null;
            } else {
                bool = s.mo5927b();
            }
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                TextView textView2 = this.f158950c;
                if (textView2 != null) {
                    textView2.setText(this.f151992a.getResources().getString(R.string.View_VM_AwaitingResponse));
                }
            } else if (mo217939i() && (textView = this.f158950c) != null) {
                textView.setText(this.f151992a.getResources().getString(R.string.View_A_VoiceCallStarting));
            }
        } else if (g != ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal()) {
        } else {
            if (mo217939i()) {
                TextView textView3 = this.f158950c;
                if (textView3 != null) {
                    textView3.setText(this.f151992a.getResources().getString(R.string.View_A_IncomingVoiceCall));
                    return;
                }
                return;
            }
            TextView textView4 = this.f158950c;
            if (textView4 != null) {
                textView4.setText(this.f151992a.getResources().getString(R.string.View_V_IncomingVideoCall));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/single/callingringing/observers/CrInviteTipsObserver$initAcceptConnectingObserver$1", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "isConnecting", "(Ljava/lang/Boolean;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.CrInviteTipsObserver$a */
    public static final class C63063a implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CrInviteTipsObserver f158952a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63063a(CrInviteTipsObserver crInviteTipsObserver) {
            this.f158952a = crInviteTipsObserver;
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            TextView textView;
            if (C60752f.m236082b(bool) && bool.booleanValue() && !C63634c.m249496b("byteview.call.android.status_connecting") && (textView = this.f158952a.f158950c) != null) {
                textView.setText(this.f158952a.f151992a.getText(R.string.View_G_Connecting));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/single/callingringing/observers/CrInviteTipsObserver$initCallingNoResponseObserver$1", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "noResponse", "(Ljava/lang/Boolean;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.CrInviteTipsObserver$b */
    public static final class C63064b implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CrInviteTipsObserver f158953a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63064b(CrInviteTipsObserver crInviteTipsObserver) {
            this.f158953a = crInviteTipsObserver;
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            C61303k kVar;
            MeetingSpecificData J;
            MeetingSpecificData J2;
            if (C60752f.m236082b(bool)) {
                if (bool == null) {
                    Intrinsics.throwNpe();
                }
                if (bool.booleanValue() && (kVar = this.f158953a.f151993b) != null && (J = kVar.mo212092J()) != null && !J.mo212573w()) {
                    CrInviteTipsObserver crInviteTipsObserver = this.f158953a;
                    String string = crInviteTipsObserver.f151992a.getString(R.string.View_VM_NoResponseTryAgain);
                    Intrinsics.checkExpressionValueIsNotNull(string, "fragment.getString(R.str…ew_VM_NoResponseTryAgain)");
                    crInviteTipsObserver.mo217912a(string, HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                    C61303k kVar2 = this.f158953a.f151993b;
                    if (kVar2 != null && (J2 = kVar2.mo212092J()) != null) {
                        J2.mo212533c(true);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/single/callingringing/observers/CrInviteTipsObserver$initRingingReceivedObserver$1", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "isRingingReceived", "(Ljava/lang/Boolean;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.CrInviteTipsObserver$c */
    public static final class C63065c implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CrInviteTipsObserver f158954a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63065c(CrInviteTipsObserver crInviteTipsObserver) {
            this.f158954a = crInviteTipsObserver;
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (C60752f.m236082b(bool) && bool.booleanValue() && !C63759i.m250294d()) {
                C63759i.m250289a(this.f158954a.f151993b.mo212056e());
                C63759i.m250291b();
                C63759i.m250290a(true);
                TextView textView = this.f158954a.f158950c;
                if (textView != null) {
                    textView.setText(this.f158954a.f151992a.getResources().getString(R.string.View_VM_AwaitingResponse));
                }
            }
        }
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        this.f158951d.removeCallbacksAndMessages(null);
        super.onDestroy(lifecycleOwner);
        C60700b.m235851b(mo217936f(), "[onDestroy]", "onDestroy");
    }

    /* renamed from: a */
    public final void mo217912a(String str, int i) {
        View view;
        Fragment fragment = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment, "fragment");
        View view2 = fragment.getView();
        TextView textView = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.calling_ringing_toast);
        } else {
            view = null;
        }
        Fragment fragment2 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment2, "fragment");
        View view3 = fragment2.getView();
        if (view3 != null) {
            textView = (TextView) view3.findViewById(R.id.calling_ringing_toast_text);
        }
        if (!C60752f.m236080a((Object) view) && !C60752f.m236080a((Object) textView)) {
            if (textView != null) {
                textView.setText(str);
            }
            if (view != null) {
                C60752f.m236079a(view);
            }
            Handler handler = this.f158951d;
            if (handler != null) {
                handler.postDelayed(new RunnableC63066d(view), (long) i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrInviteTipsObserver(Fragment fragment, C61303k kVar, CallingRingingLiveDatas aVar) {
        super(fragment, kVar, aVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, "liveDatas");
    }
}
