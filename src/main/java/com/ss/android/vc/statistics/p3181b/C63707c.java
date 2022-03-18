package com.ss.android.vc.statistics.p3181b;

import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.c */
public final /* synthetic */ class C63707c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f160823a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f160824b;

    static {
        int[] iArr = new int[InMeetingData.LiveMeetingData.Privilege.values().length];
        f160823a = iArr;
        iArr[InMeetingData.LiveMeetingData.Privilege.ANONYMOUS.ordinal()] = 1;
        iArr[InMeetingData.LiveMeetingData.Privilege.EMPLOYEE.ordinal()] = 2;
        int[] iArr2 = new int[LiveLayoutStyleView.Style.values().length];
        f160824b = iArr2;
        iArr2[LiveLayoutStyleView.Style.FULLSCREEN.ordinal()] = 1;
        iArr2[LiveLayoutStyleView.Style.GALLERY.ordinal()] = 2;
        iArr2[LiveLayoutStyleView.Style.LIST.ordinal()] = 3;
    }
}
