package com.ss.android.lark.mm.utils;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mm/utils/MmRandomUtil;", "", "()V", "genRandomRequestId", "", "randomString", "length", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.k */
public final class MmRandomUtil {

    /* renamed from: a */
    public static final MmRandomUtil f118636a = new MmRandomUtil();

    private MmRandomUtil() {
    }

    /* renamed from: a */
    public final String mo165494a() {
        return m186563a(16);
    }

    /* renamed from: a */
    private final String m186563a(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.toString()");
        return sb2;
    }
}
