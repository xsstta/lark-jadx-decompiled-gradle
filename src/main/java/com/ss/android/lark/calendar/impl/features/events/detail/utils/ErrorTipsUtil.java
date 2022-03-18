package com.ss.android.lark.calendar.impl.features.events.detail.utils;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/utils/ErrorTipsUtil;", "", "()V", "getJoinEventErrorResId", "", "errCode", "getReplyErrorDialogResId", "getShareErrorResId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d.d */
public final class ErrorTipsUtil {

    /* renamed from: a */
    public static final ErrorTipsUtil f79158a = new ErrorTipsUtil();

    /* renamed from: a */
    public final int mo113577a(int i) {
        return i != 10011 ? R.string.Calendar_Share_FaildTip : R.string.Calendar_Share_ShareLimit;
    }

    /* renamed from: b */
    public final int mo113578b(int i) {
        switch (i) {
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

    private ErrorTipsUtil() {
    }
}
