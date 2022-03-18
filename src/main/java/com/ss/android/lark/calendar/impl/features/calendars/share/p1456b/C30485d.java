package com.ss.android.lark.calendar.impl.features.calendars.share.p1456b;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.d */
public final /* synthetic */ class C30485d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f76277a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f76278b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f76279c;

    static {
        int[] iArr = new int[Calendar.ShareOption.values().length];
        f76277a = iArr;
        iArr[Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER.ordinal()] = 1;
        iArr[Calendar.ShareOption.SHARE_OPT_PRIVATE.ordinal()] = 2;
        int[] iArr2 = new int[Calendar.ShareOption.values().length];
        f76278b = iArr2;
        iArr2[Calendar.ShareOption.SHARE_OPT_PRIVATE.ordinal()] = 1;
        iArr2[Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER.ordinal()] = 2;
        iArr2[Calendar.ShareOption.SHARE_OPT_READER.ordinal()] = 3;
        iArr2[Calendar.ShareOption.SHARE_OPT_WRITER.ordinal()] = 4;
        iArr2[Calendar.ShareOption.SHARE_OPT_OWNER.ordinal()] = 5;
        int[] iArr3 = new int[Calendar.ShareOption.values().length];
        f76279c = iArr3;
        iArr3[Calendar.ShareOption.SHARE_OPT_PRIVATE.ordinal()] = 1;
        iArr3[Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER.ordinal()] = 2;
        iArr3[Calendar.ShareOption.SHARE_OPT_READER.ordinal()] = 3;
    }
}
