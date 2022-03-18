package com.ss.android.lark.mm.module.mention;

import android.net.Uri;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/mention/MmMentionUrlUtils;", "", "()V", "getMentionCommentId", "", "url", "getMentionContentId", "getMentionSummaryId", "isMentionFromComments", "", "isMentionFromSummary", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.mention.f */
public final class MmMentionUrlUtils {

    /* renamed from: a */
    public static final MmMentionUrlUtils f117052a = new MmMentionUrlUtils();

    private MmMentionUrlUtils() {
    }

    /* renamed from: b */
    public final String mo163364b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        return Uri.parse(str).getQueryParameter(C60375c.f150914a);
    }

    /* renamed from: c */
    public final String mo163365c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        return Uri.parse(str).getQueryParameter("cci");
    }

    /* renamed from: e */
    public final String mo163367e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        return Uri.parse(str).getQueryParameter("su");
    }

    /* renamed from: a */
    public final boolean mo163363a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        return Intrinsics.areEqual(Uri.parse(str).getQueryParameter("from_source"), MmMentionSource.COMMENTS.getValue());
    }

    /* renamed from: d */
    public final boolean mo163366d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        return Intrinsics.areEqual(Uri.parse(str).getQueryParameter("from_source"), MmMentionSource.SUMMARY.getValue());
    }
}
