package com.ss.android.vc.meeting.module.single.callingringing.observers;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.C61367r;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/callingringing/observers/RingingBellObserver;", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/base/CallingRingingBaseObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "handler", "Landroid/os/Handler;", "tonePlayer", "Lcom/ss/android/vc/meeting/framework/statemachine/VideoChatTonePlayer;", "initDataObservers", "", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onObserverCreated", "onStart", "onStop", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RingingBellObserver extends CallingRingingBaseObserver {

    /* renamed from: c */
    public C61367r f158975c;

    /* renamed from: d */
    private final Handler f158976d;

    @Override // com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver
    public void ca_() {
        m247046b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.RingingBellObserver$b */
    static final class RunnableC63073b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RingingBellObserver f158978a;

        RunnableC63073b(RingingBellObserver ringingBellObserver) {
            this.f158978a = ringingBellObserver;
        }

        public final void run() {
            this.f158978a.f158975c.mo212395b();
        }
    }

    /* renamed from: b */
    private final void m247046b() {
        MeetingSpecificData J;
        LiveData<Boolean> u;
        C61303k kVar = this.f151993b;
        if (kVar != null && (J = kVar.mo212092J()) != null && (u = J.mo212571u()) != null) {
            u.mo5923a(this.f151992a, new C63072a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/single/callingringing/observers/RingingBellObserver$initDataObservers$1", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "isRingingConnecting", "(Ljava/lang/Boolean;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.RingingBellObserver$a */
    public static final class C63072a implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ RingingBellObserver f158977a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63072a(RingingBellObserver ringingBellObserver) {
            this.f158977a = ringingBellObserver;
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f158977a.f158975c.mo212396c();
            }
        }
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        super.onDestroy(lifecycleOwner);
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        super.onStop(lifecycleOwner);
        if (mo217937g() == ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal()) {
            this.f158976d.removeCallbacksAndMessages(null);
            this.f158975c.mo212396c();
        }
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        Boolean bool;
        MeetingSpecificData J;
        LiveData<Boolean> u;
        MeetingSpecificData J2;
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        super.onStart(lifecycleOwner);
        if (mo217937g() == ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal()) {
            C61303k kVar = this.f151993b;
            if (kVar == null || (J2 = kVar.mo212092J()) == null || !J2.mo212574x()) {
                C61303k kVar2 = this.f151993b;
                if (kVar2 == null || (J = kVar2.mo212092J()) == null || (u = J.mo212571u()) == null) {
                    bool = null;
                } else {
                    bool = u.mo5927b();
                }
                if (!Intrinsics.areEqual((Object) bool, (Object) true)) {
                    this.f158976d.postDelayed(new RunnableC63073b(this), 50);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RingingBellObserver(Fragment fragment, C61303k kVar) {
        super(fragment, kVar);
        Context context;
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Context context2 = fragment.getContext();
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        C61367r a = C61367r.m239117a(context);
        Intrinsics.checkExpressionValueIsNotNull(a, "VideoChatTonePlayer.getI…text?.applicationContext)");
        this.f158975c = a;
        this.f158976d = new Handler();
    }
}
