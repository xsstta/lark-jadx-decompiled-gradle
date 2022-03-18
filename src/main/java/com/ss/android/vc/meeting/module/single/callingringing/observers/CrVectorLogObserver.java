package com.ss.android.vc.meeting.module.single.callingringing.observers;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver;
import com.ss.android.vc.statistics.event.bn;
import com.ss.android.vc.statistics.event2.MeetingCalleeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/callingringing/observers/CrVectorLogObserver;", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/base/CallingRingingBaseObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "resumeTime", "", "onDestroy", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onObserverCreated", "onResume", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CrVectorLogObserver extends CallingRingingBaseObserver {

    /* renamed from: c */
    private int f158961c;

    @Override // com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver
    public void ca_() {
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        super.onDestroy(lifecycleOwner);
        C60700b.m235851b(mo217936f(), "[onDestroy]", "[destroy CallingRingingFragment]");
        if (mo217937g() == ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal() && mo217940j()) {
            C60700b.m235851b(mo217936f(), "[onDestroy2]", "Ringing fragment no need stop play tone");
        }
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        super.onResume(lifecycleOwner);
        this.f158961c++;
        if (mo217937g() == ByteRTCMeetingActivity.TYPE.CALL_RINGING.ordinal() && !mo217940j() && this.f158961c == 1) {
            C61303k kVar = this.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            C60700b.m235841a(kVar.mo212056e(), "UI", "UI", "onResumeRinging", mo217936f(), "onResumeRingingFragment");
            C61303k kVar2 = this.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar2, "meeting");
            VideoChat e = kVar2.mo212056e();
            C61303k kVar3 = this.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar3, "meeting");
            bn.m250196a(e, kVar3.mo212093K());
            MeetingCalleeEvent a = MeetingCalleeEvent.f160831b.mo220274a();
            C61303k kVar4 = this.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar4, "meeting");
            VideoChat e2 = kVar4.mo212056e();
            C61303k kVar5 = this.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar5, "meeting");
            a.mo220271a(e2, kVar5.mo212093K());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrVectorLogObserver(Fragment fragment, C61303k kVar) {
        super(fragment, kVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
