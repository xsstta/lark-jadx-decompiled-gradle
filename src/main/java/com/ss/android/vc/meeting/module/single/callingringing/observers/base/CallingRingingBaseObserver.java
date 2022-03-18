package com.ss.android.vc.meeting.module.single.callingringing.observers.base;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.module.single.callingringing.observers.livedata.CallingRingingLiveDatas;
import com.ss.android.vc.net.service.VideoChatUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0019H\u0004R\u001c\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/ss/android/vc/meeting/module/single/callingringing/observers/base/CallingRingingBaseObserver;", "Lcom/ss/android/vc/common/lifecycle/BaseFragmentLifeCycleObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "liveDatas", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;)V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "isFromFloat", "", "()Z", "setFromFloat", "(Z)V", "isVoiceOnlyCall", "setVoiceOnlyCall", "getLiveDatas", "()Lcom/ss/android/vc/meeting/module/single/callingringing/observers/livedata/CallingRingingLiveDatas;", ShareHitPoint.f121869d, "", "getType", "()I", "setType", "(I)V", "user", "Lcom/ss/android/vc/net/service/VideoChatUser;", "getUser", "()Lcom/ss/android/vc/net/service/VideoChatUser;", "setUser", "(Lcom/ss/android/vc/net/service/VideoChatUser;)V", "onObserverCreated", "", "sendEvent", "event", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class CallingRingingBaseObserver extends BaseFragmentLifeCycleObserver {

    /* renamed from: c */
    private final String f158990c;

    /* renamed from: d */
    private int f158991d;

    /* renamed from: e */
    private VideoChatUser f158992e;

    /* renamed from: f */
    private boolean f158993f;

    /* renamed from: g */
    private boolean f158994g;

    /* renamed from: h */
    private final CallingRingingLiveDatas f158995h;

    public abstract void ca_();

    /* renamed from: f */
    public final String mo217936f() {
        return this.f158990c;
    }

    /* renamed from: g */
    public final int mo217937g() {
        return this.f158991d;
    }

    /* renamed from: h */
    public final VideoChatUser mo217938h() {
        return this.f158992e;
    }

    /* renamed from: i */
    public final boolean mo217939i() {
        return this.f158993f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo217940j() {
        return this.f158994g;
    }

    /* renamed from: a */
    public final void mo217935a(int i) {
        C61344j a = C61344j.m239002a().mo212329a(i).mo212331a(EventSource.EVENT_ACTIVITY);
        C61303k kVar = this.f151993b;
        if (kVar != null) {
            kVar.mo212051a(a);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallingRingingBaseObserver(Fragment fragment, C61303k kVar) {
        this(fragment, kVar, null);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallingRingingBaseObserver(Fragment fragment, C61303k kVar, CallingRingingLiveDatas aVar) {
        super(fragment, kVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f158995h = aVar;
        String simpleName = getClass().getSimpleName();
        this.f158990c = simpleName;
        this.f158991d = -1;
        Bundle arguments = fragment.getArguments();
        C60700b.m235851b(simpleName, "[onCreate]", "arguments = " + arguments);
        if (arguments != null) {
            if (arguments == null) {
                Intrinsics.throwNpe();
            }
            this.f158991d = arguments.getInt("key_type", -1);
            this.f158992e = kVar.mo212088F().getSingleRemoteUser();
            VideoChat e = kVar.mo212056e();
            Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
            this.f158993f = e.isVoiceCall();
            this.f158994g = arguments.getBoolean("key_is_from_float");
            ca_();
            return;
        }
        throw new IllegalArgumentException();
    }
}
