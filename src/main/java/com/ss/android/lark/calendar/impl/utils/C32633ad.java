package com.ss.android.lark.calendar.impl.utils;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.calendar.impl.utils.ad */
public class C32633ad {
    /* renamed from: a */
    public static int m125176a(int i) {
        return i != 1 ? i != 2 ? R.string.Calendar_Detail_ResponseSuccessed : R.string.Calendar_Share_JoinSucTip : R.string.Calendar_Share_SucTip;
    }

    /* renamed from: a */
    public static int m125177a(int i, int i2) {
        if (i == 1) {
            return i2 != 10011 ? R.string.Calendar_Share_FaildTip : R.string.Calendar_Share_ShareLimit;
        }
        if (i != 2) {
            return i2 != 10000 ? R.string.Calendar_Detail_ResponseFailed : R.string.Calendar_Common_EventHasBeenDeleteTip;
        }
        switch (i2) {
            case JosStatusCodes.RTN_CODE_NO_SUPPORT_JOS:
            case JosStatusCodes.RNT_CODE_NO_JOS_INFO:
            case 8003:
            case 8004:
            case 8006:
            case 8007:
                return R.string.Calendar_Share_ExpiredAndJoinFailedTip;
            case 8005:
                return R.string.Calendar_Share_GuestLimitJoinTip;
            default:
                return R.string.Calendar_Share_JoinFailedTip;
        }
    }
}
