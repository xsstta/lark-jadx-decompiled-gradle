package com.ss.android.lark.calendar.impl.features.calendars.editor.p1450a;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.e */
public final /* synthetic */ class C30296e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f75874a;

    static {
        int[] iArr = new int[Calendar.AccessRole.values().length];
        f75874a = iArr;
        iArr[Calendar.AccessRole.OWNER.ordinal()] = 1;
        iArr[Calendar.AccessRole.WRITER.ordinal()] = 2;
        iArr[Calendar.AccessRole.READER.ordinal()] = 3;
        iArr[Calendar.AccessRole.FREE_BUSY_READER.ordinal()] = 4;
    }
}
