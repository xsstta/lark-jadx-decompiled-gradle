package com.ss.android.lark.moments.impl.common.utils;

import com.huawei.hms.android.HwBuildEx;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/NumberUtils;", "", "()V", "getFormatCountStr", "", "count", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.f */
public final class NumberUtils {

    /* renamed from: a */
    public static final NumberUtils f119252a = new NumberUtils();

    private NumberUtils() {
    }

    /* renamed from: a */
    public final String mo166209a(int i) {
        if (i < 10000) {
            return String.valueOf(i);
        }
        return String.valueOf(i / HwBuildEx.VersionCodes.CUR_DEVELOPMENT) + "w+";
    }
}
