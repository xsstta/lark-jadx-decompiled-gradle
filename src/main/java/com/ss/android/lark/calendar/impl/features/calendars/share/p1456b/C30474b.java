package com.ss.android.lark.calendar.impl.features.calendars.share.p1456b;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.b */
public final /* synthetic */ class C30474b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f76253a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f76254b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f76255c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f76256d;

    static {
        int[] iArr = new int[Calendar.ShareOption.values().length];
        f76253a = iArr;
        iArr[Calendar.ShareOption.SHARE_OPT_WRITER.ordinal()] = 1;
        iArr[Calendar.ShareOption.SHARE_OPT_READER.ordinal()] = 2;
        iArr[Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER.ordinal()] = 3;
        iArr[Calendar.ShareOption.SHARE_OPT_PRIVATE.ordinal()] = 4;
        int[] iArr2 = new int[Calendar.ShareOption.values().length];
        f76254b = iArr2;
        iArr2[Calendar.ShareOption.SHARE_OPT_READER.ordinal()] = 1;
        iArr2[Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER.ordinal()] = 2;
        iArr2[Calendar.ShareOption.SHARE_OPT_PRIVATE.ordinal()] = 3;
        int[] iArr3 = new int[Calendar.ShareOption.values().length];
        f76255c = iArr3;
        iArr3[Calendar.ShareOption.SHARE_OPT_PRIVATE.ordinal()] = 1;
        iArr3[Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER.ordinal()] = 2;
        iArr3[Calendar.ShareOption.SHARE_OPT_READER.ordinal()] = 3;
        iArr3[Calendar.ShareOption.SHARE_OPT_WRITER.ordinal()] = 4;
        iArr3[Calendar.ShareOption.SHARE_OPT_OWNER.ordinal()] = 5;
        int[] iArr4 = new int[Calendar.AccessRole.values().length];
        f76256d = iArr4;
        iArr4[Calendar.AccessRole.FREE_BUSY_READER.ordinal()] = 1;
        iArr4[Calendar.AccessRole.READER.ordinal()] = 2;
        iArr4[Calendar.AccessRole.WRITER.ordinal()] = 3;
        iArr4[Calendar.AccessRole.OWNER.ordinal()] = 4;
    }
}
