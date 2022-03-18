package com.ss.android.vc.meeting.module.multi.gridcontent;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61293a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u001c\u0010\u0016\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/gridcontent/GridByteRtcListener;", "Lcom/ss/android/vc/meeting/framework/meeting/AbsByteRtcListener;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "setMeeting", "onFirstRemoteVideoFrame", "", "rtcJoinId", "width", "", "height", "onStreamAdd", "stream", "Lcom/ss/android/vc/irtc/VcByteStream;", "streamId", "onStreamRemove", "streamInfo", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.gridcontent.b */
public final class GridByteRtcListener extends AbstractC61293a {

    /* renamed from: a */
    private final String f157313a = "GridByteRtcListener";

    /* renamed from: b */
    private C61303k f157314b;

    public GridByteRtcListener(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f157314b = kVar;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: b */
    public void mo211764b(String str, String str2) {
        this.f157314b.aw().mo216150e(str);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211750a(VcByteStream vcByteStream, String str) {
        Intrinsics.checkParameterIsNotNull(vcByteStream, "stream");
        Intrinsics.checkParameterIsNotNull(str, "streamId");
        this.f157314b.aw().mo216139a(vcByteStream);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
    /* renamed from: a */
    public void mo211752a(String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        String str2 = this.f157313a;
        C60700b.m235851b(str2, "[onFirstRemoteVideoFrame]", "rtcJoinId = " + str);
        AbstractC62485a az = this.f157314b.az();
        Intrinsics.checkExpressionValueIsNotNull(az, "meeting.fullScreenVideoControl");
        if (!az.mo216034a()) {
            this.f157314b.aw().mo216143b(str);
        } else {
            this.f157314b.az().mo216033a(str);
        }
    }
}
