package com.ss.android.vc.meeting.bytertc;

import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/bytertc/AbsMediaDeviceWarningControl;", "Lcom/ss/android/vc/meeting/module/base/BaseControl;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "checkIfNeedShowHowlingDialog", "", "onMediaDeviceWarning", "deviceType", "", "deviceId", "", "code", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.bytertc.a */
public abstract class AbsMediaDeviceWarningControl extends AbstractC61420b {
    /* renamed from: a */
    public abstract void mo211735a();

    /* renamed from: a */
    public abstract void mo211736a(int i, String str, int i2);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsMediaDeviceWarningControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
