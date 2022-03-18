package com.ss.android.vc.meeting.module.multi.sharecontent;

import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH&J\b\u0010\u0010\u001a\u00020\u0006H&J\b\u0010\u0011\u001a\u00020\u0006H&J\b\u0010\u0012\u001a\u00020\u0006H&J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\fH&J\b\u0010\u0016\u001a\u00020\u0006H&J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\fH&¨\u0006\u0019"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/sharecontent/AbsShareContentControl;", "Lcom/ss/android/vc/meeting/module/base/BaseControl;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "addShareContentViewListener", "", "listener", "Lcom/ss/android/vc/meeting/module/multi/sharecontent/IShareContentViewListener;", "getShareContentModel", "Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentModel;", "isMeSharing", "", "isSharing", "onShareScreenChanged", "hasFollow", "refreshShareName", "refreshShareScreen", "registerRtcSdkListener", "removeShareContentViewListener", "setSketchEnabled", "enable", "unregisterRtcSdkListener", "updateScreenStreamSubscribe", "muted", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.b.a */
public abstract class AbsShareContentControl extends AbstractC61420b {
    /* renamed from: a */
    public abstract ShareContentModel mo216065a();

    /* renamed from: a */
    public abstract void mo216066a(IShareContentViewListener bVar);

    /* renamed from: a */
    public abstract void mo216067a(boolean z);

    /* renamed from: b */
    public abstract void mo216068b();

    /* renamed from: b */
    public abstract void mo216069b(IShareContentViewListener bVar);

    /* renamed from: c */
    public abstract void mo216070c();

    /* renamed from: c */
    public abstract void mo216071c(boolean z);

    /* renamed from: d */
    public abstract void mo216072d();

    /* renamed from: d */
    public abstract void mo216073d(boolean z);

    /* renamed from: e */
    public abstract boolean mo216074e();

    /* renamed from: f */
    public abstract boolean mo216075f();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsShareContentControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
