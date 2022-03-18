package com.ss.android.lark.mm.statistics;

import android.net.Uri;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/statistics/StatisticsUtil;", "", "()V", "TAG", "", "convert2FromSourceForDetail", "url", ShareHitPoint.f121868c, "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.a */
public final class StatisticsUtil {

    /* renamed from: a */
    public static final StatisticsUtil f118514a = new StatisticsUtil();

    private StatisticsUtil() {
    }

    /* renamed from: a */
    public final String mo165377a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        if (i == 5 || i == 6) {
            return "chat_link";
        }
        if (i == 8) {
            try {
                if (Intrinsics.areEqual(Uri.parse(str).getQueryParameter("from"), "from_parent_docs")) {
                    return "doc";
                }
                return "others";
            } catch (Exception e) {
                C45855f.m181664c("StatisticsUtil", "[convert2FromSource] ex=" + e.getMessage());
                return "others";
            }
        } else if (i == 11) {
            return "doc";
        } else {
            if (i == 13) {
                return "list_page";
            }
            return "others";
        }
    }
}
