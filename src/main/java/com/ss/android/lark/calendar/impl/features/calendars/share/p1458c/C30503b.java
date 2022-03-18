package com.ss.android.lark.calendar.impl.features.calendars.share.p1458c;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.c.b */
public final /* synthetic */ class C30503b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f76319a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f76320b;

    static {
        int[] iArr = new int[Calendar.ShareOption.values().length];
        f76319a = iArr;
        iArr[Calendar.ShareOption.SHARE_OPT_OWNER.ordinal()] = 1;
        iArr[Calendar.ShareOption.SHARE_OPT_WRITER.ordinal()] = 2;
        iArr[Calendar.ShareOption.SHARE_OPT_READER.ordinal()] = 3;
        int[] iArr2 = new int[Calendar.Type.values().length];
        f76320b = iArr2;
        iArr2[Calendar.Type.OTHER.ordinal()] = 1;
        iArr2[Calendar.Type.ACTIVITY.ordinal()] = 2;
        iArr2[Calendar.Type.PRIMARY.ordinal()] = 3;
    }
}
