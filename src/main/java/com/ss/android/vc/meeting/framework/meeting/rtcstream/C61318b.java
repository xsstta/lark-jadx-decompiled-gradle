package com.ss.android.vc.meeting.framework.meeting.rtcstream;

import androidx.lifecycle.Lifecycle;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.framework.meeting.rtcstream.b */
public final /* synthetic */ class C61318b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f153632a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f153633b;

    static {
        int[] iArr = new int[StreamSpec.Resolution.values().length];
        f153632a = iArr;
        iArr[StreamSpec.Resolution.FULL_SCREEN.ordinal()] = 1;
        iArr[StreamSpec.Resolution.HALF_SCREEN.ordinal()] = 2;
        iArr[StreamSpec.Resolution.QUATER_SCREEN.ordinal()] = 3;
        iArr[StreamSpec.Resolution.FLOAT_WINDOW.ordinal()] = 4;
        int[] iArr2 = new int[Lifecycle.Event.values().length];
        f153633b = iArr2;
        iArr2[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        iArr2[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
        iArr2[Lifecycle.Event.ON_STOP.ordinal()] = 3;
        iArr2[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
    }
}
