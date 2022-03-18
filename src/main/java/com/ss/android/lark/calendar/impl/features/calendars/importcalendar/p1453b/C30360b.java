package com.ss.android.lark.calendar.impl.features.calendars.importcalendar.p1453b;

import com.ss.android.lark.pb.calendars.BindingExchangeAccountResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.b */
public final /* synthetic */ class C30360b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f76014a;

    static {
        int[] iArr = new int[BindingExchangeAccountResponse.State.values().length];
        f76014a = iArr;
        iArr[BindingExchangeAccountResponse.State.BINDING_SUCCESS.ordinal()] = 1;
        iArr[BindingExchangeAccountResponse.State.UNAUTHORIZED.ordinal()] = 2;
        iArr[BindingExchangeAccountResponse.State.COMMUNICATION_FAILED.ordinal()] = 3;
        iArr[BindingExchangeAccountResponse.State.ALREADY_BINDING_SELF.ordinal()] = 4;
        iArr[BindingExchangeAccountResponse.State.NEED_SERVER_URL.ordinal()] = 5;
        iArr[BindingExchangeAccountResponse.State.UNKNOWN_ERROR.ordinal()] = 6;
        iArr[BindingExchangeAccountResponse.State.FORBIDDENT_ERROR.ordinal()] = 7;
    }
}
