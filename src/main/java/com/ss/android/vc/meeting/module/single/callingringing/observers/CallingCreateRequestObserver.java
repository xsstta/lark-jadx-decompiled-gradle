package com.ss.android.vc.meeting.module.single.callingringing.observers;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.C61316q;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.single.AbstractC63057b;
import com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.C63757g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/single/callingringing/observers/CallingCreateRequestObserver;", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/base/CallingRingingBaseObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "listener", "Lcom/ss/android/vc/meeting/module/single/OnRtcInitListener;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/single/OnRtcInitListener;)V", "getListener", "()Lcom/ss/android/vc/meeting/module/single/OnRtcInitListener;", "onObserverCreated", "", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "sendCreateRequest", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CallingCreateRequestObserver extends CallingRingingBaseObserver {

    /* renamed from: c */
    private final AbstractC63057b f158948c;

    @Override // com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver
    public void ca_() {
    }

    /* renamed from: b */
    public final AbstractC63057b mo217910b() {
        return this.f158948c;
    }

    /* renamed from: c */
    private final void m247022c() {
        Boolean bool;
        Boolean bool2;
        C61316q qVar;
        boolean z;
        String str;
        String str2;
        C61303k kVar = this.f151993b;
        VideoChat videoChat = null;
        if (kVar != null) {
            bool = Boolean.valueOf(kVar.mo212085C());
        } else {
            bool = null;
        }
        if (!C60752f.m236080a(bool)) {
            C61303k kVar2 = this.f151993b;
            if (kVar2 != null) {
                bool2 = Boolean.valueOf(kVar2.mo212085C());
            } else {
                bool2 = null;
            }
            if (bool2 == null) {
                Intrinsics.throwNpe();
            }
            if (!bool2.booleanValue()) {
                C61303k kVar3 = this.f151993b;
                if (kVar3 != null) {
                    qVar = kVar3.mo212084B();
                } else {
                    qVar = null;
                }
                boolean z2 = false;
                if (qVar != null) {
                    z = qVar.mo212196a();
                } else {
                    z = false;
                }
                String str3 = "";
                if (qVar != null) {
                    z2 = qVar.mo212203d();
                    str2 = qVar.mo212200c();
                    str = qVar.mo212204e();
                } else {
                    str2 = str3;
                    str = str2;
                }
                if (z && qVar != null) {
                    String b = qVar.mo212197b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "meetingProperty.chatId");
                    str3 = b;
                }
                C60700b.m235851b(mo217936f(), "[sendCreateRequest]", "createVideoChatCall");
                C61303k kVar4 = this.f151993b;
                if (kVar4 != null) {
                    videoChat = kVar4.mo212056e();
                }
                C63757g.m250286a(z2, str2, str, VcBizService.createVideoChatCall(videoChat, str3, this.f151993b, new C63062a(this)));
                C61303k kVar5 = this.f151993b;
                if (kVar5 != null) {
                    kVar5.mo212157c(true);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/single/callingringing/observers/CallingCreateRequestObserver$sendCreateRequest$contextId$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "", "onError", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.CallingCreateRequestObserver$a */
    public static final class C63062a implements AbstractC63598b<Unit> {

        /* renamed from: a */
        final /* synthetic */ CallingCreateRequestObserver f158949a;

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63062a(CallingCreateRequestObserver callingCreateRequestObserver) {
            this.f158949a = callingCreateRequestObserver;
        }

        /* renamed from: a */
        public void onSuccess(Unit unit) {
            C60700b.m235851b(this.f158949a.mo217936f(), "[sendCreateRequest2]", "startPreview");
            AbstractC63057b b = this.f158949a.mo217910b();
            if (b != null) {
                b.mo217889a();
            }
        }
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        super.onResume(lifecycleOwner);
        if (mo217937g() == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
            m247022c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallingCreateRequestObserver(Fragment fragment, C61303k kVar, AbstractC63057b bVar) {
        super(fragment, kVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f158948c = bVar;
    }
}
